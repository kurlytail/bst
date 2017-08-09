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
package com.brainspeedtech.swarm.layer;

import com.brainspeedtech.swarm.sm.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Convert Master To SM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConvertMasterToSM#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConvertMasterToSM#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConvertMasterToSM()
 * @model extendedMetaData="name='ConvertMasterToSM' kind='elementOnly'"
 * @generated
 */
public interface ConvertMasterToSM extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' reference.
	 * @see #setStateMachine(StateMachine)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConvertMasterToSM_StateMachine()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='stateMachine' namespace='##targetNamespace'"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.ConvertMasterToSM#getStateMachine <em>State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(String)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConvertMasterToSM_Project()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='project'"
	 * @generated
	 */
	String getProject();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.ConvertMasterToSM#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(String value);

} // ConvertMasterToSM
