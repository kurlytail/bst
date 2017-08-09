/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.sm.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import com.brainspeedtech.swarm.sm.SmPackage;
import com.brainspeedtech.swarm.sm.State;
import com.brainspeedtech.swarm.sm.StateMachine;
import com.brainspeedtech.swarm.sm.Transition;
import com.brainspeedtech.swarm.sm.diagram.edit.parts.StateEditPart;
import com.brainspeedtech.swarm.sm.diagram.edit.parts.StateMachineEditPart;
import com.brainspeedtech.swarm.sm.diagram.edit.parts.TransitionEditPart;
import com.brainspeedtech.swarm.sm.diagram.providers.SmElementTypes;

/**
 * @generated
 */
public class SmDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SmNodeDescriptor> getSemanticChildren(View view) {
		switch (SmVisualIDRegistry.getVisualID(view)) {
		case StateMachineEditPart.VISUAL_ID:
			return getStateMachine_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmNodeDescriptor> getStateMachine_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StateMachine modelElement = (StateMachine) view.getElement();
		LinkedList<SmNodeDescriptor> result = new LinkedList<SmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = SmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StateEditPart.VISUAL_ID) {
				result.add(new SmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getContainedLinks(View view) {
		switch (SmVisualIDRegistry.getVisualID(view)) {
		case StateMachineEditPart.VISUAL_ID:
			return getStateMachine_1000ContainedLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_2001ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getIncomingLinks(View view) {
		switch (SmVisualIDRegistry.getVisualID(view)) {
		case StateEditPart.VISUAL_ID:
			return getState_2001IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getOutgoingLinks(View view) {
		switch (SmVisualIDRegistry.getVisualID(view)) {
		case StateEditPart.VISUAL_ID:
			return getState_2001OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getStateMachine_1000ContainedLinks(
			View view) {
		StateMachine modelElement = (StateMachine) view.getElement();
		LinkedList<SmLinkDescriptor> result = new LinkedList<SmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getState_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getState_2001IncomingLinks(View view) {
		State modelElement = (State) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SmLinkDescriptor> result = new LinkedList<SmLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getState_2001OutgoingLinks(View view) {
		State modelElement = (State) view.getElement();
		LinkedList<SmLinkDescriptor> result = new LinkedList<SmLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SmLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SmLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			StateMachine container) {
		LinkedList<SmLinkDescriptor> result = new LinkedList<SmLinkDescriptor>();
		for (Iterator<?> links = container.getTransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != SmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			State dst = link.getTo();
			State src = link.getFrom();
			result.add(new SmLinkDescriptor(src, dst, link,
					SmElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SmLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			State target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SmLinkDescriptor> result = new LinkedList<SmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SmPackage.eINSTANCE
					.getTransition_To()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != SmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			State src = link.getFrom();
			result.add(new SmLinkDescriptor(src, target, link,
					SmElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SmLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			State source) {
		StateMachine container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof StateMachine) {
				container = (StateMachine) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SmLinkDescriptor> result = new LinkedList<SmLinkDescriptor>();
		for (Iterator<?> links = container.getTransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != SmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			State dst = link.getTo();
			State src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new SmLinkDescriptor(src, dst, link,
					SmElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<SmNodeDescriptor> getSemanticChildren(View view) {
			return SmDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SmLinkDescriptor> getContainedLinks(View view) {
			return SmDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SmLinkDescriptor> getIncomingLinks(View view) {
			return SmDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SmLinkDescriptor> getOutgoingLinks(View view) {
			return SmDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
