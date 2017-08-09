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
package com.brainspeedtech.swarm.inst.impl;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.InstFactory;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.inst.TubeInstance;

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
public class InstPackageImpl extends EPackageImpl implements InstPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellInstanceEClass = null;

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
	private EClass tubeInstanceEClass = null;

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
	 * @see com.brainspeedtech.swarm.inst.InstPackage#eNS_URI
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
		MasterPackage.eINSTANCE.eClass();
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
	public EClass getCellInstance() {
		return cellInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellInstance_Input() {
		return (EReference)cellInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellInstance_Output() {
		return (EReference)cellInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellInstance_Cell() {
		return (EReference)cellInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellInstance_Instance() {
		return (EAttribute)cellInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellInstance_InternalName() {
		return (EAttribute)cellInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellInstance_Name() {
		return (EAttribute)cellInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellInstance_Pinned() {
		return (EAttribute)cellInstanceEClass.getEStructuralFeatures().get(6);
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
	public EReference getInstance_Tube() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Cell() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(1);
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
	public EClass getTubeInstance() {
		return tubeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTubeInstance_From() {
		return (EReference)tubeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTubeInstance_To() {
		return (EReference)tubeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTubeInstance_Instance() {
		return (EAttribute)tubeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTubeInstance_InternalName() {
		return (EAttribute)tubeInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTubeInstance_Name() {
		return (EAttribute)tubeInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTubeInstance_Tube() {
		return (EReference)tubeInstanceEClass.getEStructuralFeatures().get(5);
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
		cellInstanceEClass = createEClass(CELL_INSTANCE);
		createEReference(cellInstanceEClass, CELL_INSTANCE__INPUT);
		createEReference(cellInstanceEClass, CELL_INSTANCE__OUTPUT);
		createEReference(cellInstanceEClass, CELL_INSTANCE__CELL);
		createEAttribute(cellInstanceEClass, CELL_INSTANCE__INSTANCE);
		createEAttribute(cellInstanceEClass, CELL_INSTANCE__INTERNAL_NAME);
		createEAttribute(cellInstanceEClass, CELL_INSTANCE__NAME);
		createEAttribute(cellInstanceEClass, CELL_INSTANCE__PINNED);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__TUBE);
		createEReference(instanceEClass, INSTANCE__CELL);
		createEAttribute(instanceEClass, INSTANCE__NAME);

		tubeInstanceEClass = createEClass(TUBE_INSTANCE);
		createEReference(tubeInstanceEClass, TUBE_INSTANCE__FROM);
		createEReference(tubeInstanceEClass, TUBE_INSTANCE__TO);
		createEAttribute(tubeInstanceEClass, TUBE_INSTANCE__INSTANCE);
		createEAttribute(tubeInstanceEClass, TUBE_INSTANCE__INTERNAL_NAME);
		createEAttribute(tubeInstanceEClass, TUBE_INSTANCE__NAME);
		createEReference(tubeInstanceEClass, TUBE_INSTANCE__TUBE);
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
		MasterPackage theMasterPackage = (MasterPackage)EPackage.Registry.INSTANCE.getEPackage(MasterPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cellInstanceEClass, CellInstance.class, "CellInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellInstance_Input(), this.getTubeInstance(), this.getTubeInstance_To(), "input", null, 0, -1, CellInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCellInstance_Output(), this.getTubeInstance(), this.getTubeInstance_From(), "output", null, 0, -1, CellInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCellInstance_Cell(), theMasterPackage.getMasterCell(), null, "cell", null, 0, 1, CellInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCellInstance_Instance(), theXMLTypePackage.getInt(), "instance", null, 0, 1, CellInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCellInstance_InternalName(), theXMLTypePackage.getID(), "internalName", null, 0, 1, CellInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCellInstance_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, CellInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCellInstance_Pinned(), theXMLTypePackage.getBoolean(), "pinned", "false", 0, 1, CellInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_Tube(), this.getTubeInstance(), null, "tube", null, 0, -1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_Cell(), this.getCellInstance(), null, "cell", null, 0, -1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tubeInstanceEClass, TubeInstance.class, "TubeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTubeInstance_From(), this.getCellInstance(), this.getCellInstance_Output(), "from", null, 1, 1, TubeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTubeInstance_To(), this.getCellInstance(), this.getCellInstance_Input(), "to", null, 1, 1, TubeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTubeInstance_Instance(), theXMLTypePackage.getInt(), "instance", null, 0, 1, TubeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTubeInstance_InternalName(), theXMLTypePackage.getID(), "internalName", null, 0, 1, TubeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTubeInstance_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TubeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTubeInstance_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, 1, TubeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (cellInstanceEClass, 
		   source, 
		   new String[] {
			 "name", "CellInstance",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCellInstance_Input(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "input",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCellInstance_Output(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "output",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCellInstance_Cell(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cell"
		   });		
		addAnnotation
		  (getCellInstance_Instance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "instance"
		   });		
		addAnnotation
		  (getCellInstance_InternalName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "internal_name"
		   });		
		addAnnotation
		  (getCellInstance_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getCellInstance_Pinned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pinned"
		   });		
		addAnnotation
		  (instanceEClass, 
		   source, 
		   new String[] {
			 "name", "Instance",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInstance_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInstance_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInstance_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (tubeInstanceEClass, 
		   source, 
		   new String[] {
			 "name", "TubeInstance",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTubeInstance_From(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "from",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTubeInstance_To(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "to",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTubeInstance_Instance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "instance"
		   });		
		addAnnotation
		  (getTubeInstance_InternalName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "internal_name"
		   });		
		addAnnotation
		  (getTubeInstance_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getTubeInstance_Tube(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tube"
		   });
	}

} //InstPackageImpl
