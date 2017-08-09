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
package com.brainspeedtech.swarm.sm;

import com.brainspeedtech.struct.Path;
import com.brainspeedtech.struct.Struct;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.sm.StateMachine#getState <em>State</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.sm.StateMachine#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.sm.StateMachine#getStatePath <em>State Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.sm.SmPackage#getStateMachine()
 * @model extendedMetaData="name='StateMachine' kind='elementOnly'"
 * @generated
 */
public interface StateMachine extends Struct {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.sm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getStateMachine_State()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.sm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getStateMachine_Transition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>State Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Path</em>' containment reference.
	 * @see #setStatePath(Path)
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getStateMachine_StatePath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='state_path' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getStatePath();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.sm.StateMachine#getStatePath <em>State Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Path</em>' containment reference.
	 * @see #getStatePath()
	 * @generated
	 */
	void setStatePath(Path value);

} // StateMachine
