/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;
import org.eclipse.gmf.runtime.notation.Diagram;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowFactory;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.Tube;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.FlowEditPart;
import com.brainspeedtech.swarm.flow.diagram.part.FlowDiagramEditorPlugin;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.master.util.MasterUtil;

public class UnitTestGenerator {

	public static void generate(IContainer obj) throws Exception {
		// Find all struct files in project
		for (IResource resource : obj.members()) {
			if ((resource.getType() & IResource.FILE) != 0
					&& resource.getFileExtension() != null
					&& resource.getFileExtension().equals("master")) {
				generate((IFile) resource);
			}

			if ((resource.getType() & IResource.FOLDER) != 0) {
				generate((IContainer) resource);
			}
		}
	}

	public static void generate(IFile file) throws Exception {
		MasterPackage.eINSTANCE.eClass();
		FlowPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("master", new GMFResourceFactory());
		m.put("flow", new GMFResourceFactory());


		/* Open the master file */
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Get the resource
		Resource resource = resSet.getResource(URI.createPlatformResourceURI(
				file.getFullPath().toString(), true), true);
		
		// for each Master Cell, create a new test folder
		
		MasterDesign mDesign = (MasterDesign)EcoreUtil.getObjectByType(resource.getContents(), 
				MasterPackage.eINSTANCE.getMasterDesign());
		Collection<MasterCell> masterCellList = EcoreUtil.getObjectsByType(mDesign.eContents(),
				MasterPackage.eINSTANCE.getMasterCell());

		for (MasterCell mCell : masterCellList) {
			if (mCell.isExternal()) continue;
			
			String designName = mCell.getName();

			IProject project = file.getWorkspace().getRoot().getProject(designName + "-unit-test");
			if (!project.exists()) {
				project.create(null);
			}
			project.open(null);
			// Obtain a new resource set
			
			Set<Flow> flows = new HashSet<Flow>();

			Set<Tube> inputTubes = new HashSet<Tube>();
			for(MasterTube mTube: mCell.getInput()) {
				inputTubes.addAll(mTube.getDesignTubes());
				flows.addAll(MasterUtil.getFlows(mTube));
			}
			
			Set<Tube> outputTubes = new HashSet<Tube>();
			for(MasterTube mTube: mCell.getOutput()) {
				outputTubes.addAll(mTube.getDesignTubes());
				flows.addAll(MasterUtil.getFlows(mTube));
			}

			// Create all flow files in the test folder
			for(Flow flow: flows) {
				
				Resource flowResource;
				URI flowURI = URI.createPlatformResourceURI(project.getFullPath()
						.append(flow.getName() + ".flow").toString(), true);
				try {
					flowResource = resSet.getResource(flowURI, true);
				} catch (Exception e) {
					flowResource = resSet.getResource(flowURI, false);
				}
				if (flowResource == null) {
					flowResource = resSet.createResource(flowURI);
				}
				
				flowResource.getContents().clear();
				
				Flow testFlow = FlowFactory.eINSTANCE.createFlow();
				testFlow.setName(flow.getName());
				
				
				/* Create test shells */
				Cell testInCell = FlowFactory.eINSTANCE.createCell();
				testInCell.setName("test_in");
				testFlow.getCell().add(testInCell);

				Cell testOutCell = FlowFactory.eINSTANCE.createCell();
				testOutCell.setName("test_out");
				testFlow.getCell().add(testOutCell);
				
				/* Create external shells */
				Cell extInCell = FlowFactory.eINSTANCE.createCell();
				extInCell.setName("ext_in");
				extInCell.setExternal(true);
				testFlow.getCell().add(extInCell);

				Cell extOutCell = FlowFactory.eINSTANCE.createCell();
				extOutCell.setName("ext_out");
				extOutCell.setExternal(true);
				testFlow.getCell().add(extOutCell);
				
				Tube newTube = FlowFactory.eINSTANCE.createTube();
				newTube.setName("ext_in");
				newTube.setFrom(extInCell);
				newTube.setTo(testInCell);
				testFlow.getTube().add(newTube);
				
				newTube = FlowFactory.eINSTANCE.createTube();
				newTube.setName("ext_out");
				newTube.setFrom(testOutCell);
				newTube.setTo(extOutCell);
				testFlow.getTube().add(newTube);			
				
				for (Cell cell: flow.getCell()) {
					if (!cell.getName().equals(mCell.getName())) {
						continue;
					}
					
					/* Create a duplicate cell */
					Cell newCell = EcoreUtil.copy(mCell.getDesignCells().get(0));
					testFlow.getCell().add(newCell);

					for(Tube tube: flow.getTube()) {

						if (tube.getTo() == cell) {
							newTube = FlowFactory.eINSTANCE.createTube();
							newTube.setFrom(testInCell);
							newTube.setTo(newCell);
						} else if (tube.getFrom() == cell) {
							newTube = FlowFactory.eINSTANCE.createTube();
							newTube.setFrom(newCell);
							newTube.setTo(testOutCell);
						} else {
							continue;
						}
						newTube.setName(tube.getName());
						newTube.getDescriptor().addAll(tube.getDescriptor());
						testFlow.getTube().add(newTube);
					}
				}


				Diagram diagram = ViewService.createDiagram(
						testFlow,
						FlowEditPart.MODEL_ID,
						FlowDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				flowResource.getContents().add(diagram);
				flowResource.getContents().add(diagram.getElement());

				flowResource.save(null);

			}
		}
	}

}
