/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.inst.diagram.part;

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
import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.CellInstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.InstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.TubeInstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.providers.InstElementTypes;

/**
 * @generated
 */
public class InstDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<InstNodeDescriptor> getSemanticChildren(View view) {
		switch (InstVisualIDRegistry.getVisualID(view)) {
		case InstanceEditPart.VISUAL_ID:
			return getInstance_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InstNodeDescriptor> getInstance_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Instance modelElement = (Instance) view.getElement();
		LinkedList<InstNodeDescriptor> result = new LinkedList<InstNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCell().iterator(); it.hasNext();) {
			CellInstance childElement = (CellInstance) it.next();
			int visualID = InstVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CellInstanceEditPart.VISUAL_ID) {
				result.add(new InstNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getContainedLinks(View view) {
		switch (InstVisualIDRegistry.getVisualID(view)) {
		case InstanceEditPart.VISUAL_ID:
			return getInstance_1000ContainedLinks(view);
		case CellInstanceEditPart.VISUAL_ID:
			return getCellInstance_2001ContainedLinks(view);
		case TubeInstanceEditPart.VISUAL_ID:
			return getTubeInstance_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getIncomingLinks(View view) {
		switch (InstVisualIDRegistry.getVisualID(view)) {
		case CellInstanceEditPart.VISUAL_ID:
			return getCellInstance_2001IncomingLinks(view);
		case TubeInstanceEditPart.VISUAL_ID:
			return getTubeInstance_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getOutgoingLinks(View view) {
		switch (InstVisualIDRegistry.getVisualID(view)) {
		case CellInstanceEditPart.VISUAL_ID:
			return getCellInstance_2001OutgoingLinks(view);
		case TubeInstanceEditPart.VISUAL_ID:
			return getTubeInstance_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getInstance_1000ContainedLinks(
			View view) {
		Instance modelElement = (Instance) view.getElement();
		LinkedList<InstLinkDescriptor> result = new LinkedList<InstLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TubeInstance_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getCellInstance_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getTubeInstance_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getCellInstance_2001IncomingLinks(
			View view) {
		CellInstance modelElement = (CellInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<InstLinkDescriptor> result = new LinkedList<InstLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TubeInstance_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getTubeInstance_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getCellInstance_2001OutgoingLinks(
			View view) {
		CellInstance modelElement = (CellInstance) view.getElement();
		LinkedList<InstLinkDescriptor> result = new LinkedList<InstLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TubeInstance_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InstLinkDescriptor> getTubeInstance_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<InstLinkDescriptor> getContainedTypeModelFacetLinks_TubeInstance_4001(
			Instance container) {
		LinkedList<InstLinkDescriptor> result = new LinkedList<InstLinkDescriptor>();
		for (Iterator<?> links = container.getTube().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TubeInstance) {
				continue;
			}
			TubeInstance link = (TubeInstance) linkObject;
			if (TubeInstanceEditPart.VISUAL_ID != InstVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CellInstance dst = link.getTo();
			CellInstance src = link.getFrom();
			result.add(new InstLinkDescriptor(src, dst, link,
					InstElementTypes.TubeInstance_4001,
					TubeInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InstLinkDescriptor> getIncomingTypeModelFacetLinks_TubeInstance_4001(
			CellInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<InstLinkDescriptor> result = new LinkedList<InstLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != InstPackage.eINSTANCE
					.getTubeInstance_To()
					|| false == setting.getEObject() instanceof TubeInstance) {
				continue;
			}
			TubeInstance link = (TubeInstance) setting.getEObject();
			if (TubeInstanceEditPart.VISUAL_ID != InstVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CellInstance src = link.getFrom();
			result.add(new InstLinkDescriptor(src, target, link,
					InstElementTypes.TubeInstance_4001,
					TubeInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InstLinkDescriptor> getOutgoingTypeModelFacetLinks_TubeInstance_4001(
			CellInstance source) {
		Instance container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Instance) {
				container = (Instance) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<InstLinkDescriptor> result = new LinkedList<InstLinkDescriptor>();
		for (Iterator<?> links = container.getTube().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TubeInstance) {
				continue;
			}
			TubeInstance link = (TubeInstance) linkObject;
			if (TubeInstanceEditPart.VISUAL_ID != InstVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CellInstance dst = link.getTo();
			CellInstance src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new InstLinkDescriptor(src, dst, link,
					InstElementTypes.TubeInstance_4001,
					TubeInstanceEditPart.VISUAL_ID));
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
		public List<InstNodeDescriptor> getSemanticChildren(View view) {
			return InstDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InstLinkDescriptor> getContainedLinks(View view) {
			return InstDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InstLinkDescriptor> getIncomingLinks(View view) {
			return InstDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InstLinkDescriptor> getOutgoingLinks(View view) {
			return InstDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
