/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.master.MasterPackage
 * @generated
 */
public interface MasterFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MasterFactory eINSTANCE = com.brainspeedtech.swarm.master.impl.MasterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell</em>'.
	 * @generated
	 */
	MasterCell createMasterCell();

	/**
	 * Returns a new object of class '<em>Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design</em>'.
	 * @generated
	 */
	MasterDesign createMasterDesign();

	/**
	 * Returns a new object of class '<em>Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tube</em>'.
	 * @generated
	 */
	MasterTube createMasterTube();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MasterPackage getMasterPackage();

} //MasterFactory
