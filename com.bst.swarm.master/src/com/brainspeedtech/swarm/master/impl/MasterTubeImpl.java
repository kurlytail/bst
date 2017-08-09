/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.brainspeedtech.swarm.flow.Tube;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterTubeImpl#getDesignTubes <em>Design Tubes</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterTubeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterTubeImpl#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterTubeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterTubeImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterTubeImpl extends EObjectImpl implements MasterTube {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * The cached value of the '{@link #getDesignTubes() <em>Design Tubes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignTubes()
	 * @generated
	 * @ordered
	 */
	protected EList<Tube> designTubes;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected MasterCell from;

	/**
	 * The default value of the '{@link #getInternalName() <em>Internal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalName() <em>Internal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalName()
	 * @generated
	 * @ordered
	 */
	protected String internalName = INTERNAL_NAME_EDEFAULT;

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
	protected MasterCell to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterTubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MasterPackage.Literals.MASTER_TUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tube> getDesignTubes() {
		if (designTubes == null) {
			designTubes = new EObjectResolvingEList<Tube>(Tube.class, this, MasterPackage.MASTER_TUBE__DESIGN_TUBES);
		}
		return designTubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterCell getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (MasterCell)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MasterPackage.MASTER_TUBE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterCell basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(MasterCell newFrom, NotificationChain msgs) {
		MasterCell oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_TUBE__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(MasterCell newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, MasterPackage.MASTER_CELL__OUTPUT, MasterCell.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, MasterPackage.MASTER_CELL__OUTPUT, MasterCell.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_TUBE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getInternalName() {
		return "master_tube_" + getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalName(String newInternalName) {
		String oldInternalName = internalName;
		internalName = newInternalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_TUBE__INTERNAL_NAME, oldInternalName, internalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_TUBE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterCell getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (MasterCell)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MasterPackage.MASTER_TUBE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterCell basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(MasterCell newTo, NotificationChain msgs) {
		MasterCell oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_TUBE__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(MasterCell newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, MasterPackage.MASTER_CELL__INPUT, MasterCell.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, MasterPackage.MASTER_CELL__INPUT, MasterCell.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_TUBE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MasterPackage.MASTER_TUBE__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, MasterPackage.MASTER_CELL__OUTPUT, MasterCell.class, msgs);
				return basicSetFrom((MasterCell)otherEnd, msgs);
			case MasterPackage.MASTER_TUBE__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, MasterPackage.MASTER_CELL__INPUT, MasterCell.class, msgs);
				return basicSetTo((MasterCell)otherEnd, msgs);
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
			case MasterPackage.MASTER_TUBE__FROM:
				return basicSetFrom(null, msgs);
			case MasterPackage.MASTER_TUBE__TO:
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
			case MasterPackage.MASTER_TUBE__DESIGN_TUBES:
				return getDesignTubes();
			case MasterPackage.MASTER_TUBE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case MasterPackage.MASTER_TUBE__INTERNAL_NAME:
				return getInternalName();
			case MasterPackage.MASTER_TUBE__NAME:
				return getName();
			case MasterPackage.MASTER_TUBE__TO:
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
			case MasterPackage.MASTER_TUBE__DESIGN_TUBES:
				getDesignTubes().clear();
				getDesignTubes().addAll((Collection<? extends Tube>)newValue);
				return;
			case MasterPackage.MASTER_TUBE__FROM:
				setFrom((MasterCell)newValue);
				return;
			case MasterPackage.MASTER_TUBE__INTERNAL_NAME:
				setInternalName((String)newValue);
				return;
			case MasterPackage.MASTER_TUBE__NAME:
				setName((String)newValue);
				return;
			case MasterPackage.MASTER_TUBE__TO:
				setTo((MasterCell)newValue);
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
			case MasterPackage.MASTER_TUBE__DESIGN_TUBES:
				getDesignTubes().clear();
				return;
			case MasterPackage.MASTER_TUBE__FROM:
				setFrom((MasterCell)null);
				return;
			case MasterPackage.MASTER_TUBE__INTERNAL_NAME:
				setInternalName(INTERNAL_NAME_EDEFAULT);
				return;
			case MasterPackage.MASTER_TUBE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MasterPackage.MASTER_TUBE__TO:
				setTo((MasterCell)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MasterPackage.MASTER_TUBE__DESIGN_TUBES:
				return designTubes != null && !designTubes.isEmpty();
			case MasterPackage.MASTER_TUBE__FROM:
				return from != null;
			case MasterPackage.MASTER_TUBE__INTERNAL_NAME:
				return eIsSet(MasterPackage.MASTER_TUBE__NAME);
			case MasterPackage.MASTER_TUBE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MasterPackage.MASTER_TUBE__TO:
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
		result.append(" (internalName: ");
		result.append(internalName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MasterTubeImpl
