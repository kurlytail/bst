package com.brainspeedtech.swarm.listeners;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.widgets.Display;

import com.brainspeedtech.swarm.Design;
import com.brainspeedtech.swarm.DesignFlow;
import com.brainspeedtech.swarm.SwarmFactory;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class WorkspaceListener implements IResourceChangeListener {

	public WorkspaceListener() {

	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// we are only interested in POST_CHANGE events
		if (event.getType() != IResourceChangeEvent.POST_CHANGE)
			return;
		IResourceDelta rootDelta = event.getDelta();

		IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
			public boolean visit(IResourceDelta delta) {
				if (delta.getKind() != IResourceDelta.ADDED)
					return true;

				final IResource file = delta.getResource();
				if (file == null || file.getFileExtension() == null)
					return true;
				
				if (!file.getFileExtension().equals("flow"))
					return true;

				IProject project = file.getProject();
				final TransactionalEditingDomain domain = SwarmEditingDomainFactory
						.getEditingDomain(file);

				/* Get the designer resource */
				final IFile designerFile = project.getFile("design.swarm");
				if (!designerFile.exists())
					return true;

				domain.getResourceSet().getResource(
						URI.createPlatformResourceURI(file.getFullPath()
								.toString(), true), true);

				return true;
			}
		};

		try {
			rootDelta.accept(visitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

}
