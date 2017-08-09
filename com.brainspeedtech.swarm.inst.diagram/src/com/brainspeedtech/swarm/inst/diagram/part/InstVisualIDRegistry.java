/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.inst.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.CellInstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.CellInstanceNameEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.InstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.TubeInstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.TubeInstanceNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class InstVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "com.brainspeedtech.swarm.inst.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (InstanceEditPart.MODEL_ID.equals(view.getType())) {
				return InstanceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
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
				InstDiagramEditorPlugin.getInstance().logError(
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
		if (InstPackage.eINSTANCE.getInstance().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Instance) domainElement)) {
			return InstanceEditPart.VISUAL_ID;
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
		String containerModelID = com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
				.getModelID(containerView);
		if (!InstanceEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (InstanceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = InstanceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case InstanceEditPart.VISUAL_ID:
			if (InstPackage.eINSTANCE.getCellInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return CellInstanceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
				.getModelID(containerView);
		if (!InstanceEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (InstanceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = InstanceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case InstanceEditPart.VISUAL_ID:
			if (CellInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CellInstanceEditPart.VISUAL_ID:
			if (CellInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TubeInstanceEditPart.VISUAL_ID:
			if (TubeInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (InstPackage.eINSTANCE.getTubeInstance().isSuperTypeOf(
				domainElement.eClass())) {
			return TubeInstanceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Instance element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case InstanceEditPart.VISUAL_ID:
			return false;
		case CellInstanceEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
