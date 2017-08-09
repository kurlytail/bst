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
 * @see com.brainspeedtech.constraint.software.SoftwareFactory
 * @model kind="package"
 * @generated
 */
public interface SoftwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "software";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/software";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "software";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwarePackage eINSTANCE = com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.BlockingReceiverImpl <em>Blocking Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.BlockingReceiverImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getBlockingReceiver()
	 * @generated
	 */
	int BLOCKING_RECEIVER = 0;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Master Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER__MASTER_TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blocking Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKING_RECEIVER_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.BufferDepthImpl <em>Buffer Depth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.BufferDepthImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getBufferDepth()
	 * @generated
	 */
	int BUFFER_DEPTH = 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Master Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__MASTER_TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH__DEPTH = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Buffer Depth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEPTH_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.CustomInstanceCellImpl <em>Custom Instance Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.CustomInstanceCellImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getCustomInstanceCell()
	 * @generated
	 */
	int CUSTOM_INSTANCE_CELL = 2;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL__CELL = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Instance Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTANCE_CELL_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.CustomMasterCellImpl <em>Custom Master Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.CustomMasterCellImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getCustomMasterCell()
	 * @generated
	 */
	int CUSTOM_MASTER_CELL = 3;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL__CELL = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Master Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MASTER_CELL_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.FileTubeImpl <em>File Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.FileTubeImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getFileTube()
	 * @generated
	 */
	int FILE_TUBE = 4;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Instance Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__INSTANCE_TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE__NAME = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TUBE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.IgnoreInvalidTransitionsImpl <em>Ignore Invalid Transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.IgnoreInvalidTransitionsImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getIgnoreInvalidTransitions()
	 * @generated
	 */
	int IGNORE_INVALID_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__STATE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS__STATE_MACHINES = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ignore Invalid Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_INVALID_TRANSITIONS_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.MemoryFIFOImpl <em>Memory FIFO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.MemoryFIFOImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getMemoryFIFO()
	 * @generated
	 */
	int MEMORY_FIFO = 6;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory FIFO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FIFO_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.NativeTypeImpl <em>Native Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.NativeTypeImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getNativeType()
	 * @generated
	 */
	int NATIVE_TYPE = 7;

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
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.NoIdleHandlerImpl <em>No Idle Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.NoIdleHandlerImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getNoIdleHandler()
	 * @generated
	 */
	int NO_IDLE_HANDLER = 8;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER__CELL = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Idle Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_IDLE_HANDLER_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.NoInitHandlerImpl <em>No Init Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.NoInitHandlerImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getNoInitHandler()
	 * @generated
	 */
	int NO_INIT_HANDLER = 9;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER__CELL = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Init Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INIT_HANDLER_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.SharedMemoryTubeImpl <em>Shared Memory Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.SharedMemoryTubeImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getSharedMemoryTube()
	 * @generated
	 */
	int SHARED_MEMORY_TUBE = 10;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__STRUCT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE__NAME = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shared Memory Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_TUBE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.SharedVariableImpl <em>Shared Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.SharedVariableImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getSharedVariable()
	 * @generated
	 */
	int SHARED_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Master Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__MASTER_CELL = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__STRUCT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE__NAME = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shared Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VARIABLE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.SingleTubeHandlerImpl <em>Single Tube Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.SingleTubeHandlerImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getSingleTubeHandler()
	 * @generated
	 */
	int SINGLE_TUBE_HANDLER = 12;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Tube Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TUBE_HANDLER_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.SocketTubeImpl <em>Socket Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.SocketTubeImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getSocketTube()
	 * @generated
	 */
	int SOCKET_TUBE = 13;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE__CLIENT_RECEIVER = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Socket Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TUBE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.StateGroupImpl <em>State Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.StateGroupImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getStateGroup()
	 * @generated
	 */
	int STATE_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__STATE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__NAME = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.StructSizeLimitImpl <em>Struct Size Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.StructSizeLimitImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getStructSizeLimit()
	 * @generated
	 */
	int STRUCT_SIZE_LIMIT = 15;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__STRUCTURE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT__LIMIT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Struct Size Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SIZE_LIMIT_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.software.impl.TCPSocketTubeImpl <em>TCP Socket Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.software.impl.TCPSocketTubeImpl
	 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getTCPSocketTube()
	 * @generated
	 */
	int TCP_SOCKET_TUBE = 16;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__EXCEPT_FOR = SOCKET_TUBE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__APPLY_TO_ALL_NATURES = SOCKET_TUBE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__BLURB = SOCKET_TUBE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__DISABLED = SOCKET_TUBE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__PINNED = SOCKET_TUBE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__PROCESS = SOCKET_TUBE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__REASON = SOCKET_TUBE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__TUBE = SOCKET_TUBE__TUBE;

	/**
	 * The feature id for the '<em><b>Client Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__CLIENT_RECEIVER = SOCKET_TUBE__CLIENT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Server IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__SERVER_IP = SOCKET_TUBE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE__SERVER_PORT = SOCKET_TUBE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCP Socket Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_SOCKET_TUBE_FEATURE_COUNT = SOCKET_TUBE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.BlockingReceiver <em>Blocking Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blocking Receiver</em>'.
	 * @see com.brainspeedtech.constraint.software.BlockingReceiver
	 * @generated
	 */
	EClass getBlockingReceiver();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.BlockingReceiver#getMasterTube <em>Master Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.BlockingReceiver#getMasterTube()
	 * @see #getBlockingReceiver()
	 * @generated
	 */
	EReference getBlockingReceiver_MasterTube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.BufferDepth <em>Buffer Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Depth</em>'.
	 * @see com.brainspeedtech.constraint.software.BufferDepth
	 * @generated
	 */
	EClass getBufferDepth();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.BufferDepth#getMasterTube <em>Master Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.BufferDepth#getMasterTube()
	 * @see #getBufferDepth()
	 * @generated
	 */
	EReference getBufferDepth_MasterTube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.BufferDepth#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see com.brainspeedtech.constraint.software.BufferDepth#getDepth()
	 * @see #getBufferDepth()
	 * @generated
	 */
	EAttribute getBufferDepth_Depth();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.CustomInstanceCell <em>Custom Instance Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Instance Cell</em>'.
	 * @see com.brainspeedtech.constraint.software.CustomInstanceCell
	 * @generated
	 */
	EClass getCustomInstanceCell();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.constraint.software.CustomInstanceCell#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cell</em>'.
	 * @see com.brainspeedtech.constraint.software.CustomInstanceCell#getCell()
	 * @see #getCustomInstanceCell()
	 * @generated
	 */
	EReference getCustomInstanceCell_Cell();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.CustomMasterCell <em>Custom Master Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Master Cell</em>'.
	 * @see com.brainspeedtech.constraint.software.CustomMasterCell
	 * @generated
	 */
	EClass getCustomMasterCell();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.constraint.software.CustomMasterCell#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cell</em>'.
	 * @see com.brainspeedtech.constraint.software.CustomMasterCell#getCell()
	 * @see #getCustomMasterCell()
	 * @generated
	 */
	EReference getCustomMasterCell_Cell();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.FileTube <em>File Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.FileTube
	 * @generated
	 */
	EClass getFileTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.FileTube#getInstanceTube <em>Instance Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.FileTube#getInstanceTube()
	 * @see #getFileTube()
	 * @generated
	 */
	EReference getFileTube_InstanceTube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.FileTube#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.constraint.software.FileTube#getName()
	 * @see #getFileTube()
	 * @generated
	 */
	EAttribute getFileTube_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.IgnoreInvalidTransitions <em>Ignore Invalid Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Invalid Transitions</em>'.
	 * @see com.brainspeedtech.constraint.software.IgnoreInvalidTransitions
	 * @generated
	 */
	EClass getIgnoreInvalidTransitions();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.IgnoreInvalidTransitions#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State</em>'.
	 * @see com.brainspeedtech.constraint.software.IgnoreInvalidTransitions#getState()
	 * @see #getIgnoreInvalidTransitions()
	 * @generated
	 */
	EReference getIgnoreInvalidTransitions_State();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.IgnoreInvalidTransitions#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machines</em>'.
	 * @see com.brainspeedtech.constraint.software.IgnoreInvalidTransitions#getStateMachines()
	 * @see #getIgnoreInvalidTransitions()
	 * @generated
	 */
	EReference getIgnoreInvalidTransitions_StateMachines();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.MemoryFIFO <em>Memory FIFO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory FIFO</em>'.
	 * @see com.brainspeedtech.constraint.software.MemoryFIFO
	 * @generated
	 */
	EClass getMemoryFIFO();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.MemoryFIFO#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.MemoryFIFO#getTube()
	 * @see #getMemoryFIFO()
	 * @generated
	 */
	EReference getMemoryFIFO_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Type</em>'.
	 * @see com.brainspeedtech.constraint.software.NativeType
	 * @generated
	 */
	EClass getNativeType();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.NativeType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see com.brainspeedtech.constraint.software.NativeType#getObject()
	 * @see #getNativeType()
	 * @generated
	 */
	EReference getNativeType_Object();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.NoIdleHandler <em>No Idle Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Idle Handler</em>'.
	 * @see com.brainspeedtech.constraint.software.NoIdleHandler
	 * @generated
	 */
	EClass getNoIdleHandler();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.NoIdleHandler#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cell</em>'.
	 * @see com.brainspeedtech.constraint.software.NoIdleHandler#getCell()
	 * @see #getNoIdleHandler()
	 * @generated
	 */
	EReference getNoIdleHandler_Cell();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.NoInitHandler <em>No Init Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Init Handler</em>'.
	 * @see com.brainspeedtech.constraint.software.NoInitHandler
	 * @generated
	 */
	EClass getNoInitHandler();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.NoInitHandler#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cell</em>'.
	 * @see com.brainspeedtech.constraint.software.NoInitHandler#getCell()
	 * @see #getNoInitHandler()
	 * @generated
	 */
	EReference getNoInitHandler_Cell();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.SharedMemoryTube <em>Shared Memory Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Memory Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedMemoryTube
	 * @generated
	 */
	EClass getSharedMemoryTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.SharedMemoryTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedMemoryTube#getTube()
	 * @see #getSharedMemoryTube()
	 * @generated
	 */
	EReference getSharedMemoryTube_Tube();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.constraint.software.SharedMemoryTube#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Struct</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedMemoryTube#getStruct()
	 * @see #getSharedMemoryTube()
	 * @generated
	 */
	EReference getSharedMemoryTube_Struct();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.SharedMemoryTube#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedMemoryTube#getName()
	 * @see #getSharedMemoryTube()
	 * @generated
	 */
	EAttribute getSharedMemoryTube_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.SharedVariable <em>Shared Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Variable</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedVariable
	 * @generated
	 */
	EClass getSharedVariable();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.SharedVariable#getMasterCell <em>Master Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Cell</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedVariable#getMasterCell()
	 * @see #getSharedVariable()
	 * @generated
	 */
	EReference getSharedVariable_MasterCell();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.SharedVariable#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedVariable#getCount()
	 * @see #getSharedVariable()
	 * @generated
	 */
	EAttribute getSharedVariable_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.SharedVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedVariable#getName()
	 * @see #getSharedVariable()
	 * @generated
	 */
	EAttribute getSharedVariable_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.SingleTubeHandler <em>Single Tube Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Tube Handler</em>'.
	 * @see com.brainspeedtech.constraint.software.SingleTubeHandler
	 * @generated
	 */
	EClass getSingleTubeHandler();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.SingleTubeHandler#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.SingleTubeHandler#getTube()
	 * @see #getSingleTubeHandler()
	 * @generated
	 */
	EReference getSingleTubeHandler_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.SocketTube <em>Socket Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socket Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.SocketTube
	 * @generated
	 */
	EClass getSocketTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.SocketTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.SocketTube#getTube()
	 * @see #getSocketTube()
	 * @generated
	 */
	EReference getSocketTube_Tube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.SocketTube#isClientReceiver <em>Client Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Receiver</em>'.
	 * @see com.brainspeedtech.constraint.software.SocketTube#isClientReceiver()
	 * @see #getSocketTube()
	 * @generated
	 */
	EAttribute getSocketTube_ClientReceiver();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.StateGroup <em>State Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Group</em>'.
	 * @see com.brainspeedtech.constraint.software.StateGroup
	 * @generated
	 */
	EClass getStateGroup();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.StateGroup#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State</em>'.
	 * @see com.brainspeedtech.constraint.software.StateGroup#getState()
	 * @see #getStateGroup()
	 * @generated
	 */
	EReference getStateGroup_State();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.StateGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.constraint.software.StateGroup#getName()
	 * @see #getStateGroup()
	 * @generated
	 */
	EAttribute getStateGroup_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.StructSizeLimit <em>Struct Size Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Size Limit</em>'.
	 * @see com.brainspeedtech.constraint.software.StructSizeLimit
	 * @generated
	 */
	EClass getStructSizeLimit();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.software.StructSizeLimit#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structure</em>'.
	 * @see com.brainspeedtech.constraint.software.StructSizeLimit#getStructure()
	 * @see #getStructSizeLimit()
	 * @generated
	 */
	EReference getStructSizeLimit_Structure();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.StructSizeLimit#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see com.brainspeedtech.constraint.software.StructSizeLimit#getLimit()
	 * @see #getStructSizeLimit()
	 * @generated
	 */
	EAttribute getStructSizeLimit_Limit();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.constraint.software.SharedVariable#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Struct</em>'.
	 * @see com.brainspeedtech.constraint.software.SharedVariable#getStruct()
	 * @see #getSharedVariable()
	 * @generated
	 */
	EReference getSharedVariable_Struct();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.software.TCPSocketTube <em>TCP Socket Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP Socket Tube</em>'.
	 * @see com.brainspeedtech.constraint.software.TCPSocketTube
	 * @generated
	 */
	EClass getTCPSocketTube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerIP <em>Server IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server IP</em>'.
	 * @see com.brainspeedtech.constraint.software.TCPSocketTube#getServerIP()
	 * @see #getTCPSocketTube()
	 * @generated
	 */
	EAttribute getTCPSocketTube_ServerIP();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerPort <em>Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Port</em>'.
	 * @see com.brainspeedtech.constraint.software.TCPSocketTube#getServerPort()
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
	SoftwareFactory getSoftwareFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.BlockingReceiverImpl <em>Blocking Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.BlockingReceiverImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getBlockingReceiver()
		 * @generated
		 */
		EClass BLOCKING_RECEIVER = eINSTANCE.getBlockingReceiver();

		/**
		 * The meta object literal for the '<em><b>Master Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKING_RECEIVER__MASTER_TUBE = eINSTANCE.getBlockingReceiver_MasterTube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.BufferDepthImpl <em>Buffer Depth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.BufferDepthImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getBufferDepth()
		 * @generated
		 */
		EClass BUFFER_DEPTH = eINSTANCE.getBufferDepth();

		/**
		 * The meta object literal for the '<em><b>Master Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER_DEPTH__MASTER_TUBE = eINSTANCE.getBufferDepth_MasterTube();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER_DEPTH__DEPTH = eINSTANCE.getBufferDepth_Depth();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.CustomInstanceCellImpl <em>Custom Instance Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.CustomInstanceCellImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getCustomInstanceCell()
		 * @generated
		 */
		EClass CUSTOM_INSTANCE_CELL = eINSTANCE.getCustomInstanceCell();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_INSTANCE_CELL__CELL = eINSTANCE.getCustomInstanceCell_Cell();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.CustomMasterCellImpl <em>Custom Master Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.CustomMasterCellImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getCustomMasterCell()
		 * @generated
		 */
		EClass CUSTOM_MASTER_CELL = eINSTANCE.getCustomMasterCell();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_MASTER_CELL__CELL = eINSTANCE.getCustomMasterCell_Cell();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.FileTubeImpl <em>File Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.FileTubeImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getFileTube()
		 * @generated
		 */
		EClass FILE_TUBE = eINSTANCE.getFileTube();

		/**
		 * The meta object literal for the '<em><b>Instance Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_TUBE__INSTANCE_TUBE = eINSTANCE.getFileTube_InstanceTube();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_TUBE__NAME = eINSTANCE.getFileTube_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.IgnoreInvalidTransitionsImpl <em>Ignore Invalid Transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.IgnoreInvalidTransitionsImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getIgnoreInvalidTransitions()
		 * @generated
		 */
		EClass IGNORE_INVALID_TRANSITIONS = eINSTANCE.getIgnoreInvalidTransitions();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGNORE_INVALID_TRANSITIONS__STATE = eINSTANCE.getIgnoreInvalidTransitions_State();

		/**
		 * The meta object literal for the '<em><b>State Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGNORE_INVALID_TRANSITIONS__STATE_MACHINES = eINSTANCE.getIgnoreInvalidTransitions_StateMachines();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.MemoryFIFOImpl <em>Memory FIFO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.MemoryFIFOImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getMemoryFIFO()
		 * @generated
		 */
		EClass MEMORY_FIFO = eINSTANCE.getMemoryFIFO();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_FIFO__TUBE = eINSTANCE.getMemoryFIFO_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.NativeTypeImpl <em>Native Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.NativeTypeImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getNativeType()
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
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.NoIdleHandlerImpl <em>No Idle Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.NoIdleHandlerImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getNoIdleHandler()
		 * @generated
		 */
		EClass NO_IDLE_HANDLER = eINSTANCE.getNoIdleHandler();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_IDLE_HANDLER__CELL = eINSTANCE.getNoIdleHandler_Cell();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.NoInitHandlerImpl <em>No Init Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.NoInitHandlerImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getNoInitHandler()
		 * @generated
		 */
		EClass NO_INIT_HANDLER = eINSTANCE.getNoInitHandler();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_INIT_HANDLER__CELL = eINSTANCE.getNoInitHandler_Cell();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.SharedMemoryTubeImpl <em>Shared Memory Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.SharedMemoryTubeImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getSharedMemoryTube()
		 * @generated
		 */
		EClass SHARED_MEMORY_TUBE = eINSTANCE.getSharedMemoryTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_MEMORY_TUBE__TUBE = eINSTANCE.getSharedMemoryTube_Tube();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_MEMORY_TUBE__STRUCT = eINSTANCE.getSharedMemoryTube_Struct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_MEMORY_TUBE__NAME = eINSTANCE.getSharedMemoryTube_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.SharedVariableImpl <em>Shared Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.SharedVariableImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getSharedVariable()
		 * @generated
		 */
		EClass SHARED_VARIABLE = eINSTANCE.getSharedVariable();

		/**
		 * The meta object literal for the '<em><b>Master Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_VARIABLE__MASTER_CELL = eINSTANCE.getSharedVariable_MasterCell();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_VARIABLE__COUNT = eINSTANCE.getSharedVariable_Count();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_VARIABLE__NAME = eINSTANCE.getSharedVariable_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.SingleTubeHandlerImpl <em>Single Tube Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.SingleTubeHandlerImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getSingleTubeHandler()
		 * @generated
		 */
		EClass SINGLE_TUBE_HANDLER = eINSTANCE.getSingleTubeHandler();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_TUBE_HANDLER__TUBE = eINSTANCE.getSingleTubeHandler_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.SocketTubeImpl <em>Socket Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.SocketTubeImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getSocketTube()
		 * @generated
		 */
		EClass SOCKET_TUBE = eINSTANCE.getSocketTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCKET_TUBE__TUBE = eINSTANCE.getSocketTube_Tube();

		/**
		 * The meta object literal for the '<em><b>Client Receiver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCKET_TUBE__CLIENT_RECEIVER = eINSTANCE.getSocketTube_ClientReceiver();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.StateGroupImpl <em>State Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.StateGroupImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getStateGroup()
		 * @generated
		 */
		EClass STATE_GROUP = eINSTANCE.getStateGroup();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_GROUP__STATE = eINSTANCE.getStateGroup_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_GROUP__NAME = eINSTANCE.getStateGroup_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.StructSizeLimitImpl <em>Struct Size Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.StructSizeLimitImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getStructSizeLimit()
		 * @generated
		 */
		EClass STRUCT_SIZE_LIMIT = eINSTANCE.getStructSizeLimit();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_SIZE_LIMIT__STRUCTURE = eINSTANCE.getStructSizeLimit_Structure();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT_SIZE_LIMIT__LIMIT = eINSTANCE.getStructSizeLimit_Limit();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_VARIABLE__STRUCT = eINSTANCE.getSharedVariable_Struct();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.software.impl.TCPSocketTubeImpl <em>TCP Socket Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.software.impl.TCPSocketTubeImpl
		 * @see com.brainspeedtech.constraint.software.impl.SoftwarePackageImpl#getTCPSocketTube()
		 * @generated
		 */
		EClass TCP_SOCKET_TUBE = eINSTANCE.getTCPSocketTube();

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

} //SoftwarePackage
