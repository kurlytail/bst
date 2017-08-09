/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.mray.builder;

import java.io.PrintStream;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.ui.statushandlers.StatusManager;

import com.brainspeedtech.constraint.software.hx.HxFactory;
import com.brainspeedtech.gen.software.mray.ImplementationGenerator;
import com.brainspeedtech.gen.software.mray.SMGenerator;
import com.brainspeedtech.gen.software.mray.StructGenerator;
import com.brainspeedtech.gen.software.mray.Activator;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class MrayBuilder extends SwarmProjectBuilder {

	public static final String BUILDER_ID = "com.brainspeedtech.gen.software.mray.mrayBuilder";
	public static final String PROJECT_LOCATION = "location";
	public static final String DEFAULT_PROJECT_LOCATION = "${project_name}-mray";

	@SuppressWarnings("unused")
	private static final String MARKER_TYPE = "com.brainspeedtech.gen.software.mray.xmlProblem";

	public MrayBuilder() {
		super(HxFactory.eINSTANCE.createHyperxGeneration());
		observeChangeExtension("inst");
		observeChangeExtension("struct");
		observeChangeExtension("sm");
		observeChangeExtension("layer");
		observeAddExtension("inst");
		observeAddExtension("struct");
		observeAddExtension("sm");
		observeAddExtension("layer");
		observeDeleteExtension("inst");
		observeDeleteExtension("struct");
		observeDeleteExtension("sm");
		observeDeleteExtension("layer");
		setSitePath("software/mray");
		setGeneratorClass(ImplementationGenerator.class);
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

		final IContainer container = createTargetLocation(outputDir);
		outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + container.getName();

		for (Resource res : domain.getResourceSet().getResources()) {
			try {
				if (WorkspaceSynchronizer.getFile(res).findMaxProblemSeverity(
						null, true, IResource.DEPTH_INFINITE) == IMarker.SEVERITY_ERROR) {
					StatusManager.getManager().handle(
							new Status(Status.ERROR, Activator.PLUGIN_ID,
									"Found a build error", null));
				}
			} catch (Exception e1) {
				StatusManager.getManager().handle(
						new Status(Status.ERROR, Activator.PLUGIN_ID,
								"Found a build error", e1));
				throw(new CoreException(new Status(Status.ERROR,
						Activator.PLUGIN_ID,
						"Found a build error", e1)));
			}
		}

		final String outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + container.getName();

		try {
			StructGenerator.generate((SwarmCachingEditingDomain)domain, outputDir,
					domain.getID());
		} catch (Exception e) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR,
							Activator.PLUGIN_ID,
							"Found a build error", e));
		}

		try {
			SMGenerator.generate((SwarmCachingEditingDomain)domain, outputDir,
					domain.getID());
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

	private void build(IResource resource) throws CoreException {
		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(getProject());
		String outputDir = SwarmEditingDomainFactory.getBuilderOption(
				getProject(), BUILDER_ID, PROJECT_LOCATION,
				DEFAULT_PROJECT_LOCATION);
		try {
			outputDir = outputDir.replaceAll(
					Pattern.quote("${project_name}"), getProject().getName());
			outputDir = VariablesPlugin.getDefault()
					.getStringVariableManager()
					.performStringSubstitution(outputDir);
			

		} catch (CoreException e1) {
			StatusManager.getManager().handle(e1, Activator.PLUGIN_ID);
			throw(new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID,
					"Found a build error", e1)));		}

		final IContainer project = createTargetLocation(outputDir);
		outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + project.getName();

		final Resource masterResource = domain.getResourceSet().getResource(
				URI.createPlatformResourceURI(
						resource.getFullPath().toString(), true), true);
		final String designName = getProject().getName();
		
		try {
			if (WorkspaceSynchronizer.getFile(masterResource)
					.findMaxProblemSeverity(null, true,
							IResource.DEPTH_INFINITE) != IMarker.SEVERITY_ERROR)
				ImplementationGenerator.generate((SwarmCachingEditingDomain)domain,
						outputDir, designName);
			else 
				StatusManager.getManager().handle(
						new Status(Status.ERROR, Activator.PLUGIN_ID,
								"Found a build error", null));

		} catch (Exception e) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Found a build error", e));
			throw(new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID,
					"Found a build error", e)));
		}

	}

	protected void fullBuild(final IProgressMonitor monitor, PrintStream log)
			throws CoreException {
		IFile file = getProject().getFile(
				getProject().getName() + ".master");
		if (file.exists())
			build(file);
		buildStructures();
	}

}
