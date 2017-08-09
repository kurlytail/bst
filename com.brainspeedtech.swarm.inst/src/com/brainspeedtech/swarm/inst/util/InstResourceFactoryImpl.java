/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.swarm.inst.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.emf.core.internal.util.EMFCoreConstants;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.inst.util.InstResourceImpl
 * @generated NOT
 */
public class InstResourceFactoryImpl extends GMFResourceFactory {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstResourceFactoryImpl() {
		super();
	}
	
	@Override
	public Resource createResource(URI uri) {

		XMIResource resource = new InstResourceImpl(uri);

		resource.getDefaultLoadOptions().putAll(getDefaultLoadOptions());
		resource.getDefaultSaveOptions().putAll(getDefaultSaveOptions());

		if (!resource.getEncoding().equals(EMFCoreConstants.XMI_ENCODING))
			resource.setEncoding(EMFCoreConstants.XMI_ENCODING);

		return resource;
	}

} //InstResourceFactoryImpl
