package com.brainspeedtech.swarm.listeners;

import org.eclipse.core.internal.resources.WorkspaceRoot;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.DemultiplexingListener;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.swt.widgets.Display;

import com.brainspeedtech.swarm.Design;
import com.brainspeedtech.swarm.DesignFlow;
import com.brainspeedtech.swarm.SwarmFactory;
import com.brainspeedtech.swarm.flow.Flow;

public class ResourceLoadedListener extends DemultiplexingListener {

	public ResourceLoadedListener() {
		super(NotificationFilter.RESOURCE_LOADED
				.or(NotificationFilter.RESOURCE_UNLOADED));
	}

	@Override
	protected void handleNotification(final TransactionalEditingDomain domain,
			Notification notification) {

		Resource resource = (Resource) notification.getNotifier();

		if (!notification.getOldBooleanValue()
				&& notification.getNewBooleanValue()) {
			
			if (resource.getContents().isEmpty()
					|| !(resource.getContents().get(0) instanceof Flow))
				return;
			
			IFile flowFile = WorkspaceSynchronizer.getFile(resource);
			if (!flowFile.exists())
				return;

			String projectId = TransactionUtil.getEditingDomain(resource).getID();
			IProject project = flowFile.getWorkspace().getRoot().getProject(projectId);
			if (!project.exists() || !project.isOpen())
				return;

			Flow flow = (Flow) resource.getContents().get(0);
			IFile designFile = project.getFile("design.swarm");
			if (!designFile.exists())
				return;

			Resource dResource = resource.getResourceSet().getResource(
					URI.createPlatformResourceURI(designFile.getFullPath()
							.toString(), true), true);
			final Design design = (Design) dResource.getContents().get(0);

			boolean flowFound = false;
			for (DesignFlow dFlow : design.getFlow()) {
				if (dFlow.getFlow() == flow) {
					flowFound = true;
					break;
				}
			}

			if (!flowFound) {
				final DesignFlow dFlow = SwarmFactory.eINSTANCE.createDesignFlow();
				dFlow.setFlow(flow);
				Display.getDefault().asyncExec(new Runnable() {
					
					@Override
					public void run() {
						domain.getCommandStack().execute(
								new AddCommand(domain, design.getFlow(), dFlow));
					}
				});
			}
		}
	}
}
