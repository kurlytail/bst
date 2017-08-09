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
import com.brainspeedtech.swarm.layer.QueueDepth;

import com.brainspeedtech.swarm.master.MasterTube;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Depth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.QueueDepthImpl#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.QueueDepthImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueueDepthImpl extends ConstraintBaseImpl implements QueueDepth {
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
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final long DEPTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected long depth = DEPTH_EDEFAULT;

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
	protected QueueDepthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayerPackage.Literals.QUEUE_DEPTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterTube> getTube() {
		if (tube == null) {
			tube = new EObjectResolvingEList<MasterTube>(MasterTube.class, this, LayerPackage.QUEUE_DEPTH__TUBE);
		}
		return tube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(long newDepth) {
		long oldDepth = depth;
		depth = newDepth;
		boolean oldDepthESet = depthESet;
		depthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayerPackage.QUEUE_DEPTH__DEPTH, oldDepth, depth, !oldDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDepth() {
		long oldDepth = depth;
		boolean oldDepthESet = depthESet;
		depth = DEPTH_EDEFAULT;
		depthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LayerPackage.QUEUE_DEPTH__DEPTH, oldDepth, DEPTH_EDEFAULT, oldDepthESet));
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
			case LayerPackage.QUEUE_DEPTH__TUBE:
				return getTube();
			case LayerPackage.QUEUE_DEPTH__DEPTH:
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
			case LayerPackage.QUEUE_DEPTH__TUBE:
				getTube().clear();
				getTube().addAll((Collection<? extends MasterTube>)newValue);
				return;
			case LayerPackage.QUEUE_DEPTH__DEPTH:
				setDepth((Long)newValue);
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
			case LayerPackage.QUEUE_DEPTH__TUBE:
				getTube().clear();
				return;
			case LayerPackage.QUEUE_DEPTH__DEPTH:
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
			case LayerPackage.QUEUE_DEPTH__TUBE:
				return tube != null && !tube.isEmpty();
			case LayerPackage.QUEUE_DEPTH__DEPTH:
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

} //QueueDepthImpl
