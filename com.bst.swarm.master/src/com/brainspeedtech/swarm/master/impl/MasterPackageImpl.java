/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterFactory;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterPackageImpl extends EPackageImpl implements MasterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterTubeEClass = null;

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
	 * @see com.brainspeedtech.swarm.master.MasterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MasterPackageImpl() {
		super(eNS_URI, MasterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MasterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MasterPackage init() {
		if (isInited) return (MasterPackage)EPackage.Registry.INSTANCE.getEPackage(MasterPackage.eNS_URI);

		// Obtain or create and register package
		MasterPackageImpl theMasterPackage = (MasterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MasterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MasterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FlowPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMasterPackage.createPackageContents();

		// Initialize created meta-data
		theMasterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMasterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MasterPackage.eNS_URI, theMasterPackage);
		return theMasterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterCell() {
		return masterCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterCell_Input() {
		return (EReference)masterCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterCell_Output() {
		return (EReference)masterCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterCell_DesignCells() {
		return (EReference)masterCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterCell_Count() {
		return (EAttribute)masterCellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterCell_External() {
		return (EAttribute)masterCellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterCell_InternalName() {
		return (EAttribute)masterCellEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterCell_Name() {
		return (EAttribute)masterCellEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterCell_Pinned() {
		return (EAttribute)masterCellEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterDesign() {
		return masterDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterDesign_Cell() {
		return (EReference)masterDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterDesign_Tube() {
		return (EReference)masterDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterDesign_Name() {
		return (EAttribute)masterDesignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterTube() {
		return masterTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterTube_DesignTubes() {
		return (EReference)masterTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterTube_From() {
		return (EReference)masterTubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterTube_InternalName() {
		return (EAttribute)masterTubeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterTube_Name() {
		return (EAttribute)masterTubeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterTube_To() {
		return (EReference)masterTubeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterFactory getMasterFactory() {
		return (MasterFactory)getEFactoryInstance();
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
		masterCellEClass = createEClass(MASTER_CELL);
		createEReference(masterCellEClass, MASTER_CELL__INPUT);
		createEReference(masterCellEClass, MASTER_CELL__OUTPUT);
		createEReference(masterCellEClass, MASTER_CELL__DESIGN_CELLS);
		createEAttribute(masterCellEClass, MASTER_CELL__COUNT);
		createEAttribute(masterCellEClass, MASTER_CELL__EXTERNAL);
		createEAttribute(masterCellEClass, MASTER_CELL__INTERNAL_NAME);
		createEAttribute(masterCellEClass, MASTER_CELL__NAME);
		createEAttribute(masterCellEClass, MASTER_CELL__PINNED);

		masterDesignEClass = createEClass(MASTER_DESIGN);
		createEReference(masterDesignEClass, MASTER_DESIGN__CELL);
		createEReference(masterDesignEClass, MASTER_DESIGN__TUBE);
		createEAttribute(masterDesignEClass, MASTER_DESIGN__NAME);

		masterTubeEClass = createEClass(MASTER_TUBE);
		createEReference(masterTubeEClass, MASTER_TUBE__DESIGN_TUBES);
		createEReference(masterTubeEClass, MASTER_TUBE__FROM);
		createEAttribute(masterTubeEClass, MASTER_TUBE__INTERNAL_NAME);
		createEAttribute(masterTubeEClass, MASTER_TUBE__NAME);
		createEReference(masterTubeEClass, MASTER_TUBE__TO);
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
		FlowPackage theFlowPackage = (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(masterCellEClass, MasterCell.class, "MasterCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterCell_Input(), this.getMasterTube(), this.getMasterTube_To(), "input", null, 0, -1, MasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterCell_Output(), this.getMasterTube(), this.getMasterTube_From(), "output", null, 0, -1, MasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterCell_DesignCells(), theFlowPackage.getCell(), null, "designCells", null, 0, -1, MasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterCell_Count(), theXMLTypePackage.getInt(), "count", "1", 0, 1, MasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterCell_External(), theXMLTypePackage.getBoolean(), "external", "false", 0, 1, MasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterCell_InternalName(), theXMLTypePackage.getID(), "internalName", null, 0, 1, MasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterCell_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterCell_Pinned(), theXMLTypePackage.getBoolean(), "pinned", null, 0, 1, MasterCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterDesignEClass, MasterDesign.class, "MasterDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterDesign_Cell(), this.getMasterCell(), null, "cell", null, 0, -1, MasterDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterDesign_Tube(), this.getMasterTube(), null, "tube", null, 0, -1, MasterDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterDesign_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MasterDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterTubeEClass, MasterTube.class, "MasterTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterTube_DesignTubes(), theFlowPackage.getTube(), null, "designTubes", null, 0, -1, MasterTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterTube_From(), this.getMasterCell(), this.getMasterCell_Output(), "from", null, 0, 1, MasterTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterTube_InternalName(), theXMLTypePackage.getID(), "internalName", null, 0, 1, MasterTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterTube_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MasterTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterTube_To(), this.getMasterCell(), this.getMasterCell_Input(), "to", null, 0, 1, MasterTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (masterCellEClass, 
		   source, 
		   new String[] {
			 "name", "MasterCell",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMasterCell_Input(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "input",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMasterCell_Output(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "output",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMasterCell_DesignCells(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "designCells",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMasterCell_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (getMasterCell_External(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "external"
		   });		
		addAnnotation
		  (getMasterCell_InternalName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "internal_name"
		   });		
		addAnnotation
		  (getMasterCell_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getMasterCell_Pinned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pinned"
		   });		
		addAnnotation
		  (masterDesignEClass, 
		   source, 
		   new String[] {
			 "name", "MasterDesign",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMasterDesign_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMasterDesign_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMasterDesign_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (masterTubeEClass, 
		   source, 
		   new String[] {
			 "name", "MasterTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMasterTube_DesignTubes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "designTubes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMasterTube_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from"
		   });		
		addAnnotation
		  (getMasterTube_InternalName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "internal_name"
		   });		
		addAnnotation
		  (getMasterTube_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getMasterTube_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to"
		   });
	}

} //MasterPackageImpl
