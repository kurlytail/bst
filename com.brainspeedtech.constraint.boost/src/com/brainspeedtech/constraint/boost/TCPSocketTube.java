/**
 * <copyright>
 * Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.boost;

import com.brainspeedtech.swarm.inst.TubeInstance;

import com.brainspeedtech.swarm.layer.ConstraintBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCP Socket Tube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.boost.TCPSocketTube#isClientReceiver <em>Client Receiver</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerIP <em>Server IP</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerPort <em>Server Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.boost.BoostPackage#getTCPSocketTube()
 * @model extendedMetaData="name='TCPSocketTube' kind='elementOnly'"
 * @generated
 */
public interface TCPSocketTube extends ConstraintBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright @2011-2013 BrainSpeed Technologies - All rights reserved";

	/**
	 * Returns the value of the '<em><b>Tube</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.inst.TubeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tube</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tube</em>' reference list.
	 * @see com.brainspeedtech.constraint.boost.BoostPackage#getTCPSocketTube_Tube()
	 * @model extendedMetaData="kind='element' name='tube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TubeInstance> getTube();

	/**
	 * Returns the value of the '<em><b>Client Receiver</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Receiver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Receiver</em>' attribute.
	 * @see #isSetClientReceiver()
	 * @see #unsetClientReceiver()
	 * @see #setClientReceiver(boolean)
	 * @see com.brainspeedtech.constraint.boost.BoostPackage#getTCPSocketTube_ClientReceiver()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='clientReceiver'"
	 * @generated
	 */
	boolean isClientReceiver();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#isClientReceiver <em>Client Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Receiver</em>' attribute.
	 * @see #isSetClientReceiver()
	 * @see #unsetClientReceiver()
	 * @see #isClientReceiver()
	 * @generated
	 */
	void setClientReceiver(boolean value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#isClientReceiver <em>Client Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientReceiver()
	 * @see #isClientReceiver()
	 * @see #setClientReceiver(boolean)
	 * @generated
	 */
	void unsetClientReceiver();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#isClientReceiver <em>Client Receiver</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Receiver</em>' attribute is set.
	 * @see #unsetClientReceiver()
	 * @see #isClientReceiver()
	 * @see #setClientReceiver(boolean)
	 * @generated
	 */
	boolean isSetClientReceiver();

	/**
	 * Returns the value of the '<em><b>Server IP</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server IP</em>' attribute.
	 * @see #isSetServerIP()
	 * @see #unsetServerIP()
	 * @see #setServerIP(String)
	 * @see com.brainspeedtech.constraint.boost.BoostPackage#getTCPSocketTube_ServerIP()
	 * @model default="localhost" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serverIP'"
	 * @generated
	 */
	String getServerIP();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerIP <em>Server IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server IP</em>' attribute.
	 * @see #isSetServerIP()
	 * @see #unsetServerIP()
	 * @see #getServerIP()
	 * @generated
	 */
	void setServerIP(String value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerIP <em>Server IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerIP()
	 * @see #getServerIP()
	 * @see #setServerIP(String)
	 * @generated
	 */
	void unsetServerIP();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerIP <em>Server IP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server IP</em>' attribute is set.
	 * @see #unsetServerIP()
	 * @see #getServerIP()
	 * @see #setServerIP(String)
	 * @generated
	 */
	boolean isSetServerIP();

	/**
	 * Returns the value of the '<em><b>Server Port</b></em>' attribute.
	 * The default value is <code>"8000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Port</em>' attribute.
	 * @see #isSetServerPort()
	 * @see #unsetServerPort()
	 * @see #setServerPort(int)
	 * @see com.brainspeedtech.constraint.boost.BoostPackage#getTCPSocketTube_ServerPort()
	 * @model default="8000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='serverPort'"
	 * @generated
	 */
	int getServerPort();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerPort <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Port</em>' attribute.
	 * @see #isSetServerPort()
	 * @see #unsetServerPort()
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerPort <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerPort()
	 * @see #getServerPort()
	 * @see #setServerPort(int)
	 * @generated
	 */
	void unsetServerPort();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.boost.TCPSocketTube#getServerPort <em>Server Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Port</em>' attribute is set.
	 * @see #unsetServerPort()
	 * @see #getServerPort()
	 * @see #setServerPort(int)
	 * @generated
	 */
	boolean isSetServerPort();

} // TCPSocketTube
