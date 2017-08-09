/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterCellEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterCellNameEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterDesignEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterTubeEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterTubeNameEditPart;
import com.brainspeedtech.swarm.master.diagram.part.MasterDiagramEditorPlugin;
import com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry;
import com.brainspeedtech.swarm.master.diagram.providers.MasterElementTypes;
import com.brainspeedtech.swarm.master.diagram.providers.MasterParserProvider;

/**
 * @generated
 */
public class MasterNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MasterDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MasterDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MasterNavigatorItem
				&& !isOwnView(((MasterNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MasterNavigatorGroup) {
			MasterNavigatorGroup group = (MasterNavigatorGroup) element;
			return MasterDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MasterNavigatorItem) {
			MasterNavigatorItem navigatorItem = (MasterNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MasterVisualIDRegistry.getVisualID(view)) {
		case MasterDesignEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.brainspeedtech.com/swarm/master?MasterDesign", MasterElementTypes.MasterDesign_1000); //$NON-NLS-1$
		case MasterTubeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.brainspeedtech.com/swarm/master?MasterTube", MasterElementTypes.MasterTube_4002); //$NON-NLS-1$
		case MasterCellEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.brainspeedtech.com/swarm/master?MasterCell", MasterElementTypes.MasterCell_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MasterDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MasterElementTypes.isKnownElementType(elementType)) {
			image = MasterElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MasterNavigatorGroup) {
			MasterNavigatorGroup group = (MasterNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MasterNavigatorItem) {
			MasterNavigatorItem navigatorItem = (MasterNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MasterVisualIDRegistry.getVisualID(view)) {
		case MasterDesignEditPart.VISUAL_ID:
			return getMasterDesign_1000Text(view);
		case MasterTubeEditPart.VISUAL_ID:
			return getMasterTube_4002Text(view);
		case MasterCellEditPart.VISUAL_ID:
			return getMasterCell_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMasterCell_2002Text(View view) {
		IParser parser = MasterParserProvider.getParser(
				MasterElementTypes.MasterCell_2002,
				view.getElement() != null ? view.getElement() : view,
				MasterVisualIDRegistry
						.getType(MasterCellNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MasterDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMasterDesign_1000Text(View view) {
		MasterDesign domainModelElement = (MasterDesign) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			MasterDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMasterTube_4002Text(View view) {
		IParser parser = MasterParserProvider.getParser(
				MasterElementTypes.MasterTube_4002,
				view.getElement() != null ? view.getElement() : view,
				MasterVisualIDRegistry
						.getType(MasterTubeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MasterDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MasterDesignEditPart.MODEL_ID.equals(MasterVisualIDRegistry
				.getModelID(view));
	}

}
