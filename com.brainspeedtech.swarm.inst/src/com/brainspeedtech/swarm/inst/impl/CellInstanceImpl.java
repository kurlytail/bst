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

import com.brainspeedtech.swarm.master.MasterCell;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl#getCell <em>Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl#isPinned <em>Pinned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellInstanceImpl extends EObjectImpl implements CellInstance {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<TubeInstance> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TubeInstance> output;

	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected MasterCell cell;

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
	 * The default value of the '{@link #isPinned() <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPinned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PINNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPinned() <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPinned()
	 * @generated
	 * @ordered
	 */
	protected boolean pinned = PINNED_EDEFAULT;

	/**
	 * This is true if the Pinned attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pinnedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstPackage.Literals.CELL_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TubeInstance> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<TubeInstance>(TubeInstance.class, this, InstPackage.CELL_INSTANCE__INPUT, InstPackage.TUBE_INSTANCE__TO);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TubeInstance> getOutput() {
		if (output == null) {
			output = new EObjectWithInverseResolvingEList<TubeInstance>(TubeInstance.class, this, InstPackage.CELL_INSTANCE__OUTPUT, InstPackage.TUBE_INSTANCE__FROM);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterCell getCell() {
		if (cell != null && cell.eIsProxy()) {
			InternalEObject oldCell = (InternalEObject)cell;
			cell = (MasterCell)eResolveProxy(oldCell);
			if (cell != oldCell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstPackage.CELL_INSTANCE__CELL, oldCell, cell));
			}
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterCell basicGetCell() {
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCell(MasterCell newCell) {
		MasterCell oldCell = cell;
		cell = newCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.CELL_INSTANCE__CELL, oldCell, cell));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.CELL_INSTANCE__INSTANCE, oldInstance, instance, !oldInstanceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, InstPackage.CELL_INSTANCE__INSTANCE, oldInstance, INSTANCE_EDEFAULT, oldInstanceESet));
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
	 * @generated NOT
	 */
	public String getInternalName() {
		return "cell_instance_" + getName();
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.CELL_INSTANCE__INTERNAL_NAME, oldInternalName, internalName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.CELL_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPinned() {
		return pinned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinned(boolean newPinned) {
		boolean oldPinned = pinned;
		pinned = newPinned;
		boolean oldPinnedESet = pinnedESet;
		pinnedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstPackage.CELL_INSTANCE__PINNED, oldPinned, pinned, !oldPinnedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPinned() {
		boolean oldPinned = pinned;
		boolean oldPinnedESet = pinnedESet;
		pinned = PINNED_EDEFAULT;
		pinnedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, InstPackage.CELL_INSTANCE__PINNED, oldPinned, PINNED_EDEFAULT, oldPinnedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPinned() {
		return pinnedESet;
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
			case InstPackage.CELL_INSTANCE__INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
			case InstPackage.CELL_INSTANCE__OUTPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutput()).basicAdd(otherEnd, msgs);
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
			case InstPackage.CELL_INSTANCE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case InstPackage.CELL_INSTANCE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case InstPackage.CELL_INSTANCE__INPUT:
				return getInput();
			case InstPackage.CELL_INSTANCE__OUTPUT:
				return getOutput();
			case InstPackage.CELL_INSTANCE__CELL:
				if (resolve) return getCell();
				return basicGetCell();
			case InstPackage.CELL_INSTANCE__INSTANCE:
				return getInstance();
			case InstPackage.CELL_INSTANCE__INTERNAL_NAME:
				return getInternalName();
			case InstPackage.CELL_INSTANCE__NAME:
				return getName();
			case InstPackage.CELL_INSTANCE__PINNED:
				return isPinned();
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
			case InstPackage.CELL_INSTANCE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends TubeInstance>)newValue);
				return;
			case InstPackage.CELL_INSTANCE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends TubeInstance>)newValue);
				return;
			case InstPackage.CELL_INSTANCE__CELL:
				setCell((MasterCell)newValue);
				return;
			case InstPackage.CELL_INSTANCE__INSTANCE:
				setInstance((Integer)newValue);
				return;
			case InstPackage.CELL_INSTANCE__INTERNAL_NAME:
				setInternalName((String)newValue);
				return;
			case InstPackage.CELL_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case InstPackage.CELL_INSTANCE__PINNED:
				setPinned((Boolean)newValue);
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
			case InstPackage.CELL_INSTANCE__INPUT:
				getInput().clear();
				return;
			case InstPackage.CELL_INSTANCE__OUTPUT:
				getOutput().clear();
				return;
			case InstPackage.CELL_INSTANCE__CELL:
				setCell((MasterCell)null);
				return;
			case InstPackage.CELL_INSTANCE__INSTANCE:
				unsetInstance();
				return;
			case InstPackage.CELL_INSTANCE__INTERNAL_NAME:
				setInternalName(INTERNAL_NAME_EDEFAULT);
				return;
			case InstPackage.CELL_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InstPackage.CELL_INSTANCE__PINNED:
				unsetPinned();
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
			case InstPackage.CELL_INSTANCE__INPUT:
				return input != null && !input.isEmpty();
			case InstPackage.CELL_INSTANCE__OUTPUT:
				return output != null && !output.isEmpty();
			case InstPackage.CELL_INSTANCE__CELL:
				return cell != null;
			case InstPackage.CELL_INSTANCE__INSTANCE:
				return isSetInstance();
			case InstPackage.CELL_INSTANCE__INTERNAL_NAME:
				return eIsSet(InstPackage.CELL_INSTANCE__NAME);
			case InstPackage.CELL_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InstPackage.CELL_INSTANCE__PINNED:
				return isSetPinned();
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
		result.append(", pinned: ");
		if (pinnedESet) result.append(pinned); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CellInstanceImpl
