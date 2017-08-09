/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.sgen;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashSet;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl.FactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import com.brainspeedtech.constraint.hardware.hx.HxPackage;
import com.brainspeedtech.constraint.hardware.verilog.VerilogPackage;
import com.brainspeedtech.constraint.software.SoftwarePackage;
import com.brainspeedtech.constraint.software.posix.PosixPackage;
import com.brainspeedtech.gen.html.DocStructGenerator;
import com.brainspeedtech.gen.hyperx.ImplementationGenerator;
import com.brainspeedtech.gen.hyperx.SMGenerator;
import com.brainspeedtech.gen.hyperx.StructGenerator;
import com.brainspeedtech.gen.inst.InstanceGenerator;
import com.brainspeedtech.gen.master.MasterGenerator;
import com.brainspeedtech.gen.verilog.DescriptorGenerator;
import com.brainspeedtech.gen.verilog.RegisterGenerator;
import com.brainspeedtech.reg.RegPackage;
import com.brainspeedtech.struct.StructPackage;
import com.brainspeedtech.struct.util.StructResourceFactoryImpl;
import com.brainspeedtech.struct.util.StructValidator;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.util.InstResourceFactoryImpl;
import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.layer.complexity.ComplexityPackage;
import com.brainspeedtech.swarm.layer.util.LayerResourceFactoryImpl;
import com.brainspeedtech.swarm.layer.util.LayerValidator;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.util.MasterResourceFactoryImpl;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.util.ProjectUtil;
import com.brainspeedtech.swarm.sm.SmPackage;

public class SGen {


	static SGen instance = new SGen();

	private Log log = LogFactory.getLog(SGen.class);

	private SwarmCachingEditingDomain editingDomain;

	private Collection<String> generators;
	private String outputDir;
	private String designName;

	public static String VERSION = "1.0.0.201507152040";  String[] savedArgs;
	private String projectDir;
	private String[] fileArgs;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		instance.loadPackages();
		instance.savedArgs = args.clone();
		instance.parseOptions(args);
		instance.resolveGenerators();
		instance.callGenerators();
	}
	
	private void loadFiles(String[] ext, Log log) throws ParseException {
		initializeDomain();
		projectDir = ProjectUtil.InitializeProject(editingDomain, fileArgs, ext, System.out);
		
		for(Resource resource: editingDomain.getResourceSet().getResources()) {
			log.trace("Resolved file " + resource.getURI().toFileString());
		}

		EcoreUtil.resolveAll(editingDomain.getResourceSet());
		instance.validateResources();

	}
	
	private void callGenerators() throws Exception {
		if(generators.contains("master")) {
			
			loadFiles(new String[] { "flow", "layer", "struct", "sm" }, log);

			log.trace("Generating Master Design");
			MasterGenerator.generate(editingDomain, outputDir + "/" + designName, designName, System.out);
			log.trace("Master Design generated");
			
			//SwarmCachingEditingDomain.loadJScript(editingDomain, MasterGenerator.class, projectDir, outputDir + "/" + designName, designName, 
			//		"swarm/master", System.out);
			parseOptions(savedArgs);
			resolveGenerators();
			validateResources();
		}
		
		if(generators.contains("inst")) {
			loadFiles(new String[] { "master", "layer", "struct", "sm" }, log);

			log.trace("Generating Instance Design");
			InstanceGenerator.generate(editingDomain, outputDir + "/" + designName, designName, System.out);
			log.trace("Instance Design Generated");

			//SwarmCachingEditingDomain.loadJScript(editingDomain, InstanceGenerator.class, projectDir, outputDir + "/" + designName, designName, 
			//		"swarm/instance", System.out);

			parseOptions(savedArgs);
			resolveGenerators();
			validateResources();
		}
		

		loadFiles(new String[] { "master", "inst", "layer", "struct", "sm" }, log);

		if(generators.contains("hx")) {
			EcoreUtil.resolveAll(editingDomain.getResourceSet());

			log.trace("Generating Hyperx Implementation");
			ImplementationGenerator.generate(editingDomain, outputDir+ "/" + designName + "-hx", designName);
			log.trace("Hyperx Implementation Generated");
			
			log.trace("Generating Hyperx State Machines");
			SMGenerator.generate(editingDomain, outputDir + "/" + designName + "-hx", designName);
			log.trace("Hyperx State Machines Generated");
			
			log.trace("Generating Hyperx Structures");
			StructGenerator.generate(editingDomain, outputDir + "/" + designName + "-hx", designName);
			log.trace("Hyperx Structures Generated");
			
			//SwarmCachingEditingDomain.loadJScript(editingDomain, ImplementationGenerator.class, projectDir, outputDir + "/" + designName + "-hx", designName, 
			//		"logic/software/hyperx", System.out);
		}
		
		if(generators.contains("posix")) {
			EcoreUtil.resolveAll(editingDomain.getResourceSet());

			log.trace("Generating Posix Implementation");
			com.brainspeedtech.gen.software.posix.ImplementationGenerator.generate(editingDomain,
					outputDir+ "/" + designName + "-posix", designName, System.out);
			log.trace("Posix Implementation Generated");
			
			log.trace("Generating Posix State Machines");
			com.brainspeedtech.gen.software.posix.SMGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-posix", designName);
			log.trace("Posix State Machines Generated");
			
			log.trace("Generating Posix Structures");
			com.brainspeedtech.gen.software.posix.StructGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-posix", designName, System.out);
			log.trace("Posix Structures Generated");

			//SwarmCachingEditingDomain.loadJScript(editingDomain, com.brainspeedtech.gen.software.posix.ImplementationGenerator.class, projectDir, outputDir + "/" + designName + "-posix", designName, 
			//		"logic/software/posix", System.out);
		}
		
		if(generators.contains("vpi")) {
			EcoreUtil.resolveAll(editingDomain.getResourceSet());

			log.trace("Generating VPI Implementation");
			com.brainspeedtech.gen.software.posix.vpi.ImplementationGenerator.generate(editingDomain,
					outputDir+ "/" + designName + "-vpi", designName);
			log.trace("VPI Implementation Generated");
			
			log.trace("Generating VPI State Machines");
			com.brainspeedtech.gen.software.posix.SMGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-vpi", designName);
			log.trace("VPI State Machines Generated");
			
			log.trace("Generating VPI Structures");
			com.brainspeedtech.gen.software.posix.StructGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-vpi", designName, System.out);
			log.trace("VPI Structures Generated");
			//SwarmCachingEditingDomain.loadJScript(editingDomain, com.brainspeedtech.gen.software.posix.vpi.ImplementationGenerator.class, projectDir, outputDir + "/" + designName + "-vpi", designName, 
			//		"logic/hardware/verilog/vpi", System.out);
		}
		
		if(generators.contains("verilog")) {
			EcoreUtil.resolveAll(editingDomain.getResourceSet());

			log.trace("Generating Verilog Implementation");
			com.brainspeedtech.gen.verilog.ImplementationGenerator.generate(editingDomain,
					outputDir+ "/" + designName + "-verilog", designName);
			log.trace("Verilog Implementation Generated");

			log.trace("Generating Verilog Structures");
			RegisterGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-verilog", designName);
			log.trace("Verilog Structures Generated");
			
			log.trace("Generating Verilog Descriptors");
			DescriptorGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-verilog", designName);
			log.trace("Verilog Descriptors Generated");
			//SwarmCachingEditingDomain.loadJScript(editingDomain, com.brainspeedtech.gen.verilog.ImplementationGenerator.class, projectDir, outputDir + "/" + designName + "-verilog", designName, 
			//		"logic/hardware/verilog", System.out);
		}
		
		if(generators.contains("python")) {
			EcoreUtil.resolveAll(editingDomain.getResourceSet());

			log.trace("Generating Python Structures");
			com.brainspeedtech.gen.software.python.StructGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-python", designName);
			log.trace("Python Structures Generated");
			//SwarmCachingEditingDomain.loadJScript(editingDomain, com.brainspeedtech.gen.software.python.StructGenerator.class, projectDir, outputDir + "/" + designName + "-python", designName, 
			//		"logic/software/python", System.out);
		}
		
		if(generators.contains("java")) {
			EcoreUtil.resolveAll(editingDomain.getResourceSet());

			log.trace("Generating Java Implementation");
			com.brainspeedtech.gen.software.java.ImplementationGenerator.generate(editingDomain,
					outputDir+ "/" + designName + "-java", designName);
			log.trace("Java Implementation Generated");
			
			log.trace("Generating Java State Machines");
			com.brainspeedtech.gen.software.java.SMGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-java", designName);
			log.trace("Java State Machines Generated");
			
			log.trace("Generating Java Structures");
			com.brainspeedtech.gen.software.java.StructGenerator.generate(editingDomain,
					outputDir + "/" + designName + "-java", designName);
			log.trace("Java Structures Generated");
			//SwarmCachingEditingDomain.loadJScript(editingDomain, com.brainspeedtech.gen.software.java.ImplementationGenerator.class, projectDir, outputDir + "/" + designName, designName, 
			//		"logic/software/java", System.out);
		}
		
		if(generators.contains("doc")) {
			EcoreUtil.resolveAll(editingDomain.getResourceSet());

			log.trace("Generating Document Implementation");
			DocStructGenerator.generate(editingDomain,
					outputDir+ "/" + designName + "-doc", designName);
			log.trace("Document Implementation Generated");
			//SwarmCachingEditingDomain.loadJScript(editingDomain, DocStructGenerator.class, projectDir, outputDir + "/" + designName + "-doc", designName, 
			//		"doc", System.out);

		}
	}

	private void resolveGenerators() throws ParseException {

//		if (generators.contains("hx") ||
//				generators.contains("posix") ||
//				generators.contains("verilog") ||
//				generators.contains("vpi") ||
//				generators.contains("doc") ||
//				generators.contains("java") ||
//				generators.contains("python")) {
//			
//			generators.add("inst");
//		}
//		
//		if (generators.contains("inst")) {
//			generators.add("master");
//		}
	}

	private void loadPackages() {
		// Register Packages
		StructPackage.eINSTANCE.getEFactoryInstance();
		FlowPackage.eINSTANCE.getEFactoryInstance();
		MasterPackage.eINSTANCE.getEFactoryInstance();
		InstPackage.eINSTANCE.getEFactoryInstance();
		LayerPackage.eINSTANCE.getEFactoryInstance();
		SmPackage.eINSTANCE.getEFactoryInstance();
		ComplexityPackage.eINSTANCE.getEFactoryInstance();
		PosixPackage.eINSTANCE.getEFactoryInstance();
		SoftwarePackage.eINSTANCE.getEFactoryInstance();
		NotationPackage.eINSTANCE.getEFactoryInstance();
		HxPackage.eINSTANCE.getEFactoryInstance();
		com.brainspeedtech.constraint.software.hx.HxPackage.eINSTANCE.getEFactoryInstance();
		RegPackage.eINSTANCE.getEFactoryInstance();
		VerilogPackage.eINSTANCE.getEFactoryInstance();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("struct", new StructResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("flow", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("inst", new InstResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("master", new MasterResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("layer", new LayerResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sm", new XMIResourceFactoryImpl());
		
		EValidator.Registry.INSTANCE.put(StructPackage.eINSTANCE, StructValidator.INSTANCE);
		EValidator.Registry.INSTANCE.put(LayerPackage.eINSTANCE, LayerValidator.INSTANCE);
	}

	private void initializeDomain() {
		ComposedAdapterFactory allFactories = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		
		
		editingDomain = new SwarmCachingEditingDomain(allFactories, new SwarmCachingEditingDomain.SGENResourceSet());
		FactoryImpl timpl = new FactoryImpl();
		timpl.mapResourceSet(editingDomain);
		
		editingDomain.getResourceSet().getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true),
				URI.createFileURI(outputDir + "/"));
		editingDomain.setID(designName);
		editingDomain.setBaseURI(URI.createFileURI(outputDir + "/" + designName));
	}
	

	private void validateResources () {
		Diagnostician diagnostician = Diagnostician.INSTANCE;
		
		TreeIterator<Object> iterator = EcoreUtil.getAllContents(editingDomain.getResourceSet(), true);
		
		while(iterator.hasNext()) {
			Object object = iterator.next();
			if (object instanceof EObject) {
				diagnostician.validate((EObject) object);
			}
		}
	}
	
	public void parseOptions(String[] args) {

		
		CommandLineParser parser = new GnuParser();
		Options options = new Options();

		OptionBuilder.withArgName("design");
		OptionBuilder.hasArg();
		OptionBuilder.isRequired(true);
		OptionBuilder.withDescription("Design Name");
		options.addOption(OptionBuilder.create("d"));

		OptionBuilder.withArgName("output_dir");
		OptionBuilder.hasArg();
		OptionBuilder.isRequired(true);
		OptionBuilder.withDescription("Output Directory Name");
		options.addOption(OptionBuilder.create("o"));

		OptionBuilder.withArgName("generators");
		OptionBuilder.hasArg();
		OptionBuilder.isRequired(true);
		OptionBuilder.withDescription("Invoke generators");
		options.addOption(OptionBuilder.create("g"));

		OptionBuilder.withDescription("Print this help");
		options.addOption(OptionBuilder.create("h"));

		OptionBuilder.withDescription("Show verbose debug messages");
		options.addOption(OptionBuilder.create("debug"));

		System.out.println("swarm version " + VERSION);
		try {
			// parse the command line arguments
			CommandLine line = parser.parse(options, args);
			
			if (line.hasOption("h")) {
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("swarm [OPTIONS]... [LAYERS]...", options);
				System.exit(0);
			}
			designName = line.getOptionValue('d');
			outputDir = line.getOptionValue('o');
			
			generators = new HashSet<String>();
			
			if (line.hasOption("g")) {
				for(String gen: line.getOptionValue('g').split(",")) {
					generators.add(gen);
				}
			}

			log.trace("Collecting seed files " + args);

			args = line.getArgs();
			if (args.length == 0) {
				args = new String[] { "./" };
			}
			
			fileArgs = args;

		}

		catch (ParseException exp) {
			System.out.println("Error parsing command line: "
					+ exp.getMessage());
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("swarm [OPTIONS]... [LAYERS]...", options);
			System.exit(-1);
		}
		
		
		//new StandaloneSetup().addUriMap(new Mapping("platform:/resource", "file:/" + outputDir));

		//System.setProperty("user.dir", new File(outputDir).getAbsolutePath());
	
	}

}
