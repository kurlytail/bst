/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.validation;

import java.net.URL;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.ui.util.OverlayImageDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import com.brainspeedtech.swarm.project.Activator;

public class ProblemDecoratorItemProvider extends ItemProviderAdapter {

	public ProblemDecoratorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	private static ImageDescriptor errorImageOverlay = PlatformUI
			.getWorkbench().getSharedImages()
			.getImageDescriptor(ISharedImages.IMG_DEC_FIELD_ERROR);
	private static ImageDescriptor warningImageOverlay = PlatformUI
			.getWorkbench().getSharedImages()
			.getImageDescriptor(ISharedImages.IMG_DEC_FIELD_WARNING);

	@Override
	protected Object overlayImage(Object object, Object image) {
		if(!(object instanceof EObject)) return image;
		EObject eObject = (EObject)object;
		
		IResource resource = WorkspaceSynchronizer
				.getFile(eObject.eResource());
		if (resource == null || !resource.exists()) {
			return image;
		}
		
		IMarker[] markers = null;
		try {
			markers = resource.findMarkers(null, true,
					IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			return image;
		}
		if (markers == null || markers.length == 0) {
			return image;
		}
		
		String elementId = ((XMLResource)eObject.eResource()).getID(eObject);
		IMarker foundMarker = null;
		for (int i = 0; i < markers.length; i++) {
			IMarker marker = markers[i];
			String attribute = marker
					.getAttribute(
							org.eclipse.gmf.runtime.common.ui.resources.IMarker.ELEMENT_ID,
							""); //$NON-NLS-1$
			if (attribute.equals(elementId)) {
				foundMarker = marker;
			}
		}
		if (foundMarker == null) {
			return image;
		}
		
		ImageDescriptor descriptor = ImageDescriptor
				.createFromURL((URL) image);
		
		int severity = foundMarker.getAttribute(IMarker.SEVERITY, 0);
		OverlayImageDescriptor descr;
		
		if (severity == IMarker.SEVERITY_ERROR) {
			descr = new OverlayImageDescriptor(
					descriptor.createImage(),
					errorImageOverlay);
		} else if (severity == IMarker.SEVERITY_WARNING) {
			descr = new OverlayImageDescriptor(
					descriptor.createImage(),
					warningImageOverlay);
		} else {
			return image;
		}
		return descr.createImage();
	}

}
