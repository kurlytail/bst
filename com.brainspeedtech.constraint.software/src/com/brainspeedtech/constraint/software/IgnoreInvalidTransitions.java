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

import com.brainspeedtech.swarm.layer.ConstraintBase;

import com.brainspeedtech.swarm.sm.State;
import com.brainspeedtech.swarm.sm.StateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ignore Invalid Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.IgnoreInvalidTransitions#getState <em>State</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.IgnoreInvalidTransitions#getStateMachines <em>State Machines</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getIgnoreInvalidTransitions()
 * @model extendedMetaData="name='IgnoreInvalidTransitions' kind='elementOnly'"
 * @generated
 */
public interface IgnoreInvalidTransitions extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.sm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getIgnoreInvalidTransitions_State()
	 * @model extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>State Machines</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.sm.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machines</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getIgnoreInvalidTransitions_StateMachines()
	 * @model extendedMetaData="kind='element' name='stateMachines' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StateMachine> getStateMachines();

} // IgnoreInvalidTransitions
