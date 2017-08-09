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
package com.brainspeedtech.struct.inst;

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
 * @see com.brainspeedtech.struct.inst.InstFactory
 * @model kind="package"
 * @generated
 */
public interface InstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inst";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/struct/inst";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstPackage eINSTANCE = com.brainspeedtech.struct.inst.impl.InstPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.inst.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.inst.impl.InstanceImpl
	 * @see com.brainspeedtech.struct.inst.impl.InstPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TERMS = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__STRUCT = 3;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.inst.impl.InstanceTermImpl <em>Instance Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.inst.impl.InstanceTermImpl
	 * @see com.brainspeedtech.struct.inst.impl.InstPackageImpl#getInstanceTerm()
	 * @generated
	 */
	int INSTANCE_TERM = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TERM__PATH = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TERM__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TERM__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TERM__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Instance Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TERM_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.inst.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see com.brainspeedtech.struct.inst.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the containment reference '{@link com.brainspeedtech.struct.inst.Instance#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terms</em>'.
	 * @see com.brainspeedtech.struct.inst.Instance#getTerms()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Terms();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.inst.Instance#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.struct.inst.Instance#getCount()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.inst.Instance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.struct.inst.Instance#getName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.struct.inst.Instance#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Struct</em>'.
	 * @see com.brainspeedtech.struct.inst.Instance#getStruct()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Struct();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.inst.InstanceTerm <em>Instance Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Term</em>'.
	 * @see com.brainspeedtech.struct.inst.InstanceTerm
	 * @generated
	 */
	EClass getInstanceTerm();

	/**
	 * Returns the meta object for the containment reference '{@link com.brainspeedtech.struct.inst.InstanceTerm#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see com.brainspeedtech.struct.inst.InstanceTerm#getPath()
	 * @see #getInstanceTerm()
	 * @generated
	 */
	EReference getInstanceTerm_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.inst.InstanceTerm#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.brainspeedtech.struct.inst.InstanceTerm#getIndex()
	 * @see #getInstanceTerm()
	 * @generated
	 */
	EAttribute getInstanceTerm_Index();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.inst.InstanceTerm#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see com.brainspeedtech.struct.inst.InstanceTerm#getRange()
	 * @see #getInstanceTerm()
	 * @generated
	 */
	EAttribute getInstanceTerm_Range();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.inst.InstanceTerm#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.brainspeedtech.struct.inst.InstanceTerm#getValue()
	 * @see #getInstanceTerm()
	 * @generated
	 */
	EAttribute getInstanceTerm_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstFactory getInstFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.struct.inst.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.inst.impl.InstanceImpl
		 * @see com.brainspeedtech.struct.inst.impl.InstPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__TERMS = eINSTANCE.getInstance_Terms();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__COUNT = eINSTANCE.getInstance_Count();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__STRUCT = eINSTANCE.getInstance_Struct();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.struct.inst.impl.InstanceTermImpl <em>Instance Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.inst.impl.InstanceTermImpl
		 * @see com.brainspeedtech.struct.inst.impl.InstPackageImpl#getInstanceTerm()
		 * @generated
		 */
		EClass INSTANCE_TERM = eINSTANCE.getInstanceTerm();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_TERM__PATH = eINSTANCE.getInstanceTerm_Path();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_TERM__INDEX = eINSTANCE.getInstanceTerm_Index();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_TERM__RANGE = eINSTANCE.getInstanceTerm_Range();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_TERM__VALUE = eINSTANCE.getInstanceTerm_Value();

	}

} //InstPackage
