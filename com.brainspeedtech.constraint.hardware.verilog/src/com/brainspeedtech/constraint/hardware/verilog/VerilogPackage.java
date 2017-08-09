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

import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogFactory
 * @model kind="package"
 * @generated
 */
public interface VerilogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "verilog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/hardware/verilog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "verilog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerilogPackage eINSTANCE = com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.hardware.verilog.impl.BandwidthImpl <em>Bandwidth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.hardware.verilog.impl.BandwidthImpl
	 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl#getBandwidth()
	 * @generated
	 */
	int BANDWIDTH = 0;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Master Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__MASTER_TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.hardware.verilog.impl.BusWidthImpl <em>Bus Width</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.hardware.verilog.impl.BusWidthImpl
	 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl#getBusWidth()
	 * @generated
	 */
	int BUS_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Master Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__MASTER_TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH__WIDTH = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_WIDTH_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.hardware.verilog.impl.ClockDomainImpl <em>Clock Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.hardware.verilog.impl.ClockDomainImpl
	 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl#getClockDomain()
	 * @generated
	 */
	int CLOCK_DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Master Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__MASTER_TUBE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Master Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__MASTER_CELL = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__FREQUENCY = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN__NAME = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Clock Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_DOMAIN_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.hardware.verilog.impl.VerilogGenerationImpl <em>Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogGenerationImpl
	 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl#getVerilogGeneration()
	 * @generated
	 */
	int VERILOG_GENERATION = 3;

	/**
	 * The number of structural features of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERILOG_GENERATION_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.hardware.verilog.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.Bandwidth
	 * @generated
	 */
	EClass getBandwidth();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.hardware.verilog.Bandwidth#getMasterTube <em>Master Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Tube</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.Bandwidth#getMasterTube()
	 * @see #getBandwidth()
	 * @generated
	 */
	EReference getBandwidth_MasterTube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.hardware.verilog.BusWidth <em>Bus Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Width</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.BusWidth
	 * @generated
	 */
	EClass getBusWidth();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.hardware.verilog.BusWidth#getMasterTube <em>Master Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Tube</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.BusWidth#getMasterTube()
	 * @see #getBusWidth()
	 * @generated
	 */
	EReference getBusWidth_MasterTube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.hardware.verilog.BusWidth#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.BusWidth#getWidth()
	 * @see #getBusWidth()
	 * @generated
	 */
	EAttribute getBusWidth_Width();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain <em>Clock Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Domain</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.ClockDomain
	 * @generated
	 */
	EClass getClockDomain();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getMasterTube <em>Master Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Tube</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getMasterTube()
	 * @see #getClockDomain()
	 * @generated
	 */
	EReference getClockDomain_MasterTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getMasterCell <em>Master Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Cell</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getMasterCell()
	 * @see #getClockDomain()
	 * @generated
	 */
	EReference getClockDomain_MasterCell();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getFrequency()
	 * @see #getClockDomain()
	 * @generated
	 */
	EAttribute getClockDomain_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.ClockDomain#getName()
	 * @see #getClockDomain()
	 * @generated
	 */
	EAttribute getClockDomain_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.hardware.verilog.VerilogGeneration <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation</em>'.
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogGeneration
	 * @generated
	 */
	EClass getVerilogGeneration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VerilogFactory getVerilogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.hardware.verilog.impl.BandwidthImpl <em>Bandwidth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.hardware.verilog.impl.BandwidthImpl
		 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl#getBandwidth()
		 * @generated
		 */
		EClass BANDWIDTH = eINSTANCE.getBandwidth();

		/**
		 * The meta object literal for the '<em><b>Master Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH__MASTER_TUBE = eINSTANCE.getBandwidth_MasterTube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.hardware.verilog.impl.BusWidthImpl <em>Bus Width</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.hardware.verilog.impl.BusWidthImpl
		 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl#getBusWidth()
		 * @generated
		 */
		EClass BUS_WIDTH = eINSTANCE.getBusWidth();

		/**
		 * The meta object literal for the '<em><b>Master Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_WIDTH__MASTER_TUBE = eINSTANCE.getBusWidth_MasterTube();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS_WIDTH__WIDTH = eINSTANCE.getBusWidth_Width();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.hardware.verilog.impl.ClockDomainImpl <em>Clock Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.hardware.verilog.impl.ClockDomainImpl
		 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl#getClockDomain()
		 * @generated
		 */
		EClass CLOCK_DOMAIN = eINSTANCE.getClockDomain();

		/**
		 * The meta object literal for the '<em><b>Master Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_DOMAIN__MASTER_TUBE = eINSTANCE.getClockDomain_MasterTube();

		/**
		 * The meta object literal for the '<em><b>Master Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_DOMAIN__MASTER_CELL = eINSTANCE.getClockDomain_MasterCell();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_DOMAIN__FREQUENCY = eINSTANCE.getClockDomain_Frequency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_DOMAIN__NAME = eINSTANCE.getClockDomain_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.hardware.verilog.impl.VerilogGenerationImpl <em>Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogGenerationImpl
		 * @see com.brainspeedtech.constraint.hardware.verilog.impl.VerilogPackageImpl#getVerilogGeneration()
		 * @generated
		 */
		EClass VERILOG_GENERATION = eINSTANCE.getVerilogGeneration();

	}

} //VerilogPackage
