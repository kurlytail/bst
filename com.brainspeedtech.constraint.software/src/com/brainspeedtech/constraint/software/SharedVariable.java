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

import com.brainspeedtech.struct.Struct;

import com.brainspeedtech.swarm.inst.CellInstance;

import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.master.MasterCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.SharedVariable#getMasterCell <em>Master Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.SharedVariable#getStruct <em>Struct</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.SharedVariable#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.SharedVariable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedVariable()
 * @model extendedMetaData="name='SharedVariable' kind='elementOnly'"
 * @generated
 */
public interface SharedVariable extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Master Cell</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterCell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Cell</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Cell</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedVariable_MasterCell()
	 * @model extendedMetaData="kind='element' name='masterCell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterCell> getMasterCell();

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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedVariable_Count()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.SharedVariable#getCount <em>Count</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.software.SharedVariable#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.software.SharedVariable#getCount <em>Count</em>}' attribute is set.
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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedVariable_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.SharedVariable#getName <em>Name</em>}' attribute.
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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedVariable_Struct()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
	Struct getStruct();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.SharedVariable#getStruct <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Struct value);

} // SharedVariable
