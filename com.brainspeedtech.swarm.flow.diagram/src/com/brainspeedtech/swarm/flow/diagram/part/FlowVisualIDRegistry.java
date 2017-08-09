/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.CellEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.CellNameEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.FlowEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.TubeEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.TubeNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FlowVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "com.brainspeedtech.swarm.flow.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FlowEditPart.MODEL_ID.equals(view.getType())) {
				return FlowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return com.brainspeedtech.swarm.flow.diagram.part.FlowVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				FlowDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FlowPackage.eINSTANCE.getFlow().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Flow) domainElement)) {
			return FlowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = com.brainspeedtech.swarm.flow.diagram.part.FlowVisualIDRegistry
				.getModelID(containerView);
		if (!FlowEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FlowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.brainspeedtech.swarm.flow.diagram.part.FlowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FlowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FlowEditPart.VISUAL_ID:
			if (FlowPackage.eINSTANCE.getCell().isSuperTypeOf(
					domainElement.eClass())) {
				return CellEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = com.brainspeedtech.swarm.flow.diagram.part.FlowVisualIDRegistry
				.getModelID(containerView);
		if (!FlowEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FlowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.brainspeedtech.swarm.flow.diagram.part.FlowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FlowEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case FlowEditPart.VISUAL_ID:
			if (CellEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CellEditPart.VISUAL_ID:
			if (CellNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TubeEditPart.VISUAL_ID:
			if (TubeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FlowPackage.eINSTANCE.getTube().isSuperTypeOf(
				domainElement.eClass())) {
			return TubeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Flow element) {
		return true;
	}

}
