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

import com.brainspeedtech.constraint.software.BufferDepth;
import com.brainspeedtech.constraint.software.SoftwarePackage;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import com.brainspeedtech.swarm.master.MasterTube;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buffer Depth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.BufferDepthImpl#getMasterTube <em>Master Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.BufferDepthImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BufferDepthImpl extends ConstraintBaseImpl implements BufferDepth {
	/**
	 * The cached value of the '{@link #getMasterTube() <em>Master Tube</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterTube()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterTube> masterTube;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * This is true if the Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean depthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferDepthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.BUFFER_DEPTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterTube> getMasterTube() {
		if (masterTube == null) {
			masterTube = new EObjectResolvingEList<MasterTube>(MasterTube.class, this, SoftwarePackage.BUFFER_DEPTH__MASTER_TUBE);
		}
		return masterTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		boolean oldDepthESet = depthESet;
		depthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.BUFFER_DEPTH__DEPTH, oldDepth, depth, !oldDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDepth() {
		int oldDepth = depth;
		boolean oldDepthESet = depthESet;
		depth = DEPTH_EDEFAULT;
		depthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwarePackage.BUFFER_DEPTH__DEPTH, oldDepth, DEPTH_EDEFAULT, oldDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDepth() {
		return depthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.BUFFER_DEPTH__MASTER_TUBE:
				return getMasterTube();
			case SoftwarePackage.BUFFER_DEPTH__DEPTH:
				return getDepth();
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
			case SoftwarePackage.BUFFER_DEPTH__MASTER_TUBE:
				getMasterTube().clear();
				getMasterTube().addAll((Collection<? extends MasterTube>)newValue);
				return;
			case SoftwarePackage.BUFFER_DEPTH__DEPTH:
				setDepth((Integer)newValue);
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
			case SoftwarePackage.BUFFER_DEPTH__MASTER_TUBE:
				getMasterTube().clear();
				return;
			case SoftwarePackage.BUFFER_DEPTH__DEPTH:
				unsetDepth();
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
			case SoftwarePackage.BUFFER_DEPTH__MASTER_TUBE:
				return masterTube != null && !masterTube.isEmpty();
			case SoftwarePackage.BUFFER_DEPTH__DEPTH:
				return isSetDepth();
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
		result.append(" (depth: ");
		if (depthESet) result.append(depth); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BufferDepthImpl
