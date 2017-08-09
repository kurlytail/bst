/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.struct;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.EnumTerm#getBlurb <em>Blurb</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.EnumTerm#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.EnumTerm#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.struct.StructPackage#getEnumTerm()
 * @model extendedMetaData="name='EnumTerm' kind='empty'"
 * @generated
 */
public interface EnumTerm extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Returns the value of the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blurb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blurb</em>' attribute.
	 * @see #setBlurb(String)
	 * @see com.brainspeedtech.struct.StructPackage#getEnumTerm_Blurb()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='blurb'"
	 * @generated
	 */
	String getBlurb();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.EnumTerm#getBlurb <em>Blurb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blurb</em>' attribute.
	 * @see #getBlurb()
	 * @generated
	 */
	void setBlurb(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"ENUMERATION_NAME..."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see com.brainspeedtech.struct.StructPackage#getEnumTerm_Name()
	 * @model default="ENUMERATION_NAME..." unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.EnumTerm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.struct.EnumTerm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.EnumTerm#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(String)
	 * @see com.brainspeedtech.struct.StructPackage#getEnumTerm_Value()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.EnumTerm#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.struct.EnumTerm#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.EnumTerm#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	boolean isSetValue();

} // EnumTerm
