/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.opencl;

import com.brainspeedtech.swarm.layer.LayerPackage;

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
 * @see com.brainspeedtech.constraint.software.opencl.OpenclFactory
 * @model kind="package"
 * @generated
 */
public interface OpenclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opencl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/software/opencl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opencl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenclPackage eINSTANCE = com.brainspeedtech.constraint.software.opencl.impl.OpenclPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.opencl.impl.CustomOpenCLTubeImpl <em>Custom Open CL Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.opencl.impl.CustomOpenCLTubeImpl
	 * @see com.brainspeedtech.constraint.software.opencl.impl.OpenclPackageImpl#getCustomOpenCLTube()
	 * @generated
	 */
	int CUSTOM_OPEN_CL_TUBE = 0;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Open CL Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPEN_CL_TUBE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.opencl.impl.IgnoreOpenCLTubeImpl <em>Ignore Open CL Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.opencl.impl.IgnoreOpenCLTubeImpl
	 * @see com.brainspeedtech.constraint.software.opencl.impl.OpenclPackageImpl#getIgnoreOpenCLTube()
	 * @generated
	 */
	int IGNORE_OPEN_CL_TUBE = 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ignore Open CL Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPEN_CL_TUBE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.opencl.impl.OpenCLGeneratorImpl <em>Open CL Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.opencl.impl.OpenCLGeneratorImpl
	 * @see com.brainspeedtech.constraint.software.opencl.impl.OpenclPackageImpl#getOpenCLGenerator()
	 * @generated
	 */
	int OPEN_CL_GENERATOR = 2;

	/**
	 * The number of structural features of the '<em>Open CL Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_CL_GENERATOR_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.opencl.CustomOpenCLTube <em>Custom Open CL Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Open CL Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.opencl.CustomOpenCLTube
	 * @generated
	 */
	EClass getCustomOpenCLTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.opencl.CustomOpenCLTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.opencl.CustomOpenCLTube#getTube()
	 * @see #getCustomOpenCLTube()
	 * @generated
	 */
	EReference getCustomOpenCLTube_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube <em>Ignore Open CL Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Open CL Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube
	 * @generated
	 */
	EClass getIgnoreOpenCLTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube#getTube()
	 * @see #getIgnoreOpenCLTube()
	 * @generated
	 */
	EReference getIgnoreOpenCLTube_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.opencl.OpenCLGenerator <em>Open CL Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open CL Generator</em>'.
	 * @see com.brainspeedtech.constraint.software.opencl.OpenCLGenerator
	 * @generated
	 */
	EClass getOpenCLGenerator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenclFactory getOpenclFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.opencl.impl.CustomOpenCLTubeImpl <em>Custom Open CL Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.opencl.impl.CustomOpenCLTubeImpl
		 * @see com.brainspeedtech.constraint.software.opencl.impl.OpenclPackageImpl#getCustomOpenCLTube()
		 * @generated
		 */
		EClass CUSTOM_OPEN_CL_TUBE = eINSTANCE.getCustomOpenCLTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_OPEN_CL_TUBE__TUBE = eINSTANCE.getCustomOpenCLTube_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.opencl.impl.IgnoreOpenCLTubeImpl <em>Ignore Open CL Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.opencl.impl.IgnoreOpenCLTubeImpl
		 * @see com.brainspeedtech.constraint.software.opencl.impl.OpenclPackageImpl#getIgnoreOpenCLTube()
		 * @generated
		 */
		EClass IGNORE_OPEN_CL_TUBE = eINSTANCE.getIgnoreOpenCLTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGNORE_OPEN_CL_TUBE__TUBE = eINSTANCE.getIgnoreOpenCLTube_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.opencl.impl.OpenCLGeneratorImpl <em>Open CL Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.opencl.impl.OpenCLGeneratorImpl
		 * @see com.brainspeedtech.constraint.software.opencl.impl.OpenclPackageImpl#getOpenCLGenerator()
		 * @generated
		 */
		EClass OPEN_CL_GENERATOR = eINSTANCE.getOpenCLGenerator();

	}

} //OpenclPackage
