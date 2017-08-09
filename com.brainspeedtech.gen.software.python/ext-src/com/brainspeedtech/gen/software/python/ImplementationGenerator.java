/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.python;

import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;

public class ImplementationGenerator {


	public static void generate(final SwarmCachingEditingDomain domain,
			String outputDir, String designName) throws Exception {

		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
//
//		IProject project = WorkspaceSynchronizer.getFile(masterResource)
//				.getProject();
//
//		TransactionalEditingDomain domain = TransactionUtil
//				.getEditingDomain(masterResource);
//		Resource instanceSource = null;
//		URI instURI = URI.createPlatformResourceURI(project.getFullPath()
//				.append(designName + ".inst").toString(), true);
//		try {
//			instanceSource = domain.getResourceSet().getResource(instURI, true);
//		} catch (Exception e) {
//			instanceSource = null;
//		}

//		Instance instance = InstFactory.eINSTANCE.createInstance();
//
//		if (instanceSource == null) {
//			return;
//		} else {
//			/* Diagram already present, translate the differences */
//			Diagram diagram = (Diagram) EcoreUtil.getObjectByType(
//					instanceSource.getContents(),
//					NotationPackage.eINSTANCE.getDiagram());
//
//			if (diagram == null) {
//				return;
//			}
//
//			if (diagram.getElement() instanceof Instance) {
//				instance = (Instance) diagram.getElement();
//			} else {
//				return;
//			}
//		}
		
//		/* Write the global design header file */
//		mappingFile = container.getFile("gen_" + designName + ".h");
//		GeneratorFile sourceFile = new GeneratorFile(mappingFile);
//		String data = new DesignHeaderFile().generate(instance);
//		sourceFile.write(data);
//		sourceFile.place();
//		
//		mappingFile = container.getFile("gen_" + designName + ".c");
//		sourceFile = new GeneratorFile(mappingFile);
//		data = new DesignStartupFile().generate(instance);
//		sourceFile.write(data);
//		sourceFile.place();
//		
//		mappingFile = container.getFile("gen_" + designName + "_swarm_lib.h");
//		sourceFile = new GeneratorFile(mappingFile);
//		data = new SwarmLibFile().generate(instance);
//		sourceFile.write(data);
//		sourceFile.place();
//
//		mappingFile = container.getFile("gen_" + designName + "_swarm_lib.c");
//		sourceFile = new GeneratorFile(mappingFile);
//		data = new SwarmLibSourceFile().generate(instance);
//		sourceFile.write(data);
//		sourceFile.place();
//		
//		mappingFile = container.getFile("Makefile-posix");
//		sourceFile = new GeneratorFile(mappingFile);
//		data = new MakeFile().generate(instance);
//		sourceFile.write(data);
//		sourceFile.place();
//
//
//		for (CellInstance cellInstance: instance.getCell()) {
//			
//			if (cellInstance.getCell().isExternal()) continue;
//			
//			mappingFile = container.getFile("gen_" + cellInstance.getName() + ".h");
//			sourceFile = new GeneratorFile(mappingFile);
//			data = new InstanceHeaderFile().generate(cellInstance);
//			sourceFile.write(data);
//			sourceFile.place();
//			
//			mappingFile = container.getFile("gen_" + cellInstance.getName() + ".c");
//			sourceFile = new GeneratorFile(mappingFile);
//			data = new InstanceSourceFile().generate(cellInstance);
//			sourceFile.write(data);
//			sourceFile.place();
//
//		}
//		
//		MasterDesign mDesign = (MasterDesign) EcoreUtil.getObjectByType(
//				masterResource.getContents(),
//				MasterPackage.eINSTANCE.getMasterDesign());
//
//		if (mDesign == null)
//			return;
//
//		for (MasterCell masterCell: mDesign.getCell()) {
//			
//			if (masterCell.isExternal()) continue;
//			
//			mappingFile = container.getFile("gen_" + masterCell.getName() + ".h");
//			sourceFile = new GeneratorFile(mappingFile);
//			data = new InstancePlanHeaderFile().generate(masterCell);
//			sourceFile.write(data);
//			sourceFile.place();
//			
//			mappingFile = container.getFile("gen_" + masterCell.getName() + "_plan.c");
//			sourceFile = new GeneratorFile(mappingFile);
//			data = new InstancePlanSourceFile().generate(masterCell);
//			sourceFile.write(data);
//			sourceFile.place();
//
//
//		}

	}
}
