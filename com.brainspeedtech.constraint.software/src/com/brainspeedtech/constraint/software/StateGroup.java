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

import com.brainspeedtech.swarm.layer.ConstraintBase;

import com.brainspeedtech.swarm.sm.State;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Define a group of states in a state machine as beloinging to a state machine unit. The implementations are expected to create separate entry points for the states that belong to a State Group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.StateGroup#getState <em>State</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.StateGroup#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getStateGroup()
 * @model extendedMetaData="name='StateGroup' kind='elementOnly'"
 * @generated
 */
public interface StateGroup extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.sm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getStateGroup_State()
	 * @model extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<State> getState();

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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getStateGroup_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.StateGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StateGroup
