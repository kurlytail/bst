package com.brainspeedtech.gen.software.web.gwt.builder;

import java.io.PrintStream;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.statushandlers.StatusManager;

import com.brainspeedtech.constraint.web.gwt.GWTFactory;
import com.brainspeedtech.gen.software.web.gwt.Activator;
import com.brainspeedtech.gen.software.web.gwt.ActivityMapperFile;
import com.brainspeedtech.gen.software.web.gwt.WidgetFile;
import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.util.FlowResourceImpl;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.util.MasterResourceImpl;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class GWTBuilder extends SwarmProjectBuilder {

	public static String BUILDER_ID = "com.brainspeedtech.gen.software.web.gwt.gwtBuilder";
	public static String PROJECT_LOCATION = "location";
	public static String DEFAULT_PROJECT_LOCATION = "${project_name}-gwt";

	public GWTBuilder() {
		super(GWTFactory.eINSTANCE.createGWTGeneration());
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
	

	protected void build(IResource resource, PrintStream log) throws CoreException {
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

		final String outputDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
				"/" + project.getName();

		for (Resource res : domain.getResourceSet().getResources()) {

			try {
				log.println("Processing resource " + res);
				if (res instanceof FlowResourceImpl) {
					generateActivityMapper((Flow)EcoreUtil.getObjectByType(res.getContents(),
							FlowPackage.eINSTANCE.getFlow()), 
							outputDir, log);
					generateWidget((Flow)EcoreUtil.getObjectByType(res.getContents(),
							FlowPackage.eINSTANCE.getFlow()), 
							outputDir, log);
					generateActivities((Flow)EcoreUtil.getObjectByType(res.getContents(),
							FlowPackage.eINSTANCE.getFlow()), 
							outputDir, log);
				}
				if (res instanceof MasterResourceImpl) {
					generatePlaces((MasterDesign)EcoreUtil.getObjectByType(res.getContents(),
							MasterPackage.eINSTANCE.getMasterDesign()), 
							outputDir, log);
					generateViews((MasterDesign)EcoreUtil.getObjectByType(res.getContents(),
							MasterPackage.eINSTANCE.getMasterDesign()), 
							outputDir, log);
				}
			} catch (Exception e) {
				StatusManager.getManager().handle(
						new Status(Status.ERROR, Activator.PLUGIN_ID,
								"Found a build error", e));
			}
		}
	}

	private void generateActivities(final Flow res, String outputDir, final PrintStream log) {
	}

	private void generateWidget(final Flow res, String outputDir, final PrintStream log) throws Exception {
		String genPrefix = outputDir + "/";

		new GeneratorFile(genPrefix + res.getName() + ".java") {
			@Override
			public String getFileContents() {
				log.println("Generating Widget " + file.getAbsolutePath());
				return new WidgetFile().generate(res);
			}
		};
	}

	private void generateViews(final MasterDesign res, String outputDir,
			final PrintStream log) {

	}

	private void generatePlaces(final MasterDesign res, String outputDir,
			final PrintStream log) {
	}

	private void generateActivityMapper(final Flow res, String outputDir,
			final PrintStream log) throws Exception {
		String genPrefix = outputDir + "/";

		new GeneratorFile(genPrefix + res.getName() + ".java") {
			@Override
			public String getFileContents() {
				log.println("Generating Activity Mapper " + file.getAbsolutePath());
				return new ActivityMapperFile().generate(res);
			}
		};
	}

	@Override
	protected void fullBuild(final IProgressMonitor monitor, PrintStream log)
			throws CoreException {
		log.println("Processing project " + getProject().getName());
		IFile file = getProject().getFile(
				getProject().getName() + ".master");
		if (file.exists())
			build(file, log);
	}

}
