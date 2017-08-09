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
package com.brainspeedtech.swarm.inst;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.inst.InstPackage
 * @generated
 */
public interface InstFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstFactory eINSTANCE = com.brainspeedtech.swarm.inst.impl.InstFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cell Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell Instance</em>'.
	 * @generated
	 */
	CellInstance createCellInstance();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Tube Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tube Instance</em>'.
	 * @generated
	 */
	TubeInstance createTubeInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstPackage getInstPackage();

} //InstFactory
