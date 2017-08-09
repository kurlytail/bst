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
 * A representation of the model object '<em><b>Bus Width</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.BusWidth#getMasterTube <em>Master Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.BusWidth#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getBusWidth()
 * @model extendedMetaData="name='BusWidth' kind='elementOnly'"
 * @generated
 */
public interface BusWidth extends ConstraintBase {
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
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getBusWidth_MasterTube()
	 * @model type="com.brainspeedtech.swarm.master.MasterTube"
	 *        extendedMetaData="kind='element' name='masterTube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getMasterTube();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(int)
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getBusWidth_Width()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.hardware.verilog.BusWidth#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.hardware.verilog.BusWidth#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(int)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.hardware.verilog.BusWidth#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(int)
	 * @generated
	 */
	boolean isSetWidth();

} // BusWidth
