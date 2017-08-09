/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.swarm.layer;

import com.brainspeedtech.swarm.flow.Flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Flows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.MatchingFlows#getFlows <em>Flows</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.MatchingFlows#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getMatchingFlows()
 * @model extendedMetaData="name='MatchingFlows' kind='elementOnly'"
 * @generated
 */
public interface MatchingFlows extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Flows</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.flow.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getMatchingFlows_Flows()
	 * @model extendedMetaData="kind='element' name='flows' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Flow> getFlows();

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
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getMatchingFlows_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.MatchingFlows#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MatchingFlows
