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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.sm.Transition#getTo <em>To</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.sm.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.sm.Transition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.sm.SmPackage#getTransition()
 * @model extendedMetaData="name='Transition' kind='elementOnly'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.sm.State#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getTransition_To()
	 * @see com.brainspeedtech.swarm.sm.State#getSource
	 * @model opposite="source" required="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.sm.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.sm.State#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getTransition_From()
	 * @see com.brainspeedtech.swarm.sm.State#getDest
	 * @model opposite="dest" required="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.sm.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

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
	 * @see com.brainspeedtech.swarm.sm.SmPackage#getTransition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.sm.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
