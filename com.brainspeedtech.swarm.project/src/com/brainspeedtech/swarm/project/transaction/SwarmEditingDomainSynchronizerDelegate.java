/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.transaction;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer.Delegate;

import com.brainspeedtech.swarm.project.builder.SwarmEditingDomainBuilder;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;

public class SwarmEditingDomainSynchronizerDelegate implements Delegate {

	
	List<Resource> touchedResources = new LinkedList<Resource>();
	static String synchronizer = "";
	
	public SwarmEditingDomainSynchronizerDelegate(final IProject project) {

		thread = new Thread("Reference updator for " + project.getName()) {
			@Override
			public void run() {
				while (true) {
					boolean wireProject = false;
					
					final List<Resource> touched = new LinkedList<Resource>();

					synchronized (SwarmEditingDomainSynchronizerDelegate.this) {
						if (startCount == 0) {
							try {
								SwarmEditingDomainSynchronizerDelegate.this.wait();
								System.err.println("Synchronizing for " + project.getName());
								//sleep(1000);
							} catch (InterruptedException e) {
							}
						}
						if (startCount != 0)
							wireProject = true;
					}
					
					// Sleep for batched modifications
					try {
						sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					synchronized(SwarmEditingDomainSynchronizerDelegate.this) {
						startCount = 0;
						touched.addAll(touchedResources);
						touchedResources.clear();
					}

					if (stopThread)
						break;
					
					synchronized(synchronizer) {
						final TransactionalEditingDomain domain = SwarmEditingDomainFactory
								.getEditingDomain(project);
						((SwarmCachingEditingDomain)domain).clearReferenceCache();

						domain.getCommandStack().execute(
								new RecordingCommand(domain) {

									@Override
									protected void doExecute() {
										for (Resource resource : touched) {
											resource.unload();
										}

										for (Resource resource : touched) {
											if (!WorkspaceSynchronizer.getFile(
													resource).exists()) {
												resource.unload();
												domain.getResourceSet()
														.getResources()
														.remove(resource);
											}
										}

									}
								});

						if (wireProject) {
							try {
								project.build(
										IncrementalProjectBuilder.FULL_BUILD,
										SwarmEditingDomainBuilder.BUILDER_ID,
										null, new NullProgressMonitor());
							} catch (CoreException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		};
		thread.start();
	}

	public boolean handleResourceDeleted(final Resource resource) {
		synchronized(this) {
			touchedResources.add(resource);
		}
		updateReferences();
		return true;
	}

	public boolean handleResourceChanged(final Resource resource) {
		synchronized(this) {
			touchedResources.add(resource);
			System.err.println("Changed Resource " + resource);
		}
		updateReferences();
		return true;
	}

	public boolean handleResourceMoved(final Resource resource, final URI newURI) {
		resource.setURI(newURI);
		updateReferences();
		return true;
	}
	
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

	public void dispose() {
		stopThread = true;
		this.notifyAll();
	}
}
