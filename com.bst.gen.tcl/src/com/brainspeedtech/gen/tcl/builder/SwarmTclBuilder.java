/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.tcl.builder;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.ui.statushandlers.StatusManager;

import com.brainspeedtech.constraint.software.tcl.TclFactory;
import com.brainspeedtech.gen.tcl.Activator;
import com.brainspeedtech.gen.tcl.StructGenerator;
import com.brainspeedtech.struct.util.StructResourceImpl;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class SwarmTclBuilder extends SwarmProjectBuilder {

	public static final String BUILDER_ID = "com.bst.gen.tcl.swarmTclBuilder";
	public static final String PROJECT_LOCATION = "location";
	public static final String DEFAULT_PROJECT_LOCATION = "${project_name}-tcl";

	public SwarmTclBuilder() {
		super(TclFactory.eINSTANCE.createTclGeneration());
		observeChangeExtension("struct");
		observeAddExtension("struct");
		observeDeleteExtension("struct");
		observeChangeExtension("layer");
		observeAddExtension("layer");
		observeDeleteExtension("layer");
		setSitePath("software/tcl");
		setGeneratorClass(StructGenerator.class);
	}

	private void buildStructures() throws CoreException {
		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(getProject());

		outputDir = SwarmEditingDomainFactory.getBuilderOption(
				getProject(), BUILDER_ID, PROJECT_LOCATION,
				DEFAULT_PROJECT_LOCATION);
		try {
			outputDir = outputDir.replaceAll(
					Pattern.quote("${project_name}"), getProject().getName());
			outputDir = VariablesPlugin.getDefault()
					.getStringVariableManager()
					.performStringSubstitution(outputDir);
		} catch (CoreException e1) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Found a build error", e1));
			throw(new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID,
					"Found a build error", e1)));
		}

		final IContainer project = createTargetLocation(outputDir);
		List<Resource> genList = new LinkedList<Resource>();
		for (Resource res : domain.getResourceSet().getResources()) {
			try {
				if (WorkspaceSynchronizer.getFile(res)
						.findMaxProblemSeverity(null, true,
								IResource.DEPTH_INFINITE) == IMarker.SEVERITY_ERROR)
					continue;
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				throw(new CoreException(new Status(Status.ERROR,
						Activator.PLUGIN_ID,
						"Found a build error", e1)));
			}

			if (!(res instanceof StructResourceImpl))
				continue;
			genList.add(res);

		}
		
		final String outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + project.getName();

		try {
			StructGenerator.generate((SwarmCachingEditingDomain)domain,
					outputDir,
					getProject().getName());
		} catch (Exception e) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR,
							Activator.PLUGIN_ID,
							"Found a build error", e));
			throw(new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID,
					"Found a build error", e)));
		}
	}

	protected void fullBuild(final IProgressMonitor monitor, PrintStream log)
			throws CoreException {
		buildStructures();
	}

}
