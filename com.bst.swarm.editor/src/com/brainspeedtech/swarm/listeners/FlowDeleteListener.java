package com.brainspeedtech.swarm.listeners;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.DemultiplexingListener;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

import com.brainspeedtech.swarm.DesignFlow;
import com.brainspeedtech.swarm.SwarmPackage;

public class FlowDeleteListener extends DemultiplexingListener {

	private static NotificationFilter eventFilter = 
			NotificationFilter.createEventTypeFilter(Notification.REMOVE).or(
					NotificationFilter
							.createEventTypeFilter(Notification.REMOVE_MANY));
	private static NotificationFilter featureFilter = 
			NotificationFilter.createFeatureFilter(SwarmPackage.eINSTANCE.getDesign_Flow());
	
	public FlowDeleteListener() {
		super(featureFilter.and(eventFilter));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void handleNotification(TransactionalEditingDomain domain,
			Notification notification) {
		
		Set<DesignFlow> deletedFlows = new HashSet<DesignFlow>();
		
		if (notification.getEventType() == Notification.REMOVE) {
			deletedFlows.add((DesignFlow)notification.getOldValue());
		} else {
			deletedFlows.addAll((Collection<DesignFlow>)notification.getOldValue());
		}

		for(final DesignFlow dflow: deletedFlows) {
			IWorkspaceRunnable myRunnable = new IWorkspaceRunnable(){
				@Override
				public void run(IProgressMonitor monitor) throws CoreException {
					IFile file = WorkspaceSynchronizer.getFile(dflow.getFlow().eResource());
					if (file.exists()) {
						file.delete(true, new NullProgressMonitor());
					}
				}
			};
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			try {
				workspace.run(myRunnable, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
