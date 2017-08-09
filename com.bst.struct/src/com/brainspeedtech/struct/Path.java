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
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.Path#getChild <em>Child</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.Path#getField <em>Field</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.Path#getIndex <em>Index</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.Path#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.struct.StructPackage#getPath()
 * @model extendedMetaData="name='Path' kind='elementOnly'"
 * @generated
 */
public interface Path extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(Path)
	 * @see com.brainspeedtech.struct.StructPackage#getPath_Child()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='child' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getChild();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Path#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Path value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see com.brainspeedtech.struct.StructPackage#getPath_Field()
	 * @model extendedMetaData="kind='attribute' name='field'"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Path#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #setIndex(long)
	 * @see com.brainspeedtech.struct.StructPackage#getPath_Index()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	long getIndex();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Path#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(long value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.struct.Path#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndex()
	 * @see #getIndex()
	 * @see #setIndex(long)
	 * @generated
	 */
	void unsetIndex();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.Path#getIndex <em>Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index</em>' attribute is set.
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @see #setIndex(long)
	 * @generated
	 */
	boolean isSetIndex();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #setRange(long)
	 * @see com.brainspeedtech.struct.StructPackage#getPath_Range()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='range'"
	 * @generated
	 */
	long getRange();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.Path#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #getRange()
	 * @generated
	 */
	void setRange(long value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.struct.Path#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRange()
	 * @see #getRange()
	 * @see #setRange(long)
	 * @generated
	 */
	void unsetRange();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.Path#getRange <em>Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Range</em>' attribute is set.
	 * @see #unsetRange()
	 * @see #getRange()
	 * @see #setRange(long)
	 * @generated
	 */
	boolean isSetRange();

} // Path
