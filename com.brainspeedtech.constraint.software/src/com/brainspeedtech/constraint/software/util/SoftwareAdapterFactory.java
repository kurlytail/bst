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
package com.brainspeedtech.constraint.software.util;

import com.brainspeedtech.constraint.software.*;

import com.brainspeedtech.swarm.layer.ConstraintBase;

import com.brainspeedtech.swarm.layer.IgnoreTube;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.software.SoftwarePackage
 * @generated
 */
public class SoftwareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSwitch<Adapter> modelSwitch =
		new SoftwareSwitch<Adapter>() {
			@Override
			public Adapter caseBlockingReceiver(BlockingReceiver object) {
				return createBlockingReceiverAdapter();
			}
			@Override
			public Adapter caseBufferDepth(BufferDepth object) {
				return createBufferDepthAdapter();
			}
			@Override
			public Adapter caseCustomInstanceCell(CustomInstanceCell object) {
				return createCustomInstanceCellAdapter();
			}
			@Override
			public Adapter caseCustomMasterCell(CustomMasterCell object) {
				return createCustomMasterCellAdapter();
			}
			@Override
			public Adapter caseFileTube(FileTube object) {
				return createFileTubeAdapter();
			}
			@Override
			public Adapter caseIgnoreInvalidTransitions(IgnoreInvalidTransitions object) {
				return createIgnoreInvalidTransitionsAdapter();
			}
			@Override
			public Adapter caseMemoryFIFO(MemoryFIFO object) {
				return createMemoryFIFOAdapter();
			}
			@Override
			public Adapter caseNativeType(NativeType object) {
				return createNativeTypeAdapter();
			}
			@Override
			public Adapter caseNoIdleHandler(NoIdleHandler object) {
				return createNoIdleHandlerAdapter();
			}
			@Override
			public Adapter caseNoInitHandler(NoInitHandler object) {
				return createNoInitHandlerAdapter();
			}
			@Override
			public Adapter caseSharedMemoryTube(SharedMemoryTube object) {
				return createSharedMemoryTubeAdapter();
			}
			@Override
			public Adapter caseSharedVariable(SharedVariable object) {
				return createSharedVariableAdapter();
			}
			@Override
			public Adapter caseSingleTubeHandler(SingleTubeHandler object) {
				return createSingleTubeHandlerAdapter();
			}
			@Override
			public Adapter caseSocketTube(SocketTube object) {
				return createSocketTubeAdapter();
			}
			@Override
			public Adapter caseStateGroup(StateGroup object) {
				return createStateGroupAdapter();
			}
			@Override
			public Adapter caseStructSizeLimit(StructSizeLimit object) {
				return createStructSizeLimitAdapter();
			}
			@Override
			public Adapter caseTCPSocketTube(TCPSocketTube object) {
				return createTCPSocketTubeAdapter();
			}
			@Override
			public Adapter caseConstraintBase(ConstraintBase object) {
				return createConstraintBaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.BlockingReceiver <em>Blocking Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.BlockingReceiver
	 * @generated
	 */
	public Adapter createBlockingReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.BufferDepth <em>Buffer Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.BufferDepth
	 * @generated
	 */
	public Adapter createBufferDepthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.CustomInstanceCell <em>Custom Instance Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.CustomInstanceCell
	 * @generated
	 */
	public Adapter createCustomInstanceCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.CustomMasterCell <em>Custom Master Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.CustomMasterCell
	 * @generated
	 */
	public Adapter createCustomMasterCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.FileTube <em>File Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.FileTube
	 * @generated
	 */
	public Adapter createFileTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.IgnoreInvalidTransitions <em>Ignore Invalid Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.IgnoreInvalidTransitions
	 * @generated
	 */
	public Adapter createIgnoreInvalidTransitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.MemoryFIFO <em>Memory FIFO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.MemoryFIFO
	 * @generated
	 */
	public Adapter createMemoryFIFOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.NativeType
	 * @generated
	 */
	public Adapter createNativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.NoIdleHandler <em>No Idle Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.NoIdleHandler
	 * @generated
	 */
	public Adapter createNoIdleHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.NoInitHandler <em>No Init Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.NoInitHandler
	 * @generated
	 */
	public Adapter createNoInitHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.SharedMemoryTube <em>Shared Memory Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.SharedMemoryTube
	 * @generated
	 */
	public Adapter createSharedMemoryTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.SharedVariable <em>Shared Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.SharedVariable
	 * @generated
	 */
	public Adapter createSharedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.SingleTubeHandler <em>Single Tube Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.SingleTubeHandler
	 * @generated
	 */
	public Adapter createSingleTubeHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.SocketTube <em>Socket Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.SocketTube
	 * @generated
	 */
	public Adapter createSocketTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.StateGroup <em>State Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.StateGroup
	 * @generated
	 */
	public Adapter createStateGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.StructSizeLimit <em>Struct Size Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.StructSizeLimit
	 * @generated
	 */
	public Adapter createStructSizeLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.TCPSocketTube <em>TCP Socket Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.TCPSocketTube
	 * @generated
	 */
	public Adapter createTCPSocketTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.ConstraintBase <em>Constraint Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase
	 * @generated
	 */
	public Adapter createConstraintBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SoftwareAdapterFactory
