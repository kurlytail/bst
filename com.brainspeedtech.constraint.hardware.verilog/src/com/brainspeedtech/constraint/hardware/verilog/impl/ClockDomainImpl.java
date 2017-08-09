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

import com.brainspeedtech.constraint.hardware.verilog.ClockDomain;
import com.brainspeedtech.constraint.hardware.verilog.VerilogPackage;

import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterTube;
import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.impl.ClockDomainImpl#getMasterTube <em>Master Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.impl.ClockDomainImpl#getMasterCell <em>Master Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.impl.ClockDomainImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.impl.ClockDomainImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClockDomainImpl extends ConstraintBaseImpl implements ClockDomain {
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
	 * The cached value of the '{@link #getMasterCell() <em>Master Cell</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterCell()
	 * @generated
	 * @ordered
	 */
	protected EList masterCell;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FREQUENCY_EDEFAULT = new BigInteger("125000000");

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger frequency = FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frequencyESet;

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
	protected ClockDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VerilogPackage.Literals.CLOCK_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMasterTube() {
		if (masterTube == null) {
			masterTube = new EObjectResolvingEList(MasterTube.class, this, VerilogPackage.CLOCK_DOMAIN__MASTER_TUBE);
		}
		return masterTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMasterCell() {
		if (masterCell == null) {
			masterCell = new EObjectResolvingEList(MasterCell.class, this, VerilogPackage.CLOCK_DOMAIN__MASTER_CELL);
		}
		return masterCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(BigInteger newFrequency) {
		BigInteger oldFrequency = frequency;
		frequency = newFrequency;
		boolean oldFrequencyESet = frequencyESet;
		frequencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerilogPackage.CLOCK_DOMAIN__FREQUENCY, oldFrequency, frequency, !oldFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrequency() {
		BigInteger oldFrequency = frequency;
		boolean oldFrequencyESet = frequencyESet;
		frequency = FREQUENCY_EDEFAULT;
		frequencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VerilogPackage.CLOCK_DOMAIN__FREQUENCY, oldFrequency, FREQUENCY_EDEFAULT, oldFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrequency() {
		return frequencyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VerilogPackage.CLOCK_DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerilogPackage.CLOCK_DOMAIN__MASTER_TUBE:
				return getMasterTube();
			case VerilogPackage.CLOCK_DOMAIN__MASTER_CELL:
				return getMasterCell();
			case VerilogPackage.CLOCK_DOMAIN__FREQUENCY:
				return getFrequency();
			case VerilogPackage.CLOCK_DOMAIN__NAME:
				return getName();
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
			case VerilogPackage.CLOCK_DOMAIN__MASTER_TUBE:
				getMasterTube().clear();
				getMasterTube().addAll((Collection)newValue);
				return;
			case VerilogPackage.CLOCK_DOMAIN__MASTER_CELL:
				getMasterCell().clear();
				getMasterCell().addAll((Collection)newValue);
				return;
			case VerilogPackage.CLOCK_DOMAIN__FREQUENCY:
				setFrequency((BigInteger)newValue);
				return;
			case VerilogPackage.CLOCK_DOMAIN__NAME:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case VerilogPackage.CLOCK_DOMAIN__MASTER_TUBE:
				getMasterTube().clear();
				return;
			case VerilogPackage.CLOCK_DOMAIN__MASTER_CELL:
				getMasterCell().clear();
				return;
			case VerilogPackage.CLOCK_DOMAIN__FREQUENCY:
				unsetFrequency();
				return;
			case VerilogPackage.CLOCK_DOMAIN__NAME:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VerilogPackage.CLOCK_DOMAIN__MASTER_TUBE:
				return masterTube != null && !masterTube.isEmpty();
			case VerilogPackage.CLOCK_DOMAIN__MASTER_CELL:
				return masterCell != null && !masterCell.isEmpty();
			case VerilogPackage.CLOCK_DOMAIN__FREQUENCY:
				return isSetFrequency();
			case VerilogPackage.CLOCK_DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (frequency: ");
		if (frequencyESet) result.append(frequency); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClockDomainImpl
