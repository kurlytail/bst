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
package com.brainspeedtech.swarm.sm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.sm.State#getSource <em>Source</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.sm.State#getDest <em>Dest</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.sm.State#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.sm.SmPackage#getState()
 * @model extendedMetaData="name='State' kind='elementOnly'"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.sm.Transition}.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.sm.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getState_Source()
	 * @see com.brainspeedtech.swarm.sm.Transition#getTo
	 * @model opposite="to"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Transition> getSource();

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.sm.Transition}.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.sm.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference list.
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getState_Dest()
	 * @see com.brainspeedtech.swarm.sm.Transition#getFrom
	 * @model opposite="from"
	 *        extendedMetaData="kind='element' name='dest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Transition> getDest();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getState_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.sm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // State
