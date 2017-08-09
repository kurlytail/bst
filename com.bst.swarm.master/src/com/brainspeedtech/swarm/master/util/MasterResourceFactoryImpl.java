/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.gmf.runtime.emf.core.internal.util.EMFCoreConstants;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.master.util.MasterResourceImpl
 * @generated NOT
 */
public class MasterResourceFactoryImpl extends GMFResourceFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Resource createResource(URI uri) {

		XMIResource resource = new MasterResourceImpl(uri);

		resource.getDefaultLoadOptions().putAll(getDefaultLoadOptions());
		resource.getDefaultSaveOptions().putAll(getDefaultSaveOptions());

		if (!resource.getEncoding().equals(EMFCoreConstants.XMI_ENCODING))
			resource.setEncoding(EMFCoreConstants.XMI_ENCODING);

		return resource;
	}

} //MasterResourceFactoryImpl
