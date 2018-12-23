/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.builder;

import java.io.PrintStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.brainspeedtech.swarm.layer.LayerFactory;
import com.brainspeedtech.swarm.layer.NatureBase;

public class SwarmEditingDomainBuilder extends SwarmProjectBuilder {

	protected SwarmEditingDomainBuilder(NatureBase nature) {
		super(LayerFactory.eINSTANCE.createFlowAnalysisAndMerge());
		observeAddExtension("flow");
		observeAddExtension("struct");
		observeAddExtension("layer");
		observeAddExtension("master");
		observeAddExtension("inst");
		observeAddExtension("sm");
		observeDeleteExtension("flow");
		observeDeleteExtension("struct");
		observeDeleteExtension("layer");
		observeDeleteExtension("master");
		observeDeleteExtension("inst");
		observeDeleteExtension("sm");
		observeChangeExtension("flow");
		observeChangeExtension("struct");
		observeChangeExtension("layer");
		observeChangeExtension("master");
		observeChangeExtension("inst");
		observeChangeExtension("sm");
	}
	
	public SwarmEditingDomainBuilder() {
		super(LayerFactory.eINSTANCE.createFlowAnalysisAndMerge());
		observeAddExtension("flow");
		observeAddExtension("struct");
		observeAddExtension("layer");
		observeAddExtension("master");
		observeAddExtension("inst");
		observeAddExtension("sm");
		observeDeleteExtension("flow");
		observeDeleteExtension("struct");
		observeDeleteExtension("layer");
		observeDeleteExtension("master");
		observeDeleteExtension("inst");
		observeDeleteExtension("sm");
		observeChangeExtension("flow");
		observeChangeExtension("struct");
		observeChangeExtension("layer");
		observeChangeExtension("master");
		observeChangeExtension("inst");
		observeChangeExtension("sm");
	}


	private static IProject currentProject = null;

	public static IProject getCurrentProject() {
		return currentProject;
	}

	public static final String BUILDER_ID = "com.brainspeedtech.swarm.project.swarmEditingDomainBuilder";
	public static final String MARKER_ID = "com.brainspeedtech.swarm.project.editingDomainProblem";

	@Override
	protected void fullBuild(IProgressMonitor monitor, PrintStream log) throws CoreException {
		currentProject = getProject();

		currentProject = null;
	}
	
	protected String getBuilderID() {
		return BUILDER_ID;
	}
	
}
