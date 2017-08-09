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
package com.brainspeedtech.constraint.software;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.software.SoftwarePackage
 * @generated
 */
public interface SoftwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareFactory eINSTANCE = com.brainspeedtech.constraint.software.impl.SoftwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Blocking Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blocking Receiver</em>'.
	 * @generated
	 */
	BlockingReceiver createBlockingReceiver();

	/**
	 * Returns a new object of class '<em>Buffer Depth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer Depth</em>'.
	 * @generated
	 */
	BufferDepth createBufferDepth();

	/**
	 * Returns a new object of class '<em>Custom Instance Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Instance Cell</em>'.
	 * @generated
	 */
	CustomInstanceCell createCustomInstanceCell();

	/**
	 * Returns a new object of class '<em>Custom Master Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Master Cell</em>'.
	 * @generated
	 */
	CustomMasterCell createCustomMasterCell();

	/**
	 * Returns a new object of class '<em>File Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Tube</em>'.
	 * @generated
	 */
	FileTube createFileTube();

	/**
	 * Returns a new object of class '<em>Ignore Invalid Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore Invalid Transitions</em>'.
	 * @generated
	 */
	IgnoreInvalidTransitions createIgnoreInvalidTransitions();

	/**
	 * Returns a new object of class '<em>Memory FIFO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory FIFO</em>'.
	 * @generated
	 */
	MemoryFIFO createMemoryFIFO();

	/**
	 * Returns a new object of class '<em>Native Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Native Type</em>'.
	 * @generated
	 */
	NativeType createNativeType();

	/**
	 * Returns a new object of class '<em>No Idle Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Idle Handler</em>'.
	 * @generated
	 */
	NoIdleHandler createNoIdleHandler();

	/**
	 * Returns a new object of class '<em>No Init Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Init Handler</em>'.
	 * @generated
	 */
	NoInitHandler createNoInitHandler();

	/**
	 * Returns a new object of class '<em>Shared Memory Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Memory Tube</em>'.
	 * @generated
	 */
	SharedMemoryTube createSharedMemoryTube();

	/**
	 * Returns a new object of class '<em>Shared Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Variable</em>'.
	 * @generated
	 */
	SharedVariable createSharedVariable();

	/**
	 * Returns a new object of class '<em>Single Tube Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Tube Handler</em>'.
	 * @generated
	 */
	SingleTubeHandler createSingleTubeHandler();

	/**
	 * Returns a new object of class '<em>State Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Group</em>'.
	 * @generated
	 */
	StateGroup createStateGroup();

	/**
	 * Returns a new object of class '<em>Struct Size Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Size Limit</em>'.
	 * @generated
	 */
	StructSizeLimit createStructSizeLimit();

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
	SoftwarePackage getSoftwarePackage();

} //SoftwareFactory
