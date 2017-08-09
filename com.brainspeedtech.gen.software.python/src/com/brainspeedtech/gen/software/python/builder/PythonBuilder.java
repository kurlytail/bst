/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.python.builder;

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

import com.brainspeedtech.constraint.software.python.PythonFactory;
import com.brainspeedtech.gen.software.python.Activator;
import com.brainspeedtech.gen.software.python.ImplementationGenerator;
import com.brainspeedtech.gen.software.python.StructGenerator;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class PythonBuilder extends SwarmProjectBuilder {

	public static String BUILDER_ID = "com.brainspeedtech.gen.software.python.pythonBuilder";
	public static String PROJECT_LOCATION = "location";
	public static String DEFAULT_PROJECT_LOCATION = "${project_name}-python";

	public PythonBuilder() {
		super(PythonFactory.eINSTANCE.createPythonGenerator());
		observeChangeExtension("struct");
		observeChangeExtension("sm");
		observeChangeExtension("layer");
		observeAddExtension("struct");
		observeAddExtension("sm");
		observeAddExtension("layer");
		observeDeleteExtension("struct");
		observeDeleteExtension("sm");
		observeDeleteExtension("layer");
		setSitePath("software/python");
		setGeneratorClass(ImplementationGenerator.class);
	}

	protected String getBuilderID() {
		return BUILDER_ID;
	}
	
	protected String getoutputDir() {
		return PROJECT_LOCATION;
	}
	
	protected String getDefaultoutputDir() {
		return DEFAULT_PROJECT_LOCATION;
	}
	
	protected void buildStructures(IProgressMonitor monitor) throws CoreException {
		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(getProject());

		outputDir = SwarmEditingDomainFactory.getBuilderOption(
				getProject(), getBuilderID(), getoutputDir(),
				getDefaultoutputDir());
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

		IContainer container = createTargetLocation(outputDir);
		
		outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + container.getName();

		try {
			StructGenerator.generate((SwarmCachingEditingDomain)domain, 
					outputDir,
					domain.getID());
		} catch (Exception e1) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Found a build error", e1));
			throw(new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID,
					"Found a build error", e1)));
		}

	}

	protected void build(IResource resource) throws CoreException {
		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(getProject());
		outputDir = SwarmEditingDomainFactory.getBuilderOption(
				getProject(), getBuilderID(), getoutputDir(),
				getDefaultoutputDir());
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
					"Found a build error", e1)));
		}

		final IContainer project = createTargetLocation(outputDir);
		outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + outputDir;

		final Resource masterResource = domain.getResourceSet().getResource(
				URI.createPlatformResourceURI(
						resource.getFullPath().toString(), true), true);
		final String designName = getProject().getName();

		try {
			if (WorkspaceSynchronizer.getFile(masterResource)
					.findMaxProblemSeverity(null, true,
							IResource.DEPTH_INFINITE) != IMarker.SEVERITY_ERROR)
				ImplementationGenerator.generate((SwarmCachingEditingDomain)domain, 
						outputDir,
						designName);
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
		buildStructures(monitor);
	}

}
