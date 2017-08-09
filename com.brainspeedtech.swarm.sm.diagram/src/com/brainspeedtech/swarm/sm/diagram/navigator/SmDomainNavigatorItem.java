/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.sm.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class SmDomainNavigatorItem extends PlatformObject {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { EObject.class,
				IPropertySource.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof com.brainspeedtech.swarm.sm.diagram.navigator.SmDomainNavigatorItem) {
							com.brainspeedtech.swarm.sm.diagram.navigator.SmDomainNavigatorItem domainNavigatorItem = (com.brainspeedtech.swarm.sm.diagram.navigator.SmDomainNavigatorItem) adaptableObject;
							EObject eObject = domainNavigatorItem.getEObject();
							if (adapterType == EObject.class) {
								return eObject;
							}
							if (adapterType == IPropertySource.class) {
								return domainNavigatorItem
										.getPropertySourceProvider()
										.getPropertySource(eObject);
							}
						}

						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				com.brainspeedtech.swarm.sm.diagram.navigator.SmDomainNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private Object myParent;

	/**
	 * @generated
	 */
	private EObject myEObject;

	/**
	 * @generated
	 */
	private IPropertySourceProvider myPropertySourceProvider;

	/**
	 * @generated
	 */
	public SmDomainNavigatorItem(EObject eObject, Object parent,
			IPropertySourceProvider propertySourceProvider) {
		myParent = parent;
		myEObject = eObject;
		myPropertySourceProvider = propertySourceProvider;
	}

	/**
	 * @generated
	 */
	public Object getParent() {
		return myParent;
	}

	/**
	 * @generated
	 */
	public EObject getEObject() {
		return myEObject;
	}

	/**
	 * @generated
	 */
	public IPropertySourceProvider getPropertySourceProvider() {
		return myPropertySourceProvider;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof com.brainspeedtech.swarm.sm.diagram.navigator.SmDomainNavigatorItem) {
			return EcoreUtil
					.getURI(getEObject())
					.equals(EcoreUtil
							.getURI(((com.brainspeedtech.swarm.sm.diagram.navigator.SmDomainNavigatorItem) obj)
									.getEObject()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getEObject()).hashCode();
	}

}
