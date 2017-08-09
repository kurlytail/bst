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
import com.brainspeedtech.constraint.software.TCPSocketTube;

import com.brainspeedtech.swarm.inst.TubeInstance;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCP Socket Tube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.TCPSocketTubeImpl#getServerIP <em>Server IP</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.TCPSocketTubeImpl#getServerPort <em>Server Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCPSocketTubeImpl extends SocketTubeImpl implements TCPSocketTube {
	/**
	 * The default value of the '{@link #getServerIP() <em>Server IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerIP()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_IP_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getServerIP() <em>Server IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerIP()
	 * @generated
	 * @ordered
	 */
	protected String serverIP = SERVER_IP_EDEFAULT;

	/**
	 * This is true if the Server IP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverIPESet;

	/**
	 * The default value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_PORT_EDEFAULT = 8000;

	/**
	 * The cached value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected int serverPort = SERVER_PORT_EDEFAULT;

	/**
	 * This is true if the Server Port attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverPortESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPSocketTubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.TCP_SOCKET_TUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerIP() {
		return serverIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerIP(String newServerIP) {
		String oldServerIP = serverIP;
		serverIP = newServerIP;
		boolean oldServerIPESet = serverIPESet;
		serverIPESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.TCP_SOCKET_TUBE__SERVER_IP, oldServerIP, serverIP, !oldServerIPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerIP() {
		String oldServerIP = serverIP;
		boolean oldServerIPESet = serverIPESet;
		serverIP = SERVER_IP_EDEFAULT;
		serverIPESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwarePackage.TCP_SOCKET_TUBE__SERVER_IP, oldServerIP, SERVER_IP_EDEFAULT, oldServerIPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerIP() {
		return serverIPESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServerPort() {
		return serverPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerPort(int newServerPort) {
		int oldServerPort = serverPort;
		serverPort = newServerPort;
		boolean oldServerPortESet = serverPortESet;
		serverPortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.TCP_SOCKET_TUBE__SERVER_PORT, oldServerPort, serverPort, !oldServerPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerPort() {
		int oldServerPort = serverPort;
		boolean oldServerPortESet = serverPortESet;
		serverPort = SERVER_PORT_EDEFAULT;
		serverPortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwarePackage.TCP_SOCKET_TUBE__SERVER_PORT, oldServerPort, SERVER_PORT_EDEFAULT, oldServerPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerPort() {
		return serverPortESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.TCP_SOCKET_TUBE__SERVER_IP:
				return getServerIP();
			case SoftwarePackage.TCP_SOCKET_TUBE__SERVER_PORT:
				return getServerPort();
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
			case SoftwarePackage.TCP_SOCKET_TUBE__SERVER_IP:
				setServerIP((String)newValue);
				return;
			case SoftwarePackage.TCP_SOCKET_TUBE__SERVER_PORT:
				setServerPort((Integer)newValue);
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
			case SoftwarePackage.TCP_SOCKET_TUBE__SERVER_IP:
				unsetServerIP();
				return;
			case SoftwarePackage.TCP_SOCKET_TUBE__SERVER_PORT:
				unsetServerPort();
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
			case SoftwarePackage.TCP_SOCKET_TUBE__SERVER_IP:
				return isSetServerIP();
			case SoftwarePackage.TCP_SOCKET_TUBE__SERVER_PORT:
				return isSetServerPort();
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
		result.append(" (serverIP: ");
		if (serverIPESet) result.append(serverIP); else result.append("<unset>");
		result.append(", serverPort: ");
		if (serverPortESet) result.append(serverPort); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TCPSocketTubeImpl
