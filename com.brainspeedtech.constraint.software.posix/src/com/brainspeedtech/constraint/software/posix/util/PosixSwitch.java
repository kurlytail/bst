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
package com.brainspeedtech.constraint.software.posix.util;

import com.brainspeedtech.constraint.software.SocketTube;
import com.brainspeedtech.constraint.software.posix.*;

import com.brainspeedtech.swarm.layer.ConstraintBase;

import com.brainspeedtech.swarm.layer.NatureBase;
import com.brainspeedtech.swarm.layer.CustomTube;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see com.brainspeedtech.constraint.software.posix.PosixPackage
 * @generated
 */
public class PosixSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PosixPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PosixSwitch() {
		if (modelPackage == null) {
			modelPackage = PosixPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PosixPackage.CUSTOM_POSIX_TUBE: {
				CustomPosixTube customPosixTube = (CustomPosixTube)theEObject;
				Object result = caseCustomPosixTube(customPosixTube);
				if (result == null) result = caseConstraintBase(customPosixTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PosixPackage.IGNORE_POSIX_TUBE: {
				IgnorePosixTube ignorePosixTube = (IgnorePosixTube)theEObject;
				Object result = caseIgnorePosixTube(ignorePosixTube);
				if (result == null) result = caseConstraintBase(ignorePosixTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PosixPackage.POSIX_GENERATOR: {
				PosixGenerator posixGenerator = (PosixGenerator)theEObject;
				Object result = casePosixGenerator(posixGenerator);
				if (result == null) result = caseNatureBase(posixGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PosixPackage.UNIX_SOCKET_TUBE: {
				UnixSocketTube unixSocketTube = (UnixSocketTube)theEObject;
				Object result = caseUnixSocketTube(unixSocketTube);
				if (result == null) result = caseSocketTube(unixSocketTube);
				if (result == null) result = caseConstraintBase(unixSocketTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Posix Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Posix Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomPosixTube(CustomPosixTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Posix Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Posix Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIgnorePosixTube(IgnorePosixTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePosixGenerator(PosixGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unix Socket Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unix Socket Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnixSocketTube(UnixSocketTube object) {
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
	public Object caseConstraintBase(ConstraintBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nature Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nature Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNatureBase(NatureBase object) {
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
	public Object caseSocketTube(SocketTube object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //PosixSwitch
