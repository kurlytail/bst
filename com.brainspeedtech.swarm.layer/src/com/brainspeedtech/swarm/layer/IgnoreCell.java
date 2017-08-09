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

import com.brainspeedtech.swarm.master.MasterCell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ignore Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Cell will be absent from the instance design
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.IgnoreCell#getMasterCell <em>Master Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getIgnoreCell()
 * @model annotation="http://www.brainspeedtech.com appinfo='com.bst.gen.swarmMasterNature'"
 *        extendedMetaData="name='IgnoreCell' kind='elementOnly'"
 * @generated
 */
public interface IgnoreCell extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Master Cell</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterCell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Cell</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Cell</em>' reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getIgnoreCell_MasterCell()
	 * @model extendedMetaData="kind='element' name='masterCell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterCell> getMasterCell();

} // IgnoreCell
