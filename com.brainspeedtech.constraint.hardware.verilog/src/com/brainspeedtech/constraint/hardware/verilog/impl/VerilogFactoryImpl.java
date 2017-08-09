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
package com.brainspeedtech.constraint.hardware.verilog.impl;

import com.brainspeedtech.constraint.hardware.verilog.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerilogFactoryImpl extends EFactoryImpl implements VerilogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerilogFactory init() {
		try {
			VerilogFactory theVerilogFactory = (VerilogFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.brainspeedtech.com/constraint/hardware/verilog"); 
			if (theVerilogFactory != null) {
				return theVerilogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VerilogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerilogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VerilogPackage.BANDWIDTH: return createBandwidth();
			case VerilogPackage.BUS_WIDTH: return createBusWidth();
			case VerilogPackage.CLOCK_DOMAIN: return createClockDomain();
			case VerilogPackage.VERILOG_GENERATION: return createVerilogGeneration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bandwidth createBandwidth() {
		BandwidthImpl bandwidth = new BandwidthImpl();
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusWidth createBusWidth() {
		BusWidthImpl busWidth = new BusWidthImpl();
		return busWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockDomain createClockDomain() {
		ClockDomainImpl clockDomain = new ClockDomainImpl();
		return clockDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerilogGeneration createVerilogGeneration() {
		VerilogGenerationImpl verilogGeneration = new VerilogGenerationImpl();
		return verilogGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerilogPackage getVerilogPackage() {
		return (VerilogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static VerilogPackage getPackage() {
		return VerilogPackage.eINSTANCE;
	}

} //VerilogFactoryImpl
