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
package com.brainspeedtech.swarm.layer.complexity.impl;

import com.brainspeedtech.swarm.layer.LayerPackage;

import com.brainspeedtech.swarm.layer.complexity.ComplexityFactory;
import com.brainspeedtech.swarm.layer.complexity.ComplexityPackage;
import com.brainspeedtech.swarm.layer.complexity.ContainerConstraint;
import com.brainspeedtech.swarm.layer.complexity.InstanceConstraint;
import com.brainspeedtech.swarm.layer.complexity.SpaceComplexity;
import com.brainspeedtech.swarm.layer.complexity.TimeComplexity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexityPackageImpl extends EPackageImpl implements ComplexityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceComplexityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeComplexityEClass = null;

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
	 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComplexityPackageImpl() {
		super(eNS_URI, ComplexityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComplexityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComplexityPackage init() {
		if (isInited) return (ComplexityPackage)EPackage.Registry.INSTANCE.getEPackage(ComplexityPackage.eNS_URI);

		// Obtain or create and register package
		ComplexityPackageImpl theComplexityPackage = (ComplexityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComplexityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComplexityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LayerPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComplexityPackage.createPackageContents();

		// Initialize created meta-data
		theComplexityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComplexityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComplexityPackage.eNS_URI, theComplexityPackage);
		return theComplexityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerConstraint() {
		return containerConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerConstraint_Object() {
		return (EAttribute)containerConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerConstraint_Name() {
		return (EAttribute)containerConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceConstraint() {
		return instanceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceConstraint_Object() {
		return (EAttribute)instanceConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceConstraint_Count() {
		return (EAttribute)instanceConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpaceComplexity() {
		return spaceComplexityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpaceComplexity_Object() {
		return (EAttribute)spaceComplexityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpaceComplexity_Units() {
		return (EAttribute)spaceComplexityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeComplexity() {
		return timeComplexityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeComplexity_Object() {
		return (EAttribute)timeComplexityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeComplexity_Units() {
		return (EAttribute)timeComplexityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexityFactory getComplexityFactory() {
		return (ComplexityFactory)getEFactoryInstance();
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
		containerConstraintEClass = createEClass(CONTAINER_CONSTRAINT);
		createEAttribute(containerConstraintEClass, CONTAINER_CONSTRAINT__OBJECT);
		createEAttribute(containerConstraintEClass, CONTAINER_CONSTRAINT__NAME);

		instanceConstraintEClass = createEClass(INSTANCE_CONSTRAINT);
		createEAttribute(instanceConstraintEClass, INSTANCE_CONSTRAINT__OBJECT);
		createEAttribute(instanceConstraintEClass, INSTANCE_CONSTRAINT__COUNT);

		spaceComplexityEClass = createEClass(SPACE_COMPLEXITY);
		createEAttribute(spaceComplexityEClass, SPACE_COMPLEXITY__OBJECT);
		createEAttribute(spaceComplexityEClass, SPACE_COMPLEXITY__UNITS);

		timeComplexityEClass = createEClass(TIME_COMPLEXITY);
		createEAttribute(timeComplexityEClass, TIME_COMPLEXITY__OBJECT);
		createEAttribute(timeComplexityEClass, TIME_COMPLEXITY__UNITS);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerConstraintEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		instanceConstraintEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		spaceComplexityEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		timeComplexityEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());

		// Initialize classes and features; add operations and parameters
		initEClass(containerConstraintEClass, ContainerConstraint.class, "ContainerConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerConstraint_Object(), theXMLTypePackage.getAnyURI(), "object", null, 0, -1, ContainerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerConstraint_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ContainerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceConstraintEClass, InstanceConstraint.class, "InstanceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceConstraint_Object(), theXMLTypePackage.getAnyURI(), "object", null, 0, -1, InstanceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceConstraint_Count(), theXMLTypePackage.getInt(), "count", null, 0, 1, InstanceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spaceComplexityEClass, SpaceComplexity.class, "SpaceComplexity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpaceComplexity_Object(), theXMLTypePackage.getAnyURI(), "object", null, 0, -1, SpaceComplexity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpaceComplexity_Units(), theXMLTypePackage.getFloat(), "units", null, 0, 1, SpaceComplexity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeComplexityEClass, TimeComplexity.class, "TimeComplexity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeComplexity_Object(), theXMLTypePackage.getAnyURI(), "object", null, 0, -1, TimeComplexity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeComplexity_Units(), theXMLTypePackage.getFloat(), "units", null, 0, 1, TimeComplexity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (containerConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "ContainerConstraint",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainerConstraint_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getContainerConstraint_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (instanceConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "InstanceConstraint",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInstanceConstraint_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInstanceConstraint_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (spaceComplexityEClass, 
		   source, 
		   new String[] {
			 "name", "SpaceComplexity",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpaceComplexity_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpaceComplexity_Units(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "units"
		   });		
		addAnnotation
		  (timeComplexityEClass, 
		   source, 
		   new String[] {
			 "name", "TimeComplexity",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTimeComplexity_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeComplexity_Units(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "units"
		   });
	}

} //ComplexityPackageImpl
