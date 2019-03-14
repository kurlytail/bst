/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.util;

import java.io.File;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.cli.ParseException;
import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UnresolvedProxyCrossReferencer;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Shape;

import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;



public class ProjectUtil {
	

	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> Set<T> getReferringInstances(EObject object, Class<T> clazz) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(object);
		if (domain instanceof SwarmCachingEditingDomain) {
			SwarmCachingEditingDomain swarmDomain = (SwarmCachingEditingDomain) domain;
			return new HashSet<T>(swarmDomain.getReferringInstances(object, clazz));
		}
		
		return new HashSet<T>();
		
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> Set<T> getReferringInstances(Collection<? extends EObject> objectList, Class<T> clazz) {
		Set<T> hashSet = new HashSet<T>();
		
		if(objectList.isEmpty()) return hashSet;
		
		TransactionalEditingDomain domain = TransactionUtil
				.getEditingDomain(objectList.iterator().next());
		
		if (domain instanceof SwarmCachingEditingDomain) {
			SwarmCachingEditingDomain swarmDomain = (SwarmCachingEditingDomain) domain;
			for(EObject obj: objectList) {
				hashSet.addAll(swarmDomain.getReferringInstances(obj, clazz));
			}
			return hashSet;
		}
		
		return new HashSet<T>();

	}
	
	public static Set<EObject> getReferringInstances(EObject object) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(object);
		Collection<Setting> referencingObjects = UsageCrossReferencer.find(
				object, domain.getResourceSet());
		Set<EObject> hashSet = new HashSet<EObject>();
		
		for (Setting setting : referencingObjects) {
			hashSet.add(setting.getEObject());
		}

		return hashSet;
	}
	
	public static Set<EObject> getReferringInstances(Collection<EObject> objectList) {
		if (objectList.isEmpty()) return new HashSet<EObject>();

		Map<EObject, Collection<Setting>> referencingObjects = UsageCrossReferencer.findAll(
				objectList, objectList.iterator().next().eResource().getResourceSet());
		Set<EObject> hashSet = new HashSet<EObject>();
		
		for (EObject eObject: referencingObjects.keySet()) {
			for (Setting setting : referencingObjects.get(eObject)) {
				hashSet.add(setting.getEObject());
			}
		}

		return hashSet;
	}

	public static <T extends EObject> T getReferringInstance(EObject object, Class<T> clazz) {
		if (object == null) return null;
		if (object.eResource() == null || object.eResource().getResourceSet() == null) {
			return null;
		}
		
		Collection<T> references = getReferringInstances(object, clazz);
		if (references.isEmpty()) return null;
		return references.iterator().next();

	}

	public static boolean removeUnresolvedObjects(EObject object) {
		Map<EObject, Collection<Setting>> unresolved = UnresolvedProxyCrossReferencer.find(object);
		return removeUnresolvedObjects(unresolved);
	}

	private static boolean removeUnresolvedObjects(
			Map<EObject, Collection<Setting>> unresolved) {
		boolean removed = false;
		for(EObject object: unresolved.keySet()) {
			Collection<Setting> settings = unresolved.get(object);
			for (Setting setting: settings) {
				object.eContents().remove(setting.getEObject());
				removed = true;
			}
		}
		return removed;
	}

	public static boolean removeUnresolvedObjects(Resource resource) {
		Map<EObject, Collection<Setting>> unresolved = UnresolvedProxyCrossReferencer.find(resource);
		return removeUnresolvedObjects(unresolved);
	}

	public static boolean removeUnresolvedContainers(EObject object) {
		Map<EObject, Collection<Setting>> unresolved = UnresolvedProxyCrossReferencer.find(object);
		return removeUnresolvedContainers(unresolved);
	}

	private static boolean removeUnresolvedContainers(
			Map<EObject, Collection<Setting>> unresolved) {
		boolean removed = false;
		for(EObject object: unresolved.keySet()) {
			object.eContainer().eContents().remove(object);
			removed = true;
		}
		
		return removed;
	}

	public static boolean removeUnresolvedContainers(Resource resource) {
		Map<EObject, Collection<Setting>> unresolved = UnresolvedProxyCrossReferencer.find(resource);
		return removeUnresolvedContainers(unresolved);
	}


	public static MasterDesign getMasterDesign(Resource res) {
		ResourceSet rSet = res.getResourceSet();
		for(Resource candidate: rSet.getResources()) {
			Object obj = EcoreUtil.getObjectByType(candidate.getContents(), MasterPackage.eINSTANCE.getMasterDesign());
			if (obj != null) {
				return (MasterDesign)obj;
			}
		}
		return null;
	}
	
	public static String InitializeProject(SwarmCachingEditingDomain domain,
			String[] args, String[] ext, PrintStream log) throws ParseException {
		
		String impliedProjectDir = null;
		
		log.println("Clearing editing domain");
		
		domain.clearReferenceCache();
		for(Iterator<Resource> it = domain.getResourceSet().getResources().iterator(); it.hasNext();) {
			Resource resource = it.next();
			if (resource != null)
				resource.unload();
			it.remove();
		}
		
		/* Build the seed file list */
		List<File> designFileList = new LinkedList<File>();

		for (String arg : args) {
			if (arg == null) break;
			File file = new File(arg);
			if (file.isFile()) {
				designFileList.add(file);
				log.println("Added explicit seed file " + arg);
				
			} else if (file.isDirectory()) {
				
				if(impliedProjectDir == null) {
					impliedProjectDir = file.getPath();
				}
				Iterator<File> fileIterator = FileUtils.iterateFiles(
						file, ext,
						true);
				while (fileIterator.hasNext()) {
					File innerFile = fileIterator.next();
					if (innerFile.toString().contains("node_modules")) continue;
					designFileList.add(innerFile);
				}
				log.println("Found seed files " + designFileList + " through directory " + arg);
			} else {
				throw(new ParseException("Argument " + arg + " is not a layer file or directory"));
			}
		}
		
		log.println("Loading seed resources");
		
		for(File file: designFileList) {
			log.println("Loading resource " + file.getPath());
			domain.getResourceSet().getResource(URI.createFileURI(file.getPath()), true);
		}
		
		if(impliedProjectDir == null) {
			impliedProjectDir = "./";
		}
		
		log.println("Implied project dir = " + impliedProjectDir);
		
		// Build references
		EcoreUtil.resolveAll(domain.getResourceSet());
		domain.buildReferenceCache();
		
		return impliedProjectDir;
	}

	public static void sanitizeDiagram(Diagram finalDiagram) {
		/* Clean up diagram some more, deal with only top level objects */
		List<Shape> toRemoveShapes = new LinkedList<Shape>();
		for (Object obj: finalDiagram.getDiagram().getChildren()) {
			if(obj instanceof Shape) {
				Shape shape = (Shape)obj;
				if(shape.getElement() instanceof MasterDesign ||
						shape.getElement() instanceof Instance) {
					toRemoveShapes.add(shape);
				}
			}
		}
		
		for (Shape shape: toRemoveShapes) {	
			finalDiagram.getDiagram().removeChild(shape);
		}
		
		List<Edge> toRemoveEdges = new LinkedList<Edge>();
		for (Object obj: finalDiagram.getDiagram().getEdges()) {
			if(obj instanceof Edge) {
				Edge edge = (Edge)obj;
				if(edge.getElement() instanceof MasterDesign) {
					toRemoveEdges.add(edge);
				}
				if(edge.getElement() instanceof Instance) {
					toRemoveEdges.add(edge);
				}
			}
		}
		
		for (Edge edge: toRemoveEdges) {	
			finalDiagram.getDiagram().removeEdge(edge);
		}
	}
}
