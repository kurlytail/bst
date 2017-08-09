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
package com.brainspeedtech.constraint.software.python;

import com.brainspeedtech.swarm.layer.ConstraintBase;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.brainspeedtech.constraint.software.python.PythonFactory
 * @model kind="package"
 * @generated
 */
public interface PythonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "python";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/software/python";
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "python";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PythonPackage eINSTANCE = com.brainspeedtech.constraint.software.python.impl.PythonPackageImpl.init();
	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.python.impl.PyPackageImpl <em>Py Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.python.impl.PyPackageImpl
	 * @see com.brainspeedtech.constraint.software.python.impl.PythonPackageImpl#getPyPackage()
	 * @generated
	 */
	int PY_PACKAGE = 0;
	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;
	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;
	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;
	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;
	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;
	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;
	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;
	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__OBJECT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE__NAME = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Py Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PY_PACKAGE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.python.impl.PythonGeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.python.impl.PythonGeneratorImpl
	 * @see com.brainspeedtech.constraint.software.python.impl.PythonPackageImpl#getPythonGenerator()
	 * @generated
	 */
	int PYTHON_GENERATOR = 1;
	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_GENERATOR_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.python.PyPackage <em>Py Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Py Package</em>'.
	 * @see com.brainspeedtech.constraint.software.python.PyPackage
	 * @generated
	 */
	EClass getPyPackage();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.python.PyPackage#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see com.brainspeedtech.constraint.software.python.PyPackage#getObject()
	 * @see #getPyPackage()
	 * @generated
	 */
	EReference getPyPackage_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.python.PyPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.constraint.software.python.PyPackage#getName()
	 * @see #getPyPackage()
	 * @generated
	 */
	EAttribute getPyPackage_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.python.PythonGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see com.brainspeedtech.constraint.software.python.PythonGenerator
	 * @generated
	 */
	EClass getPythonGenerator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PythonFactory getPythonFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.python.impl.PyPackageImpl <em>Py Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.python.impl.PyPackageImpl
		 * @see com.brainspeedtech.constraint.software.python.impl.PythonPackageImpl#getPyPackage()
		 * @generated
		 */
		EClass PY_PACKAGE = eINSTANCE.getPyPackage();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PY_PACKAGE__OBJECT = eINSTANCE.getPyPackage_Object();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PY_PACKAGE__NAME = eINSTANCE.getPyPackage_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.python.impl.PythonGeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.python.impl.PythonGeneratorImpl
		 * @see com.brainspeedtech.constraint.software.python.impl.PythonPackageImpl#getPythonGenerator()
		 * @generated
		 */
		EClass PYTHON_GENERATOR = eINSTANCE.getPythonGenerator();

	}

} //PythonPackage
