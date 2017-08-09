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
package com.brainspeedtech.constraint.hardware.verilog;

import com.brainspeedtech.swarm.layer.ConstraintBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bandwidth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.Bandwidth#getMasterTube <em>Master Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getBandwidth()
 * @model extendedMetaData="name='Bandwidth' kind='elementOnly'"
 * @generated
 */
public interface Bandwidth extends ConstraintBase {
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
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getBandwidth_MasterTube()
	 * @model type="com.brainspeedtech.swarm.master.MasterTube"
	 *        extendedMetaData="kind='element' name='masterTube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getMasterTube();

} // Bandwidth
