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
package com.brainspeedtech.swarm.inst.impl;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.TubeInstance;

import com.brainspeedtech.swarm.master.MasterTube;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tube Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl#getTube <em>Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TubeInstanceImpl extends EObjectImpl implements TubeInstance {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected CellInstance from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected CellInstance to;

	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected int instance = INSTANCE_EDEFAULT;

	/**
	 * This is true if the Instance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instanceESet;

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
	 * The cached value of the '{@link #getTube() <em>Tube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTube()
	 * @generated
	 * @ordered
	 */
	protected MasterTube tube;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TubeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstPackage.Literals.TUBE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstance getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (CellInstance)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstPackage.TUBE_INSTANCE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstance basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(CellInstance newFrom, NotificationChain msgs) {
		CellInstance oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstPackage.TUBE_INSTANCE__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(CellInstance newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, InstPackage.CELL_INSTANCE__OUTPUT, CellInstance.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, InstPackage.CELL_INSTANCE__OUTPUT, CellInstance.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.TUBE_INSTANCE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstance getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (CellInstance)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstPackage.TUBE_INSTANCE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstance basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(CellInstance newTo, NotificationChain msgs) {
		CellInstance oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstPackage.TUBE_INSTANCE__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(CellInstance newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, InstPackage.CELL_INSTANCE__INPUT, CellInstance.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, InstPackage.CELL_INSTANCE__INPUT, CellInstance.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.TUBE_INSTANCE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(int newInstance) {
		int oldInstance = instance;
		instance = newInstance;
		boolean oldInstanceESet = instanceESet;
		instanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.TUBE_INSTANCE__INSTANCE, oldInstance, instance, !oldInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstance() {
		int oldInstance = instance;
		boolean oldInstanceESet = instanceESet;
		instance = INSTANCE_EDEFAULT;
		instanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, InstPackage.TUBE_INSTANCE__INSTANCE, oldInstance, INSTANCE_EDEFAULT, oldInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstance() {
		return instanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalName() {
		return "tube_instance_" + getName();
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.TUBE_INSTANCE__INTERNAL_NAME, oldInternalName, internalName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.TUBE_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterTube getTube() {
		if (tube != null && tube.eIsProxy()) {
			InternalEObject oldTube = (InternalEObject)tube;
			tube = (MasterTube)eResolveProxy(oldTube);
			if (tube != oldTube) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstPackage.TUBE_INSTANCE__TUBE, oldTube, tube));
			}
		}
		return tube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterTube basicGetTube() {
		return tube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTube(MasterTube newTube) {
		MasterTube oldTube = tube;
		tube = newTube;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.TUBE_INSTANCE__TUBE, oldTube, tube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstPackage.TUBE_INSTANCE__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, InstPackage.CELL_INSTANCE__OUTPUT, CellInstance.class, msgs);
				return basicSetFrom((CellInstance)otherEnd, msgs);
			case InstPackage.TUBE_INSTANCE__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, InstPackage.CELL_INSTANCE__INPUT, CellInstance.class, msgs);
				return basicSetTo((CellInstance)otherEnd, msgs);
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
			case InstPackage.TUBE_INSTANCE__FROM:
				return basicSetFrom(null, msgs);
			case InstPackage.TUBE_INSTANCE__TO:
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
			case InstPackage.TUBE_INSTANCE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case InstPackage.TUBE_INSTANCE__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case InstPackage.TUBE_INSTANCE__INSTANCE:
				return getInstance();
			case InstPackage.TUBE_INSTANCE__INTERNAL_NAME:
				return getInternalName();
			case InstPackage.TUBE_INSTANCE__NAME:
				return getName();
			case InstPackage.TUBE_INSTANCE__TUBE:
				if (resolve) return getTube();
				return basicGetTube();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstPackage.TUBE_INSTANCE__FROM:
				setFrom((CellInstance)newValue);
				return;
			case InstPackage.TUBE_INSTANCE__TO:
				setTo((CellInstance)newValue);
				return;
			case InstPackage.TUBE_INSTANCE__INSTANCE:
				setInstance((Integer)newValue);
				return;
			case InstPackage.TUBE_INSTANCE__INTERNAL_NAME:
				setInternalName((String)newValue);
				return;
			case InstPackage.TUBE_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case InstPackage.TUBE_INSTANCE__TUBE:
				setTube((MasterTube)newValue);
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
			case InstPackage.TUBE_INSTANCE__FROM:
				setFrom((CellInstance)null);
				return;
			case InstPackage.TUBE_INSTANCE__TO:
				setTo((CellInstance)null);
				return;
			case InstPackage.TUBE_INSTANCE__INSTANCE:
				unsetInstance();
				return;
			case InstPackage.TUBE_INSTANCE__INTERNAL_NAME:
				setInternalName(INTERNAL_NAME_EDEFAULT);
				return;
			case InstPackage.TUBE_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InstPackage.TUBE_INSTANCE__TUBE:
				setTube((MasterTube)null);
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
			case InstPackage.TUBE_INSTANCE__FROM:
				return from != null;
			case InstPackage.TUBE_INSTANCE__TO:
				return to != null;
			case InstPackage.TUBE_INSTANCE__INSTANCE:
				return isSetInstance();
			case InstPackage.TUBE_INSTANCE__INTERNAL_NAME:
				return eIsSet(InstPackage.TUBE_INSTANCE__NAME);
			case InstPackage.TUBE_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InstPackage.TUBE_INSTANCE__TUBE:
				return tube != null;
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
		result.append(" (instance: ");
		if (instanceESet) result.append(instance); else result.append("<unset>");
		result.append(", internalName: ");
		result.append(internalName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TubeInstanceImpl
