/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.opencl.impl;

import com.brainspeedtech.constraint.software.SoftwarePackage;

import com.brainspeedtech.constraint.software.opencl.CustomOpenCLTube;
import com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube;
import com.brainspeedtech.constraint.software.opencl.OpenCLGenerator;
import com.brainspeedtech.constraint.software.opencl.OpenclFactory;
import com.brainspeedtech.constraint.software.opencl.OpenclPackage;

import com.brainspeedtech.swarm.layer.LayerPackage;

import com.brainspeedtech.swarm.master.MasterPackage;

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
public class OpenclPackageImpl extends EPackageImpl implements OpenclPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customOpenCLTubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreOpenCLTubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openCLGeneratorEClass = null;

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
	 * @see com.brainspeedtech.constraint.software.opencl.OpenclPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenclPackageImpl() {
		super(eNS_URI, OpenclFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenclPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenclPackage init() {
		if (isInited) return (OpenclPackage)EPackage.Registry.INSTANCE.getEPackage(OpenclPackage.eNS_URI);

		// Obtain or create and register package
		OpenclPackageImpl theOpenclPackage = (OpenclPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpenclPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpenclPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SoftwarePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenclPackage.createPackageContents();

		// Initialize created meta-data
		theOpenclPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenclPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenclPackage.eNS_URI, theOpenclPackage);
		return theOpenclPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomOpenCLTube() {
		return customOpenCLTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomOpenCLTube_Tube() {
		return (EReference)customOpenCLTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnoreOpenCLTube() {
		return ignoreOpenCLTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgnoreOpenCLTube_Tube() {
		return (EReference)ignoreOpenCLTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenCLGenerator() {
		return openCLGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenclFactory getOpenclFactory() {
		return (OpenclFactory)getEFactoryInstance();
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
		customOpenCLTubeEClass = createEClass(CUSTOM_OPEN_CL_TUBE);
		createEReference(customOpenCLTubeEClass, CUSTOM_OPEN_CL_TUBE__TUBE);

		ignoreOpenCLTubeEClass = createEClass(IGNORE_OPEN_CL_TUBE);
		createEReference(ignoreOpenCLTubeEClass, IGNORE_OPEN_CL_TUBE__TUBE);

		openCLGeneratorEClass = createEClass(OPEN_CL_GENERATOR);
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

		// Add supertypes to classes
		customOpenCLTubeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		ignoreOpenCLTubeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		openCLGeneratorEClass.getESuperTypes().add(theLayerPackage.getNatureBase());

		// Initialize classes and features; add operations and parameters
		initEClass(customOpenCLTubeEClass, CustomOpenCLTube.class, "CustomOpenCLTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomOpenCLTube_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, CustomOpenCLTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ignoreOpenCLTubeEClass, IgnoreOpenCLTube.class, "IgnoreOpenCLTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIgnoreOpenCLTube_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, IgnoreOpenCLTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openCLGeneratorEClass, OpenCLGenerator.class, "OpenCLGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (customOpenCLTubeEClass, 
		   source, 
		   new String[] {
			 "name", "CustomOpenCLTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCustomOpenCLTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (ignoreOpenCLTubeEClass, 
		   source, 
		   new String[] {
			 "name", "IgnoreOpenCLTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIgnoreOpenCLTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (openCLGeneratorEClass, 
		   source, 
		   new String[] {
			 "name", "OpenCLGenerator",
			 "kind", "empty"
		   });
	}

} //OpenclPackageImpl
