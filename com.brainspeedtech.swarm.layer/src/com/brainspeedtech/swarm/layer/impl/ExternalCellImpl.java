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

import com.brainspeedtech.swarm.inst.CellInstance;

import com.brainspeedtech.swarm.layer.ExternalCell;
import com.brainspeedtech.swarm.layer.LayerPackage;

import com.brainspeedtech.swarm.master.MasterCell;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ExternalCellImpl#getMasterCell <em>Master Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ExternalCellImpl#getInstanceCell <em>Instance Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalCellImpl extends ConstraintBaseImpl implements ExternalCell {
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
	 * The cached value of the '{@link #getInstanceCell() <em>Instance Cell</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceCell()
	 * @generated
	 * @ordered
	 */
	protected EList<CellInstance> instanceCell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayerPackage.Literals.EXTERNAL_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterCell> getMasterCell() {
		if (masterCell == null) {
			masterCell = new EObjectResolvingEList<MasterCell>(MasterCell.class, this, LayerPackage.EXTERNAL_CELL__MASTER_CELL);
		}
		return masterCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CellInstance> getInstanceCell() {
		if (instanceCell == null) {
			instanceCell = new EObjectResolvingEList<CellInstance>(CellInstance.class, this, LayerPackage.EXTERNAL_CELL__INSTANCE_CELL);
		}
		return instanceCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayerPackage.EXTERNAL_CELL__MASTER_CELL:
				return getMasterCell();
			case LayerPackage.EXTERNAL_CELL__INSTANCE_CELL:
				return getInstanceCell();
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
			case LayerPackage.EXTERNAL_CELL__MASTER_CELL:
				getMasterCell().clear();
				getMasterCell().addAll((Collection<? extends MasterCell>)newValue);
				return;
			case LayerPackage.EXTERNAL_CELL__INSTANCE_CELL:
				getInstanceCell().clear();
				getInstanceCell().addAll((Collection<? extends CellInstance>)newValue);
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
			case LayerPackage.EXTERNAL_CELL__MASTER_CELL:
				getMasterCell().clear();
				return;
			case LayerPackage.EXTERNAL_CELL__INSTANCE_CELL:
				getInstanceCell().clear();
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
			case LayerPackage.EXTERNAL_CELL__MASTER_CELL:
				return masterCell != null && !masterCell.isEmpty();
			case LayerPackage.EXTERNAL_CELL__INSTANCE_CELL:
				return instanceCell != null && !instanceCell.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalCellImpl
