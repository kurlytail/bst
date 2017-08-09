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

import com.brainspeedtech.constraint.software.IgnoreInvalidTransitions;
import com.brainspeedtech.constraint.software.SoftwarePackage;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import com.brainspeedtech.swarm.sm.State;
import com.brainspeedtech.swarm.sm.StateMachine;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ignore Invalid Transitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.IgnoreInvalidTransitionsImpl#getState <em>State</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.IgnoreInvalidTransitionsImpl#getStateMachines <em>State Machines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IgnoreInvalidTransitionsImpl extends ConstraintBaseImpl implements IgnoreInvalidTransitions {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getStateMachines() <em>State Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> stateMachines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IgnoreInvalidTransitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.IGNORE_INVALID_TRANSITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectResolvingEList<State>(State.class, this, SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getStateMachines() {
		if (stateMachines == null) {
			stateMachines = new EObjectResolvingEList<StateMachine>(StateMachine.class, this, SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE_MACHINES);
		}
		return stateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE:
				return getState();
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE_MACHINES:
				return getStateMachines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE_MACHINES:
				getStateMachines().clear();
				getStateMachines().addAll((Collection<? extends StateMachine>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE:
				getState().clear();
				return;
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE_MACHINES:
				getStateMachines().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE:
				return state != null && !state.isEmpty();
			case SoftwarePackage.IGNORE_INVALID_TRANSITIONS__STATE_MACHINES:
				return stateMachines != null && !stateMachines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IgnoreInvalidTransitionsImpl
