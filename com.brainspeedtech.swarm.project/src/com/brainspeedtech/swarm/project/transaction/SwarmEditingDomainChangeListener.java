/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.transaction;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.ui.statushandlers.StatusManager;

import com.brainspeedtech.swarm.project.Activator;
import com.brainspeedtech.swarm.project.builder.SwarmEditingDomainBuilder;
import com.brainspeedtech.swarm.project.builder.SwarmNature;

public class SwarmEditingDomainChangeListener implements
		IResourceChangeListener {
	
	boolean stopThread = false;
	
	private Thread thread;
	
	private int startCount = 0;
	
	public void updateReferences() {
		synchronized(this) {
			++startCount;
			this.notifyAll();
		}
	}
	
	public static void updateReferences(IProject project) {
		QualifiedName name = new QualifiedName(project.getName(), "synchronizer");
		SwarmEditingDomainSynchronizerDelegate synchronizer;
		SwarmEditingDomainFactory.getEditingDomain(project);
		try {
			synchronizer = (SwarmEditingDomainSynchronizerDelegate) project.getSessionProperty(name);
			synchronizer.updateReferences();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	List<Resource> touchedResources = new LinkedList<Resource>();
	
	public SwarmEditingDomainChangeListener() {
		super();
	}
	
	public SwarmEditingDomainChangeListener(final IProject project) {
		super();

		thread = new Thread("Reference updator for " + project.getName()) {
			@Override
			public void run() {
				while (true) {
					boolean wireProject = false;
					
					final List<Resource> touched = new LinkedList<Resource>();

					synchronized (SwarmEditingDomainChangeListener.this) {
						try {
							SwarmEditingDomainChangeListener.this.wait();
						} catch (InterruptedException e) {
						}
						if (startCount != 0)
							wireProject = true;
						startCount = 0;
						touched.addAll(touchedResources);
						touchedResources.clear();
					}

					if (stopThread)
						break;
					
					final TransactionalEditingDomain domain = SwarmEditingDomainFactory.getEditingDomain(project);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						
						@Override
						protected void doExecute() {
							for(Resource resource: touched) {
								resource.unload();
							}

							for(Resource resource: touched) {
								if(!WorkspaceSynchronizer.getFile(resource).exists()) {
									domain.getResourceSet().getResources().remove(resource);
								} 
							}

						}
					});


					if (wireProject) {
						try {
							project.build(IncrementalProjectBuilder.FULL_BUILD, 
									SwarmEditingDomainBuilder.BUILDER_ID, null, new NullProgressMonitor());
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		thread.start();
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// we are only interested in POST_CHANGE events
		if (event.getType() != IResourceChangeEvent.POST_CHANGE)
			return;
		IResourceDelta rootDelta = event.getDelta();

		IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
			public boolean visit(final IResourceDelta delta) {
				// only interested in added
				if (delta.getKind() != IResourceDelta.ADDED)
					return true;

				if (!(delta.getResource() instanceof IFile))
					return true;

				IFile wResource = (IFile) delta.getResource();
				final IProject targetProject = wResource.getProject();

				try {
					if (!targetProject.isAccessible()) return false;
					if (!targetProject.hasNature(SwarmNature.NATURE_ID))
						return false;
				} catch (CoreException e) {
					StatusManager.getManager().handle(e, Activator.PLUGIN_ID);
					return false;
				}

				if((delta.getFlags() & IResourceDelta.MOVED_FROM) != 0)
					return true;
				
				SwarmEditingDomainSynchronizerDelegate.updateReferences(targetProject);

				/* Rewire project resource */
				return true;
			}
		};
		try {
			rootDelta.accept(visitor);
		} catch (Exception e) {
			// open error dialog with syncExec or print to plugin log file
		}
	}

}
