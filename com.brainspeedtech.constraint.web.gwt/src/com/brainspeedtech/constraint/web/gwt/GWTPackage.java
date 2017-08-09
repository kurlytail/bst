/**
 */
package com.brainspeedtech.constraint.web.gwt;

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
 * @see com.brainspeedtech.constraint.web.gwt.GWTFactory
 * @model kind="package"
 * @generated
 */
public interface GWTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gwt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/web/gwt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gwt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GWTPackage eINSTANCE = com.brainspeedtech.constraint.web.gwt.impl.GWTPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.web.gwt.impl.GWTGenerationImpl <em>Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.web.gwt.impl.GWTGenerationImpl
	 * @see com.brainspeedtech.constraint.web.gwt.impl.GWTPackageImpl#getGWTGeneration()
	 * @generated
	 */
	int GWT_GENERATION = 0;

	/**
	 * The number of structural features of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GWT_GENERATION_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.web.gwt.GWTGeneration <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation</em>'.
	 * @see com.brainspeedtech.constraint.web.gwt.GWTGeneration
	 * @generated
	 */
	EClass getGWTGeneration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GWTFactory getGWTFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.web.gwt.impl.GWTGenerationImpl <em>Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.web.gwt.impl.GWTGenerationImpl
		 * @see com.brainspeedtech.constraint.web.gwt.impl.GWTPackageImpl#getGWTGeneration()
		 * @generated
		 */
		EClass GWT_GENERATION = eINSTANCE.getGWTGeneration();

	}

} //GWTPackage
