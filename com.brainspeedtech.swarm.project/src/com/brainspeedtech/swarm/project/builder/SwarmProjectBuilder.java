/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.builder;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.script.ScriptException;

import org.apache.commons.cli.ParseException;
import org.eclipse.core.resources.IBuildConfiguration;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.marker.IMarkerConfigurator;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.IConstraintFilter;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

import com.brainspeedtech.swarm.layer.NatureBase;
import com.brainspeedtech.swarm.project.Activator;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;
import com.brainspeedtech.swarm.project.util.ProjectUtil;
import com.brainspeedtech.swarm.project.validation.ValidationDelegateClientSelector;

public abstract class SwarmProjectBuilder extends IncrementalProjectBuilder {
	
	protected String outputDir = null;

	private static NatureBase currentNature = null;
	private NatureBase nature = null;
	
	public static NatureBase getCurrentNature() {
		return currentNature;
	}
	
	protected SwarmProjectBuilder(NatureBase nature) {
		this.nature = nature;
	}
	
	private List<IProject> projectList = new LinkedList<IProject>();
	protected boolean addMarkers = false;
	private String sitePath;
	private Class<?> generatorClass;
	
	public Class<?> getGeneratorClass() {
		return generatorClass;
	}

	public void setGeneratorClass(Class<?> generatorClass) {
		this.generatorClass = generatorClass;
	}

	public String getSitePath() {
		return sitePath;
	}

	public void setSitePath(String sitePath) {
		this.sitePath = sitePath;
	}

	static IMarkerConfigurator swarmMarkerConfigurator = new IMarkerConfigurator() {

		@Override
		public void appendMarkerConfiguration(IMarker marker,
				IConstraintStatus status) throws CoreException {
			EObject eObject = status.getTarget();
			if (eObject.eResource() instanceof XMLResourceImpl) {
				XMLResourceImpl resource = (XMLResourceImpl) eObject
						.eResource();

				marker.setAttribute(
						org.eclipse.gmf.runtime.common.ui.resources.IMarker.ELEMENT_ID,
						resource.getID(eObject));
			}
		}
	};
	
	public static boolean validateResource(final Resource resource) throws CoreException {
		boolean success = true;
		ValidationDelegateClientSelector.running = true;
		final IBatchValidator validator = (IBatchValidator) ModelValidationService
				.getInstance().newValidator(EvaluationMode.BATCH);
		validator.addConstraintFilter(new IConstraintFilter() {
			@Override
			public boolean accept(IConstraintDescriptor constraint, EObject target) {
				if (constraint.getCategories().iterator().next().getId().equals("org.eclipse.gmf.runtime.emf.core.references")) return false;
				return true;
			}
		});
		validator.setIncludeLiveConstraints(true);
		IStatus status = validator.validate(resource.getContents());

		if(status.getCode() == IStatus.ERROR)
			success = false;
		MarkerUtil.createMarkers(status, SwarmEditingDomainBuilder.MARKER_ID,
				swarmMarkerConfigurator);

		ValidationDelegateClientSelector.running = false;

		return success;
	}

	public static boolean validateResources(final Collection<Resource> resources) throws CoreException {
		boolean success = true;
		ValidationDelegateClientSelector.running = true;
		final IBatchValidator validator = (IBatchValidator) ModelValidationService
				.getInstance().newValidator(EvaluationMode.BATCH);
		validator.addConstraintFilter(new IConstraintFilter() {
			@Override
			public boolean accept(IConstraintDescriptor constraint, EObject target) {
				if (constraint.getCategories().iterator().next().getId().equals("org.eclipse.gmf.runtime.emf.core.references")) return false;
				return true;
			}
		});

		validator.setIncludeLiveConstraints(true);

		for (Resource resource : resources) {
			IStatus status = validator.validate(resource.getContents());

			if(status.getCode() == IStatus.ERROR)
				success = false;

			MarkerUtil.createMarkers(status,
					SwarmEditingDomainBuilder.MARKER_ID,
					swarmMarkerConfigurator);
		}
		ValidationDelegateClientSelector.running = false;

		return success;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind,
			@SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor)
			throws CoreException {
		
		outputDir = getProject().getLocation().toString();
		
		currentNature = nature;
		PrintStream log = System.out;
		String builderType = nature.getClass().getInterfaces()[0].getSimpleName() + ":";
		
		log.println(builderType + getProject().getName() + " STARTED");
		IProject[] modifiedProjects = new IProject[] {};

		projectList.clear();

		IBuildConfiguration buildConfig = null;
		try {
			buildConfig = getProject().getActiveBuildConfig();
		} catch (CoreException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		LinkedList<String> seedList = new LinkedList<String>();
		
		if(buildConfig == null || buildConfig.getName().equals(IBuildConfiguration.DEFAULT_CONFIG_NAME)) {
			IPath path = getProject().getLocation();
			if(path != null) {
				seedList.add(path.makeAbsolute().toOSString());
			}
		} else {
			
		}
	

		HashSet<String> allExtensions = new HashSet<String>();
		allExtensions.addAll(observeAddExtensions);
		allExtensions.addAll(observeChangeExtensions);
		allExtensions.removeAll(generatedFileExtensions);

		final String[] seedArray = seedList.toArray(new String[0]);
		String[] ext = allExtensions.toArray(new String[0]);
		
		SwarmCachingEditingDomain domain = (SwarmCachingEditingDomain) SwarmEditingDomainFactory
				.getEditingDomain(getProject());
		try {
			ProjectUtil.InitializeProject((SwarmCachingEditingDomain)domain, seedArray, ext, log);
		} catch (ParseException e) {
			log.println(e.getStackTrace());
			throw(new CoreException(new Status(IStatus.ERROR, 
					Activator.PLUGIN_ID, builderType + "Nested Exception", e)));
		}
		
		boolean resourceErrors = false;
				
		for (Resource resource : domain.getResourceSet().getResources()) {
			IFile file = null;
			try {
				file = WorkspaceSynchronizer.getFile(resource);
				if (file == null) {
					throw new Exception("Missing resource, you probably forgot to import a project for " + resource.getURI().toString());
				}
			} catch (Exception ex) {
				log.println(ex.getStackTrace());
				throw(new CoreException(new Status(IStatus.ERROR, 
						Activator.PLUGIN_ID, builderType + "Nested Exception", ex)));
			}
			if (generatedFileNames.contains(file.getName())) {
				continue;
			}
			
			if (file.getFileExtension() != null) {
				if (allExtensions.contains(file.getFileExtension())
						&& file.exists()) {
					resourceErrors = resourceErrors & !validateResource(resource);
				}
			}
		}
		
		if (resourceErrors) {
			log.println(builderType + "Aborting build due to resource errors");
			currentNature = null;
			throw(new CoreException(new Status(IStatus.ERROR, 
					Activator.PLUGIN_ID, builderType + "Aborting build due to resource errors")));
		}

		for (Resource resource : domain.getResourceSet().getResources()) {
			IFile file = null;
			try {
				file = WorkspaceSynchronizer.getFile(resource);
			} catch (Exception ex) {
				log.println(ex.getStackTrace());
				throw(new CoreException(new Status(IStatus.ERROR, 
						Activator.PLUGIN_ID, builderType + "Nested Exception", ex)));
			}

			if (!file.exists()) {
				continue;
			}

			file.deleteMarkers(null, true, IResource.DEPTH_INFINITE);
		}

		if (kind == FULL_BUILD) {
			fullBuild(monitor, log);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor, log);
			} else {
				incrementalBuild(delta, monitor, log);
			}
		}

		
		// Refresh the project
		getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		
		allExtensions.addAll(generatedFileExtensions);
		ext = allExtensions.toArray(new String[0]);
		
		try {
			ProjectUtil.InitializeProject((SwarmCachingEditingDomain)domain, seedArray, ext, log);
		} catch (ParseException e) {
			log.println(e.getStackTrace());
			throw(new CoreException(new Status(IStatus.ERROR, 
					Activator.PLUGIN_ID, builderType + "Nested Exception", e)));
		}
		
		
		/* Validate build */
		if (!validateResources(domain.getResourceSet().getResources())) {
			log.println(builderType + "Aborting build due to resource errors");
			currentNature = null;
			throw(new CoreException(new Status(IStatus.ERROR, 
					Activator.PLUGIN_ID, builderType + "Aborting build due to resource errors")));			
		}
		
		try {
			final String projectDir = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() +
					"/" + getProject().getName();
			SwarmCachingEditingDomain.setupGenerator(domain, generatorClass, projectDir, outputDir, getProject().getName(),
					sitePath, log);
		} catch (Exception e) {
			throw (new CoreException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID, builderType
							+ "Aborting build due to script errors", e)));
		}

		modifiedProjects = projectList.toArray(modifiedProjects);

		log.println(builderType +  getProject().getName() + " DONE");

		currentNature = null;
		return modifiedProjects;
	}

	protected IContainer createTargetLocation(String name) throws CoreException {
		IPath containerPath = new Path(name);
		String projectName = containerPath.segment(0);
		IProject project = getProject().getWorkspace().getRoot()
				.getProject(projectName);
		if (!project.exists()) {
			IProjectDescription desc = project.getWorkspace()
					.newProjectDescription(project.getName());
			project.create(desc, null);
		}
		project.open(null);
		IContainer container = project;

		if (containerPath.segmentCount() >= 2) {
			IFolder folder = project.getFolder(containerPath.segment(1));
			if (!folder.exists())
				folder.create(true, true, new NullProgressMonitor());

			for (int i = 2; i < containerPath.segmentCount(); ++i) {
				folder = folder.getFolder(containerPath.segment(i));
				if (!folder.exists())
					folder.create(true, true, new NullProgressMonitor());
			}

			container = folder;
		}

		projectList.add(project);
		return container;
	}

	protected void fullBuild(final IProgressMonitor monitor, PrintStream log)
			throws CoreException {
	}

	private Set<String> observeChangeExtensions = new HashSet<String>();
	private Set<String> observeDeleteExtensions = new HashSet<String>();
	private Set<String> observeAddExtensions = new HashSet<String>();
	private Set<String> generatedFileExtensions = new HashSet<String>();
	private Set<String> generatedFileNames = new HashSet<String>();

	private boolean rebuildMaster;

	protected void observeChangeExtension(String ext) {
		observeChangeExtensions.add(ext);
	}

	protected void observeDeleteExtension(String ext) {
		observeDeleteExtensions.add(ext);
	}

	protected void observeAddExtension(String ext) {
		observeAddExtensions.add(ext);
	}

	protected void generatedFileExtension(String ext) {
		generatedFileExtensions.add(ext);
	}

	protected void generatedFileNames(String name) {
		generatedFileNames.add(name);
	}

	protected void incrementalBuild(IResourceDelta delta,
			final IProgressMonitor monitor, final PrintStream log) throws CoreException {

		rebuildMaster = false;

		getDelta(getProject()).accept(new IResourceDeltaVisitor() {

			@Override
			public boolean visit(IResourceDelta delta) throws CoreException {
				IResource resource = delta.getResource();

				if (resource.getFileExtension() == null)
					return true;

				switch (delta.getKind()) {
				case IResourceDelta.ADDED:
					if (observeAddExtensions.contains(resource
							.getFileExtension()))
						rebuildMaster = true;
					break;
				case IResourceDelta.REMOVED:
					if (observeDeleteExtensions.contains(resource
							.getFileExtension()))
						rebuildMaster = true;
					break;

				case IResourceDelta.CHANGED:
					if (observeChangeExtensions.contains(resource
							.getFileExtension()))
						rebuildMaster = true;
					break;
				}
				return true;
			}
		});

		if (rebuildMaster) {
			fullBuild(monitor, log);
		}
	}
}
