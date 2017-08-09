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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Idle Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.NoIdleHandler#getCell <em>Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getNoIdleHandler()
 * @model extendedMetaData="name='NoIdleHandler' kind='elementOnly'"
 * @generated
 */
public interface NoIdleHandler extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterCell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getNoIdleHandler_Cell()
	 * @model extendedMetaData="kind='element' name='cell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterCell> getCell();

} // NoIdleHandler
