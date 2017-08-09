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
package com.brainspeedtech.constraint.software.java;

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
 * @see com.brainspeedtech.constraint.software.java.JavaFactory
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/software/java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaPackage eINSTANCE = com.brainspeedtech.constraint.software.java.impl.JavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.java.impl.JavaGeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.java.impl.JavaGeneratorImpl
	 * @see com.brainspeedtech.constraint.software.java.impl.JavaPackageImpl#getJavaGenerator()
	 * @generated
	 */
	int JAVA_GENERATOR = 0;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GENERATOR_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.java.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.java.impl.PackageImpl
	 * @see com.brainspeedtech.constraint.software.java.impl.JavaPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OBJECT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.java.JavaGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see com.brainspeedtech.constraint.software.java.JavaGenerator
	 * @generated
	 */
	EClass getJavaGenerator();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.java.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see com.brainspeedtech.constraint.software.java.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.java.Package#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see com.brainspeedtech.constraint.software.java.Package#getObject()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.java.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.constraint.software.java.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaFactory getJavaFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.java.impl.JavaGeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.java.impl.JavaGeneratorImpl
		 * @see com.brainspeedtech.constraint.software.java.impl.JavaPackageImpl#getJavaGenerator()
		 * @generated
		 */
		EClass JAVA_GENERATOR = eINSTANCE.getJavaGenerator();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.java.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.java.impl.PackageImpl
		 * @see com.brainspeedtech.constraint.software.java.impl.JavaPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OBJECT = eINSTANCE.getPackage_Object();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

	}

} //JavaPackage
