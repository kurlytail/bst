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
package com.brainspeedtech.swarm.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.flow.Flow#getCell <em>Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Flow#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Flow#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.flow.FlowPackage#getFlow()
 * @model extendedMetaData="name='Flow' kind='elementOnly'"
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' containment reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.flow.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' containment reference list.
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getFlow_Cell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Cell> getCell();

	/**
	 * Returns the value of the '<em><b>Tube</b></em>' containment reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.flow.Tube}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tube</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tube</em>' containment reference list.
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getFlow_Tube()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Tube> getTube();

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
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getFlow_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.flow.Flow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Flow
