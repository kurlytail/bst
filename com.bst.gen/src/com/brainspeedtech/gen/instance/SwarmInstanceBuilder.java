/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.instance;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.WorkbenchException;

import com.brainspeedtech.gen.inst.InstanceGenerator;
import com.brainspeedtech.swarm.layer.LayerFactory;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class SwarmInstanceBuilder extends SwarmProjectBuilder {
	public static final String BUILDER_ID = "com.bst.gen.swarmInstanceBuilder";

	public SwarmInstanceBuilder() {
		super(LayerFactory.eINSTANCE.createInstanceTransform());
		observeChangeExtension("master");
		observeChangeExtension("layer");

		observeAddExtension("master");
		observeAddExtension("layer");

		observeDeleteExtension("inst");
		observeDeleteExtension("layer");

		generatedFileNames("inst");
		setSitePath("instance");
		setGeneratorClass(InstanceGenerator.class);
	}

	@Override
	protected void fullBuild(IProgressMonitor monitor, PrintStream log) throws CoreException {

		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(getProject());
		try {
			InstanceGenerator.generate((SwarmCachingEditingDomain) domain, 
					ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() + "/" + getProject().getName(),
					getProject().getName(), log);
		} catch (IOException e) {
			e.printStackTrace(log);
			throw new WorkbenchException("IO error", e);
			
		}
	}

}
