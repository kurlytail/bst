/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.transaction;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl.FactoryImpl;
import org.eclipse.emf.workspace.IResourceUndoContextPolicy;
import org.eclipse.emf.workspace.impl.WorkspaceCommandStackImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.ui.statushandlers.StatusManager;

import com.brainspeedtech.swarm.layer.Layer;
import com.brainspeedtech.swarm.layer.LayerFactory;
import com.brainspeedtech.swarm.project.Activator;
import com.brainspeedtech.swarm.project.builder.SwarmNature;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;

public class SwarmEditingDomainFactory extends FactoryImpl {

	public static SwarmEditingDomainFactory INSTANCE = new SwarmEditingDomainFactory();

	public synchronized TransactionalEditingDomain createEditingDomain() {
		WorkspaceCommandStackImpl stack = new WorkspaceCommandStackImpl(OperationHistoryFactory.getOperationHistory());
		stack.setResourceUndoContextPolicy(IResourceUndoContextPolicy.DEFAULT);
		
		TransactionalEditingDomain result = new SwarmCachingEditingDomain(
			new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE),
			stack);
		
		result.getResourceSet().getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true),
				URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() + "/"));
		
		mapResourceSet(result);
		return result;
	}

	public static TransactionalEditingDomain getEditingDomain(IResource file) {

		IProject project;

		if (file instanceof IProject)
			project = (IProject) file;
		else
			project = file.getProject();

		QualifiedName name = new QualifiedName(project.getName(), "domain");
		TransactionalEditingDomain domain = null;
		SwarmEditingDomainSynchronizerDelegate synchronizer = null;

		try {
			domain = (TransactionalEditingDomain) project
					.getSessionProperty(name);
			if (domain != null)
				return domain;
		} catch (CoreException e) {
			domain = TransactionalEditingDomain.Registry.INSTANCE
					.getEditingDomain(project.getName());
		}

		if (domain == null) {
			/* Create a new editing domain */
			domain = SwarmEditingDomainFactory.INSTANCE.createEditingDomain();
			TransactionalEditingDomain.Registry.INSTANCE.add(project.getName(),
					domain);
			
			((SwarmCachingEditingDomain)domain).setBaseURI(
					URI.createFileURI(project.getLocation().makeAbsolute().toOSString()));
			synchronizer = 
					new SwarmEditingDomainSynchronizerDelegate(file.getProject());

			new WorkspaceSynchronizer(domain, synchronizer);
		}

		try {
			project.setSessionProperty(name, domain);
			name = new QualifiedName(project.getName(), "synchronizer");
			project.setSessionProperty(name, synchronizer);

		} catch (CoreException e) {
			StatusManager.getManager().handle(e, Activator.PLUGIN_ID);
		}

		return domain;
	}

	public static void addNatures(IProject project, String[] strings)
			throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		Set<String> natureSet = new HashSet<String>();
		natureSet.addAll(Arrays.asList(natures));
		natureSet.addAll(Arrays.asList(strings));
		natures = new String[] {};
		description.setNatureIds(natureSet.toArray(natures));
		project.setDescription(description, null);

		/* TODO the following needs to move out */
		for (String nature : natureSet) {
			if (nature.equals(SwarmNature.NATURE_ID)) {
				// create the base layer
				final URI layerURI = URI.createPlatformResourceURI(project.getName()
						+ "/swarm.layer", true);
				final TransactionalEditingDomain domain = SwarmEditingDomainFactory.getEditingDomain(project);
				
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					
					@Override
					protected void doExecute() {

						try {
							if (domain.getResourceSet().getResource(layerURI, true) != null) {
								return;
							}
						} catch (Exception ex) {
						}
						final Resource resource = domain.getResourceSet().createResource(layerURI);

						Layer layer = LayerFactory.eINSTANCE.createLayer();
						resource.getContents().add(layer);

						IFile file = WorkspaceSynchronizer.getFile(resource);

						if (!file.exists()) {
							try {
								resource.save(null);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				});

				SwarmEditingDomainSynchronizerDelegate.updateReferences(project);
			}
		}		
	}

	public static void removeNatures(IProject project, String[] strings)
			throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		Set<String> natureSet = new HashSet<String>();
		natureSet.addAll(Arrays.asList(natures));
		natureSet.removeAll(Arrays.asList(strings));

		natures = new String[] {};
		description.setNatureIds(natureSet.toArray(natures));
		project.setDescription(description, null);
	}

	public static void toggleNatures(IProject project, String[] strings)
			throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		Set<String> natureSet = new HashSet<String>();
		natureSet.addAll(Arrays.asList(natures));

		for (String str : strings) {
			if (natureSet.contains(str)) {
				natureSet.remove(str);
			} else {
				natureSet.add(str);
			}
		}

		natures = new String[] {};
		description.setNatureIds(natureSet.toArray(natures));
		project.setDescription(description, null);
	}

	public static String[] getNatures(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		return description.getNatureIds();
	}

	public static String getBuilderOption(IProject project, String builderId,
			String projectLocation, String defaultProjectLocation) {

		IProjectDescription description = null;
		try {
			description = project.getDescription();
		} catch (CoreException e) {
			StatusManager.getManager().handle(e, Activator.PLUGIN_ID);
			return null;
		}
		ICommand[] specs = description.getBuildSpec();
		for (ICommand spec : specs) {
			if (spec.getBuilderName().equals(builderId)) {
				Map<String, String> args = spec.getArguments();
				if (args.get(projectLocation) == null)
					return defaultProjectLocation;
				return args.get(projectLocation);
			}
		}
		return null;
	}

	public static void setBuilderOption(IProject project, String builderId,
			String projectLocation, String text) {

		IProjectDescription description = null;
		try {
			description = project.getDescription();
		} catch (CoreException e) {
			StatusManager.getManager().handle(e, Activator.PLUGIN_ID);
			return;
		}
		ICommand[] specs = description.getBuildSpec();
		for (ICommand spec : specs) {
			if (spec.getBuilderName().equals(builderId)) {
				Map<String, String> args = spec.getArguments();
				args.put(projectLocation, text);
				spec.setArguments(args);
				description.setBuildSpec(specs);
				try {
					project.setDescription(description,
							new NullProgressMonitor());
				} catch (CoreException e) {
					StatusManager.getManager().handle(e, Activator.PLUGIN_ID);
				}
				return;
			}
		}
	}

	static public EditingDomain getEditingDomain(EObject object) {
		return getEditingDomain(WorkspaceSynchronizer.getFile(object.eResource()));
	}

}
