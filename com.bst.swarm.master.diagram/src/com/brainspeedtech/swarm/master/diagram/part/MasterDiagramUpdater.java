/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.part;

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
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterCellEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterDesignEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterTubeEditPart;
import com.brainspeedtech.swarm.master.diagram.providers.MasterElementTypes;

/**
 * @generated
 */
public class MasterDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<MasterNodeDescriptor> getSemanticChildren(View view) {
		switch (MasterVisualIDRegistry.getVisualID(view)) {
		case MasterDesignEditPart.VISUAL_ID:
			return getMasterDesign_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MasterNodeDescriptor> getMasterDesign_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MasterDesign modelElement = (MasterDesign) view.getElement();
		LinkedList<MasterNodeDescriptor> result = new LinkedList<MasterNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCell().iterator(); it.hasNext();) {
			MasterCell childElement = (MasterCell) it.next();
			int visualID = MasterVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MasterCellEditPart.VISUAL_ID) {
				result.add(new MasterNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getContainedLinks(View view) {
		switch (MasterVisualIDRegistry.getVisualID(view)) {
		case MasterDesignEditPart.VISUAL_ID:
			return getMasterDesign_1000ContainedLinks(view);
		case MasterCellEditPart.VISUAL_ID:
			return getMasterCell_2002ContainedLinks(view);
		case MasterTubeEditPart.VISUAL_ID:
			return getMasterTube_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getIncomingLinks(View view) {
		switch (MasterVisualIDRegistry.getVisualID(view)) {
		case MasterCellEditPart.VISUAL_ID:
			return getMasterCell_2002IncomingLinks(view);
		case MasterTubeEditPart.VISUAL_ID:
			return getMasterTube_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getOutgoingLinks(View view) {
		switch (MasterVisualIDRegistry.getVisualID(view)) {
		case MasterCellEditPart.VISUAL_ID:
			return getMasterCell_2002OutgoingLinks(view);
		case MasterTubeEditPart.VISUAL_ID:
			return getMasterTube_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getMasterDesign_1000ContainedLinks(
			View view) {
		MasterDesign modelElement = (MasterDesign) view.getElement();
		LinkedList<MasterLinkDescriptor> result = new LinkedList<MasterLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MasterTube_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getMasterCell_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getMasterTube_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getMasterCell_2002IncomingLinks(
			View view) {
		MasterCell modelElement = (MasterCell) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MasterLinkDescriptor> result = new LinkedList<MasterLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MasterTube_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getMasterTube_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getMasterCell_2002OutgoingLinks(
			View view) {
		MasterCell modelElement = (MasterCell) view.getElement();
		LinkedList<MasterLinkDescriptor> result = new LinkedList<MasterLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MasterTube_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MasterLinkDescriptor> getMasterTube_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MasterLinkDescriptor> getContainedTypeModelFacetLinks_MasterTube_4002(
			MasterDesign container) {
		LinkedList<MasterLinkDescriptor> result = new LinkedList<MasterLinkDescriptor>();
		for (Iterator<?> links = container.getTube().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MasterTube) {
				continue;
			}
			MasterTube link = (MasterTube) linkObject;
			if (MasterTubeEditPart.VISUAL_ID != MasterVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MasterCell dst = link.getTo();
			MasterCell src = link.getFrom();
			result.add(new MasterLinkDescriptor(src, dst, link,
					MasterElementTypes.MasterTube_4002,
					MasterTubeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MasterLinkDescriptor> getIncomingTypeModelFacetLinks_MasterTube_4002(
			MasterCell target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MasterLinkDescriptor> result = new LinkedList<MasterLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MasterPackage.eINSTANCE
					.getMasterTube_To()
					|| false == setting.getEObject() instanceof MasterTube) {
				continue;
			}
			MasterTube link = (MasterTube) setting.getEObject();
			if (MasterTubeEditPart.VISUAL_ID != MasterVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MasterCell src = link.getFrom();
			result.add(new MasterLinkDescriptor(src, target, link,
					MasterElementTypes.MasterTube_4002,
					MasterTubeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MasterLinkDescriptor> getOutgoingTypeModelFacetLinks_MasterTube_4002(
			MasterCell source) {
		MasterDesign container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MasterDesign) {
				container = (MasterDesign) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MasterLinkDescriptor> result = new LinkedList<MasterLinkDescriptor>();
		for (Iterator<?> links = container.getTube().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MasterTube) {
				continue;
			}
			MasterTube link = (MasterTube) linkObject;
			if (MasterTubeEditPart.VISUAL_ID != MasterVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MasterCell dst = link.getTo();
			MasterCell src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new MasterLinkDescriptor(src, dst, link,
					MasterElementTypes.MasterTube_4002,
					MasterTubeEditPart.VISUAL_ID));
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
		public List<MasterNodeDescriptor> getSemanticChildren(View view) {
			return MasterDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MasterLinkDescriptor> getContainedLinks(View view) {
			return MasterDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MasterLinkDescriptor> getIncomingLinks(View view) {
			return MasterDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MasterLinkDescriptor> getOutgoingLinks(View view) {
			return MasterDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
