/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterCellEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterCellNameEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterDesignEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterTubeEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterTubeNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MasterVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "com.bst.swarm.master.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MasterDesignEditPart.MODEL_ID.equals(view.getType())) {
				return MasterDesignEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
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
				MasterDiagramEditorPlugin.getInstance().logError(
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
		if (MasterPackage.eINSTANCE.getMasterDesign().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MasterDesign) domainElement)) {
			return MasterDesignEditPart.VISUAL_ID;
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
		String containerModelID = com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
				.getModelID(containerView);
		if (!MasterDesignEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MasterDesignEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MasterDesignEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MasterDesignEditPart.VISUAL_ID:
			if (MasterPackage.eINSTANCE.getMasterCell().isSuperTypeOf(
					domainElement.eClass())) {
				return MasterCellEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
				.getModelID(containerView);
		if (!MasterDesignEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MasterDesignEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MasterDesignEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MasterDesignEditPart.VISUAL_ID:
			if (MasterCellEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MasterCellEditPart.VISUAL_ID:
			if (MasterCellNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MasterTubeEditPart.VISUAL_ID:
			if (MasterTubeNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (MasterPackage.eINSTANCE.getMasterTube().isSuperTypeOf(
				domainElement.eClass())) {
			return MasterTubeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MasterDesign element) {
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
		case MasterDesignEditPart.VISUAL_ID:
			return false;
		case MasterCellEditPart.VISUAL_ID:
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
			return com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
