/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.sm.diagram.navigator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.brainspeedtech.swarm.sm.diagram.part.SmDiagramEditorPlugin;

/**
 * @generated
 */
public class SmDomainNavigatorLabelProvider implements ICommonLabelProvider {

	/**
	 * @generated
	 */
	private AdapterFactoryLabelProvider myAdapterFactoryLabelProvider = new AdapterFactoryLabelProvider(
			SmDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SmDomainNavigatorItem) {
			return myAdapterFactoryLabelProvider
					.getImage(((SmDomainNavigatorItem) element).getEObject());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SmDomainNavigatorItem) {
			return myAdapterFactoryLabelProvider
					.getText(((SmDomainNavigatorItem) element).getEObject());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public void addListener(ILabelProviderListener listener) {
		myAdapterFactoryLabelProvider.addListener(listener);
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myAdapterFactoryLabelProvider.dispose();
	}

	/**
	 * @generated
	 */
	public boolean isLabelProperty(Object element, String property) {
		return myAdapterFactoryLabelProvider.isLabelProperty(element, property);
	}

	/**
	 * @generated
	 */
	public void removeListener(ILabelProviderListener listener) {
		myAdapterFactoryLabelProvider.removeListener(listener);
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

}
