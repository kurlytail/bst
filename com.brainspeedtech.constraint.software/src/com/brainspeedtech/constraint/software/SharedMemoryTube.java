/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software;

import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.swarm.layer.IgnoreTube;
import com.brainspeedtech.swarm.layer.ConstraintBase;

import com.brainspeedtech.swarm.master.MasterTube;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Memory Tube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.SharedMemoryTube#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.SharedMemoryTube#getStruct <em>Struct</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.SharedMemoryTube#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedMemoryTube()
 * @model extendedMetaData="name='SharedMemoryTube' kind='elementOnly'"
 * @generated
 */
public interface SharedMemoryTube extends ConstraintBase {

	/**
	 * Returns the value of the '<em><b>Tube</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterTube}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tube</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tube</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedMemoryTube_Tube()
	 * @model extendedMetaData="kind='element' name='tube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterTube> getTube();

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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedMemoryTube_Struct()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
	Struct getStruct();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.SharedMemoryTube#getStruct <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Struct value);

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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getSharedMemoryTube_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.SharedMemoryTube#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SharedMemoryTube
