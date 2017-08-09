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
package com.brainspeedtech.constraint.software.tcl;

import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.software.tcl.TclFactory
 * @model kind="package"
 * @generated
 */
public interface TclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tcl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/software/tcl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tcl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TclPackage eINSTANCE = com.brainspeedtech.constraint.software.tcl.impl.TclPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.tcl.impl.TclGenerationImpl <em>Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.tcl.impl.TclGenerationImpl
	 * @see com.brainspeedtech.constraint.software.tcl.impl.TclPackageImpl#getTclGeneration()
	 * @generated
	 */
	int TCL_GENERATION = 0;

	/**
	 * The number of structural features of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCL_GENERATION_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.tcl.TclGeneration <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation</em>'.
	 * @see com.brainspeedtech.constraint.software.tcl.TclGeneration
	 * @generated
	 */
	EClass getTclGeneration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TclFactory getTclFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.tcl.impl.TclGenerationImpl <em>Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.tcl.impl.TclGenerationImpl
		 * @see com.brainspeedtech.constraint.software.tcl.impl.TclPackageImpl#getTclGeneration()
		 * @generated
		 */
		EClass TCL_GENERATION = eINSTANCE.getTclGeneration();

	}

} //TclPackage
