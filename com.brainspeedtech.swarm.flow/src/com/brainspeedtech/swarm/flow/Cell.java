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
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.flow.Cell#getInput <em>Input</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Cell#getOutput <em>Output</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Cell#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Cell#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Cell#isExternal <em>External</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.Cell#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.flow.FlowPackage#getCell()
 * @model extendedMetaData="name='Cell' kind='elementOnly'"
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.flow.Tube}.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.flow.Tube#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getCell_Input()
	 * @see com.brainspeedtech.swarm.flow.Tube#getTo
	 * @model opposite="to"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Tube> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.flow.Tube}.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.flow.Tube#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getCell_Output()
	 * @see com.brainspeedtech.swarm.flow.Tube#getFrom
	 * @model opposite="from"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Tube> getOutput();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #setCount(int)
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getCell_Count()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.flow.Cell#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.flow.Cell#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.flow.Cell#getCount <em>Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count</em>' attribute is set.
	 * @see #unsetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	boolean isSetCount();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getCell_Domain()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='domain'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.flow.Cell#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #isSetExternal()
	 * @see #unsetExternal()
	 * @see #setExternal(boolean)
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getCell_External()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='external'"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.flow.Cell#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isSetExternal()
	 * @see #unsetExternal()
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.flow.Cell#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternal()
	 * @see #isExternal()
	 * @see #setExternal(boolean)
	 * @generated
	 */
	void unsetExternal();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.flow.Cell#isExternal <em>External</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>External</em>' attribute is set.
	 * @see #unsetExternal()
	 * @see #isExternal()
	 * @see #setExternal(boolean)
	 * @generated
	 */
	boolean isSetExternal();

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
	 * @see com.brainspeedtech.swarm.flow.FlowPackage#getCell_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.flow.Cell#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Cell
