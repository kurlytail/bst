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

import com.brainspeedtech.constraint.hardware.verilog.Bandwidth;
import com.brainspeedtech.constraint.hardware.verilog.BusWidth;
import com.brainspeedtech.constraint.hardware.verilog.ClockDomain;
import com.brainspeedtech.constraint.hardware.verilog.VerilogFactory;
import com.brainspeedtech.constraint.hardware.verilog.VerilogGeneration;
import com.brainspeedtech.constraint.hardware.verilog.VerilogPackage;

import com.brainspeedtech.swarm.inst.InstPackage;

import com.brainspeedtech.swarm.layer.LayerPackage;

import com.brainspeedtech.swarm.master.MasterPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerilogPackageImpl extends EPackageImpl implements VerilogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandwidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busWidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verilogGenerationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.brainspeedtech.constraint.hardware.verilog.VerilogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VerilogPackageImpl() {
		super(eNS_URI, VerilogFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VerilogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VerilogPackage init() {
		if (isInited) return (VerilogPackage)EPackage.Registry.INSTANCE.getEPackage(VerilogPackage.eNS_URI);

		// Obtain or create and register package
		VerilogPackageImpl theVerilogPackage = (VerilogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VerilogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VerilogPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LayerPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVerilogPackage.createPackageContents();

		// Initialize created meta-data
		theVerilogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVerilogPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VerilogPackage.eNS_URI, theVerilogPackage);
		return theVerilogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBandwidth() {
		return bandwidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBandwidth_MasterTube() {
		return (EReference)bandwidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusWidth() {
		return busWidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusWidth_MasterTube() {
		return (EReference)busWidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusWidth_Width() {
		return (EAttribute)busWidthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockDomain() {
		return clockDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockDomain_MasterTube() {
		return (EReference)clockDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockDomain_MasterCell() {
		return (EReference)clockDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockDomain_Frequency() {
		return (EAttribute)clockDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockDomain_Name() {
		return (EAttribute)clockDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerilogGeneration() {
		return verilogGenerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerilogFactory getVerilogFactory() {
		return (VerilogFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bandwidthEClass = createEClass(BANDWIDTH);
		createEReference(bandwidthEClass, BANDWIDTH__MASTER_TUBE);

		busWidthEClass = createEClass(BUS_WIDTH);
		createEReference(busWidthEClass, BUS_WIDTH__MASTER_TUBE);
		createEAttribute(busWidthEClass, BUS_WIDTH__WIDTH);

		clockDomainEClass = createEClass(CLOCK_DOMAIN);
		createEReference(clockDomainEClass, CLOCK_DOMAIN__MASTER_TUBE);
		createEReference(clockDomainEClass, CLOCK_DOMAIN__MASTER_CELL);
		createEAttribute(clockDomainEClass, CLOCK_DOMAIN__FREQUENCY);
		createEAttribute(clockDomainEClass, CLOCK_DOMAIN__NAME);

		verilogGenerationEClass = createEClass(VERILOG_GENERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LayerPackage theLayerPackage = (LayerPackage)EPackage.Registry.INSTANCE.getEPackage(LayerPackage.eNS_URI);
		MasterPackage theMasterPackage = (MasterPackage)EPackage.Registry.INSTANCE.getEPackage(MasterPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes
		bandwidthEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		busWidthEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		clockDomainEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		verilogGenerationEClass.getESuperTypes().add(theLayerPackage.getNatureBase());

		// Initialize classes and features; add operations and parameters
		initEClass(bandwidthEClass, Bandwidth.class, "Bandwidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBandwidth_MasterTube(), theMasterPackage.getMasterTube(), null, "masterTube", null, 0, -1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busWidthEClass, BusWidth.class, "BusWidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusWidth_MasterTube(), theMasterPackage.getMasterTube(), null, "masterTube", null, 0, -1, BusWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusWidth_Width(), theXMLTypePackage.getInt(), "width", null, 0, 1, BusWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockDomainEClass, ClockDomain.class, "ClockDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockDomain_MasterTube(), theMasterPackage.getMasterTube(), null, "masterTube", null, 0, -1, ClockDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockDomain_MasterCell(), theMasterPackage.getMasterCell(), null, "masterCell", null, 0, -1, ClockDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockDomain_Frequency(), theXMLTypePackage.getUnsignedLong(), "frequency", "125000000", 0, 1, ClockDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockDomain_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ClockDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verilogGenerationEClass, VerilogGeneration.class, "VerilogGeneration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (bandwidthEClass, 
		   source, 
		   new String[] {
			 "name", "Bandwidth",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBandwidth_MasterTube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterTube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (busWidthEClass, 
		   source, 
		   new String[] {
			 "name", "BusWidth",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBusWidth_MasterTube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterTube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusWidth_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (clockDomainEClass, 
		   source, 
		   new String[] {
			 "name", "ClockDomain",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClockDomain_MasterTube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterTube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClockDomain_MasterCell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterCell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClockDomain_Frequency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "frequency"
		   });		
		addAnnotation
		  (getClockDomain_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (verilogGenerationEClass, 
		   source, 
		   new String[] {
			 "name", "VerilogGeneration",
			 "kind", "empty"
		   });
	}

} //VerilogPackageImpl
