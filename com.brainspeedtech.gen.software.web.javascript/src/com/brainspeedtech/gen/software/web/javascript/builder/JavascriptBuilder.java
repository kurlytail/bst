/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.web.javascript.builder;

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

import com.brainspeedtech.constraint.software.web.javascript.JavascriptFactory;
import com.brainspeedtech.gen.software.web.javascript.Activator;
import com.brainspeedtech.gen.software.web.javascript.ImplementationGenerator;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class JavascriptBuilder extends SwarmProjectBuilder {

	public static String BUILDER_ID = "com.brainspeedtech.gen.software.web.javascript.javascriptBuilder";
	public static String PROJECT_LOCATION = "location";
	public static String DEFAULT_PROJECT_LOCATION = "${project_name}-javascript";

	public JavascriptBuilder() {
		super(JavascriptFactory.eINSTANCE.createJavascriptGeneration());
		observeChangeExtension("struct");
		observeChangeExtension("sm");
		observeChangeExtension("layer");
		observeAddExtension("struct");
		observeAddExtension("sm");
		observeAddExtension("layer");
		observeDeleteExtension("struct");
		observeDeleteExtension("sm");
		observeDeleteExtension("layer");
		setSitePath("software/javascript");
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
	

	protected void build(IResource resource) throws CoreException {
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

		createTargetLocation(outputDir);
		outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + outputDir;

	}

	protected void fullBuild(final IProgressMonitor monitor, PrintStream log)
			throws CoreException {
		IFile file = getProject().getFile(
				getProject().getName() + ".master");
		if (file.exists())
			build(file);
	}

}
