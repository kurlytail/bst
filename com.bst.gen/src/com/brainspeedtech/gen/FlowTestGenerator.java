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
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.Tube;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.master.util.MasterUtil;

public class FlowTestGenerator {

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

		Set<Flow> flows = new HashSet<Flow>();

		for (MasterCell mCell : masterCellList) {
			if (mCell.isExternal()) continue;

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
			
		}
			
		for (Flow flow: flows) {
			String designName = flow.getName();

			IProject project = file.getWorkspace().getRoot().getProject(designName + "-flow-test");
			if (!project.exists()) {
				project.create(null);
			}
			project.open(null);

			/* Find the master cells for cells in this flow */
			Set<MasterCell> mCellSet = new HashSet<MasterCell>();
			
			for (MasterCell mCell : masterCellList) {
				for (Cell cell: flow.getCell()) {
					if (cell.getName().equals(mCell.getName())) {
						mCellSet.add(mCell);
					}
				}
			}
			
			/* Create the set of master cells that connect to the cells */
			Set<MasterCell> mConnectedSet = new HashSet<MasterCell>();
			Set<Flow> fConnectedFlows = new HashSet<Flow>();

			for (MasterCell mCell: mCellSet) {
				for(MasterTube mTube: mCell.getOutput()) {
					mConnectedSet.add(mTube.getTo());
					fConnectedFlows.addAll(MasterUtil.getFlows(mTube));
				}
				for(MasterTube mTube: mCell.getInput()) {
					mConnectedSet.add(mTube.getFrom());
					fConnectedFlows.addAll(MasterUtil.getFlows(mTube));
				}
			}
			
			mConnectedSet.removeAll(mCellSet);
			
			/* Find all the unit test designs for those master cells and refer to
			 * those flows in this design
			 */
			
			for (MasterCell mCell: mCellSet) {
				IProject unitProject = file.getWorkspace().getRoot().getProject(mCell.getName() + "-unit-test");
				if (!unitProject.exists()) continue;

				for (Flow mFlow: fConnectedFlows) {
					/* Attempt to get the flow test definition */
					IFile flowFile = unitProject.getFile(mFlow.getName() + ".flow");
					if (!flowFile.exists()) continue;
					
					Resource flowResource = resSet.getResource(URI.createPlatformResourceURI(
							flowFile.getFullPath().toString(), true), true);
					Flow testFlow = (Flow)EcoreUtil.getObjectByType(flowResource.getContents(), FlowPackage.eINSTANCE.getFlow());

				}
			}

		}
	}

}
