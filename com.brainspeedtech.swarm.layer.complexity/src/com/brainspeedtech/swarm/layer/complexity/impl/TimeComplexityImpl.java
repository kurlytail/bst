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
package com.brainspeedtech.swarm.layer.complexity.impl;

import com.brainspeedtech.swarm.layer.complexity.ComplexityPackage;
import com.brainspeedtech.swarm.layer.complexity.TimeComplexity;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Complexity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.complexity.impl.TimeComplexityImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.complexity.impl.TimeComplexityImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeComplexityImpl extends ConstraintBaseImpl implements TimeComplexity {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<String> object;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final float UNITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected float units = UNITS_EDEFAULT;

	/**
	 * This is true if the Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeComplexityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComplexityPackage.Literals.TIME_COMPLEXITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getObject() {
		if (object == null) {
			object = new EDataTypeEList<String>(String.class, this, ComplexityPackage.TIME_COMPLEXITY__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(float newUnits) {
		float oldUnits = units;
		units = newUnits;
		boolean oldUnitsESet = unitsESet;
		unitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComplexityPackage.TIME_COMPLEXITY__UNITS, oldUnits, units, !oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnits() {
		float oldUnits = units;
		boolean oldUnitsESet = unitsESet;
		units = UNITS_EDEFAULT;
		unitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ComplexityPackage.TIME_COMPLEXITY__UNITS, oldUnits, UNITS_EDEFAULT, oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnits() {
		return unitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComplexityPackage.TIME_COMPLEXITY__OBJECT:
				return getObject();
			case ComplexityPackage.TIME_COMPLEXITY__UNITS:
				return getUnits();
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
			case ComplexityPackage.TIME_COMPLEXITY__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends String>)newValue);
				return;
			case ComplexityPackage.TIME_COMPLEXITY__UNITS:
				setUnits((Float)newValue);
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
			case ComplexityPackage.TIME_COMPLEXITY__OBJECT:
				getObject().clear();
				return;
			case ComplexityPackage.TIME_COMPLEXITY__UNITS:
				unsetUnits();
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
			case ComplexityPackage.TIME_COMPLEXITY__OBJECT:
				return object != null && !object.isEmpty();
			case ComplexityPackage.TIME_COMPLEXITY__UNITS:
				return isSetUnits();
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
		result.append(" (object: ");
		result.append(object);
		result.append(", units: ");
		if (unitsESet) result.append(units); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimeComplexityImpl
