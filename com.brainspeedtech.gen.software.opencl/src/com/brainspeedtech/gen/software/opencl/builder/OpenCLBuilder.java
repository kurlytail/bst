package com.brainspeedtech.gen.software.opencl.builder;

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

import com.brainspeedtech.constraint.software.opencl.OpenclFactory;
import com.brainspeedtech.gen.software.opencl.Activator;
import com.brainspeedtech.gen.software.opencl.ImplementationGenerator;
import com.brainspeedtech.gen.software.opencl.SMGenerator;
import com.brainspeedtech.gen.software.opencl.StructGenerator;
import com.brainspeedtech.swarm.layer.NatureBase;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class OpenCLBuilder extends SwarmProjectBuilder {

	public static String BUILDER_ID = "com.brainspeedtech.gen.software.opencl.openclBuilder";
	public static String PROJECT_LOCATION = "location";
	public static String DEFAULT_PROJECT_LOCATION = "${project_name}-opencl";

	public OpenCLBuilder() {
		super(OpenclFactory.eINSTANCE.createOpenCLGenerator());
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
	}

	public OpenCLBuilder(NatureBase natureBase) {
		super(natureBase);
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
	}

	protected String getBuilderID() {
		return BUILDER_ID;
	}
	
	protected String getProjectLocation() {
		return PROJECT_LOCATION;
	}
	
	protected String getDefaultProjectLocation() {
		return DEFAULT_PROJECT_LOCATION;
	}
	
	protected void buildStructures() throws CoreException {
		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(getProject());

		String projectLocation = SwarmEditingDomainFactory.getBuilderOption(
				getProject(), getBuilderID(), getProjectLocation(),
				getDefaultProjectLocation());
		try {
			projectLocation = projectLocation.replaceAll(
					Pattern.quote("${project_name}"), getProject().getName());
			projectLocation = VariablesPlugin.getDefault()
					.getStringVariableManager()
					.performStringSubstitution(projectLocation);
		} catch (CoreException e1) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Found a build error", e1));
			return;
		}

		final IContainer container = createTargetLocation(projectLocation);
		
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
		}
	}

	protected void build(IResource resource) throws CoreException {
		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(getProject());
		String projectLocation = SwarmEditingDomainFactory.getBuilderOption(
				getProject(), getBuilderID(), getProjectLocation(),
				getDefaultProjectLocation());
		try {
			projectLocation = projectLocation.replaceAll(
					Pattern.quote("${project_name}"), getProject().getName());
			projectLocation = VariablesPlugin.getDefault()
					.getStringVariableManager()
					.performStringSubstitution(projectLocation);
		} catch (CoreException e1) {
			StatusManager.getManager().handle(e1, Activator.PLUGIN_ID);
			return;
		}

		final IContainer project = createTargetLocation(projectLocation);

		final Resource masterResource = domain.getResourceSet().getResource(
				URI.createPlatformResourceURI(
						resource.getFullPath().toString(), true), true);
		final String designName = getProject().getName();
		final String outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + project.getName();


		try {
			if (WorkspaceSynchronizer.getFile(masterResource)
					.findMaxProblemSeverity(null, true,
							IResource.DEPTH_INFINITE) != IMarker.SEVERITY_ERROR)
				ImplementationGenerator.generate((SwarmCachingEditingDomain)domain,
						outputDir, designName);
		} catch (Exception e) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Found a build error", e));
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
