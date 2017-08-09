/**
 * <copyright>
 * Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.boost;

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
 * <!-- begin-model-doc -->
 *   Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * 
 * <!-- end-model-doc -->
 * @see com.brainspeedtech.constraint.boost.BoostFactory
 * @model kind="package"
 * @generated
 */
public interface BoostPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright @2011-2013 BrainSpeed Technologies - All rights reserved";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boost";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/boost";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boost";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoostPackage eINSTANCE = com.brainspeedtech.constraint.boost.impl.BoostPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.boost.impl.BoostNatureImpl <em>Nature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.boost.impl.BoostNatureImpl
	 * @see com.brainspeedtech.constraint.boost.impl.BoostPackageImpl#getBoostNature()
	 * @generated
	 */
	int BOOST_NATURE = 0;

	/**
	 * The number of structural features of the '<em>Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOST_NATURE_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.boost.impl.NativeTypeImpl <em>Native Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.boost.impl.NativeTypeImpl
	 * @see com.brainspeedtech.constraint.boost.impl.BoostPackageImpl#getNativeType()
	 * @generated
	 */
	int NATIVE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__OBJECT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Native Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.boost.impl.TCPSocketTubeImpl <em>TCP Socket Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.boost.impl.TCPSocketTubeImpl
	 * @see com.brainspeedtech.constraint.boost.impl.BoostPackageImpl#getTCPSocketTube()
	 * @generated
	 */
	int TCP_SOCKET_TUBE = 2;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__CLIENT_RECEIVER = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__SERVER_IP = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__SERVER_PORT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TCP Socket Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.boost.BoostNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nature</em>'.
	 * @see com.brainspeedtech.constraint.boost.BoostNature
	 * @generated
	 */
	EClass getBoostNature();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.boost.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Type</em>'.
	 * @see com.brainspeedtech.constraint.boost.NativeType
	 * @generated
	 */
	EClass getNativeType();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.boost.NativeType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see com.brainspeedtech.constraint.boost.NativeType#getObject()
	 * @see #getNativeType()
	 * @generated
	 */
	EReference getNativeType_Object();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.boost.TCPSocketTube <em>TCP Socket Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP Socket Tube</em>'.
	 * @see com.brainspeedtech.constraint.boost.TCPSocketTube
	 * @generated
	 */
	EClass getTCPSocketTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.boost.TCPSocketTube#getTube()
	 * @see #getTCPSocketTube()
	 * @generated
	 */
	EReference getTCPSocketTube_Tube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#isClientReceiver <em>Client Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Receiver</em>'.
	 * @see com.brainspeedtech.constraint.boost.TCPSocketTube#isClientReceiver()
	 * @see #getTCPSocketTube()
	 * @generated
	 */
	EAttribute getTCPSocketTube_ClientReceiver();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerIP <em>Server IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server IP</em>'.
	 * @see com.brainspeedtech.constraint.boost.TCPSocketTube#getServerIP()
	 * @see #getTCPSocketTube()
	 * @generated
	 */
	EAttribute getTCPSocketTube_ServerIP();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerPort <em>Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Port</em>'.
	 * @see com.brainspeedtech.constraint.boost.TCPSocketTube#getServerPort()
	 * @see #getTCPSocketTube()
	 * @generated
	 */
	EAttribute getTCPSocketTube_ServerPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoostFactory getBoostFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.boost.impl.BoostNatureImpl <em>Nature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.boost.impl.BoostNatureImpl
		 * @see com.brainspeedtech.constraint.boost.impl.BoostPackageImpl#getBoostNature()
		 * @generated
		 */
		EClass BOOST_NATURE = eINSTANCE.getBoostNature();
		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.boost.impl.NativeTypeImpl <em>Native Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.boost.impl.NativeTypeImpl
		 * @see com.brainspeedtech.constraint.boost.impl.BoostPackageImpl#getNativeType()
		 * @generated
		 */
		EClass NATIVE_TYPE = eINSTANCE.getNativeType();
		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATIVE_TYPE__OBJECT = eINSTANCE.getNativeType_Object();
		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.boost.impl.TCPSocketTubeImpl <em>TCP Socket Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.boost.impl.TCPSocketTubeImpl
		 * @see com.brainspeedtech.constraint.boost.impl.BoostPackageImpl#getTCPSocketTube()
		 * @generated
		 */
		EClass TCP_SOCKET_TUBE = eINSTANCE.getTCPSocketTube();
		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCP_SOCKET_TUBE__TUBE = eINSTANCE.getTCPSocketTube_Tube();
		/**
		 * The meta object literal for the '<em><b>Client Receiver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_SOCKET_TUBE__CLIENT_RECEIVER = eINSTANCE.getTCPSocketTube_ClientReceiver();
		/**
		 * The meta object literal for the '<em><b>Server IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_SOCKET_TUBE__SERVER_IP = eINSTANCE.getTCPSocketTube_ServerIP();
		/**
		 * The meta object literal for the '<em><b>Server Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_SOCKET_TUBE__SERVER_PORT = eINSTANCE.getTCPSocketTube_ServerPort();

	}

} //BoostPackage
