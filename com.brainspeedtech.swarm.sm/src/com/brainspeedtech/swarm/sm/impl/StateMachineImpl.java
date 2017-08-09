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
package com.brainspeedtech.swarm.sm.impl;

import com.brainspeedtech.struct.Path;

import com.brainspeedtech.struct.impl.StructImpl;

import com.brainspeedtech.swarm.sm.SmPackage;
import com.brainspeedtech.swarm.sm.State;
import com.brainspeedtech.swarm.sm.StateMachine;
import com.brainspeedtech.swarm.sm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.sm.impl.StateMachineImpl#getState <em>State</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.sm.impl.StateMachineImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.sm.impl.StateMachineImpl#getStatePath <em>State Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends StructImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getStatePath() <em>State Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatePath()
	 * @generated
	 * @ordered
	 */
	protected Path statePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, SmPackage.STATE_MACHINE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, SmPackage.STATE_MACHINE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path getStatePath() {
		return statePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatePath(Path newStatePath, NotificationChain msgs) {
		Path oldStatePath = statePath;
		statePath = newStatePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmPackage.STATE_MACHINE__STATE_PATH, oldStatePath, newStatePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatePath(Path newStatePath) {
		if (newStatePath != statePath) {
			NotificationChain msgs = null;
			if (statePath != null)
				msgs = ((InternalEObject)statePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmPackage.STATE_MACHINE__STATE_PATH, null, msgs);
			if (newStatePath != null)
				msgs = ((InternalEObject)newStatePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmPackage.STATE_MACHINE__STATE_PATH, null, msgs);
			msgs = basicSetStatePath(newStatePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmPackage.STATE_MACHINE__STATE_PATH, newStatePath, newStatePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmPackage.STATE_MACHINE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case SmPackage.STATE_MACHINE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case SmPackage.STATE_MACHINE__STATE_PATH:
				return basicSetStatePath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmPackage.STATE_MACHINE__STATE:
				return getState();
			case SmPackage.STATE_MACHINE__TRANSITION:
				return getTransition();
			case SmPackage.STATE_MACHINE__STATE_PATH:
				return getStatePath();
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
			case SmPackage.STATE_MACHINE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case SmPackage.STATE_MACHINE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case SmPackage.STATE_MACHINE__STATE_PATH:
				setStatePath((Path)newValue);
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
			case SmPackage.STATE_MACHINE__STATE:
				getState().clear();
				return;
			case SmPackage.STATE_MACHINE__TRANSITION:
				getTransition().clear();
				return;
			case SmPackage.STATE_MACHINE__STATE_PATH:
				setStatePath((Path)null);
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
			case SmPackage.STATE_MACHINE__STATE:
				return state != null && !state.isEmpty();
			case SmPackage.STATE_MACHINE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case SmPackage.STATE_MACHINE__STATE_PATH:
				return statePath != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
