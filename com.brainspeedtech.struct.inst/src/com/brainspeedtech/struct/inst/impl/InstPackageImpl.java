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
package com.brainspeedtech.struct.inst.impl;

import com.brainspeedtech.struct.StructPackage;

import com.brainspeedtech.struct.inst.InstFactory;
import com.brainspeedtech.struct.inst.InstPackage;
import com.brainspeedtech.struct.inst.Instance;
import com.brainspeedtech.struct.inst.InstanceTerm;

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
public class InstPackageImpl extends EPackageImpl implements InstPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceTermEClass = null;

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
	 * @see com.brainspeedtech.struct.inst.InstPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstPackageImpl() {
		super(eNS_URI, InstFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InstPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstPackage init() {
		if (isInited) return (InstPackage)EPackage.Registry.INSTANCE.getEPackage(InstPackage.eNS_URI);

		// Obtain or create and register package
		InstPackageImpl theInstPackage = (InstPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInstPackage.createPackageContents();

		// Initialize created meta-data
		theInstPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstPackage.eNS_URI, theInstPackage);
		return theInstPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Terms() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Count() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Name() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Struct() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceTerm() {
		return instanceTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceTerm_Path() {
		return (EReference)instanceTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceTerm_Index() {
		return (EAttribute)instanceTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceTerm_Range() {
		return (EAttribute)instanceTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceTerm_Value() {
		return (EAttribute)instanceTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstFactory getInstFactory() {
		return (InstFactory)getEFactoryInstance();
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
		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__TERMS);
		createEAttribute(instanceEClass, INSTANCE__COUNT);
		createEAttribute(instanceEClass, INSTANCE__NAME);
		createEReference(instanceEClass, INSTANCE__STRUCT);

		instanceTermEClass = createEClass(INSTANCE_TERM);
		createEReference(instanceTermEClass, INSTANCE_TERM__PATH);
		createEAttribute(instanceTermEClass, INSTANCE_TERM__INDEX);
		createEAttribute(instanceTermEClass, INSTANCE_TERM__RANGE);
		createEAttribute(instanceTermEClass, INSTANCE_TERM__VALUE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		StructPackage theStructPackage = (StructPackage)EPackage.Registry.INSTANCE.getEPackage(StructPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_Terms(), this.getInstanceTerm(), null, "terms", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Count(), theXMLTypePackage.getInt(), "count", "1", 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_Struct(), theStructPackage.getStruct(), null, "struct", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceTermEClass, InstanceTerm.class, "InstanceTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceTerm_Path(), theStructPackage.getPath(), null, "path", null, 1, 1, InstanceTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceTerm_Index(), theXMLTypePackage.getInt(), "index", null, 0, 1, InstanceTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceTerm_Range(), theXMLTypePackage.getInt(), "range", null, 0, 1, InstanceTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceTerm_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, InstanceTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (instanceEClass, 
		   source, 
		   new String[] {
			 "name", "Instance",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInstance_Terms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "terms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInstance_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (getInstance_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getInstance_Struct(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "struct"
		   });		
		addAnnotation
		  (instanceTermEClass, 
		   source, 
		   new String[] {
			 "name", "InstanceTerm",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInstanceTerm_Path(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "path",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInstanceTerm_Index(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "index"
		   });		
		addAnnotation
		  (getInstanceTerm_Range(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "range"
		   });		
		addAnnotation
		  (getInstanceTerm_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });
	}

} //InstPackageImpl
