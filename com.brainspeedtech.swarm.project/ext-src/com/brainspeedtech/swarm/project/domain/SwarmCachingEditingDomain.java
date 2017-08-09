/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;

import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.layer.Custom;
import com.brainspeedtech.swarm.layer.Property;
import com.brainspeedtech.swarm.layer.util.SGenXMLHelper;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.project.util.ProjectUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class SwarmCachingEditingDomain extends TransactionalEditingDomainImpl {
	
	
	private static String getID(EObject eObject) {
		
		if(EcoreUtil.getID(eObject) != null) {
			return EcoreUtil.getID(eObject);
		}
	    if (eObject.eResource() instanceof XMIResource) {
	        return ((XMIResource)eObject.eResource()).getID(eObject);
	    }
	    
	    return null;
	}
	
	
	private static String nsURI2Package(String nsURI)
	{
		String str[] = nsURI.replaceFirst("http://www.brainspeedtech.com/", "").split("/");
		String pkg = StringUtils.join(str,".");
		return "com.brainspeedtech." + pkg;
	}
	
	private static JsonSerializer<EAttribute> eAtributeSerializer = new JsonSerializer<EAttribute>() {

		@Override
		public JsonElement serialize(EAttribute arg0, Type arg1,
				JsonSerializationContext arg2) {
			JsonObject jsonObject = new JsonObject();


			for(EAttribute eAttr: arg0.eClass().getEAttributes()) {
				if (arg0.eGet(eAttr) instanceof Class<?>) continue;
				jsonObject.add(eAttr.getName(), arg2.serialize(arg0.eGet(eAttr)));
			}
			
			String name = arg0.getEType().getName();
			
			jsonObject.addProperty("type", name);
			
			return jsonObject;
		}
	};
	
	
	private static JsonSerializer<EReference> eReferenceSerializer = new JsonSerializer<EReference>() {

		@Override
		public JsonElement serialize(EReference arg0, Type arg1,
				JsonSerializationContext arg2) {
			JsonObject jsonObject = new JsonObject();

			//jsonObject.addProperty("clazz", arg0.getEReferenceType().getName().replaceAll("Impl$", ""));
			
			for(EAttribute eAttr: arg0.eClass().getEAttributes()) {
				if (eAttr.getName().equals("name")) continue;
				if (arg0.eGet(eAttr) instanceof Class<?>) continue;
				jsonObject.add(eAttr.getName(), arg2.serialize(arg0.eGet(eAttr)));
			}
			
			if (arg0.getEReferenceType().getName().startsWith("EObject")) {
				jsonObject.addProperty("type", "AnyURI");
			} else {
				jsonObject.addProperty("type", nsURI2Package(arg0.getEReferenceType().getEPackage().getNsURI()) 
						+ "." + arg0.getEReferenceType().getName().replaceAll("Impl$", ""));
			}
			jsonObject.addProperty("lowerBound", arg0.getLowerBound());
			jsonObject.addProperty("upperBound", arg0.getUpperBound());
			jsonObject.addProperty("defaultValue", arg0.getDefaultValueLiteral());
			EReference opposite = arg0.getEOpposite();
			if (opposite != null) {
				jsonObject.addProperty("opposite_type", nsURI2Package(opposite.getEType().getEPackage().getNsURI()) 
						+ "." + opposite.getEType().getName().replaceAll("Impl$", ""));
				jsonObject.addProperty("opposite_field", opposite.getName());
			}
			
//			for(EAttribute eAttr: arg0.getEReferenceType().getEAllAttributes()) {
//				if (arg0.eGet(eAttr) instanceof Class<?>) continue;
//				jsonObject.addProperty(eAttr.getName(), eAttr.getContainerClass().getName());
//			}

			return jsonObject;
		}
	};
	
	private static JsonSerializer<EClassifier> eClassifierSerializer = new JsonSerializer<EClassifier>() {

		@Override
		public JsonElement serialize(EClassifier arg0, Type arg1,
				JsonSerializationContext arg2) {
			JsonObject jsonObject = new JsonObject();
			
			if (arg0 instanceof EClass) {
				EClass eClass = (EClass)arg0;
				for (EReference ref: eClass.getEReferences()) {
					jsonObject.add(ref.getName(), arg2.serialize(ref));
				}
				//jsonObject.add("references", arg2.serialize(eClass.getEAllReferences()));
				
				for (EAttribute attr: eClass.getEAttributes()) {
					jsonObject.add(attr.getName(), arg2.serialize(attr));
				}
				
				List<String> supertypes = new LinkedList<>();
				for (EClass cls : eClass.getESuperTypes()) {
					supertypes.add(nsURI2Package(cls.getEPackage().getNsURI()) + "." + cls.getName());
				}
				
				jsonObject.add("super", arg2.serialize(supertypes));
			}

			return jsonObject;
		}
	};
	
	private static JsonSerializer<EPackage> ePackageSerializer = new JsonSerializer<EPackage>() {

		@Override
		public JsonElement serialize(EPackage arg0, Type arg1,
				JsonSerializationContext arg2) {
			JsonObject jsonObject = new JsonObject();
			
			List<String> classifiers = new LinkedList<>();
			for (EClassifier cls: arg0.getEClassifiers()) {
				classifiers.add(nsURI2Package(arg0.getNsURI()) + "." + cls.getName());
			}
			jsonObject.add("definedTypes", arg2.serialize(classifiers));

			return jsonObject;
		}
	};
	
	private static JsonSerializer<EObject> eObjectSerializer = new JsonSerializer<EObject>() {
		
		@Override
		public JsonElement serialize(EObject arg0, Type arg1,
				JsonSerializationContext arg2) {
			JsonObject jsonObject = new JsonObject();
			
			if (arg0 instanceof Property) {
				return null;
			}
			jsonObject.addProperty("clazz", arg0.getClass().getSimpleName().replaceAll("Impl$", ""));
			for(EAttribute eAttr: arg0.eClass().getEAllAttributes()) {
				if (arg0.eGet(eAttr) instanceof Property) continue;
				if (arg0.eGet(eAttr) instanceof Class<?>) continue;
				jsonObject.add(eAttr.getName(), arg2.serialize(arg0.eGet(eAttr)));
			}
			//jsonObject.addProperty("id", getID(arg0));
			
			for (EReference eAttr : arg0.eClass().getEAllReferences()) {
				
				if(arg0 instanceof Custom) continue;

				if (eAttr.isMany() && arg0.eGet(eAttr) != null) {
					List<String> manyMap = new LinkedList<String>();
					EList<EObject> eObjectList = (EList<EObject>) arg0
							.eGet(eAttr);
					for (EObject eObj : eObjectList) {
						// System.out.println(eObj);
						manyMap.add(getID(eObj));
					}
					jsonObject.add(eAttr.getName(), arg2.serialize(manyMap));
				} else {
					if (arg0.eGet(eAttr) instanceof EObject) {
						jsonObject.addProperty(eAttr.getName(),
								getID((EObject) arg0.eGet(eAttr)));
					} else {
						jsonObject.add(eAttr.getName(),
								arg2.serialize(arg0.eGet(eAttr)));
					}
				}

			}

			if (arg0 instanceof Custom) {
				for (Property property : ((Custom) arg0).getProperties()) {
					
					FeatureMap fm = property.getValue();
					List<Object> manyMap = new LinkedList<Object>();

					for (FeatureMap.Entry obj : fm) {
						// System.out.println(eObj);
						if (obj.getValue() instanceof EObject) {
							manyMap.add(getID((EObject)obj.getValue()));
						} else {
							manyMap.add(obj.getValue());
						}
					}
					jsonObject.add(property.getName(), arg2.serialize(manyMap));
				}
			}

			// TODO Auto-generated method stub
			return jsonObject;
		}
	};		
	
	GsonBuilder builder = new GsonBuilder();
	{
		builder.registerTypeHierarchyAdapter(EObject.class,
			eObjectSerializer);
		builder.registerTypeHierarchyAdapter(EPackage.class, ePackageSerializer);
		builder.registerTypeHierarchyAdapter(EClassifier.class, eClassifierSerializer);
		builder.registerTypeHierarchyAdapter(EReference.class, eReferenceSerializer);
		builder.registerTypeHierarchyAdapter(EAttribute.class, eAtributeSerializer);
		builder.setPrettyPrinting();
	}
	Gson gson = builder.create();
	private Map<Class<?>, Map<EObject, Collection<EObject>>> referenceCache = new HashMap<Class<?>, Map<EObject,Collection<EObject>>>();
	


	private HashMap<String, List<EObject>> typedMap;
	private HashMap<String, EObject> idMap;

	
	public static class SGENResourceSet extends ResourceSetImpl {

		@Override
		protected Resource demandCreateResource(URI uri) {
			URIConverter theURIConverter = getURIConverter();
			URI normalizedURI = theURIConverter.normalize(uri);
			return super.demandCreateResource(normalizedURI);
		}

	}

	public static class SGENURIConverter extends ExtensibleURIConverterImpl {

		private class SGENURIMap extends HashMap<URI, URI> implements URIMap {

			/**
			 * 
			 */
			private static final long serialVersionUID = -1840609195686165090L;

			@Override
			public URI getURI(URI uri) {
				for(URI sourceURI: keySet()) {
					if(uri.toString().startsWith(sourceURI.toString())) {
						URI returnURI = URI.createURI(uri.toString().replace(sourceURI.toString(), get(sourceURI).toString()));
						uri = returnURI;
						break;
					}
				}
				return uri;
			}
			
		}
		
		URIMap uriMap = new SGENURIMap();
		
		@Override
		protected URIMap getInternalURIMap() {
			return uriMap;
		}

	}
	
	protected void initialize() {
		getResourceSet().setURIConverter(new SGENURIConverter());
	}
	
	public SwarmCachingEditingDomain(AdapterFactory adapterFactory,
			TransactionalCommandStack stack) {
		this(adapterFactory, stack, new SGENResourceSet());
	}

	public SwarmCachingEditingDomain(AdapterFactory adapterFactory) {
		this(adapterFactory, new SGENResourceSet());
	}
	
	public SwarmCachingEditingDomain(AdapterFactory adapterFactory,
			ResourceSet resourceSet) {
		super(adapterFactory, resourceSet);
		initialize();
	}

	public SwarmCachingEditingDomain(AdapterFactory adapterFactory,
			TransactionalCommandStack stack, ResourceSet resourceSet) {
		super(adapterFactory, stack, resourceSet);
		initialize();
	}


	
	public void clearReferenceCache() {
		synchronized(referenceCache) {
			referenceCache.clear();
		}
	}
	
	public Collection<Object> getObjectsByType(EClassifier type) {
		Collection<Object> objects = new LinkedList<Object>();
		
		for(Resource res: getResourceSet().getResources()) {
			Collection <Object> objs = EcoreUtil.getObjectsByType(res.getContents(), type);
			objects.addAll(objs);
		}
		
		return objects;
	}
	

	public Object getObjectByType(EClassifier type) {
		for(Resource res: getResourceSet().getResources()) {
			Object obj = EcoreUtil.getObjectByType(res.getContents(), type);
			if (obj != null) return obj;
		}
		return null;
	}
	
	public static String readString(InputStream in) throws IOException {
		InputStreamReader is = new InputStreamReader(in);
		StringBuilder sb=new StringBuilder();
		BufferedReader br = new BufferedReader(is);
		String read = br.readLine();

		while(read != null) {
		    //System.out.println(read);
			read += "\n";
		    sb.append(read);
		    read =br.readLine();
		}

		return sb.toString();
	}
	
	public <T extends EObject> Collection<T> getReferringInstances(EObject object, Class<T> clazz) {
		
		Collection<EObject> references = null;
		
		synchronized (referenceCache) {
			Map<EObject, Collection<EObject>> referenceList = referenceCache
					.get(clazz);

			if (referenceList != null) {
				references = referenceList.get(object);
			}

			if (references == null) {
				references = new LinkedList<EObject>();
			}
		}
		
		return (Collection<T>) references;
	}

	public URI getBaseURI() {
		return SGenXMLHelper.domaintoURI.get(getID());
	}

	public void setBaseURI(URI baseURI) {
		SGenXMLHelper.domaintoURI.put(getID(), baseURI);
	}
	
	private void addReference(EObject key, EObject obj)
	{
		if (key == null) return;
		
		if (key.eIsProxy()) {
			return;
		}
		
		if(key instanceof ConstraintBase) {
			ConstraintBase base = (ConstraintBase)key;
			if(base.isDisabled()) return;
		}
		
		List supers = ClassUtils.getAllInterfaces(obj.getClass());
		supers.addAll(ClassUtils.getAllSuperclasses(obj.getClass()));
		supers.add(obj.getClass());
		
		for(Object o: supers) {
			Class clazz = (Class)o;
			Map<EObject, Collection<EObject>> referenceList = referenceCache
					.get(clazz);
			if (referenceList == null) {
				referenceList = new HashMap<EObject, Collection<EObject>>();
				referenceCache.put(clazz, referenceList);
			}
			
			Collection<EObject> links = referenceList.get(key);
			if (links == null) {
				links = new HashSet<EObject>();
				referenceList.put(key, links);
			}
			links.add(obj);
		}
	
	}
	
	public void buildReferenceCache(EObject obj) {
		
		if(!obj.eClass().getEPackage().getNsURI().contains("brainspeedtech")) return;
		
		List<EObject> list = typedMap.get(obj.eClass().getName());
		if(list == null) {
			list = new LinkedList<EObject>();
		}
		list.add(obj);
		typedMap.put(obj.eClass().getName(), list);
		
		if(obj.eIsProxy()) return;
		
		if(obj instanceof ConstraintBase) {
			ConstraintBase base = (ConstraintBase)obj;
			if(base.isDisabled()) return;
		}
		for(Iterator<EObject> contit = obj.eCrossReferences().iterator(); contit.hasNext();) {
			EObject key = contit.next();
			addReference(key, obj);
		}
		for(Iterator<EObject> contit = obj.eContents().iterator(); contit.hasNext();) {
			EObject key = contit.next();
			addReference(key, obj);
		}
		
		addReference(obj.eContainer(), obj);
	}

	public void buildReferenceCache() {
		
		TreeIterator<Object> contents = EcoreUtil.getAllContents(getResourceSet(), true);
		typedMap = new HashMap<String, List<EObject>>();
		idMap = new HashMap<>();
		
		while(contents.hasNext()) {
			Object obj = contents.next();
			if (obj instanceof EObject) {
				if(obj.getClass().getName().startsWith("com.brainspeedtech") == false) continue;
				EObject eobj = (EObject)obj;
				
				if (obj instanceof ConstraintBase) {
					if (((ConstraintBase) obj).isDisabled()) continue;
				}
				buildReferenceCache(eobj);
				idMap.put(getID(eobj),eobj);
			}
		}
		
		if(!getResourceSet().getResources().isEmpty()) {
			final MasterDesign design = ProjectUtil.getMasterDesign(getResourceSet().getResources().get(0));
			if (design == null) return;
			
			String projectPath = design.eResource().getURI().trimSegments(1).toFileString();
			
			// JSON Generator for the full design
			try {
				new GeneratorFile(projectPath + "/generate.js") {
					
					@Override
					public String getFileContents() throws Exception {
						String script = "var _ = require('lodash');";
						script += "var swarm_design = " + gson.toJson(idMap) + ";";
						script += readString(SwarmCachingEditingDomain.class
								.getResourceAsStream("swarmlib.js"));
						script += readString(SwarmCachingEditingDomain.class
								.getResourceAsStream("nodegen.js"));
						return script;
					}
				};
				
			} catch (Exception e) {
				e.printStackTrace();
			}	
			
			// JSON Generator for the full design
			try {
				new GeneratorFile(projectPath + "/design.js") {
					
					@Override
					public String getFileContents() throws Exception {
						String script = "var _ = require('lodash');";
						script += "var swarm_design = " + gson.toJson(idMap) + ";";
						script += readString(SwarmCachingEditingDomain.class
								.getResourceAsStream("swarmlib.js"));
						return script;
					}
				};
				
			} catch (Exception e) {
				e.printStackTrace();
			}	
			
			try {
				
				Map<String, Object> classMap = new HashMap<>();
				Set<String> keySet = new HashSet<>();
				keySet.addAll(EPackage.Registry.INSTANCE.keySet());
				
				for(String key: keySet) {
					EPackage pkg = null;
					try {
						pkg = EPackage.Registry.INSTANCE.getEPackage(key);
					}
					catch (Exception exc) {
						
					}
					if (pkg == null) continue;
					
					if (key.contains("brainspeedtech") || key.contains("bst")) {
						classMap.put(nsURI2Package(pkg.getNsURI() + "." + pkg.getClass().getSimpleName().replaceAll("Impl$", "")), pkg);
						
						for(EClassifier cls: pkg.getEClassifiers()) {
							classMap.put(nsURI2Package(pkg.getNsURI() + "." + cls.getName().replaceAll("Impl$", "")), cls);
						}
					}

				}
				
				
				
/*				final Map<String, Object> finalClassMap = classMap;
				new GeneratorFile(projectPath + "/metamodel.js") {
					
					@Override
					public String getFileContents() throws Exception {
						return "var swarm_design = " + gson.toJson(finalClassMap) + ";";
					}
				};
*/				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	static private Object loadIfExists(ScriptEngine engine, String fileName) throws FileNotFoundException, ScriptException {
		File file = new File(fileName);
		if (!file.exists()) return null;
		
		return engine.eval(new BufferedReader(new InputStreamReader(new FileInputStream(file))));
	}
	
	static private void copyIfExists(String src, String dest) throws ScriptException, IOException {
		File file = new File(src);
		if (!file.exists()) return;
		
		FileUtils.copyFile(file, new File(dest));
	}
	
	static public void setupGenerator(SwarmCachingEditingDomain domain, final Class<?> generatorClass, String projectDir, 
			String outputDir, String projectName, String sitePath, PrintStream out) 
					throws Exception {
//		out.println("Creating script engine");
//		ScriptEngineManager mgr = new ScriptEngineManager();
//		ScriptEngine engine = mgr.getEngineByName("JavaScript");
//		
//		out.println("Sourcing handlebars");
//		/* Load libraries */
//		engine.eval(new BufferedReader(new InputStreamReader(
//				SwarmCachingEditingDomain.class
//						.getResourceAsStream("handlebars.js"))));
//		
//		out.println("Sourcing underscore");
//		/* Load libraries */
//		engine.eval(new BufferedReader(new InputStreamReader(
//				SwarmCachingEditingDomain.class
//						.getResourceAsStream("underscore.js"))));

		// Rebuild reference cache
		domain.buildReferenceCache();
		
//		out.println("Sourcing design");
//		/* Load design */
//		engine.eval("var swarm_design = {}"); // In case the file does not exist
//		loadIfExists(engine, projectDir + "/" + projectName + ".js");
		
//		copyIfExists(projectDir + "/" + projectName + ".js", outputDir + "/model/" + projectName + ".js");
//		out.println("Sourcing root swarmlib.js");
//		/* Load base swarm libraries */
//		engine.eval(new BufferedReader(new InputStreamReader(
//				SwarmCachingEditingDomain.class
//						.getResourceAsStream("swarmlib.js"))));
//		new GeneratorFile(outputDir + "/web/js/swarmlib.js") {
//			@Override
//			public String getFileContents() throws Exception {
//				// TODO Auto-generated method stub
//				return readString(SwarmCachingEditingDomain.class
//						.getResourceAsStream("swarmlib.js"));
//			}
//		};
//		new GeneratorFile(outputDir + "/web/js/lib/handlebars.js") {
//			@Override
//			public String getFileContents() throws Exception {
//				// TODO Auto-generated method stub
//				return readString(SwarmCachingEditingDomain.class
//						.getResourceAsStream("handlebars.js"));
//			}
//		};
//		
//		new GeneratorFile(outputDir + "/web/js/lib/underscore.js") {
//			@Override
//			public String getFileContents() throws Exception {
//				// TODO Auto-generated method stub
//				return readString(SwarmCachingEditingDomain.class
//						.getResourceAsStream("underscore.js"));
//			}
//		};
//		
//		new GeneratorFile(outputDir + "/web/js/lib/jquery.js") {
//			@Override
//			public String getFileContents() throws Exception {
//				// TODO Auto-generated method stub
//				return readString(SwarmCachingEditingDomain.class
//						.getResourceAsStream("jquery.js"));
//			}
//		};
//		
//		/* Load generator swarm libraries */
//		if(generatorClass != null) {
//			out.println("Source generator specific swarmlib.js");
//			engine.put("sitePath", sitePath);
//			engine.eval(new BufferedReader(new InputStreamReader(
//					generatorClass.getResourceAsStream("swarmlib.js"))));
		if(generatorClass != null) {
			new GeneratorFile(outputDir + "/lib/" + sitePath + "/swarmlib.js") {
				@Override
				public String getFileContents() throws Exception {
					// TODO Auto-generated method stub
					return readString(generatorClass
							.getResourceAsStream("swarmlib.js"));
				}
			};
		}
		
//		if(generatorClass != null) {
//			new GeneratorFile(outputDir + "/map/" + sitePath + "/map._", false) {
//				@Override
//				public String getFileContents() throws Exception {
//					// TODO Auto-generated method stub
//					return readString(generatorClass
//							.getResourceAsStream("map._"));
//				}
//			};
//		}
//		
//		new GeneratorFile(outputDir + "/lib/nodegen.ls") {
//			@Override
//			public String getFileContents() throws Exception {
//				// TODO Auto-generated method stub
//				return readString(SwarmCachingEditingDomain.class
//						.getResourceAsStream("nodegen.ls"));
//			}
//		};
		
//		new GeneratorFile(outputDir + "/map/map._", false) {
//			@Override
//			public String getFileContents() throws Exception {
//				// TODO Auto-generated method stub
//				return readString(SwarmCachingEditingDomain.class
//						.getResourceAsStream("map._"));
//			}
//		};
//		
//		new GeneratorFile(outputDir + "/scripts/setup.sh") {
//			@Override
//			public String getFileContents() throws Exception {
//				// TODO Auto-generated method stub
//				return readString(SwarmCachingEditingDomain.class
//						.getResourceAsStream("setup.sh"));
//			}
//		};
//		
//		new GeneratorFile(outputDir + "/scripts/generate.sh") {
//			@Override
//			public String getFileContents() throws Exception {
//				// TODO Auto-generated method stub
//				return readString(SwarmCachingEditingDomain.class
//						.getResourceAsStream("generate.sh"));
//			}
//		};
//		
		if(!(new File(outputDir + "/package.json").exists())) {
			new GeneratorFile(outputDir + "/package.json") {
				@Override
				public String getFileContents() throws Exception {
					// TODO Auto-generated method stub
					return readString(SwarmCachingEditingDomain.class
							.getResourceAsStream("package.json"));
				}
			};
		}
//		
//		
//		out.println("Source project swarmlib.js");
//		/* Setup the builder type so all templates can access it*/
//		engine.eval("swarm_design['builder'] = builder;");
//		loadIfExists(engine, projectDir + "/swarmlib.js");
//		if(new File(projectDir + "/swarmlib.js").exists())
//			FileUtils.copyFile(new File(projectDir + "/swarmlib.js"),
//					new File(outputDir + "/web/js/" + projectName + "/swarmlib.js"));
		
		// generate_hbar(generatorClass, projectDir, outputDir, out, engine);
		// generate_underscore(generatorClass, projectDir, outputDir, out, engine);

	}
	
	@SuppressWarnings("unused")
	private static void generate_underscore(final Class<?> generatorClass,
			String projectDir, String outputDir, PrintStream out,
			ScriptEngine engine) throws IOException, ScriptException, Exception {
		out.println("Source root map");
		engine.eval("generator_map = {}");
		engine.eval("uscore_template_source = {}");
		engine.eval("uscore_template_objects = {}");
		String mapTemplate = "";
		String templateString = readString(SwarmCachingEditingDomain.class.getResourceAsStream("map._"));

		mapTemplate += templateString;
		
		if(generatorClass != null) {

			out.println("Source builder map");
			templateString = readString(generatorClass.getResourceAsStream("map._"));
			mapTemplate += templateString;
		}
		
		/* Load build lists */
		if(new File(projectDir + "/map._").exists()) {
			out.println("Source project map");
			templateString = new String(Files.readAllBytes(Paths.get(projectDir + "/map._")));
			mapTemplate += templateString;
			
		}
		
		engine.put("map_template", mapTemplate);
		engine.eval("uscore_template = _.template(map_template);");
		engine.eval("uscore_template = uscore_template(swarm_design);");
		engine.eval((String)engine.get("uscore_template"));
		

		List<String> fileList = new ArrayList<>();
		engine.put("file_list", fileList);
		engine.eval(new BufferedReader(new InputStreamReader(
				SwarmCachingEditingDomain.class
						.getResourceAsStream("get_generator_files.js"))));
		
		HashSet<String> templates = new HashSet<>();
		
		for(String fileName: fileList) {
			engine.put("uscore_template", "");
			engine.eval("uscore_template = generator_map['" + fileName + "'].template;");
			String template = (String) engine.get("uscore_template");
			templates.add(template);
		}

		
		for(String template_name: templates) {
			out.println("Loading template " + template_name);
			String template;
			String template_name_root = template_name;
			
			if(template_name.startsWith("ROOT_CLASSLOADER")) {
				template_name = template_name.replaceFirst("ROOT_CLASSLOADER", "");
				InputStream strm = SwarmCachingEditingDomain.class.getResourceAsStream(template_name);
				template = readString(strm);
			} else if(template_name.startsWith("CLASSLOADER")) {
				template_name = template_name.replaceFirst("CLASSLOADER", "");
				InputStream strm = generatorClass.getResourceAsStream(template_name);
				template = readString(strm);
			} else {
				template = new String(Files.readAllBytes(Paths.get(projectDir + "/" + template_name)));
			}
			
			engine.put("uscore_template", template);
			engine.eval("uscore_template_source['" + template_name + "'] = uscore_template;");
			engine.eval("uscore_template_objects['" + template_name_root + "'] = _.template(uscore_template);");
		}
		
		
		for(String fileName: fileList) {
			out.println("Generating file " + fileName);
			engine.put("current_file", fileName);
			engine.eval(new BufferedReader(new InputStreamReader(
					SwarmCachingEditingDomain.class
							.getResourceAsStream("generate_uscore.js"))));
			final String fileData = (String) engine.get("file_data");
			new GeneratorFile(outputDir + "/" + fileName) {
				@Override
				public String getFileContents() throws Exception {
					// TODO Auto-generated method stub
					return fileData;
				}
			};
		}
	}


	@SuppressWarnings("unused")
	private static void generate_hbar(final Class<?> generatorClass,
			String projectDir, String outputDir, PrintStream out,
			ScriptEngine engine) throws IOException, ScriptException, Exception {
		out.println("Source root map");
		engine.eval("generator_map = {}");
		engine.put("hbar_template", readString(SwarmCachingEditingDomain.class.getResourceAsStream("map.hbar")));
		engine.eval("hbar_template = Handlebars.compile(hbar_template);");
		engine.eval("hbar_template = hbar_template(swarm_design);");
		String script = (String)engine.get("hbar_template");
		engine.eval(script);

		
		if(generatorClass != null) {

			out.println("Source builder map");
			engine.put("hbar_template", readString(generatorClass.getResourceAsStream("map.hbar")));
			engine.eval("hbar_template = Handlebars.compile(hbar_template);");
			engine.eval("hbar_template = hbar_template(swarm_design);");
			script = (String)engine.get("hbar_template");
			engine.eval(script);
		}
		
		/* Load build lists */
		if(new File(projectDir + "/map.hbar").exists()) {
			out.println("Source project map");
			engine.put("hbar_template", new String(Files.readAllBytes(Paths.get(projectDir + "/map.hbar"))));
			engine.eval("hbar_template = Handlebars.compile(hbar_template);");
			engine.eval("hbar_template = hbar_template(swarm_design);");
			String test = (String)engine.get("hbar_template");
			engine.eval((String)engine.get("hbar_template"));
		}
		
		List<String> fileList = new ArrayList<>();
		engine.put("file_list", fileList);
		engine.eval(new BufferedReader(new InputStreamReader(
				SwarmCachingEditingDomain.class
						.getResourceAsStream("get_partial_files.js"))));
		
		for(String fileName: fileList) {
			engine.put("hbar_template", "");
			engine.eval("hbar_template = partial_map['" + fileName + "'].template;");
			String template = (String) engine.get("hbar_template");
			out.print("Loading partial template " + template);
			if(template.startsWith("CLASSLOADER")) {
				
				template = template.replaceFirst("CLASSLOADER", "");
				InputStream strm = generatorClass.getResourceAsStream(template);
				template = readString(strm);
			} else {
				template = new String(Files.readAllBytes(Paths.get(projectDir + "/" + template)));
			}
			engine.put("hbar_template", template);
			engine.eval("Handlebars.registerPartial('" + fileName + "', hbar_template);");
		}

		fileList = new ArrayList<>();
		engine.put("file_list", fileList);
		engine.eval(new BufferedReader(new InputStreamReader(
				SwarmCachingEditingDomain.class
						.getResourceAsStream("get_generator_files.js"))));
		
		for(String fileName: fileList) {
			engine.put("hbar_template", "");
			engine.eval("hbar_template = generator_map['" + fileName + "'].template;");
			String template = (String) engine.get("hbar_template");
			out.println("Loading template " + template);
			
			if(template.startsWith("ROOT_CLASSLOADER")) {
				template = template.replaceFirst("ROOT_CLASSLOADER", "");
				InputStream strm = SwarmCachingEditingDomain.class.getResourceAsStream(template);
				template = readString(strm);
			} else if(template.startsWith("CLASSLOADER")) {
				template = template.replaceFirst("CLASSLOADER", "");
				InputStream strm = generatorClass.getResourceAsStream(template);
				template = readString(strm);
			} else {
				template = new String(Files.readAllBytes(Paths.get(projectDir + "/" + template)));
			}
			engine.put("hbar_template", template);
			engine.eval("generator_map['" + fileName + "'].template = Handlebars.compile(hbar_template);");
		}
		
		for(String fileName: fileList) {
			out.println("Generating file " + fileName);
			engine.put("current_file", fileName);
			engine.eval(new BufferedReader(new InputStreamReader(
					SwarmCachingEditingDomain.class
							.getResourceAsStream("generate.js"))));
			final String fileData = (String) engine.get("file_data");
			new GeneratorFile(outputDir + "/" + fileName) {
				@Override
				public String getFileContents() throws Exception {
					// TODO Auto-generated method stub
					return fileData;
				}
			};
		}
	}
}
