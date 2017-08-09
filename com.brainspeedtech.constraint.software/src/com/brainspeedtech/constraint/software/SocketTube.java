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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Socket Tube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.SocketTube#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.SocketTube#isClientReceiver <em>Client Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSocketTube()
 * @model abstract="true"
 *        extendedMetaData="name='SocketTube' kind='elementOnly'"
 * @generated
 */
public interface SocketTube extends ConstraintBase {
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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSocketTube_Tube()
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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSocketTube_ClientReceiver()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='clientReceiver'"
	 * @generated
	 */
	boolean isClientReceiver();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.SocketTube#isClientReceiver <em>Client Receiver</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.software.SocketTube#isClientReceiver <em>Client Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientReceiver()
	 * @see #isClientReceiver()
	 * @see #setClientReceiver(boolean)
	 * @generated
	 */
	void unsetClientReceiver();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.software.SocketTube#isClientReceiver <em>Client Receiver</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Receiver</em>' attribute is set.
	 * @see #unsetClientReceiver()
	 * @see #isClientReceiver()
	 * @see #setClientReceiver(boolean)
	 * @generated
	 */
	boolean isSetClientReceiver();

} // SocketTube
