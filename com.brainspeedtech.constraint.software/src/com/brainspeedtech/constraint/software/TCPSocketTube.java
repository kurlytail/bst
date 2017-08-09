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
package com.brainspeedtech.constraint.software;

import com.brainspeedtech.swarm.inst.TubeInstance;

import com.brainspeedtech.swarm.layer.ConstraintBase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCP Socket Tube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerIP <em>Server IP</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerPort <em>Server Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getTCPSocketTube()
 * @model extendedMetaData="name='TCPSocketTube' kind='elementOnly'"
 * @generated
 */
public interface TCPSocketTube extends SocketTube {
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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getTCPSocketTube_ServerIP()
	 * @model default="localhost" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serverIP'"
	 * @generated
	 */
	String getServerIP();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerIP <em>Server IP</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerIP <em>Server IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerIP()
	 * @see #getServerIP()
	 * @see #setServerIP(String)
	 * @generated
	 */
	void unsetServerIP();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerIP <em>Server IP</em>}' attribute is set.
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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getTCPSocketTube_ServerPort()
	 * @model default="8000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='serverPort'"
	 * @generated
	 */
	int getServerPort();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerPort <em>Server Port</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerPort <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerPort()
	 * @see #getServerPort()
	 * @see #setServerPort(int)
	 * @generated
	 */
	void unsetServerPort();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.software.TCPSocketTube#getServerPort <em>Server Port</em>}' attribute is set.
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
