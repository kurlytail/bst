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
package com.brainspeedtech.constraint.software.python.impl;

import com.brainspeedtech.constraint.software.SoftwarePackage;

import com.brainspeedtech.constraint.software.python.PyPackage;
import com.brainspeedtech.constraint.software.python.PythonFactory;
import com.brainspeedtech.constraint.software.python.PythonGenerator;
import com.brainspeedtech.constraint.software.python.PythonPackage;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
public class PythonPackageImpl extends EPackageImpl implements PythonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pyPackageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pythonGeneratorEClass = null;
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
	 * @see com.brainspeedtech.constraint.software.python.PythonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PythonPackageImpl() {
		super(eNS_URI, PythonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PythonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PythonPackage init() {
		if (isInited) return (PythonPackage)EPackage.Registry.INSTANCE.getEPackage(PythonPackage.eNS_URI);

		// Obtain or create and register package
		PythonPackageImpl thePythonPackage = (PythonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PythonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PythonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SoftwarePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePythonPackage.createPackageContents();

		// Initialize created meta-data
		thePythonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePythonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PythonPackage.eNS_URI, thePythonPackage);
		return thePythonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPyPackage() {
		return pyPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPyPackage_Object() {
		return (EReference)pyPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPyPackage_Name() {
		return (EAttribute)pyPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPythonGenerator() {
		return pythonGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonFactory getPythonFactory() {
		return (PythonFactory)getEFactoryInstance();
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
		pyPackageEClass = createEClass(PY_PACKAGE);
		createEReference(pyPackageEClass, PY_PACKAGE__OBJECT);
		createEAttribute(pyPackageEClass, PY_PACKAGE__NAME);

		pythonGeneratorEClass = createEClass(PYTHON_GENERATOR);
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

		// Add supertypes to classes
		pyPackageEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		pythonGeneratorEClass.getESuperTypes().add(theLayerPackage.getNatureBase());

		// Initialize classes and features; add operations and parameters
		initEClass(pyPackageEClass, PyPackage.class, "PyPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPyPackage_Object(), ecorePackage.getEObject(), null, "object", null, 0, -1, PyPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPyPackage_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PyPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pythonGeneratorEClass, PythonGenerator.class, "PythonGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (pyPackageEClass, 
		   source, 
		   new String[] {
			 "name", "PyPackage",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPyPackage_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPyPackage_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (pythonGeneratorEClass, 
		   source, 
		   new String[] {
			 "name", "PythonGenerator",
			 "kind", "empty"
		   });
	}

} //PythonPackageImpl
