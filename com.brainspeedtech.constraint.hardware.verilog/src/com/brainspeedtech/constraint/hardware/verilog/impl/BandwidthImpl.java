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
package com.brainspeedtech.constraint.hardware.verilog.impl;

import com.brainspeedtech.constraint.hardware.verilog.Bandwidth;
import com.brainspeedtech.constraint.hardware.verilog.VerilogPackage;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import com.brainspeedtech.swarm.master.MasterTube;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bandwidth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.impl.BandwidthImpl#getMasterTube <em>Master Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BandwidthImpl extends ConstraintBaseImpl implements Bandwidth {
	/**
	 * The cached value of the '{@link #getMasterTube() <em>Master Tube</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterTube()
	 * @generated
	 * @ordered
	 */
	protected EList masterTube;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BandwidthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VerilogPackage.Literals.BANDWIDTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMasterTube() {
		if (masterTube == null) {
			masterTube = new EObjectResolvingEList(MasterTube.class, this, VerilogPackage.BANDWIDTH__MASTER_TUBE);
		}
		return masterTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerilogPackage.BANDWIDTH__MASTER_TUBE:
				return getMasterTube();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VerilogPackage.BANDWIDTH__MASTER_TUBE:
				getMasterTube().clear();
				getMasterTube().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case VerilogPackage.BANDWIDTH__MASTER_TUBE:
				getMasterTube().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VerilogPackage.BANDWIDTH__MASTER_TUBE:
				return masterTube != null && !masterTube.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BandwidthImpl
