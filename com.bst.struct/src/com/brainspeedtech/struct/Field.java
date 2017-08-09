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
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.Field#getAtom <em>Atom</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.Field#getBlurb <em>Blurb</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.Field#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.Field#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.struct.StructPackage#getField()
 * @model extendedMetaData="name='Field' kind='empty'"
 * @generated
 */
public interface Field extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Returns the value of the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom</em>' reference.
	 * @see #setAtom(Atom)
	 * @see com.brainspeedtech.struct.StructPackage#getField_Atom()
	 * @model extendedMetaData="kind='attribute' name='atom'"
	 * @generated
	 */
	Atom getAtom();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Field#getAtom <em>Atom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom</em>' reference.
	 * @see #getAtom()
	 * @generated
	 */
	void setAtom(Atom value);

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
	 * @see com.brainspeedtech.struct.StructPackage#getField_Blurb()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='blurb'"
	 * @generated
	 */
	String getBlurb();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Field#getBlurb <em>Blurb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blurb</em>' attribute.
	 * @see #getBlurb()
	 * @generated
	 */
	void setBlurb(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #setCount(long)
	 * @see com.brainspeedtech.struct.StructPackage#getField_Count()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	long getCount();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Field#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #getCount()
	 * @generated
	 */
	void setCount(long value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.struct.Field#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(long)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.Field#getCount <em>Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count</em>' attribute is set.
	 * @see #unsetCount()
	 * @see #getCount()
	 * @see #setCount(long)
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
	 * @see com.brainspeedtech.struct.StructPackage#getField_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Field
