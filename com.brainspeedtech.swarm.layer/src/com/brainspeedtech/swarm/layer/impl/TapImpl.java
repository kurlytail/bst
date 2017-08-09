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
package com.brainspeedtech.swarm.layer.impl;

import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.layer.Tap;

import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterTube;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.TapImpl#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.TapImpl#getCell <em>Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TapImpl extends ConstraintBaseImpl implements Tap {
	/**
	 * The cached value of the '{@link #getTube() <em>Tube</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTube()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterTube> tube;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayerPackage.Literals.TAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterTube> getTube() {
		if (tube == null) {
			tube = new EObjectResolvingEList<MasterTube>(MasterTube.class, this, LayerPackage.TAP__TUBE);
		}
		return tube;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayerPackage.TAP__CELL, oldCell, cell));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LayerPackage.TAP__CELL, oldCell, cell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayerPackage.TAP__TUBE:
				return getTube();
			case LayerPackage.TAP__CELL:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LayerPackage.TAP__TUBE:
				getTube().clear();
				getTube().addAll((Collection<? extends MasterTube>)newValue);
				return;
			case LayerPackage.TAP__CELL:
				setCell((MasterCell)newValue);
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
			case LayerPackage.TAP__TUBE:
				getTube().clear();
				return;
			case LayerPackage.TAP__CELL:
				setCell((MasterCell)null);
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
			case LayerPackage.TAP__TUBE:
				return tube != null && !tube.isEmpty();
			case LayerPackage.TAP__CELL:
				return cell != null;
		}
		return super.eIsSet(featureID);
	}

} //TapImpl
