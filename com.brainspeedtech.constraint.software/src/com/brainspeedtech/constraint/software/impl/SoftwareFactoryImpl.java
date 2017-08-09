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
package com.brainspeedtech.constraint.software.impl;

import com.brainspeedtech.constraint.software.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareFactoryImpl extends EFactoryImpl implements SoftwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareFactory init() {
		try {
			SoftwareFactory theSoftwareFactory = (SoftwareFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.brainspeedtech.com/constraint/software"); 
			if (theSoftwareFactory != null) {
				return theSoftwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SoftwarePackage.BLOCKING_RECEIVER: return createBlockingReceiver();
			case SoftwarePackage.BUFFER_DEPTH: return createBufferDepth();
			case SoftwarePackage.CUSTOM_INSTANCE_CELL: return createCustomInstanceCell();
			case SoftwarePackage.CUSTOM_MASTER_CELL: return createCustomMasterCell();
			case SoftwarePackage.FILE_TUBE: return createFileTube();
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS: return createIgnoreInvalidTransitions();
			case SoftwarePackage.MEMORY_FIFO: return createMemoryFIFO();
			case SoftwarePackage.NATIVE_TYPE: return createNativeType();
			case SoftwarePackage.NO_IDLE_HANDLER: return createNoIdleHandler();
			case SoftwarePackage.NO_INIT_HANDLER: return createNoInitHandler();
			case SoftwarePackage.SHARED_MEMORY_TUBE: return createSharedMemoryTube();
			case SoftwarePackage.SHARED_VARIABLE: return createSharedVariable();
			case SoftwarePackage.SINGLE_TUBE_HANDLER: return createSingleTubeHandler();
			case SoftwarePackage.STATE_GROUP: return createStateGroup();
			case SoftwarePackage.STRUCT_SIZE_LIMIT: return createStructSizeLimit();
			case SoftwarePackage.TCP_SOCKET_TUBE: return createTCPSocketTube();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockingReceiver createBlockingReceiver() {
		BlockingReceiverImpl blockingReceiver = new BlockingReceiverImpl();
		return blockingReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferDepth createBufferDepth() {
		BufferDepthImpl bufferDepth = new BufferDepthImpl();
		return bufferDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomInstanceCell createCustomInstanceCell() {
		CustomInstanceCellImpl customInstanceCell = new CustomInstanceCellImpl();
		return customInstanceCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMasterCell createCustomMasterCell() {
		CustomMasterCellImpl customMasterCell = new CustomMasterCellImpl();
		return customMasterCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTube createFileTube() {
		FileTubeImpl fileTube = new FileTubeImpl();
		return fileTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreInvalidTransitions createIgnoreInvalidTransitions() {
		IgnoreInvalidTransitionsImpl ignoreInvalidTransitions = new IgnoreInvalidTransitionsImpl();
		return ignoreInvalidTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryFIFO createMemoryFIFO() {
		MemoryFIFOImpl memoryFIFO = new MemoryFIFOImpl();
		return memoryFIFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeType createNativeType() {
		NativeTypeImpl nativeType = new NativeTypeImpl();
		return nativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoIdleHandler createNoIdleHandler() {
		NoIdleHandlerImpl noIdleHandler = new NoIdleHandlerImpl();
		return noIdleHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoInitHandler createNoInitHandler() {
		NoInitHandlerImpl noInitHandler = new NoInitHandlerImpl();
		return noInitHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedMemoryTube createSharedMemoryTube() {
		SharedMemoryTubeImpl sharedMemoryTube = new SharedMemoryTubeImpl();
		return sharedMemoryTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedVariable createSharedVariable() {
		SharedVariableImpl sharedVariable = new SharedVariableImpl();
		return sharedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleTubeHandler createSingleTubeHandler() {
		SingleTubeHandlerImpl singleTubeHandler = new SingleTubeHandlerImpl();
		return singleTubeHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateGroup createStateGroup() {
		StateGroupImpl stateGroup = new StateGroupImpl();
		return stateGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructSizeLimit createStructSizeLimit() {
		StructSizeLimitImpl structSizeLimit = new StructSizeLimitImpl();
		return structSizeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCPSocketTube createTCPSocketTube() {
		TCPSocketTubeImpl tcpSocketTube = new TCPSocketTubeImpl();
		return tcpSocketTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarePackage getSoftwarePackage() {
		return (SoftwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwarePackage getPackage() {
		return SoftwarePackage.eINSTANCE;
	}

} //SoftwareFactoryImpl
