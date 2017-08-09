/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.part;

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

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.Tube;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.CellEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.FlowEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.TubeEditPart;
import com.brainspeedtech.swarm.flow.diagram.providers.FlowElementTypes;

/**
 * @generated
 */
public class FlowDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<FlowNodeDescriptor> getSemanticChildren(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case FlowEditPart.VISUAL_ID:
			return getFlow_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FlowNodeDescriptor> getFlow_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Flow modelElement = (Flow) view.getElement();
		LinkedList<FlowNodeDescriptor> result = new LinkedList<FlowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCell().iterator(); it.hasNext();) {
			Cell childElement = (Cell) it.next();
			int visualID = FlowVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CellEditPart.VISUAL_ID) {
				result.add(new FlowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getContainedLinks(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case FlowEditPart.VISUAL_ID:
			return getFlow_1000ContainedLinks(view);
		case CellEditPart.VISUAL_ID:
			return getCell_2001ContainedLinks(view);
		case TubeEditPart.VISUAL_ID:
			return getTube_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getIncomingLinks(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case CellEditPart.VISUAL_ID:
			return getCell_2001IncomingLinks(view);
		case TubeEditPart.VISUAL_ID:
			return getTube_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getOutgoingLinks(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case CellEditPart.VISUAL_ID:
			return getCell_2001OutgoingLinks(view);
		case TubeEditPart.VISUAL_ID:
			return getTube_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getFlow_1000ContainedLinks(View view) {
		Flow modelElement = (Flow) view.getElement();
		LinkedList<FlowLinkDescriptor> result = new LinkedList<FlowLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Tube_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getCell_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getTube_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getCell_2001IncomingLinks(View view) {
		Cell modelElement = (Cell) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FlowLinkDescriptor> result = new LinkedList<FlowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Tube_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getTube_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getCell_2001OutgoingLinks(View view) {
		Cell modelElement = (Cell) view.getElement();
		LinkedList<FlowLinkDescriptor> result = new LinkedList<FlowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Tube_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FlowLinkDescriptor> getTube_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<FlowLinkDescriptor> getContainedTypeModelFacetLinks_Tube_4001(
			Flow container) {
		LinkedList<FlowLinkDescriptor> result = new LinkedList<FlowLinkDescriptor>();
		for (Iterator<?> links = container.getTube().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Tube) {
				continue;
			}
			Tube link = (Tube) linkObject;
			if (TubeEditPart.VISUAL_ID != FlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Cell dst = link.getTo();
			Cell src = link.getFrom();
			result.add(new FlowLinkDescriptor(src, dst, link,
					FlowElementTypes.Tube_4001, TubeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FlowLinkDescriptor> getIncomingTypeModelFacetLinks_Tube_4001(
			Cell target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FlowLinkDescriptor> result = new LinkedList<FlowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FlowPackage.eINSTANCE
					.getTube_To()
					|| false == setting.getEObject() instanceof Tube) {
				continue;
			}
			Tube link = (Tube) setting.getEObject();
			if (TubeEditPart.VISUAL_ID != FlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Cell src = link.getFrom();
			result.add(new FlowLinkDescriptor(src, target, link,
					FlowElementTypes.Tube_4001, TubeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FlowLinkDescriptor> getOutgoingTypeModelFacetLinks_Tube_4001(
			Cell source) {
		Flow container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Flow) {
				container = (Flow) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FlowLinkDescriptor> result = new LinkedList<FlowLinkDescriptor>();
		for (Iterator<?> links = container.getTube().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Tube) {
				continue;
			}
			Tube link = (Tube) linkObject;
			if (TubeEditPart.VISUAL_ID != FlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Cell dst = link.getTo();
			Cell src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new FlowLinkDescriptor(src, dst, link,
					FlowElementTypes.Tube_4001, TubeEditPart.VISUAL_ID));
		}
		return result;
	}

}
