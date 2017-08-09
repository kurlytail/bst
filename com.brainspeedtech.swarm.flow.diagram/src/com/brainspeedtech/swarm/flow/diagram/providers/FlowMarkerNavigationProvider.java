/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.providers;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.emf.ui.providers.marker.AbstractModelMarkerNavigationProvider;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Shape;

import com.brainspeedtech.swarm.flow.diagram.part.FlowDiagramEditorPlugin;
import com.brainspeedtech.swarm.flow.diagram.part.FlowDiagramEditorUtil;

/**
 * @generated
 */
public class FlowMarkerNavigationProvider extends
		AbstractModelMarkerNavigationProvider {

	/**
	 * @generated
	 */
	public static final String MARKER_TYPE = FlowDiagramEditorPlugin.ID
			+ ".diagnostic"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	protected void doGotoMarker(IMarker marker) {
		String elementId = marker
				.getAttribute(
						org.eclipse.gmf.runtime.common.core.resources.IMarker.ELEMENT_ID,
						null);
		if (elementId == null || !(getEditor() instanceof DiagramEditor)) {
			return;
		}
		DiagramEditor editor = (DiagramEditor) getEditor();
		Map editPartRegistry = editor.getDiagramGraphicalViewer()
				.getEditPartRegistry();
		EObject targetView = editor.getDiagram().eResource()
				.getEObject(elementId);
		if (targetView == null) {
			return;
		}
		EditPart targetEditPart = (EditPart) editPartRegistry.get(targetView);
		if (targetEditPart == null) {
			TreeIterator<EObject> iterator = editor.getDiagram().eAllContents();
			XMLResource resource = (XMLResource)  editor.getDiagram().eResource();
			while (iterator.hasNext()) {
				EObject object = iterator.next();
				if (object instanceof Shape) {
					Shape shape = (Shape) object;
					if(resource.getID(shape.getElement()) == null) continue;
					if (resource.getID(shape.getElement()).equals(elementId)) {
						targetEditPart = (EditPart) editPartRegistry.get(shape);
					}
				}
				if (object instanceof Connector) {
					Connector shape = (Connector) object;
					if(resource.getID(shape.getElement()) == null) continue;
					if (resource.getID(shape.getElement()).equals(elementId)) {
						targetEditPart = (EditPart) editPartRegistry.get(shape);
					}
				}
			}
		}
		if (targetEditPart != null) {
			FlowDiagramEditorUtil.selectElementsInDiagram(editor,
					Arrays.asList(new EditPart[] { targetEditPart }));
		}
	}

	/**
	 * @generated
	 */
	public static void deleteMarkers(IResource resource) {
		try {
			resource.deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_ZERO);
		} catch (CoreException e) {
			FlowDiagramEditorPlugin.getInstance().logError(
					"Failed to delete validation markers", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public static IMarker addMarker(IFile file, String elementId,
			String location, String message, int statusSeverity) {
		IMarker marker = null;
		try {
			marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.LOCATION, location);
			marker.setAttribute(
					org.eclipse.gmf.runtime.common.ui.resources.IMarker.ELEMENT_ID,
					elementId);
			int markerSeverity = IMarker.SEVERITY_INFO;
			if (statusSeverity == IStatus.WARNING) {
				markerSeverity = IMarker.SEVERITY_WARNING;
			} else if (statusSeverity == IStatus.ERROR
					|| statusSeverity == IStatus.CANCEL) {
				markerSeverity = IMarker.SEVERITY_ERROR;
			}
			marker.setAttribute(IMarker.SEVERITY, markerSeverity);
		} catch (CoreException e) {
			FlowDiagramEditorPlugin.getInstance().logError(
					"Failed to create validation marker", e); //$NON-NLS-1$
		}
		return marker;
	}
}
