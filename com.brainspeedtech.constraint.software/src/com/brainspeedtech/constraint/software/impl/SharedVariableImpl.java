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

import com.brainspeedtech.constraint.software.SharedVariable;
import com.brainspeedtech.constraint.software.SoftwarePackage;

import com.brainspeedtech.struct.Struct;

import com.brainspeedtech.swarm.inst.CellInstance;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;
import com.brainspeedtech.swarm.master.MasterCell;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SharedVariableImpl#getMasterCell <em>Master Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SharedVariableImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SharedVariableImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SharedVariableImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SharedVariableImpl extends ConstraintBaseImpl implements SharedVariable {
	/**
	 * The cached value of the '{@link #getMasterCell() <em>Master Cell</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterCell()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterCell> masterCell;

	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected Struct struct;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * This is true if the Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.SHARED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterCell> getMasterCell() {
		if (masterCell == null) {
			masterCell = new EObjectResolvingEList<MasterCell>(MasterCell.class, this, SoftwarePackage.SHARED_VARIABLE__MASTER_CELL);
		}
		return masterCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		boolean oldCountESet = countESet;
		countESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SHARED_VARIABLE__COUNT, oldCount, count, !oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCount() {
		int oldCount = count;
		boolean oldCountESet = countESet;
		count = COUNT_EDEFAULT;
		countESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwarePackage.SHARED_VARIABLE__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCount() {
		return countESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SHARED_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getStruct() {
		if (struct != null && struct.eIsProxy()) {
			InternalEObject oldStruct = (InternalEObject)struct;
			struct = (Struct)eResolveProxy(oldStruct);
			if (struct != oldStruct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.SHARED_VARIABLE__STRUCT, oldStruct, struct));
			}
		}
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct basicGetStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Struct newStruct) {
		Struct oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SHARED_VARIABLE__STRUCT, oldStruct, struct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.SHARED_VARIABLE__MASTER_CELL:
				return getMasterCell();
			case SoftwarePackage.SHARED_VARIABLE__STRUCT:
				if (resolve) return getStruct();
				return basicGetStruct();
			case SoftwarePackage.SHARED_VARIABLE__COUNT:
				return getCount();
			case SoftwarePackage.SHARED_VARIABLE__NAME:
				return getName();
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
			case SoftwarePackage.SHARED_VARIABLE__MASTER_CELL:
				getMasterCell().clear();
				getMasterCell().addAll((Collection<? extends MasterCell>)newValue);
				return;
			case SoftwarePackage.SHARED_VARIABLE__STRUCT:
				setStruct((Struct)newValue);
				return;
			case SoftwarePackage.SHARED_VARIABLE__COUNT:
				setCount((Integer)newValue);
				return;
			case SoftwarePackage.SHARED_VARIABLE__NAME:
				setName((String)newValue);
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
			case SoftwarePackage.SHARED_VARIABLE__MASTER_CELL:
				getMasterCell().clear();
				return;
			case SoftwarePackage.SHARED_VARIABLE__STRUCT:
				setStruct((Struct)null);
				return;
			case SoftwarePackage.SHARED_VARIABLE__COUNT:
				unsetCount();
				return;
			case SoftwarePackage.SHARED_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
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
			case SoftwarePackage.SHARED_VARIABLE__MASTER_CELL:
				return masterCell != null && !masterCell.isEmpty();
			case SoftwarePackage.SHARED_VARIABLE__STRUCT:
				return struct != null;
			case SoftwarePackage.SHARED_VARIABLE__COUNT:
				return isSetCount();
			case SoftwarePackage.SHARED_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SharedVariableImpl
