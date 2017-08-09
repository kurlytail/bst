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

import com.brainspeedtech.constraint.software.SoftwarePackage;
import com.brainspeedtech.constraint.software.StructSizeLimit;

import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import com.brainspeedtech.swarm.master.MasterDesign;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Size Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.StructSizeLimitImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.StructSizeLimitImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructSizeLimitImpl extends ConstraintBaseImpl implements StructSizeLimit {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<Struct> structure;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final long LIMIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected long limit = LIMIT_EDEFAULT;

	/**
	 * This is true if the Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean limitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructSizeLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.STRUCT_SIZE_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Struct> getStructure() {
		if (structure == null) {
			structure = new EObjectResolvingEList<Struct>(Struct.class, this, SoftwarePackage.STRUCT_SIZE_LIMIT__STRUCTURE);
		}
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(long newLimit) {
		long oldLimit = limit;
		limit = newLimit;
		boolean oldLimitESet = limitESet;
		limitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.STRUCT_SIZE_LIMIT__LIMIT, oldLimit, limit, !oldLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLimit() {
		long oldLimit = limit;
		boolean oldLimitESet = limitESet;
		limit = LIMIT_EDEFAULT;
		limitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwarePackage.STRUCT_SIZE_LIMIT__LIMIT, oldLimit, LIMIT_EDEFAULT, oldLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLimit() {
		return limitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.STRUCT_SIZE_LIMIT__STRUCTURE:
				return getStructure();
			case SoftwarePackage.STRUCT_SIZE_LIMIT__LIMIT:
				return getLimit();
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
			case SoftwarePackage.STRUCT_SIZE_LIMIT__STRUCTURE:
				getStructure().clear();
				getStructure().addAll((Collection<? extends Struct>)newValue);
				return;
			case SoftwarePackage.STRUCT_SIZE_LIMIT__LIMIT:
				setLimit((Long)newValue);
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
			case SoftwarePackage.STRUCT_SIZE_LIMIT__STRUCTURE:
				getStructure().clear();
				return;
			case SoftwarePackage.STRUCT_SIZE_LIMIT__LIMIT:
				unsetLimit();
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
			case SoftwarePackage.STRUCT_SIZE_LIMIT__STRUCTURE:
				return structure != null && !structure.isEmpty();
			case SoftwarePackage.STRUCT_SIZE_LIMIT__LIMIT:
				return isSetLimit();
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
		result.append(" (limit: ");
		if (limitESet) result.append(limit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StructSizeLimitImpl
