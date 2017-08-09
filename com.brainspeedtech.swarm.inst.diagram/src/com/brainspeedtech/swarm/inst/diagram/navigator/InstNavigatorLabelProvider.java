/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.inst.diagram.navigator;

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

import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.CellInstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.CellInstanceNameEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.InstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.TubeInstanceEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.TubeInstanceNameEditPart;
import com.brainspeedtech.swarm.inst.diagram.part.InstDiagramEditorPlugin;
import com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry;
import com.brainspeedtech.swarm.inst.diagram.providers.InstElementTypes;
import com.brainspeedtech.swarm.inst.diagram.providers.InstParserProvider;

/**
 * @generated
 */
public class InstNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		InstDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		InstDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof InstNavigatorItem
				&& !isOwnView(((InstNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof InstNavigatorGroup) {
			InstNavigatorGroup group = (InstNavigatorGroup) element;
			return InstDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof InstNavigatorItem) {
			InstNavigatorItem navigatorItem = (InstNavigatorItem) element;
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
		switch (InstVisualIDRegistry.getVisualID(view)) {
		case InstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.brainspeedtech.com/swarm/inst?Instance", InstElementTypes.Instance_1000); //$NON-NLS-1$
		case CellInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.brainspeedtech.com/swarm/inst?CellInstance", InstElementTypes.CellInstance_2001); //$NON-NLS-1$
		case TubeInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.brainspeedtech.com/swarm/inst?TubeInstance", InstElementTypes.TubeInstance_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = InstDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& InstElementTypes.isKnownElementType(elementType)) {
			image = InstElementTypes.getImage(elementType);
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
		if (element instanceof InstNavigatorGroup) {
			InstNavigatorGroup group = (InstNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof InstNavigatorItem) {
			InstNavigatorItem navigatorItem = (InstNavigatorItem) element;
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
		switch (InstVisualIDRegistry.getVisualID(view)) {
		case InstanceEditPart.VISUAL_ID:
			return getInstance_1000Text(view);
		case CellInstanceEditPart.VISUAL_ID:
			return getCellInstance_2001Text(view);
		case TubeInstanceEditPart.VISUAL_ID:
			return getTubeInstance_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTubeInstance_4001Text(View view) {
		IParser parser = InstParserProvider.getParser(
				InstElementTypes.TubeInstance_4001,
				view.getElement() != null ? view.getElement() : view,
				InstVisualIDRegistry
						.getType(TubeInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InstDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCellInstance_2001Text(View view) {
		IParser parser = InstParserProvider.getParser(
				InstElementTypes.CellInstance_2001,
				view.getElement() != null ? view.getElement() : view,
				InstVisualIDRegistry
						.getType(CellInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InstDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInstance_1000Text(View view) {
		Instance domainModelElement = (Instance) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			InstDiagramEditorPlugin.getInstance().logError(
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
		return InstanceEditPart.MODEL_ID.equals(InstVisualIDRegistry
				.getModelID(view));
	}

}
