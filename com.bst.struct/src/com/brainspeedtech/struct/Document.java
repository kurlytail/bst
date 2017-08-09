/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.struct;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.Document#getStruct <em>Struct</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.Document#isGhost <em>Ghost</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.Document#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.struct.StructPackage#getDocument()
 * @model extendedMetaData="name='Document' kind='elementOnly'"
 * @generated
 */
public interface Document extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
	 * The list contents are of type {@link com.brainspeedtech.struct.Atom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference list.
	 * @see com.brainspeedtech.struct.StructPackage#getDocument_Struct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Atom> getStruct();

	/**
	 * Returns the value of the '<em><b>Ghost</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ghost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ghost</em>' attribute.
	 * @see #isSetGhost()
	 * @see #unsetGhost()
	 * @see #setGhost(boolean)
	 * @see com.brainspeedtech.struct.StructPackage#getDocument_Ghost()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ghost'"
	 * @generated
	 */
	boolean isGhost();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Document#isGhost <em>Ghost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ghost</em>' attribute.
	 * @see #isSetGhost()
	 * @see #unsetGhost()
	 * @see #isGhost()
	 * @generated
	 */
	void setGhost(boolean value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.struct.Document#isGhost <em>Ghost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGhost()
	 * @see #isGhost()
	 * @see #setGhost(boolean)
	 * @generated
	 */
	void unsetGhost();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.Document#isGhost <em>Ghost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ghost</em>' attribute is set.
	 * @see #unsetGhost()
	 * @see #isGhost()
	 * @see #setGhost(boolean)
	 * @generated
	 */
	boolean isSetGhost();

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
	 * @see com.brainspeedtech.struct.StructPackage#getDocument_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Document
