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

import java.math.BigInteger;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getMasterTube <em>Master Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getMasterCell <em>Master Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getClockDomain()
 * @model extendedMetaData="name='ClockDomain' kind='elementOnly'"
 * @generated
 */
public interface ClockDomain extends ConstraintBase {
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
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getClockDomain_MasterTube()
	 * @model type="com.brainspeedtech.swarm.master.MasterTube"
	 *        extendedMetaData="kind='element' name='masterTube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getMasterTube();

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
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getClockDomain_MasterCell()
	 * @model type="com.brainspeedtech.swarm.master.MasterCell"
	 *        extendedMetaData="kind='element' name='masterCell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getMasterCell();

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * The default value is <code>"125000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #setFrequency(BigInteger)
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getClockDomain_Frequency()
	 * @model default="125000000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='frequency'"
	 * @generated
	 */
	BigInteger getFrequency();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(BigInteger value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(BigInteger)
	 * @generated
	 */
	void unsetFrequency();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getFrequency <em>Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frequency</em>' attribute is set.
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(BigInteger)
	 * @generated
	 */
	boolean isSetFrequency();

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
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#getClockDomain_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ClockDomain
