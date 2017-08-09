package com.brainspeedtech.gen.boost.builder;

import java.io.PrintStream;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.ui.statushandlers.StatusManager;

import com.brainspeedtech.constraint.boost.BoostFactory;
import com.brainspeedtech.gen.boost.Activator;
import com.brainspeedtech.swarm.layer.NatureBase;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class BoostBuilder extends SwarmProjectBuilder {

	public static final String BUILDER_ID = "com.brainspeedtech.gen.boost.boostBuilder";
	public static final String PROJECT_LOCATION = "location";
	public static final String DEFAULT_PROJECT_LOCATION = "${project_name}-boost";

	public BoostBuilder() {
		super(BoostFactory.eINSTANCE.createBoostNature());
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
		setSitePath("software/boost");
		setGeneratorClass(this.getClass());

	}
	
	public BoostBuilder(NatureBase natureBase) {
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
		setSitePath("software/boost");
		setGeneratorClass(this.getClass());

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
	

	private void build(IResource resource, PrintStream log) throws CoreException {
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
					"Found a build error", e1)));		}

		createTargetLocation(outputDir);
		outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + outputDir;
	}

	protected void fullBuild(final IProgressMonitor monitor, PrintStream log)
			throws CoreException {
		IFile file = getProject().getFile(
				getProject().getName() + ".master");
		if (file.exists())
			build(file, log);
	}

}
