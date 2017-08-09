/**
 * <copyright>
 * Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.boost;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.boost.BoostPackage
 * @generated
 */
public interface BoostFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright @2011-2013 BrainSpeed Technologies - All rights reserved";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoostFactory eINSTANCE = com.brainspeedtech.constraint.boost.impl.BoostFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Nature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nature</em>'.
	 * @generated
	 */
	BoostNature createBoostNature();

	/**
	 * Returns a new object of class '<em>Native Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Native Type</em>'.
	 * @generated
	 */
	NativeType createNativeType();

	/**
	 * Returns a new object of class '<em>TCP Socket Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCP Socket Tube</em>'.
	 * @generated
	 */
	TCPSocketTube createTCPSocketTube();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BoostPackage getBoostPackage();

} //BoostFactory
