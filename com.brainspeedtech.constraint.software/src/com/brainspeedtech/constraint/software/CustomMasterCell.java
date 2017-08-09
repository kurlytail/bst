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

import com.brainspeedtech.swarm.layer.ConstraintBase;

import com.brainspeedtech.swarm.master.MasterCell;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Master Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.CustomMasterCell#getCell <em>Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getCustomMasterCell()
 * @model extendedMetaData="name='CustomMasterCell' kind='elementOnly'"
 * @generated
 */
public interface CustomMasterCell extends ConstraintBase {
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
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getCustomMasterCell_Cell()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='cell' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterCell getCell();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.CustomMasterCell#getCell <em>Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell</em>' reference.
	 * @see #getCell()
	 * @generated
	 */
	void setCell(MasterCell value);

} // CustomMasterCell
