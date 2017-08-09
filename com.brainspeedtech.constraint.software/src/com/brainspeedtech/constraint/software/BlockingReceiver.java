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

import com.brainspeedtech.swarm.master.MasterTube;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blocking Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.BlockingReceiver#getMasterTube <em>Master Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getBlockingReceiver()
 * @model extendedMetaData="name='BlockingReceiver' kind='elementOnly'"
 * @generated
 */
public interface BlockingReceiver extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Master Tube</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterTube}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Tube</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Tube</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getBlockingReceiver_MasterTube()
	 * @model extendedMetaData="kind='element' name='masterTube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterTube> getMasterTube();

} // BlockingReceiver
