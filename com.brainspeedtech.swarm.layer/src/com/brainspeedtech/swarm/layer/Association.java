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

import com.brainspeedtech.swarm.master.MasterTube;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.Association#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Association#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getAssociation()
 * @model extendedMetaData="name='Association' kind='elementOnly'"
 * @generated
 */
public interface Association extends ConstraintBase {
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
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getAssociation_Tube()
	 * @model extendedMetaData="kind='element' name='tube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterTube> getTube();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"One To One"</code>.
	 * The literals are from the enumeration {@link com.brainspeedtech.swarm.layer.AssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.brainspeedtech.swarm.layer.AssociationType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(AssociationType)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getAssociation_Type()
	 * @model default="One To One" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	AssociationType getType();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.Association#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.brainspeedtech.swarm.layer.AssociationType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(AssociationType value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.Association#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(AssociationType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.Association#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(AssociationType)
	 * @generated
	 */
	boolean isSetType();

} // Association
