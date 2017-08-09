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

import com.brainspeedtech.struct.Path;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.inst.InstanceTerm#getPath <em>Path</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.inst.InstanceTerm#getIndex <em>Index</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.inst.InstanceTerm#getRange <em>Range</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.inst.InstanceTerm#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.struct.inst.InstPackage#getInstanceTerm()
 * @model extendedMetaData="name='InstanceTerm' kind='elementOnly'"
 * @generated
 */
public interface InstanceTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see com.brainspeedtech.struct.inst.InstPackage#getInstanceTerm_Path()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.inst.InstanceTerm#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #setIndex(int)
	 * @see com.brainspeedtech.struct.inst.InstPackage#getInstanceTerm_Index()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.inst.InstanceTerm#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #isSetIndex()
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.struct.inst.InstanceTerm#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndex()
	 * @see #getIndex()
	 * @see #setIndex(int)
	 * @generated
	 */
	void unsetIndex();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.inst.InstanceTerm#getIndex <em>Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index</em>' attribute is set.
	 * @see #unsetIndex()
	 * @see #getIndex()
	 * @see #setIndex(int)
	 * @generated
	 */
	boolean isSetIndex();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #setRange(int)
	 * @see com.brainspeedtech.struct.inst.InstPackage#getInstanceTerm_Range()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='range'"
	 * @generated
	 */
	int getRange();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.inst.InstanceTerm#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #getRange()
	 * @generated
	 */
	void setRange(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.struct.inst.InstanceTerm#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRange()
	 * @see #getRange()
	 * @see #setRange(int)
	 * @generated
	 */
	void unsetRange();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.struct.inst.InstanceTerm#getRange <em>Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Range</em>' attribute is set.
	 * @see #unsetRange()
	 * @see #getRange()
	 * @see #setRange(int)
	 * @generated
	 */
	boolean isSetRange();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.brainspeedtech.struct.inst.InstPackage#getInstanceTerm_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.struct.inst.InstanceTerm#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // InstanceTerm
