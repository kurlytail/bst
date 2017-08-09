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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage
 * @generated
 */
public interface VerilogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerilogFactory eINSTANCE = com.brainspeedtech.constraint.hardware.verilog.impl.VerilogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bandwidth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bandwidth</em>'.
	 * @generated
	 */
	Bandwidth createBandwidth();

	/**
	 * Returns a new object of class '<em>Bus Width</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Width</em>'.
	 * @generated
	 */
	BusWidth createBusWidth();

	/**
	 * Returns a new object of class '<em>Clock Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Domain</em>'.
	 * @generated
	 */
	ClockDomain createClockDomain();

	/**
	 * Returns a new object of class '<em>Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation</em>'.
	 * @generated
	 */
	VerilogGeneration createVerilogGeneration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VerilogPackage getVerilogPackage();

} //VerilogFactory
