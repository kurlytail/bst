/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.struct.provider;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.ui.statushandlers.StatusManager;

import com.brainspeedtech.struct.Atom;

public class ScopedItemPropertyDescriptor extends ItemPropertyDescriptor {

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences);
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable, category);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage, category);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, staticImage);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, category);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category,
			String[] filterFlags) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable, category);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable) {
		super(adapterFactory, displayName, description, parentReferences,
				isSettable);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences) {
		super(adapterFactory, displayName, description, parentReferences);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category,
			String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage, category);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
				category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
				category);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable) {
		super(adapterFactory, displayName, description, feature, isSettable);
		// TODO Auto-generated constructor stub
	}

	public ScopedItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature) {
		super(adapterFactory, displayName, description, feature);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Collection<?> getComboBoxObjects(Object object) {
		EObject eObj = (EObject) object;

		IFile f = WorkspaceSynchronizer.getFile(eObj.eResource());
		/* Get all possible resources to load into this set */

		try {
			collectResources(eObj.eResource().getResourceSet(), f.getProject());
		} catch (CoreException e) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR, "com.bst.struct.edit",
							"Error building object list", e));
		}

		/*
		 * Subtract all resources that reference this resource, directly or
		 * indirectly
		 */
		Set<Resource> visited = new HashSet<Resource>();
		Set<Resource> remaining = new HashSet<Resource>();

		remaining.add(eObj.eResource());
		do {
			Map<EObject, Collection<Setting>> referenced = EcoreUtil.UsageCrossReferencer
					.find(remaining);
			visited.addAll(remaining);
			remaining.clear();

			for (Collection<Setting> settings : referenced.values()) {
				for (Setting setting : settings) {
					if (setting instanceof EObject) {
						remaining.add(((EObject) setting).eResource());
					}
				}
			}

			remaining.removeAll(visited);
		} while (!remaining.isEmpty());
		

		/*
		 * Get the list of all objects of a given type in the remaining
		 * resources
		 */
		remaining.addAll(eObj.eResource().getResourceSet().getResources());
		remaining.removeAll(visited);

		List<Atom> atoms = new LinkedList<Atom>();
		for (Resource res : remaining) {
			if (res.getContents().size() != 0) {
				atoms.addAll((Collection<? extends Atom>) EcoreUtil
						.getObjectsByType(res.getContents().get(0).eContents(),
								eObj.eContainer().eClass()));
			}
		}

		if(eObj.eResource().getContents().size() != 0) {
			for (Object obj : EcoreUtil.getObjectsByType(eObj.eResource()
					.getContents().get(0).eContents(), eObj.eContainer().eClass())) {
				if (obj == eObj.eContainer())
					return atoms;

				atoms.add((Atom) obj);
			}
		}

		return atoms;
	}

	private void collectResources(ResourceSet resourceSet, IResource resource)
			throws CoreException {
		
		if (resource.isLinked()) return;
		
		if (resource instanceof IFile && resource.getFileExtension() != null
				&& resource.getFileExtension().equals("struct")
				&& resource.isAccessible()
				&& !resource.isLinked()) {
			resourceSet.getResource(URI.createPlatformResourceURI(resource
					.getFullPath().toString(), true), true);
		} else if (resource instanceof IContainer) {
			IContainer container = (IContainer) resource;
			if (container.isAccessible()) {
				for (IResource res : container.members()) {
					collectResources(resourceSet, res);
				}
			}
		}
	}

}
