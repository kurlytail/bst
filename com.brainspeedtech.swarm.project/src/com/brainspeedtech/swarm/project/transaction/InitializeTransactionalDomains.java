/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.transaction;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IStartup;

import com.brainspeedtech.swarm.project.builder.SwarmNature;

public class InitializeTransactionalDomains implements IStartup {

	@Override
	public void earlyStartup() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		/*
		 * For every project with the Swarm nature, add a corresponding
		 * transactional domain instance in the registery
		 */

		for (final IProject project : root.getProjects()) {
			try {
				if (project.getNature(SwarmNature.NATURE_ID) != null) {
					SwarmEditingDomainSynchronizerDelegate.updateReferences(project);
				}
			} catch (CoreException e) {
			}
		}
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		SwarmEditingDomainChangeListener listener = new SwarmEditingDomainChangeListener();
		workspace.addResourceChangeListener(listener);
	}
	


}
