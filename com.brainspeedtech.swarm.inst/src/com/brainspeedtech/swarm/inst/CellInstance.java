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
package com.brainspeedtech.swarm.inst;

import com.brainspeedtech.swarm.master.MasterCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.inst.CellInstance#getInput <em>Input</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.CellInstance#getOutput <em>Output</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.CellInstance#getCell <em>Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.CellInstance#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.CellInstance#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.CellInstance#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.CellInstance#isPinned <em>Pinned</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.inst.InstPackage#getCellInstance()
 * @model extendedMetaData="name='CellInstance' kind='elementOnly'"
 * @generated
 */
public interface CellInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.inst.TubeInstance}.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.inst.TubeInstance#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getCellInstance_Input()
	 * @see com.brainspeedtech.swarm.inst.TubeInstance#getTo
	 * @model opposite="to"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TubeInstance> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.inst.TubeInstance}.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.inst.TubeInstance#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getCellInstance_Output()
	 * @see com.brainspeedtech.swarm.inst.TubeInstance#getFrom
	 * @model opposite="from"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TubeInstance> getOutput();

	/**
	 * Returns the value of the '<em><b>Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' reference.
	 * @see #setCell(MasterCell)
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getCellInstance_Cell()
	 * @model extendedMetaData="kind='attribute' name='cell'"
	 * @generated
	 */
	MasterCell getCell();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#getCell <em>Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell</em>' reference.
	 * @see #getCell()
	 * @generated
	 */
	void setCell(MasterCell value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #isSetInstance()
	 * @see #unsetInstance()
	 * @see #setInstance(int)
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getCellInstance_Instance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='instance'"
	 * @generated
	 */
	int getInstance();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #isSetInstance()
	 * @see #unsetInstance()
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstance()
	 * @see #getInstance()
	 * @see #setInstance(int)
	 * @generated
	 */
	void unsetInstance();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#getInstance <em>Instance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance</em>' attribute is set.
	 * @see #unsetInstance()
	 * @see #getInstance()
	 * @see #setInstance(int)
	 * @generated
	 */
	boolean isSetInstance();

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
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getCellInstance_InternalName()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='internal_name'"
	 * @generated
	 */
	String getInternalName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#getInternalName <em>Internal Name</em>}' attribute.
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
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getCellInstance_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pinned</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getCellInstance_Pinned()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='pinned'"
	 * @generated
	 */
	boolean isPinned();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#isPinned <em>Pinned</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#isPinned <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPinned()
	 * @see #isPinned()
	 * @see #setPinned(boolean)
	 * @generated
	 */
	void unsetPinned();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.inst.CellInstance#isPinned <em>Pinned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pinned</em>' attribute is set.
	 * @see #unsetPinned()
	 * @see #isPinned()
	 * @see #setPinned(boolean)
	 * @generated
	 */
	boolean isSetPinned();

} // CellInstance
