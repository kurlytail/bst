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
package com.brainspeedtech.constraint.web.html.impl;

import com.brainspeedtech.constraint.web.html.HtmlFactory;
import com.brainspeedtech.constraint.web.html.HtmlGeneration;
import com.brainspeedtech.constraint.web.html.HtmlPackage;

import com.brainspeedtech.constraint.web.html.IndexPage;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmlPackageImpl extends EPackageImpl implements HtmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlGenerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexPageEClass = null;

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
	 * @see com.brainspeedtech.constraint.web.html.HtmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HtmlPackageImpl() {
		super(eNS_URI, HtmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HtmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HtmlPackage init() {
		if (isInited) return (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Obtain or create and register package
		HtmlPackageImpl theHtmlPackage = (HtmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HtmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HtmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LayerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHtmlPackage.createPackageContents();

		// Initialize created meta-data
		theHtmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHtmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HtmlPackage.eNS_URI, theHtmlPackage);
		return theHtmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHtmlGeneration() {
		return htmlGenerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexPage() {
		return indexPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexPage_Instance() {
		return (EReference)indexPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlFactory getHtmlFactory() {
		return (HtmlFactory)getEFactoryInstance();
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
		htmlGenerationEClass = createEClass(HTML_GENERATION);

		indexPageEClass = createEClass(INDEX_PAGE);
		createEReference(indexPageEClass, INDEX_PAGE__INSTANCE);
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
		InstPackage theInstPackage = (InstPackage)EPackage.Registry.INSTANCE.getEPackage(InstPackage.eNS_URI);

		// Add supertypes to classes
		htmlGenerationEClass.getESuperTypes().add(theLayerPackage.getNatureBase());
		indexPageEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());

		// Initialize classes and features; add operations and parameters
		initEClass(htmlGenerationEClass, HtmlGeneration.class, "HtmlGeneration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexPageEClass, IndexPage.class, "IndexPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexPage_Instance(), theInstPackage.getCellInstance(), null, "instance", null, 1, 1, IndexPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (htmlGenerationEClass, 
		   source, 
		   new String[] {
			 "name", "HtmlGeneration",
			 "kind", "empty"
		   });		
		addAnnotation
		  (indexPageEClass, 
		   source, 
		   new String[] {
			 "name", "IndexPage",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIndexPage_Instance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instance",
			 "namespace", "##targetNamespace"
		   });
	}

} //HtmlPackageImpl
