/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master;

import com.brainspeedtech.swarm.flow.Tube;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterTube#getDesignTubes <em>Design Tubes</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterTube#getFrom <em>From</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterTube#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterTube#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.MasterTube#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterTube()
 * @model extendedMetaData="name='MasterTube' kind='elementOnly'"
 * @generated
 */
public interface MasterTube extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Returns the value of the '<em><b>Design Tubes</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.flow.Tube}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Tubes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Tubes</em>' reference list.
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterTube_DesignTubes()
	 * @model extendedMetaData="kind='element' name='designTubes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Tube> getDesignTubes();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.master.MasterCell#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(MasterCell)
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterTube_From()
	 * @see com.brainspeedtech.swarm.master.MasterCell#getOutput
	 * @model opposite="output"
	 *        extendedMetaData="kind='attribute' name='from'"
	 * @generated
	 */
	MasterCell getFrom();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterTube#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(MasterCell value);

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
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterTube_InternalName()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='internal_name'"
	 * @generated
	 */
	String getInternalName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterTube#getInternalName <em>Internal Name</em>}' attribute.
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
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterTube_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterTube#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.brainspeedtech.swarm.master.MasterCell#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(MasterCell)
	 * @see com.brainspeedtech.swarm.master.MasterPackage#getMasterTube_To()
	 * @see com.brainspeedtech.swarm.master.MasterCell#getInput
	 * @model opposite="input"
	 *        extendedMetaData="kind='attribute' name='to'"
	 * @generated
	 */
	MasterCell getTo();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.master.MasterTube#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(MasterCell value);

} // MasterTube
