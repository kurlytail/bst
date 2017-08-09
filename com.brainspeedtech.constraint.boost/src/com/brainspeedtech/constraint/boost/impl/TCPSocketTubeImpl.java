/**
 * <copyright>
 * Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.boost.impl;

import com.brainspeedtech.constraint.boost.BoostPackage;
import com.brainspeedtech.constraint.boost.TCPSocketTube;

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
 * An implementation of the model object '<em><b>TCP Socket Tube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.boost.impl.TCPSocketTubeImpl#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.boost.impl.TCPSocketTubeImpl#isClientReceiver <em>Client Receiver</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.boost.impl.TCPSocketTubeImpl#getServerIP <em>Server IP</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.boost.impl.TCPSocketTubeImpl#getServerPort <em>Server Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCPSocketTubeImpl extends ConstraintBaseImpl implements TCPSocketTube {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright @2011-2013 BrainSpeed Technologies - All rights reserved";

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
		return BoostPackage.Literals.TCP_SOCKET_TUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TubeInstance> getTube() {
		if (tube == null) {
			tube = new EObjectResolvingEList<TubeInstance>(TubeInstance.class, this, BoostPackage.TCP_SOCKET_TUBE__TUBE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BoostPackage.TCP_SOCKET_TUBE__CLIENT_RECEIVER, oldClientReceiver, clientReceiver, !oldClientReceiverESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BoostPackage.TCP_SOCKET_TUBE__CLIENT_RECEIVER, oldClientReceiver, CLIENT_RECEIVER_EDEFAULT, oldClientReceiverESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BoostPackage.TCP_SOCKET_TUBE__SERVER_IP, oldServerIP, serverIP, !oldServerIPESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BoostPackage.TCP_SOCKET_TUBE__SERVER_IP, oldServerIP, SERVER_IP_EDEFAULT, oldServerIPESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BoostPackage.TCP_SOCKET_TUBE__SERVER_PORT, oldServerPort, serverPort, !oldServerPortESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BoostPackage.TCP_SOCKET_TUBE__SERVER_PORT, oldServerPort, SERVER_PORT_EDEFAULT, oldServerPortESet));
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
			case BoostPackage.TCP_SOCKET_TUBE__TUBE:
				return getTube();
			case BoostPackage.TCP_SOCKET_TUBE__CLIENT_RECEIVER:
				return isClientReceiver();
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_IP:
				return getServerIP();
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_PORT:
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
			case BoostPackage.TCP_SOCKET_TUBE__TUBE:
				getTube().clear();
				getTube().addAll((Collection<? extends TubeInstance>)newValue);
				return;
			case BoostPackage.TCP_SOCKET_TUBE__CLIENT_RECEIVER:
				setClientReceiver((Boolean)newValue);
				return;
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_IP:
				setServerIP((String)newValue);
				return;
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_PORT:
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
			case BoostPackage.TCP_SOCKET_TUBE__TUBE:
				getTube().clear();
				return;
			case BoostPackage.TCP_SOCKET_TUBE__CLIENT_RECEIVER:
				unsetClientReceiver();
				return;
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_IP:
				unsetServerIP();
				return;
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_PORT:
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
			case BoostPackage.TCP_SOCKET_TUBE__TUBE:
				return tube != null && !tube.isEmpty();
			case BoostPackage.TCP_SOCKET_TUBE__CLIENT_RECEIVER:
				return isSetClientReceiver();
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_IP:
				return isSetServerIP();
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_PORT:
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
		result.append(" (clientReceiver: ");
		if (clientReceiverESet) result.append(clientReceiver); else result.append("<unset>");
		result.append(", serverIP: ");
		if (serverIPESet) result.append(serverIP); else result.append("<unset>");
		result.append(", serverPort: ");
		if (serverPortESet) result.append(serverPort); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TCPSocketTubeImpl
