/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.navigator;

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

import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.CellEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.CellNameEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.FlowEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.TubeEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.TubeNameEditPart;
import com.brainspeedtech.swarm.flow.diagram.part.FlowDiagramEditorPlugin;
import com.brainspeedtech.swarm.flow.diagram.part.FlowVisualIDRegistry;
import com.brainspeedtech.swarm.flow.diagram.providers.FlowElementTypes;
import com.brainspeedtech.swarm.flow.diagram.providers.FlowParserProvider;

/**
 * @generated
 */
public class FlowNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		FlowDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		FlowDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FlowNavigatorItem
				&& !isOwnView(((FlowNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof FlowNavigatorGroup) {
			FlowNavigatorGroup group = (FlowNavigatorGroup) element;
			return FlowDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof FlowNavigatorItem) {
			FlowNavigatorItem navigatorItem = (FlowNavigatorItem) element;
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
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case TubeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.brainspeedtech.com/swarm/flow?Tube", FlowElementTypes.Tube_4001); //$NON-NLS-1$
		case FlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.brainspeedtech.com/swarm/flow?Flow", FlowElementTypes.Flow_1000); //$NON-NLS-1$
		case CellEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.brainspeedtech.com/swarm/flow?Cell", FlowElementTypes.Cell_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FlowDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& FlowElementTypes.isKnownElementType(elementType)) {
			image = FlowElementTypes.getImage(elementType);
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
		if (element instanceof FlowNavigatorGroup) {
			FlowNavigatorGroup group = (FlowNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FlowNavigatorItem) {
			FlowNavigatorItem navigatorItem = (FlowNavigatorItem) element;
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
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case TubeEditPart.VISUAL_ID:
			return getTube_4001Text(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_1000Text(view);
		case CellEditPart.VISUAL_ID:
			return getCell_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCell_2001Text(View view) {
		IParser parser = FlowParserProvider.getParser(
				FlowElementTypes.Cell_2001,
				view.getElement() != null ? view.getElement() : view,
				FlowVisualIDRegistry.getType(CellNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTube_4001Text(View view) {
		IParser parser = FlowParserProvider.getParser(
				FlowElementTypes.Tube_4001,
				view.getElement() != null ? view.getElement() : view,
				FlowVisualIDRegistry.getType(TubeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_1000Text(View view) {
		Flow domainModelElement = (Flow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			FlowDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
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
		return FlowEditPart.MODEL_ID.equals(FlowVisualIDRegistry
				.getModelID(view));
	}

}
