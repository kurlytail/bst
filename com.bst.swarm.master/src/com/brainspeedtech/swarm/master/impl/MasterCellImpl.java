/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master.impl;

import com.brainspeedtech.swarm.flow.Cell;

import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl#getDesignCells <em>Design Cells</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl#isExternal <em>External</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl#isPinned <em>Pinned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterCellImpl extends EObjectImpl implements MasterCell {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterTube> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterTube> output;

	/**
	 * The cached value of the '{@link #getDesignCells() <em>Design Cells</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> designCells;

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
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * This is true if the External attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean externalESet;

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
	protected MasterCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MasterPackage.Literals.MASTER_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterTube> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<MasterTube>(MasterTube.class, this, MasterPackage.MASTER_CELL__INPUT, MasterPackage.MASTER_TUBE__TO);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterTube> getOutput() {
		if (output == null) {
			output = new EObjectWithInverseResolvingEList<MasterTube>(MasterTube.class, this, MasterPackage.MASTER_CELL__OUTPUT, MasterPackage.MASTER_TUBE__FROM);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getDesignCells() {
		if (designCells == null) {
			designCells = new EObjectResolvingEList<Cell>(Cell.class, this, MasterPackage.MASTER_CELL__DESIGN_CELLS);
		}
		return designCells;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_CELL__COUNT, oldCount, count, !oldCountESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MasterPackage.MASTER_CELL__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
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
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		boolean oldExternalESet = externalESet;
		externalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_CELL__EXTERNAL, oldExternal, external, !oldExternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExternal() {
		boolean oldExternal = external;
		boolean oldExternalESet = externalESet;
		external = EXTERNAL_EDEFAULT;
		externalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MasterPackage.MASTER_CELL__EXTERNAL, oldExternal, EXTERNAL_EDEFAULT, oldExternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExternal() {
		return externalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getInternalName() {
		return "master_cell_" + getName();
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
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_CELL__INTERNAL_NAME, oldInternalName, internalName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_CELL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_CELL__PINNED, oldPinned, pinned, !oldPinnedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MasterPackage.MASTER_CELL__PINNED, oldPinned, PINNED_EDEFAULT, oldPinnedESet));
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
			case MasterPackage.MASTER_CELL__INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
			case MasterPackage.MASTER_CELL__OUTPUT:
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
			case MasterPackage.MASTER_CELL__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case MasterPackage.MASTER_CELL__OUTPUT:
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
			case MasterPackage.MASTER_CELL__INPUT:
				return getInput();
			case MasterPackage.MASTER_CELL__OUTPUT:
				return getOutput();
			case MasterPackage.MASTER_CELL__DESIGN_CELLS:
				return getDesignCells();
			case MasterPackage.MASTER_CELL__COUNT:
				return getCount();
			case MasterPackage.MASTER_CELL__EXTERNAL:
				return isExternal();
			case MasterPackage.MASTER_CELL__INTERNAL_NAME:
				return getInternalName();
			case MasterPackage.MASTER_CELL__NAME:
				return getName();
			case MasterPackage.MASTER_CELL__PINNED:
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
			case MasterPackage.MASTER_CELL__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends MasterTube>)newValue);
				return;
			case MasterPackage.MASTER_CELL__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends MasterTube>)newValue);
				return;
			case MasterPackage.MASTER_CELL__DESIGN_CELLS:
				getDesignCells().clear();
				getDesignCells().addAll((Collection<? extends Cell>)newValue);
				return;
			case MasterPackage.MASTER_CELL__COUNT:
				setCount((Integer)newValue);
				return;
			case MasterPackage.MASTER_CELL__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case MasterPackage.MASTER_CELL__INTERNAL_NAME:
				setInternalName((String)newValue);
				return;
			case MasterPackage.MASTER_CELL__NAME:
				setName((String)newValue);
				return;
			case MasterPackage.MASTER_CELL__PINNED:
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
			case MasterPackage.MASTER_CELL__INPUT:
				getInput().clear();
				return;
			case MasterPackage.MASTER_CELL__OUTPUT:
				getOutput().clear();
				return;
			case MasterPackage.MASTER_CELL__DESIGN_CELLS:
				getDesignCells().clear();
				return;
			case MasterPackage.MASTER_CELL__COUNT:
				unsetCount();
				return;
			case MasterPackage.MASTER_CELL__EXTERNAL:
				unsetExternal();
				return;
			case MasterPackage.MASTER_CELL__INTERNAL_NAME:
				setInternalName(INTERNAL_NAME_EDEFAULT);
				return;
			case MasterPackage.MASTER_CELL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MasterPackage.MASTER_CELL__PINNED:
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
			case MasterPackage.MASTER_CELL__INPUT:
				return input != null && !input.isEmpty();
			case MasterPackage.MASTER_CELL__OUTPUT:
				return output != null && !output.isEmpty();
			case MasterPackage.MASTER_CELL__DESIGN_CELLS:
				return designCells != null && !designCells.isEmpty();
			case MasterPackage.MASTER_CELL__COUNT:
				return isSetCount();
			case MasterPackage.MASTER_CELL__EXTERNAL:
				return isSetExternal();
			case MasterPackage.MASTER_CELL__INTERNAL_NAME:
				return eIsSet(MasterPackage.MASTER_CELL__NAME);
			case MasterPackage.MASTER_CELL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MasterPackage.MASTER_CELL__PINNED:
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
		result.append(" (count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(", external: ");
		if (externalESet) result.append(external); else result.append("<unset>");
		result.append(", internalName: ");
		result.append(internalName);
		result.append(", name: ");
		result.append(name);
		result.append(", pinned: ");
		if (pinnedESet) result.append(pinned); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MasterCellImpl
