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

import com.brainspeedtech.constraint.software.CustomInstanceCell;
import com.brainspeedtech.constraint.software.SoftwarePackage;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Instance Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.CustomInstanceCellImpl#getCell <em>Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomInstanceCellImpl extends ConstraintBaseImpl implements CustomInstanceCell {
	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected CellInstance cell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomInstanceCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.CUSTOM_INSTANCE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstance getCell() {
		if (cell != null && cell.eIsProxy()) {
			InternalEObject oldCell = (InternalEObject)cell;
			cell = (CellInstance)eResolveProxy(oldCell);
			if (cell != oldCell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.CUSTOM_INSTANCE_CELL__CELL, oldCell, cell));
			}
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstance basicGetCell() {
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCell(CellInstance newCell) {
		CellInstance oldCell = cell;
		cell = newCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.CUSTOM_INSTANCE_CELL__CELL, oldCell, cell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.CUSTOM_INSTANCE_CELL__CELL:
				if (resolve) return getCell();
				return basicGetCell();
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
			case SoftwarePackage.CUSTOM_INSTANCE_CELL__CELL:
				setCell((CellInstance)newValue);
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
			case SoftwarePackage.CUSTOM_INSTANCE_CELL__CELL:
				setCell((CellInstance)null);
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
			case SoftwarePackage.CUSTOM_INSTANCE_CELL__CELL:
				return cell != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomInstanceCellImpl
