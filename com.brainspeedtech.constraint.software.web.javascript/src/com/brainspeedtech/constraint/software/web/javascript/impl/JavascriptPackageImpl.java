/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.web.javascript.impl;

import com.brainspeedtech.constraint.software.web.javascript.JavascriptFactory;
import com.brainspeedtech.constraint.software.web.javascript.JavascriptGeneration;
import com.brainspeedtech.constraint.software.web.javascript.JavascriptPackage;

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
public class JavascriptPackageImpl extends EPackageImpl implements JavascriptPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javascriptGenerationEClass = null;

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
	 * @see com.brainspeedtech.constraint.software.web.javascript.JavascriptPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavascriptPackageImpl() {
		super(eNS_URI, JavascriptFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JavascriptPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavascriptPackage init() {
		if (isInited) return (JavascriptPackage)EPackage.Registry.INSTANCE.getEPackage(JavascriptPackage.eNS_URI);

		// Obtain or create and register package
		JavascriptPackageImpl theJavascriptPackage = (JavascriptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavascriptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavascriptPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LayerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJavascriptPackage.createPackageContents();

		// Initialize created meta-data
		theJavascriptPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavascriptPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavascriptPackage.eNS_URI, theJavascriptPackage);
		return theJavascriptPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavascriptGeneration() {
		return javascriptGenerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavascriptFactory getJavascriptFactory() {
		return (JavascriptFactory)getEFactoryInstance();
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
		javascriptGenerationEClass = createEClass(JAVASCRIPT_GENERATION);
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
		javascriptGenerationEClass.getESuperTypes().add(theLayerPackage.getNatureBase());

		// Initialize classes and features; add operations and parameters
		initEClass(javascriptGenerationEClass, JavascriptGeneration.class, "JavascriptGeneration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (javascriptGenerationEClass, 
		   source, 
		   new String[] {
			 "name", "JavascriptGeneration",
			 "kind", "empty"
		   });
	}

} //JavascriptPackageImpl
