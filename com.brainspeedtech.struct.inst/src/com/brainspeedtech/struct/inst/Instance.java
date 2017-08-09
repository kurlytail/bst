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
package com.brainspeedtech.struct.inst;

import com.brainspeedtech.struct.Struct;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.inst.Instance#getTerms <em>Terms</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.inst.Instance#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.inst.Instance#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.inst.Instance#getStruct <em>Struct</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.struct.inst.InstPackage#getInstance()
 * @model extendedMetaData="name='Instance' kind='elementOnly'"
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference.
	 * @see #setTerms(InstanceTerm)
	 * @see com.brainspeedtech.struct.inst.InstPackage#getInstance_Terms()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='terms' namespace='##targetNamespace'"
	 * @generated
	 */
	InstanceTerm getTerms();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.inst.Instance#getTerms <em>Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms</em>' containment reference.
	 * @see #getTerms()
	 * @generated
	 */
	void setTerms(InstanceTerm value);

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
	 * @see com.brainspeedtech.struct.inst.InstPackage#getInstance_Count()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.inst.Instance#getCount <em>Count</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.struct.inst.Instance#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.inst.Instance#getCount <em>Count</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.brainspeedtech.struct.inst.InstPackage#getInstance_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.inst.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' reference.
	 * @see #setStruct(Struct)
	 * @see com.brainspeedtech.struct.inst.InstPackage#getInstance_Struct()
	 * @model extendedMetaData="kind='attribute' name='struct'"
	 * @generated
	 */
	Struct getStruct();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.inst.Instance#getStruct <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Struct value);

} // Instance
