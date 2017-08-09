/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.constraint.software.ui.popup.actions;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.brainspeedtech.constraint.software.SocketTube;
import com.brainspeedtech.constraint.software.SoftwareFactory;
import com.brainspeedtech.constraint.software.SoftwarePackage;
import com.brainspeedtech.constraint.software.TCPSocketTube;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.layer.Layer;
import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.layer.presentation.LayerEditor;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class CreateDefaultServerSockets implements IObjectActionDelegate {

	private Layer layer;
	private static Random random = new Random();
	IWorkbenchPart editor;

	
	/**
	 * Constructor for Action1.
	 */
	public CreateDefaultServerSockets() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		editor = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (layer == null) return;
		
		IFile file = WorkspaceSynchronizer.getFile(layer.eResource());
		if (file == null) return;
		
		IProject project = file.getProject();
		IFile instanceFile = project.getFile(project.getName() + ".inst");
		if (!instanceFile.exists()) return;
		
//		TransactionalEditingDomain domain =
//				SwarmEditingDomainFactory.getEditingDomain(instanceFile);
//		if (domain == null) return;
		
		Resource resource = layer.eResource().getResourceSet().getResource(URI.createPlatformResourceURI(
				instanceFile.getFullPath().toString(), true), true);
		if (resource == null) return;
		
		Instance instance = (Instance)EcoreUtil.getObjectByType(resource.getContents(), InstPackage.eINSTANCE.getInstance());
		if (instance == null) return;
		
		EditingDomain domain = ((IEditingDomainProvider)editor).getEditingDomain();		

		Set<Integer> portSet = new HashSet<Integer>();
		

		Collection<Object> sockets = EcoreUtil.getObjectsByType(
				layer.getConstraint(),
				SoftwarePackage.eINSTANCE.getTCPSocketTube());
		for (Object sObj : sockets) {
			if (!(sObj instanceof TCPSocketTube))
				continue;
			TCPSocketTube tObj = (TCPSocketTube) sObj;
			portSet.add(tObj.getServerPort());
		}
		
		List<SocketTube> addedTubes = new LinkedList<SocketTube>();
		
		for(TubeInstance tInst: instance.getTube()) {
			boolean clientReceiver = false;
			if(tInst.getTo().getCell().isExternal() &&
					tInst.getFrom().getCell().isExternal()) continue;
			if((!tInst.getTo().getCell().isExternal()) &&
							(!tInst.getFrom().getCell().isExternal())) continue;
			if(tInst.getTo().getCell().isExternal()) {
				clientReceiver = true;
			}
			
			TCPSocketTube socketTube = ProjectUtil.getReferringInstance(tInst, TCPSocketTube.class);
			if (socketTube != null) continue;
			
			socketTube = SoftwareFactory.eINSTANCE.createTCPSocketTube();
			socketTube.setClientReceiver(clientReceiver);
			socketTube.setBlurb("TCP Server Socket for " + tInst.getName());
			socketTube.setProcess("Automatically Added by User Action");
			socketTube.setServerIP("localhost");
			
			int newPort;
			while(true) {
				newPort = random.nextInt(30000) + 30000;
				if(portSet.contains(newPort)) continue;
				break;
			}
			socketTube.setServerPort(newPort);
			socketTube.getTube().add(tInst);
			
			addedTubes.add(socketTube);
		}
		
		if (!addedTubes.isEmpty()) {
		final List<SocketTube> finalTube = addedTubes;
		domain.getCommandStack().execute(new AbstractCommand() {
			@Override
			public void execute() {
				layer.getConstraint().addAll(finalTube);
			}
			

			@Override
			public boolean canExecute() {
				return true;
			}
			@Override
			public boolean canUndo() {
				return true;
			}


			@Override
			public void undo() {
				layer.getConstraint().removeAll(finalTube);
			}


			@Override
			public void redo() {
				layer.getConstraint().addAll(finalTube);
			}});

		((LayerEditor)editor).externalSetDirty();
		}

//		Map<Object, Object> saveOptions = new HashMap<Object, Object>();
//		saveOptions
//				.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
//						Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
//		if(layer.eResource().getContents().size() != 0)
//			try {
//				layer.eResource().save(saveOptions);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if(!(selection instanceof StructuredSelection)) return;
		
		StructuredSelection sel = (StructuredSelection)selection;
		layer = (Layer)sel.getFirstElement();
	}

}
