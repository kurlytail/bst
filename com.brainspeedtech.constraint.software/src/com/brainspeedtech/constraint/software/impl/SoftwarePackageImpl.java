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

import com.brainspeedtech.constraint.software.BlockingReceiver;
import com.brainspeedtech.constraint.software.BufferDepth;
import com.brainspeedtech.constraint.software.CustomInstanceCell;
import com.brainspeedtech.constraint.software.CustomMasterCell;
import com.brainspeedtech.constraint.software.FileTube;
import com.brainspeedtech.constraint.software.IgnoreInvalidTransitions;
import com.brainspeedtech.constraint.software.MemoryFIFO;
import com.brainspeedtech.constraint.software.NativeType;
import com.brainspeedtech.constraint.software.NoIdleHandler;
import com.brainspeedtech.constraint.software.NoInitHandler;
import com.brainspeedtech.constraint.software.SharedMemoryTube;
import com.brainspeedtech.constraint.software.SharedVariable;
import com.brainspeedtech.constraint.software.SingleTubeHandler;
import com.brainspeedtech.constraint.software.SocketTube;
import com.brainspeedtech.constraint.software.SoftwareFactory;
import com.brainspeedtech.constraint.software.SoftwarePackage;
import com.brainspeedtech.constraint.software.StateGroup;
import com.brainspeedtech.constraint.software.StructSizeLimit;
import com.brainspeedtech.constraint.software.TCPSocketTube;

import com.brainspeedtech.struct.StructPackage;

import com.brainspeedtech.swarm.inst.InstPackage;

import com.brainspeedtech.swarm.layer.LayerPackage;

import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.sm.SmPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarePackageImpl extends EPackageImpl implements SoftwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockingReceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferDepthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customInstanceCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customMasterCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreInvalidTransitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryFIFOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noIdleHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noInitHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedMemoryTubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleTubeHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socketTubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structSizeLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpSocketTubeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoftwarePackageImpl() {
		super(eNS_URI, SoftwareFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SoftwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoftwarePackage init() {
		if (isInited) return (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);

		// Obtain or create and register package
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoftwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LayerPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSoftwarePackage.createPackageContents();

		// Initialize created meta-data
		theSoftwarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSoftwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoftwarePackage.eNS_URI, theSoftwarePackage);
		return theSoftwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockingReceiver() {
		return blockingReceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockingReceiver_MasterTube() {
		return (EReference)blockingReceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferDepth() {
		return bufferDepthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBufferDepth_MasterTube() {
		return (EReference)bufferDepthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBufferDepth_Depth() {
		return (EAttribute)bufferDepthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomInstanceCell() {
		return customInstanceCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomInstanceCell_Cell() {
		return (EReference)customInstanceCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomMasterCell() {
		return customMasterCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomMasterCell_Cell() {
		return (EReference)customMasterCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileTube() {
		return fileTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileTube_InstanceTube() {
		return (EReference)fileTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTube_Name() {
		return (EAttribute)fileTubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnoreInvalidTransitions() {
		return ignoreInvalidTransitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgnoreInvalidTransitions_State() {
		return (EReference)ignoreInvalidTransitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgnoreInvalidTransitions_StateMachines() {
		return (EReference)ignoreInvalidTransitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryFIFO() {
		return memoryFIFOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryFIFO_Tube() {
		return (EReference)memoryFIFOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNativeType() {
		return nativeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNativeType_Object() {
		return (EReference)nativeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoIdleHandler() {
		return noIdleHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoIdleHandler_Cell() {
		return (EReference)noIdleHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoInitHandler() {
		return noInitHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoInitHandler_Cell() {
		return (EReference)noInitHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedMemoryTube() {
		return sharedMemoryTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedMemoryTube_Tube() {
		return (EReference)sharedMemoryTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedMemoryTube_Struct() {
		return (EReference)sharedMemoryTubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedMemoryTube_Name() {
		return (EAttribute)sharedMemoryTubeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedVariable() {
		return sharedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedVariable_MasterCell() {
		return (EReference)sharedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedVariable_Count() {
		return (EAttribute)sharedVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedVariable_Name() {
		return (EAttribute)sharedVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleTubeHandler() {
		return singleTubeHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleTubeHandler_Tube() {
		return (EReference)singleTubeHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocketTube() {
		return socketTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocketTube_Tube() {
		return (EReference)socketTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocketTube_ClientReceiver() {
		return (EAttribute)socketTubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateGroup() {
		return stateGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateGroup_State() {
		return (EReference)stateGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateGroup_Name() {
		return (EAttribute)stateGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructSizeLimit() {
		return structSizeLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructSizeLimit_Structure() {
		return (EReference)structSizeLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructSizeLimit_Limit() {
		return (EAttribute)structSizeLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedVariable_Struct() {
		return (EReference)sharedVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCPSocketTube() {
		return tcpSocketTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPSocketTube_ServerIP() {
		return (EAttribute)tcpSocketTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPSocketTube_ServerPort() {
		return (EAttribute)tcpSocketTubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFactory getSoftwareFactory() {
		return (SoftwareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		blockingReceiverEClass = createEClass(BLOCKING_RECEIVER);
		createEReference(blockingReceiverEClass, BLOCKING_RECEIVER__MASTER_TUBE);

		bufferDepthEClass = createEClass(BUFFER_DEPTH);
		createEReference(bufferDepthEClass, BUFFER_DEPTH__MASTER_TUBE);
		createEAttribute(bufferDepthEClass, BUFFER_DEPTH__DEPTH);

		customInstanceCellEClass = createEClass(CUSTOM_INSTANCE_CELL);
		createEReference(customInstanceCellEClass, CUSTOM_INSTANCE_CELL__CELL);

		customMasterCellEClass = createEClass(CUSTOM_MASTER_CELL);
		createEReference(customMasterCellEClass, CUSTOM_MASTER_CELL__CELL);

		fileTubeEClass = createEClass(FILE_TUBE);
		createEReference(fileTubeEClass, FILE_TUBE__INSTANCE_TUBE);
		createEAttribute(fileTubeEClass, FILE_TUBE__NAME);

		ignoreInvalidTransitionsEClass = createEClass(IGNORE_INVALID_TRANSITIONS);
		createEReference(ignoreInvalidTransitionsEClass, IGNORE_INVALID_TRANSITIONS__STATE);
		createEReference(ignoreInvalidTransitionsEClass, IGNORE_INVALID_TRANSITIONS__STATE_MACHINES);

		memoryFIFOEClass = createEClass(MEMORY_FIFO);
		createEReference(memoryFIFOEClass, MEMORY_FIFO__TUBE);

		nativeTypeEClass = createEClass(NATIVE_TYPE);
		createEReference(nativeTypeEClass, NATIVE_TYPE__OBJECT);

		noIdleHandlerEClass = createEClass(NO_IDLE_HANDLER);
		createEReference(noIdleHandlerEClass, NO_IDLE_HANDLER__CELL);

		noInitHandlerEClass = createEClass(NO_INIT_HANDLER);
		createEReference(noInitHandlerEClass, NO_INIT_HANDLER__CELL);

		sharedMemoryTubeEClass = createEClass(SHARED_MEMORY_TUBE);
		createEReference(sharedMemoryTubeEClass, SHARED_MEMORY_TUBE__TUBE);
		createEReference(sharedMemoryTubeEClass, SHARED_MEMORY_TUBE__STRUCT);
		createEAttribute(sharedMemoryTubeEClass, SHARED_MEMORY_TUBE__NAME);

		sharedVariableEClass = createEClass(SHARED_VARIABLE);
		createEReference(sharedVariableEClass, SHARED_VARIABLE__MASTER_CELL);
		createEReference(sharedVariableEClass, SHARED_VARIABLE__STRUCT);
		createEAttribute(sharedVariableEClass, SHARED_VARIABLE__COUNT);
		createEAttribute(sharedVariableEClass, SHARED_VARIABLE__NAME);

		singleTubeHandlerEClass = createEClass(SINGLE_TUBE_HANDLER);
		createEReference(singleTubeHandlerEClass, SINGLE_TUBE_HANDLER__TUBE);

		socketTubeEClass = createEClass(SOCKET_TUBE);
		createEReference(socketTubeEClass, SOCKET_TUBE__TUBE);
		createEAttribute(socketTubeEClass, SOCKET_TUBE__CLIENT_RECEIVER);

		stateGroupEClass = createEClass(STATE_GROUP);
		createEReference(stateGroupEClass, STATE_GROUP__STATE);
		createEAttribute(stateGroupEClass, STATE_GROUP__NAME);

		structSizeLimitEClass = createEClass(STRUCT_SIZE_LIMIT);
		createEReference(structSizeLimitEClass, STRUCT_SIZE_LIMIT__STRUCTURE);
		createEAttribute(structSizeLimitEClass, STRUCT_SIZE_LIMIT__LIMIT);

		tcpSocketTubeEClass = createEClass(TCP_SOCKET_TUBE);
		createEAttribute(tcpSocketTubeEClass, TCP_SOCKET_TUBE__SERVER_IP);
		createEAttribute(tcpSocketTubeEClass, TCP_SOCKET_TUBE__SERVER_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LayerPackage theLayerPackage = (LayerPackage)EPackage.Registry.INSTANCE.getEPackage(LayerPackage.eNS_URI);
		MasterPackage theMasterPackage = (MasterPackage)EPackage.Registry.INSTANCE.getEPackage(MasterPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		InstPackage theInstPackage = (InstPackage)EPackage.Registry.INSTANCE.getEPackage(InstPackage.eNS_URI);
		SmPackage theSmPackage = (SmPackage)EPackage.Registry.INSTANCE.getEPackage(SmPackage.eNS_URI);
		StructPackage theStructPackage = (StructPackage)EPackage.Registry.INSTANCE.getEPackage(StructPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockingReceiverEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		bufferDepthEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		customInstanceCellEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		customMasterCellEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		fileTubeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		ignoreInvalidTransitionsEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		memoryFIFOEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		nativeTypeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		noIdleHandlerEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		noInitHandlerEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		sharedMemoryTubeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		sharedVariableEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		singleTubeHandlerEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		socketTubeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		stateGroupEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		structSizeLimitEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		tcpSocketTubeEClass.getESuperTypes().add(this.getSocketTube());

		// Initialize classes and features; add operations and parameters
		initEClass(blockingReceiverEClass, BlockingReceiver.class, "BlockingReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockingReceiver_MasterTube(), theMasterPackage.getMasterTube(), null, "masterTube", null, 0, -1, BlockingReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bufferDepthEClass, BufferDepth.class, "BufferDepth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBufferDepth_MasterTube(), theMasterPackage.getMasterTube(), null, "masterTube", null, 0, -1, BufferDepth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBufferDepth_Depth(), theXMLTypePackage.getInt(), "depth", "1", 0, 1, BufferDepth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customInstanceCellEClass, CustomInstanceCell.class, "CustomInstanceCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomInstanceCell_Cell(), theInstPackage.getCellInstance(), null, "cell", null, 1, 1, CustomInstanceCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customMasterCellEClass, CustomMasterCell.class, "CustomMasterCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomMasterCell_Cell(), theMasterPackage.getMasterCell(), null, "cell", null, 1, 1, CustomMasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileTubeEClass, FileTube.class, "FileTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileTube_InstanceTube(), theInstPackage.getTubeInstance(), null, "instanceTube", null, 0, -1, FileTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTube_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FileTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ignoreInvalidTransitionsEClass, IgnoreInvalidTransitions.class, "IgnoreInvalidTransitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIgnoreInvalidTransitions_State(), theSmPackage.getState(), null, "state", null, 0, -1, IgnoreInvalidTransitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIgnoreInvalidTransitions_StateMachines(), theSmPackage.getStateMachine(), null, "stateMachines", null, 0, -1, IgnoreInvalidTransitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryFIFOEClass, MemoryFIFO.class, "MemoryFIFO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryFIFO_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, MemoryFIFO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nativeTypeEClass, NativeType.class, "NativeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNativeType_Object(), theStructPackage.getAtom(), null, "object", null, 0, -1, NativeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noIdleHandlerEClass, NoIdleHandler.class, "NoIdleHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoIdleHandler_Cell(), theMasterPackage.getMasterCell(), null, "cell", null, 0, -1, NoIdleHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noInitHandlerEClass, NoInitHandler.class, "NoInitHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoInitHandler_Cell(), theMasterPackage.getMasterCell(), null, "cell", null, 0, -1, NoInitHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedMemoryTubeEClass, SharedMemoryTube.class, "SharedMemoryTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedMemoryTube_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, SharedMemoryTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedMemoryTube_Struct(), theStructPackage.getStruct(), null, "struct", null, 1, 1, SharedMemoryTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedMemoryTube_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SharedMemoryTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedVariableEClass, SharedVariable.class, "SharedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedVariable_MasterCell(), theMasterPackage.getMasterCell(), null, "masterCell", null, 0, -1, SharedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedVariable_Struct(), theStructPackage.getStruct(), null, "struct", null, 1, 1, SharedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedVariable_Count(), theXMLTypePackage.getInt(), "count", "1", 0, 1, SharedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedVariable_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SharedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleTubeHandlerEClass, SingleTubeHandler.class, "SingleTubeHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleTubeHandler_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, SingleTubeHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socketTubeEClass, SocketTube.class, "SocketTube", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSocketTube_Tube(), theInstPackage.getTubeInstance(), null, "tube", null, 0, -1, SocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSocketTube_ClientReceiver(), theXMLTypePackage.getBoolean(), "clientReceiver", "false", 0, 1, SocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateGroupEClass, StateGroup.class, "StateGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateGroup_State(), theSmPackage.getState(), null, "state", null, 0, -1, StateGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateGroup_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, StateGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structSizeLimitEClass, StructSizeLimit.class, "StructSizeLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructSizeLimit_Structure(), theStructPackage.getStruct(), null, "structure", null, 0, -1, StructSizeLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructSizeLimit_Limit(), theXMLTypePackage.getLong(), "limit", null, 0, 1, StructSizeLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcpSocketTubeEClass, TCPSocketTube.class, "TCPSocketTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCPSocketTube_ServerIP(), theXMLTypePackage.getString(), "serverIP", "localhost", 0, 1, TCPSocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPSocketTube_ServerPort(), theXMLTypePackage.getInt(), "serverPort", "8000", 0, 1, TCPSocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (blockingReceiverEClass, 
		   source, 
		   new String[] {
			 "name", "BlockingReceiver",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBlockingReceiver_MasterTube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterTube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (bufferDepthEClass, 
		   source, 
		   new String[] {
			 "name", "BufferDepth",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBufferDepth_MasterTube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterTube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBufferDepth_Depth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "depth"
		   });		
		addAnnotation
		  (customInstanceCellEClass, 
		   source, 
		   new String[] {
			 "name", "CustomInstanceCell",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCustomInstanceCell_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (customMasterCellEClass, 
		   source, 
		   new String[] {
			 "name", "CustomMasterCell",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCustomMasterCell_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fileTubeEClass, 
		   source, 
		   new String[] {
			 "name", "FileTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFileTube_InstanceTube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instanceTube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileTube_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (ignoreInvalidTransitionsEClass, 
		   source, 
		   new String[] {
			 "name", "IgnoreInvalidTransitions",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIgnoreInvalidTransitions_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIgnoreInvalidTransitions_StateMachines(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stateMachines",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (memoryFIFOEClass, 
		   source, 
		   new String[] {
			 "name", "MemoryFIFO",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMemoryFIFO_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (nativeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NativeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNativeType_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (noIdleHandlerEClass, 
		   source, 
		   new String[] {
			 "name", "NoIdleHandler",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNoIdleHandler_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (noInitHandlerEClass, 
		   source, 
		   new String[] {
			 "name", "NoInitHandler",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNoInitHandler_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sharedMemoryTubeEClass, 
		   source, 
		   new String[] {
			 "name", "SharedMemoryTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSharedMemoryTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSharedMemoryTube_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSharedMemoryTube_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (sharedVariableEClass, 
		   source, 
		   new String[] {
			 "name", "SharedVariable",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSharedVariable_MasterCell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterCell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSharedVariable_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSharedVariable_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (getSharedVariable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (singleTubeHandlerEClass, 
		   source, 
		   new String[] {
			 "name", "SingleTubeHandler",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSingleTubeHandler_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (socketTubeEClass, 
		   source, 
		   new String[] {
			 "name", "SocketTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSocketTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSocketTube_ClientReceiver(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientReceiver"
		   });			
		addAnnotation
		  (stateGroupEClass, 
		   source, 
		   new String[] {
			 "name", "StateGroup",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStateGroup_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStateGroup_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (structSizeLimitEClass, 
		   source, 
		   new String[] {
			 "name", "StructSizeLimit",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStructSizeLimit_Structure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "structure",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStructSizeLimit_Limit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "limit"
		   });		
		addAnnotation
		  (tcpSocketTubeEClass, 
		   source, 
		   new String[] {
			 "name", "TCPSocketTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTCPSocketTube_ServerIP(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serverIP"
		   });		
		addAnnotation
		  (getTCPSocketTube_ServerPort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serverPort"
		   });
	}

} //SoftwarePackageImpl
