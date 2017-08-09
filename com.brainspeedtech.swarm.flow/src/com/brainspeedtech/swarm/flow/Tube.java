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

import com.brainspeedtech.struct.Struct;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.flow.Tube#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Tube#getFrom <em>From</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Tube#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Tube#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.flow.FlowPackage#getTube()
 * @model extendedMetaData="name='Tube' kind='elementOnly'"
 * @generated
 */
public interface Tube extends EObject {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.struct.Struct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' reference list.
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getTube_Descriptor()
	 * @model extendedMetaData="kind='element' name='descriptor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Struct> getDescriptor();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.flow.Cell#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Cell)
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getTube_From()
	 * @see com.brainspeedtech.swarm.flow.Cell#getOutput
	 * @model opposite="output"
	 *        extendedMetaData="kind='attribute' name='from'"
	 * @generated
	 */
	Cell getFrom();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.flow.Tube#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Cell value);

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
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getTube_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.flow.Tube#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.flow.Cell#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Cell)
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getTube_To()
	 * @see com.brainspeedtech.swarm.flow.Cell#getInput
	 * @model opposite="input"
	 *        extendedMetaData="kind='attribute' name='to'"
	 * @generated
	 */
	Cell getTo();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.flow.Tube#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Cell value);

} // Tube
