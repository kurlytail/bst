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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.software.SoftwarePackage
 * @generated
 */
public class SoftwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSwitch() {
		if (modelPackage == null) {
			modelPackage = SoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SoftwarePackage.BLOCKING_RECEIVER: {
				BlockingReceiver blockingReceiver = (BlockingReceiver)theEObject;
				T result = caseBlockingReceiver(blockingReceiver);
				if (result == null) result = caseConstraintBase(blockingReceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.BUFFER_DEPTH: {
				BufferDepth bufferDepth = (BufferDepth)theEObject;
				T result = caseBufferDepth(bufferDepth);
				if (result == null) result = caseConstraintBase(bufferDepth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.CUSTOM_INSTANCE_CELL: {
				CustomInstanceCell customInstanceCell = (CustomInstanceCell)theEObject;
				T result = caseCustomInstanceCell(customInstanceCell);
				if (result == null) result = caseConstraintBase(customInstanceCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.CUSTOM_MASTER_CELL: {
				CustomMasterCell customMasterCell = (CustomMasterCell)theEObject;
				T result = caseCustomMasterCell(customMasterCell);
				if (result == null) result = caseConstraintBase(customMasterCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.FILE_TUBE: {
				FileTube fileTube = (FileTube)theEObject;
				T result = caseFileTube(fileTube);
				if (result == null) result = caseConstraintBase(fileTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS: {
				IgnoreInvalidTransitions ignoreInvalidTransitions = (IgnoreInvalidTransitions)theEObject;
				T result = caseIgnoreInvalidTransitions(ignoreInvalidTransitions);
				if (result == null) result = caseConstraintBase(ignoreInvalidTransitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.MEMORY_FIFO: {
				MemoryFIFO memoryFIFO = (MemoryFIFO)theEObject;
				T result = caseMemoryFIFO(memoryFIFO);
				if (result == null) result = caseConstraintBase(memoryFIFO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.NATIVE_TYPE: {
				NativeType nativeType = (NativeType)theEObject;
				T result = caseNativeType(nativeType);
				if (result == null) result = caseConstraintBase(nativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.NO_IDLE_HANDLER: {
				NoIdleHandler noIdleHandler = (NoIdleHandler)theEObject;
				T result = caseNoIdleHandler(noIdleHandler);
				if (result == null) result = caseConstraintBase(noIdleHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.NO_INIT_HANDLER: {
				NoInitHandler noInitHandler = (NoInitHandler)theEObject;
				T result = caseNoInitHandler(noInitHandler);
				if (result == null) result = caseConstraintBase(noInitHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.SHARED_MEMORY_TUBE: {
				SharedMemoryTube sharedMemoryTube = (SharedMemoryTube)theEObject;
				T result = caseSharedMemoryTube(sharedMemoryTube);
				if (result == null) result = caseConstraintBase(sharedMemoryTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.SHARED_VARIABLE: {
				SharedVariable sharedVariable = (SharedVariable)theEObject;
				T result = caseSharedVariable(sharedVariable);
				if (result == null) result = caseConstraintBase(sharedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.SINGLE_TUBE_HANDLER: {
				SingleTubeHandler singleTubeHandler = (SingleTubeHandler)theEObject;
				T result = caseSingleTubeHandler(singleTubeHandler);
				if (result == null) result = caseConstraintBase(singleTubeHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.SOCKET_TUBE: {
				SocketTube socketTube = (SocketTube)theEObject;
				T result = caseSocketTube(socketTube);
				if (result == null) result = caseConstraintBase(socketTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.STATE_GROUP: {
				StateGroup stateGroup = (StateGroup)theEObject;
				T result = caseStateGroup(stateGroup);
				if (result == null) result = caseConstraintBase(stateGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.STRUCT_SIZE_LIMIT: {
				StructSizeLimit structSizeLimit = (StructSizeLimit)theEObject;
				T result = caseStructSizeLimit(structSizeLimit);
				if (result == null) result = caseConstraintBase(structSizeLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.TCP_SOCKET_TUBE: {
				TCPSocketTube tcpSocketTube = (TCPSocketTube)theEObject;
				T result = caseTCPSocketTube(tcpSocketTube);
				if (result == null) result = caseSocketTube(tcpSocketTube);
				if (result == null) result = caseConstraintBase(tcpSocketTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blocking Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blocking Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockingReceiver(BlockingReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Depth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Depth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferDepth(BufferDepth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Instance Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Instance Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomInstanceCell(CustomInstanceCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Master Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Master Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomMasterCell(CustomMasterCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileTube(FileTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Invalid Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Invalid Transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreInvalidTransitions(IgnoreInvalidTransitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory FIFO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory FIFO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryFIFO(MemoryFIFO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeType(NativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Idle Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Idle Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoIdleHandler(NoIdleHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Init Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Init Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoInitHandler(NoInitHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Memory Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Memory Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedMemoryTube(SharedMemoryTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedVariable(SharedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Tube Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Tube Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleTubeHandler(SingleTubeHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Socket Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Socket Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocketTube(SocketTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateGroup(StateGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Size Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Size Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructSizeLimit(StructSizeLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP Socket Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP Socket Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCPSocketTube(TCPSocketTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintBase(ConstraintBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SoftwareSwitch
