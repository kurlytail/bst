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
package com.brainspeedtech.swarm.flow.impl;

import com.brainspeedtech.struct.Struct;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.Tube;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.TubeImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.TubeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.TubeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.TubeImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TubeImpl extends EObjectImpl implements Tube {
	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected EList<Struct> descriptor;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Cell from;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Cell to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.TUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Struct> getDescriptor() {
		if (descriptor == null) {
			descriptor = new EObjectResolvingEList<Struct>(Struct.class, this, FlowPackage.TUBE__DESCRIPTOR);
		}
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Cell)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.TUBE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Cell newFrom, NotificationChain msgs) {
		Cell oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.TUBE__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Cell newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, FlowPackage.CELL__OUTPUT, Cell.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, FlowPackage.CELL__OUTPUT, Cell.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TUBE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		String localname = "";
		if (name == NAME_EDEFAULT || name == null || name.length() == 0) {
			if (getFrom() != null && getFrom().getName() != null) {
				localname = localname + getFrom().getName() + "_";
			}
			if (getTo() != null && getTo().getName() != null) {
				localname = localname + getTo().getName();
			}
		} else {
			localname = name;
		}
		return localname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TUBE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Cell)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.TUBE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Cell newTo, NotificationChain msgs) {
		Cell oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.TUBE__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Cell newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, FlowPackage.CELL__INPUT, Cell.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, FlowPackage.CELL__INPUT, Cell.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TUBE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.TUBE__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, FlowPackage.CELL__OUTPUT, Cell.class, msgs);
				return basicSetFrom((Cell)otherEnd, msgs);
			case FlowPackage.TUBE__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, FlowPackage.CELL__INPUT, Cell.class, msgs);
				return basicSetTo((Cell)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.TUBE__FROM:
				return basicSetFrom(null, msgs);
			case FlowPackage.TUBE__TO:
				return basicSetTo(null, msgs);
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
			case FlowPackage.TUBE__DESCRIPTOR:
				return getDescriptor();
			case FlowPackage.TUBE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case FlowPackage.TUBE__NAME:
				return getName();
			case FlowPackage.TUBE__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case FlowPackage.TUBE__DESCRIPTOR:
				getDescriptor().clear();
				getDescriptor().addAll((Collection<? extends Struct>)newValue);
				return;
			case FlowPackage.TUBE__FROM:
				setFrom((Cell)newValue);
				return;
			case FlowPackage.TUBE__NAME:
				setName((String)newValue);
				return;
			case FlowPackage.TUBE__TO:
				setTo((Cell)newValue);
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
			case FlowPackage.TUBE__DESCRIPTOR:
				getDescriptor().clear();
				return;
			case FlowPackage.TUBE__FROM:
				setFrom((Cell)null);
				return;
			case FlowPackage.TUBE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FlowPackage.TUBE__TO:
				setTo((Cell)null);
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
			case FlowPackage.TUBE__DESCRIPTOR:
				return descriptor != null && !descriptor.isEmpty();
			case FlowPackage.TUBE__FROM:
				return from != null;
			case FlowPackage.TUBE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FlowPackage.TUBE__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TubeImpl
