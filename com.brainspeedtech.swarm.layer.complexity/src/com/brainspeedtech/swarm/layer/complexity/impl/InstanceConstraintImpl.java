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
import com.brainspeedtech.swarm.layer.complexity.InstanceConstraint;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.complexity.impl.InstanceConstraintImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.complexity.impl.InstanceConstraintImpl#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceConstraintImpl extends ConstraintBaseImpl implements InstanceConstraint {
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
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComplexityPackage.Literals.INSTANCE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getObject() {
		if (object == null) {
			object = new EDataTypeEList<String>(String.class, this, ComplexityPackage.INSTANCE_CONSTRAINT__OBJECT);
		}
		return object;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComplexityPackage.INSTANCE_CONSTRAINT__COUNT, oldCount, count, !oldCountESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ComplexityPackage.INSTANCE_CONSTRAINT__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComplexityPackage.INSTANCE_CONSTRAINT__OBJECT:
				return getObject();
			case ComplexityPackage.INSTANCE_CONSTRAINT__COUNT:
				return getCount();
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
			case ComplexityPackage.INSTANCE_CONSTRAINT__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends String>)newValue);
				return;
			case ComplexityPackage.INSTANCE_CONSTRAINT__COUNT:
				setCount((Integer)newValue);
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
			case ComplexityPackage.INSTANCE_CONSTRAINT__OBJECT:
				getObject().clear();
				return;
			case ComplexityPackage.INSTANCE_CONSTRAINT__COUNT:
				unsetCount();
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
			case ComplexityPackage.INSTANCE_CONSTRAINT__OBJECT:
				return object != null && !object.isEmpty();
			case ComplexityPackage.INSTANCE_CONSTRAINT__COUNT:
				return isSetCount();
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
		result.append(", count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InstanceConstraintImpl
