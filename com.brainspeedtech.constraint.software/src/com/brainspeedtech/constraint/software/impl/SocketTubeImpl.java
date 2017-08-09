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

import com.brainspeedtech.constraint.software.SocketTube;
import com.brainspeedtech.constraint.software.SoftwarePackage;

import com.brainspeedtech.swarm.inst.TubeInstance;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Socket Tube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SocketTubeImpl#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SocketTubeImpl#isClientReceiver <em>Client Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SocketTubeImpl extends ConstraintBaseImpl implements SocketTube {
	/**
	 * The cached value of the '{@link #getTube() <em>Tube</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTube()
	 * @generated
	 * @ordered
	 */
	protected EList<TubeInstance> tube;

	/**
	 * The default value of the '{@link #isClientReceiver() <em>Client Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClientReceiver()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLIENT_RECEIVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClientReceiver() <em>Client Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClientReceiver()
	 * @generated
	 * @ordered
	 */
	protected boolean clientReceiver = CLIENT_RECEIVER_EDEFAULT;

	/**
	 * This is true if the Client Receiver attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientReceiverESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocketTubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.SOCKET_TUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TubeInstance> getTube() {
		if (tube == null) {
			tube = new EObjectResolvingEList<TubeInstance>(TubeInstance.class, this, SoftwarePackage.SOCKET_TUBE__TUBE);
		}
		return tube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClientReceiver() {
		return clientReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientReceiver(boolean newClientReceiver) {
		boolean oldClientReceiver = clientReceiver;
		clientReceiver = newClientReceiver;
		boolean oldClientReceiverESet = clientReceiverESet;
		clientReceiverESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SOCKET_TUBE__CLIENT_RECEIVER, oldClientReceiver, clientReceiver, !oldClientReceiverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientReceiver() {
		boolean oldClientReceiver = clientReceiver;
		boolean oldClientReceiverESet = clientReceiverESet;
		clientReceiver = CLIENT_RECEIVER_EDEFAULT;
		clientReceiverESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwarePackage.SOCKET_TUBE__CLIENT_RECEIVER, oldClientReceiver, CLIENT_RECEIVER_EDEFAULT, oldClientReceiverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientReceiver() {
		return clientReceiverESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.SOCKET_TUBE__TUBE:
				return getTube();
			case SoftwarePackage.SOCKET_TUBE__CLIENT_RECEIVER:
				return isClientReceiver();
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
			case SoftwarePackage.SOCKET_TUBE__TUBE:
				getTube().clear();
				getTube().addAll((Collection<? extends TubeInstance>)newValue);
				return;
			case SoftwarePackage.SOCKET_TUBE__CLIENT_RECEIVER:
				setClientReceiver((Boolean)newValue);
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
			case SoftwarePackage.SOCKET_TUBE__TUBE:
				getTube().clear();
				return;
			case SoftwarePackage.SOCKET_TUBE__CLIENT_RECEIVER:
				unsetClientReceiver();
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
			case SoftwarePackage.SOCKET_TUBE__TUBE:
				return tube != null && !tube.isEmpty();
			case SoftwarePackage.SOCKET_TUBE__CLIENT_RECEIVER:
				return isSetClientReceiver();
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
		result.append(" (clientReceiver: ");
		if (clientReceiverESet) result.append(clientReceiver); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SocketTubeImpl
