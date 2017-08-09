/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * Copyright @2012 BrainSpeed Technolgoies
 */
package com.brainspeedtech.reg.impl;

import com.brainspeedtech.reg.RegFactory;
import com.brainspeedtech.reg.RegPackage;
import com.brainspeedtech.reg.Register;
import com.brainspeedtech.reg.RegisterInstance;

import com.brainspeedtech.reg.TypeType;
import com.brainspeedtech.struct.StructPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class RegPackageImpl extends EPackageImpl implements RegPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

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
	 * @see com.brainspeedtech.reg.RegPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RegPackageImpl() {
		super(eNS_URI, RegFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RegPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RegPackage init() {
		if (isInited) return (RegPackage)EPackage.Registry.INSTANCE.getEPackage(RegPackage.eNS_URI);

		// Obtain or create and register package
		RegPackageImpl theRegPackage = (RegPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RegPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RegPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRegPackage.createPackageContents();

		// Initialize created meta-data
		theRegPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRegPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RegPackage.eNS_URI, theRegPackage);
		return theRegPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterInstance() {
		return registerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterInstance_Location() {
		return (EAttribute)registerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterInstance_Type() {
		return (EAttribute)registerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegFactory getRegFactory() {
		return (RegFactory)getEFactoryInstance();
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
		registerEClass = createEClass(REGISTER);

		registerInstanceEClass = createEClass(REGISTER_INSTANCE);
		createEAttribute(registerInstanceEClass, REGISTER_INSTANCE__LOCATION);
		createEAttribute(registerInstanceEClass, REGISTER_INSTANCE__TYPE);

		// Create enums
		typeTypeEEnum = createEEnum(TYPE_TYPE);

		// Create data types
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
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
		StructPackage theStructPackage = (StructPackage)EPackage.Registry.INSTANCE.getEPackage(StructPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		registerEClass.getESuperTypes().add(theStructPackage.getStruct());
		registerInstanceEClass.getESuperTypes().add(theStructPackage.getField());

		// Initialize classes and features; add operations and parameters
		initEClass(registerEClass, Register.class, "Register", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registerInstanceEClass, RegisterInstance.class, "RegisterInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegisterInstance_Location(), theXMLTypePackage.getInt(), "location", null, 0, 1, RegisterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisterInstance_Type(), this.getTypeType(), "type", null, 0, 1, RegisterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.READ_WRITE);
		addEEnumLiteral(typeTypeEEnum, TypeType.READ_ONLY);
		addEEnumLiteral(typeTypeEEnum, TypeType.WRITE_ONLY);
		addEEnumLiteral(typeTypeEEnum, TypeType.RESERVED);
		addEEnumLiteral(typeTypeEEnum, TypeType.READ_CLEAR);
		addEEnumLiteral(typeTypeEEnum, TypeType.WRITE_CLEAR);
		addEEnumLiteral(typeTypeEEnum, TypeType.WRITE_LOST);
		addEEnumLiteral(typeTypeEEnum, TypeType.EXTERNAL);

		// Initialize data types
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (registerEClass, 
		   source, 
		   new String[] {
			 "name", "Register",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (registerInstanceEClass, 
		   source, 
		   new String[] {
			 "name", "RegisterInstance",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRegisterInstance_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "location"
		   });		
		addAnnotation
		  (getRegisterInstance_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (typeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "type_._type"
		   });		
		addAnnotation
		  (typeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });
	}

} //RegPackageImpl
