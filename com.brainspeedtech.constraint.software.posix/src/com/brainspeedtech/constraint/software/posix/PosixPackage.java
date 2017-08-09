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
package com.brainspeedtech.constraint.software.posix;

import com.brainspeedtech.constraint.software.SoftwarePackage;
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
 * @see com.brainspeedtech.constraint.software.posix.PosixFactory
 * @model kind="package"
 * @generated
 */
public interface PosixPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "posix";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/software/posix";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "posix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PosixPackage eINSTANCE = com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.posix.impl.CustomPosixTubeImpl <em>Custom Posix Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.posix.impl.CustomPosixTubeImpl
	 * @see com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl#getCustomPosixTube()
	 * @generated
	 */
	int CUSTOM_POSIX_TUBE = 0;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Posix Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_POSIX_TUBE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.posix.impl.IgnorePosixTubeImpl <em>Ignore Posix Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.posix.impl.IgnorePosixTubeImpl
	 * @see com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl#getIgnorePosixTube()
	 * @generated
	 */
	int IGNORE_POSIX_TUBE = 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ignore Posix Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_POSIX_TUBE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.posix.impl.PosixGeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.posix.impl.PosixGeneratorImpl
	 * @see com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl#getPosixGenerator()
	 * @generated
	 */
	int POSIX_GENERATOR = 2;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_GENERATOR_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.posix.impl.UnixSocketTubeImpl <em>Unix Socket Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.posix.impl.UnixSocketTubeImpl
	 * @see com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl#getUnixSocketTube()
	 * @generated
	 */
	int UNIX_SOCKET_TUBE = 3;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE__BLURB = SoftwarePackage.SOCKET_TUBE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE__DISABLED = SoftwarePackage.SOCKET_TUBE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE__PINNED = SoftwarePackage.SOCKET_TUBE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE__PROCESS = SoftwarePackage.SOCKET_TUBE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE__REASON = SoftwarePackage.SOCKET_TUBE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE__TUBE = SoftwarePackage.SOCKET_TUBE__TUBE;

	/**
	 * The feature id for the '<em><b>Client Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE__CLIENT_RECEIVER = SoftwarePackage.SOCKET_TUBE__CLIENT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE__NAME = SoftwarePackage.SOCKET_TUBE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unix Socket Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_SOCKET_TUBE_FEATURE_COUNT = SoftwarePackage.SOCKET_TUBE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.posix.CustomPosixTube <em>Custom Posix Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Posix Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.posix.CustomPosixTube
	 * @generated
	 */
	EClass getCustomPosixTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.posix.CustomPosixTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.posix.CustomPosixTube#getTube()
	 * @see #getCustomPosixTube()
	 * @generated
	 */
	EReference getCustomPosixTube_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.posix.IgnorePosixTube <em>Ignore Posix Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Posix Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.posix.IgnorePosixTube
	 * @generated
	 */
	EClass getIgnorePosixTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.posix.IgnorePosixTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.posix.IgnorePosixTube#getTube()
	 * @see #getIgnorePosixTube()
	 * @generated
	 */
	EReference getIgnorePosixTube_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.posix.PosixGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see com.brainspeedtech.constraint.software.posix.PosixGenerator
	 * @generated
	 */
	EClass getPosixGenerator();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.posix.UnixSocketTube <em>Unix Socket Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unix Socket Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.posix.UnixSocketTube
	 * @generated
	 */
	EClass getUnixSocketTube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.posix.UnixSocketTube#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.constraint.software.posix.UnixSocketTube#getName()
	 * @see #getUnixSocketTube()
	 * @generated
	 */
	EAttribute getUnixSocketTube_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PosixFactory getPosixFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.posix.impl.CustomPosixTubeImpl <em>Custom Posix Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.posix.impl.CustomPosixTubeImpl
		 * @see com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl#getCustomPosixTube()
		 * @generated
		 */
		EClass CUSTOM_POSIX_TUBE = eINSTANCE.getCustomPosixTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_POSIX_TUBE__TUBE = eINSTANCE.getCustomPosixTube_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.posix.impl.IgnorePosixTubeImpl <em>Ignore Posix Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.posix.impl.IgnorePosixTubeImpl
		 * @see com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl#getIgnorePosixTube()
		 * @generated
		 */
		EClass IGNORE_POSIX_TUBE = eINSTANCE.getIgnorePosixTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGNORE_POSIX_TUBE__TUBE = eINSTANCE.getIgnorePosixTube_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.posix.impl.PosixGeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.posix.impl.PosixGeneratorImpl
		 * @see com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl#getPosixGenerator()
		 * @generated
		 */
		EClass POSIX_GENERATOR = eINSTANCE.getPosixGenerator();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.posix.impl.UnixSocketTubeImpl <em>Unix Socket Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.posix.impl.UnixSocketTubeImpl
		 * @see com.brainspeedtech.constraint.software.posix.impl.PosixPackageImpl#getUnixSocketTube()
		 * @generated
		 */
		EClass UNIX_SOCKET_TUBE = eINSTANCE.getUnixSocketTube();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIX_SOCKET_TUBE__NAME = eINSTANCE.getUnixSocketTube_Name();

	}

} //PosixPackage
