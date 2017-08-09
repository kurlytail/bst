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

import com.brainspeedtech.swarm.master.MasterTube;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tube Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.inst.TubeInstance#getFrom <em>From</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.TubeInstance#getTo <em>To</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.TubeInstance#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.TubeInstance#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.TubeInstance#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.inst.TubeInstance#getTube <em>Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.inst.InstPackage#getTubeInstance()
 * @model extendedMetaData="name='TubeInstance' kind='elementOnly'"
 * @generated
 */
public interface TubeInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.inst.CellInstance#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(CellInstance)
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getTubeInstance_From()
	 * @see com.brainspeedtech.swarm.inst.CellInstance#getOutput
	 * @model opposite="output" required="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	CellInstance getFrom();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.TubeInstance#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CellInstance value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.inst.CellInstance#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CellInstance)
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getTubeInstance_To()
	 * @see com.brainspeedtech.swarm.inst.CellInstance#getInput
	 * @model opposite="input" required="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	CellInstance getTo();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.TubeInstance#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CellInstance value);

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
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getTubeInstance_Instance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='instance'"
	 * @generated
	 */
	int getInstance();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.TubeInstance#getInstance <em>Instance</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.inst.TubeInstance#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstance()
	 * @see #getInstance()
	 * @see #setInstance(int)
	 * @generated
	 */
	void unsetInstance();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.inst.TubeInstance#getInstance <em>Instance</em>}' attribute is set.
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
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getTubeInstance_InternalName()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='internal_name'"
	 * @generated
	 */
	String getInternalName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.TubeInstance#getInternalName <em>Internal Name</em>}' attribute.
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
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getTubeInstance_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.TubeInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tube</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tube</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tube</em>' reference.
	 * @see #setTube(MasterTube)
	 * @see com.brainspeedtech.swarm.inst.InstPackage#getTubeInstance_Tube()
	 * @model extendedMetaData="kind='attribute' name='tube'"
	 * @generated
	 */
	MasterTube getTube();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.inst.TubeInstance#getTube <em>Tube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tube</em>' reference.
	 * @see #getTube()
	 * @generated
	 */
	void setTube(MasterTube value);

} // TubeInstance
