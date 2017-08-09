/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.struct.impl;

import com.brainspeedtech.struct.Atom;
import com.brainspeedtech.struct.Document;
import com.brainspeedtech.struct.EnumTerm;
import com.brainspeedtech.struct.Field;
import com.brainspeedtech.struct.Path;
import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.struct.StructFactory;
import com.brainspeedtech.struct.StructPackage;

import com.brainspeedtech.struct.util.StructValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructPackageImpl extends EPackageImpl implements StructPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;

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
	 * @see com.brainspeedtech.struct.StructPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructPackageImpl() {
		super(eNS_URI, StructFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructPackage init() {
		if (isInited) return (StructPackage)EPackage.Registry.INSTANCE.getEPackage(StructPackage.eNS_URI);

		// Obtain or create and register package
		StructPackageImpl theStructPackage = (StructPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStructPackage.createPackageContents();

		// Initialize created meta-data
		theStructPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructPackage.eNS_URI, theStructPackage);
		return theStructPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtom() {
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtom_Atom() {
		return (EReference)atomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtom_Blurb() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtom_Count() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtom_Name() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Struct() {
		return (EReference)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Ghost() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Name() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnum_Term() {
		return (EReference)enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumTerm() {
		return enumTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumTerm_Blurb() {
		return (EAttribute)enumTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumTerm_Name() {
		return (EAttribute)enumTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumTerm_Value() {
		return (EAttribute)enumTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Atom() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Blurb() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Count() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Child() {
		return (EReference)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Field() {
		return (EReference)pathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Index() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Range() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStruct_Field() {
		return (EReference)structEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructFactory getStructFactory() {
		return (StructFactory)getEFactoryInstance();
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
		atomEClass = createEClass(ATOM);
		createEReference(atomEClass, ATOM__ATOM);
		createEAttribute(atomEClass, ATOM__BLURB);
		createEAttribute(atomEClass, ATOM__COUNT);
		createEAttribute(atomEClass, ATOM__NAME);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__STRUCT);
		createEAttribute(documentEClass, DOCUMENT__GHOST);
		createEAttribute(documentEClass, DOCUMENT__NAME);

		enumEClass = createEClass(ENUM);
		createEReference(enumEClass, ENUM__TERM);

		enumTermEClass = createEClass(ENUM_TERM);
		createEAttribute(enumTermEClass, ENUM_TERM__BLURB);
		createEAttribute(enumTermEClass, ENUM_TERM__NAME);
		createEAttribute(enumTermEClass, ENUM_TERM__VALUE);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__ATOM);
		createEAttribute(fieldEClass, FIELD__BLURB);
		createEAttribute(fieldEClass, FIELD__COUNT);
		createEAttribute(fieldEClass, FIELD__NAME);

		pathEClass = createEClass(PATH);
		createEReference(pathEClass, PATH__CHILD);
		createEReference(pathEClass, PATH__FIELD);
		createEAttribute(pathEClass, PATH__INDEX);
		createEAttribute(pathEClass, PATH__RANGE);

		structEClass = createEClass(STRUCT);
		createEReference(structEClass, STRUCT__FIELD);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enumEClass.getESuperTypes().add(this.getAtom());
		structEClass.getESuperTypes().add(this.getAtom());

		// Initialize classes and features; add operations and parameters
		initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtom_Atom(), this.getAtom(), null, "atom", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtom_Blurb(), theXMLTypePackage.getString(), "blurb", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtom_Count(), theXMLTypePackage.getLong(), "count", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtom_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Struct(), this.getAtom(), null, "struct", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Ghost(), theXMLTypePackage.getBoolean(), "ghost", "false", 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, com.brainspeedtech.struct.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnum_Term(), this.getEnumTerm(), null, "term", null, 1, -1, com.brainspeedtech.struct.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumTermEClass, EnumTerm.class, "EnumTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumTerm_Blurb(), theXMLTypePackage.getString(), "blurb", null, 0, 1, EnumTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumTerm_Name(), theXMLTypePackage.getString(), "name", "ENUMERATION_NAME...", 0, 1, EnumTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumTerm_Value(), theXMLTypePackage.getString(), "value", "0", 0, 1, EnumTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Atom(), this.getAtom(), null, "atom", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Blurb(), theXMLTypePackage.getString(), "blurb", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Count(), theXMLTypePackage.getLong(), "count", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPath_Child(), this.getPath(), null, "child", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Field(), this.getField(), null, "field", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_Index(), theXMLTypePackage.getLong(), "index", "0", 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_Range(), theXMLTypePackage.getLong(), "range", "0", 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStruct_Field(), this.getField(), null, "field", null, 1, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (atomEClass, 
		   source, 
		   new String[] {
			 "name", "Atom",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAtom_Atom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "atom"
		   });		
		addAnnotation
		  (getAtom_Blurb(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "blurb"
		   });		
		addAnnotation
		  (getAtom_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (getAtom_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (documentEClass, 
		   source, 
		   new String[] {
			 "name", "Document",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocument_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocument_Ghost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ghost"
		   });		
		addAnnotation
		  (getDocument_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (enumEClass, 
		   source, 
		   new String[] {
			 "name", "Enum",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEnum_Term(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "term",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (enumTermEClass, 
		   source, 
		   new String[] {
			 "name", "EnumTerm",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEnumTerm_Blurb(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "blurb"
		   });		
		addAnnotation
		  (getEnumTerm_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getEnumTerm_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (fieldEClass, 
		   source, 
		   new String[] {
			 "name", "Field",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getField_Atom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "atom"
		   });		
		addAnnotation
		  (getField_Blurb(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "blurb"
		   });		
		addAnnotation
		  (getField_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (getField_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (pathEClass, 
		   source, 
		   new String[] {
			 "name", "Path",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPath_Child(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "child",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPath_Field(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "field"
		   });		
		addAnnotation
		  (getPath_Index(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "index"
		   });		
		addAnnotation
		  (getPath_Range(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "range"
		   });		
		addAnnotation
		  (structEClass, 
		   source, 
		   new String[] {
			 "name", "Struct",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStruct_Field(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "field",
			 "namespace", "##targetNamespace"
		   });
	}

} //StructPackageImpl
