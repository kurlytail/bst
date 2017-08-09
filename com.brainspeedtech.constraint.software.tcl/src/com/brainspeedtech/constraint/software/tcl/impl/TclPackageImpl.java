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
package com.brainspeedtech.constraint.software.tcl.impl;

import com.brainspeedtech.constraint.software.tcl.TclFactory;
import com.brainspeedtech.constraint.software.tcl.TclGeneration;
import com.brainspeedtech.constraint.software.tcl.TclPackage;

import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TclPackageImpl extends EPackageImpl implements TclPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tclGenerationEClass = null;

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
	 * @see com.brainspeedtech.constraint.software.tcl.TclPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TclPackageImpl() {
		super(eNS_URI, TclFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TclPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TclPackage init() {
		if (isInited) return (TclPackage)EPackage.Registry.INSTANCE.getEPackage(TclPackage.eNS_URI);

		// Obtain or create and register package
		TclPackageImpl theTclPackage = (TclPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TclPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TclPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LayerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTclPackage.createPackageContents();

		// Initialize created meta-data
		theTclPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTclPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TclPackage.eNS_URI, theTclPackage);
		return theTclPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTclGeneration() {
		return tclGenerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TclFactory getTclFactory() {
		return (TclFactory)getEFactoryInstance();
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
		tclGenerationEClass = createEClass(TCL_GENERATION);
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

		// Add supertypes to classes
		tclGenerationEClass.getESuperTypes().add(theLayerPackage.getNatureBase());

		// Initialize classes and features; add operations and parameters
		initEClass(tclGenerationEClass, TclGeneration.class, "TclGeneration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (tclGenerationEClass, 
		   source, 
		   new String[] {
			 "name", "TclGeneration",
			 "kind", "empty"
		   });
	}

} //TclPackageImpl
