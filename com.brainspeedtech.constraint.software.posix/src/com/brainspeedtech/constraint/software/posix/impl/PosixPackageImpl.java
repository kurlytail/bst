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
package com.brainspeedtech.constraint.software.posix.impl;

import com.brainspeedtech.constraint.software.SoftwarePackage;
import com.brainspeedtech.constraint.software.posix.CustomPosixTube;
import com.brainspeedtech.constraint.software.posix.IgnorePosixTube;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.brainspeedtech.constraint.software.posix.PosixFactory;
import com.brainspeedtech.constraint.software.posix.PosixGenerator;
import com.brainspeedtech.constraint.software.posix.PosixPackage;
import com.brainspeedtech.constraint.software.posix.UnixSocketTube;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.master.MasterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PosixPackageImpl extends EPackageImpl implements PosixPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customPosixTubeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignorePosixTubeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass posixGeneratorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unixSocketTubeEClass = null;
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
	 * @see com.brainspeedtech.constraint.software.posix.PosixPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PosixPackageImpl() {
		super(eNS_URI, PosixFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PosixPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PosixPackage init() {
		if (isInited) return (PosixPackage)EPackage.Registry.INSTANCE.getEPackage(PosixPackage.eNS_URI);

		// Obtain or create and register package
		PosixPackageImpl thePosixPackage = (PosixPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PosixPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PosixPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SoftwarePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePosixPackage.createPackageContents();

		// Initialize created meta-data
		thePosixPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePosixPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PosixPackage.eNS_URI, thePosixPackage);
		return thePosixPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomPosixTube() {
		return customPosixTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomPosixTube_Tube() {
		return (EReference)customPosixTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnorePosixTube() {
		return ignorePosixTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgnorePosixTube_Tube() {
		return (EReference)ignorePosixTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosixGenerator() {
		return posixGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnixSocketTube() {
		return unixSocketTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnixSocketTube_Name() {
		return (EAttribute)unixSocketTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PosixFactory getPosixFactory() {
		return (PosixFactory)getEFactoryInstance();
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
		customPosixTubeEClass = createEClass(CUSTOM_POSIX_TUBE);
		createEReference(customPosixTubeEClass, CUSTOM_POSIX_TUBE__TUBE);

		ignorePosixTubeEClass = createEClass(IGNORE_POSIX_TUBE);
		createEReference(ignorePosixTubeEClass, IGNORE_POSIX_TUBE__TUBE);

		posixGeneratorEClass = createEClass(POSIX_GENERATOR);

		unixSocketTubeEClass = createEClass(UNIX_SOCKET_TUBE);
		createEAttribute(unixSocketTubeEClass, UNIX_SOCKET_TUBE__NAME);
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
		SoftwarePackage theSoftwarePackage = (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes
		customPosixTubeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		ignorePosixTubeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		posixGeneratorEClass.getESuperTypes().add(theLayerPackage.getNatureBase());
		unixSocketTubeEClass.getESuperTypes().add(theSoftwarePackage.getSocketTube());

		// Initialize classes and features; add operations and parameters
		initEClass(customPosixTubeEClass, CustomPosixTube.class, "CustomPosixTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomPosixTube_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, CustomPosixTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ignorePosixTubeEClass, IgnorePosixTube.class, "IgnorePosixTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIgnorePosixTube_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, IgnorePosixTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(posixGeneratorEClass, PosixGenerator.class, "PosixGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unixSocketTubeEClass, UnixSocketTube.class, "UnixSocketTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnixSocketTube_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, UnixSocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (customPosixTubeEClass, 
		   source, 
		   new String[] {
			 "name", "CustomPosixTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCustomPosixTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (ignorePosixTubeEClass, 
		   source, 
		   new String[] {
			 "name", "IgnorePosixTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIgnorePosixTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (posixGeneratorEClass, 
		   source, 
		   new String[] {
			 "name", "PosixGenerator",
			 "kind", "empty"
		   });		
		addAnnotation
		  (unixSocketTubeEClass, 
		   source, 
		   new String[] {
			 "name", "UnixSocketTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnixSocketTube_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });
	}

} //PosixPackageImpl
