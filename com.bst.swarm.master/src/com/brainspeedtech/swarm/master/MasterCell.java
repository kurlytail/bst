/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master;

import com.brainspeedtech.swarm.flow.Cell;

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
 *   <li>{@link com.brainspeedtech.swarm.master.MasterCell#getInput <em>Input</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterCell#getOutput <em>Output</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterCell#getDesignCells <em>Design Cells</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterCell#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterCell#isExternal <em>External</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterCell#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterCell#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterCell#isPinned <em>Pinned</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell()
 * @model extendedMetaData="name='MasterCell' kind='elementOnly'"
 * @generated
 */
public interface MasterCell extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterTube}.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.master.MasterTube#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell_Input()
	 * @see com.brainspeedtech.swarm.master.MasterTube#getTo
	 * @model opposite="to"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterTube> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterTube}.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.master.MasterTube#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell_Output()
	 * @see com.brainspeedtech.swarm.master.MasterTube#getFrom
	 * @model opposite="from"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterTube> getOutput();

	/**
	 * Returns the value of the '<em><b>Design Cells</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.flow.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Cells</em>' reference list.
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell_DesignCells()
	 * @model extendedMetaData="kind='element' name='designCells' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Cell> getDesignCells();

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
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell_Count()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#getCount <em>Count</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#getCount <em>Count</em>}' attribute is set.
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
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell_External()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='external'"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#isExternal <em>External</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternal()
	 * @see #isExternal()
	 * @see #setExternal(boolean)
	 * @generated
	 */
	void unsetExternal();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#isExternal <em>External</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Internal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Name</em>' attribute.
	 * @see #setInternalName(String)
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell_InternalName()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='internal_name'"
	 * @generated
	 */
	String getInternalName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#getInternalName <em>Internal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Name</em>' attribute.
	 * @see #getInternalName()
	 * @generated
	 */
	void setInternalName(String value);

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
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinned</em>' attribute.
	 * @see #isSetPinned()
	 * @see #unsetPinned()
	 * @see #setPinned(boolean)
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterCell_Pinned()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='pinned'"
	 * @generated
	 */
	boolean isPinned();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#isPinned <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinned</em>' attribute.
	 * @see #isSetPinned()
	 * @see #unsetPinned()
	 * @see #isPinned()
	 * @generated
	 */
	void setPinned(boolean value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#isPinned <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPinned()
	 * @see #isPinned()
	 * @see #setPinned(boolean)
	 * @generated
	 */
	void unsetPinned();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.master.MasterCell#isPinned <em>Pinned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pinned</em>' attribute is set.
	 * @see #unsetPinned()
	 * @see #isPinned()
	 * @see #setPinned(boolean)
	 * @generated
	 */
	boolean isSetPinned();

} // MasterCell
