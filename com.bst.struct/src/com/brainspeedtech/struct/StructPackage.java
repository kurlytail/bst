/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.struct;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.struct.StructFactory
 * @model kind="package"
 * @generated
 */
public interface StructPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "struct";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/struct";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "struct";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructPackage eINSTANCE = com.brainspeedtech.struct.impl.StructPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.impl.AtomImpl
	 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 0;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ATOM = 0;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__BLURB = 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__NAME = 3;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.impl.DocumentImpl
	 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STRUCT = 0;

	/**
	 * The feature id for the '<em><b>Ghost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__GHOST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.impl.EnumImpl
	 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 2;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ATOM = ATOM__ATOM;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__BLURB = ATOM__BLURB;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__COUNT = ATOM__COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = ATOM__NAME;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TERM = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.impl.EnumTermImpl <em>Enum Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.impl.EnumTermImpl
	 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getEnumTerm()
	 * @generated
	 */
	int ENUM_TERM = 3;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TERM__BLURB = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TERM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TERM__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Enum Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TERM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.impl.FieldImpl
	 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 4;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ATOM = 0;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BLURB = 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 3;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.impl.PathImpl
	 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 5;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__CHILD = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FIELD = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__RANGE = 3;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.struct.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.struct.impl.StructImpl
	 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 6;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__ATOM = ATOM__ATOM;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__BLURB = ATOM__BLURB;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__COUNT = ATOM__COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__NAME = ATOM__NAME;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__FIELD = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see com.brainspeedtech.struct.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.struct.Atom#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atom</em>'.
	 * @see com.brainspeedtech.struct.Atom#getAtom()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Atom();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Atom#getBlurb <em>Blurb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blurb</em>'.
	 * @see com.brainspeedtech.struct.Atom#getBlurb()
	 * @see #getAtom()
	 * @generated
	 */
	EAttribute getAtom_Blurb();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Atom#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.struct.Atom#getCount()
	 * @see #getAtom()
	 * @generated
	 */
	EAttribute getAtom_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Atom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.struct.Atom#getName()
	 * @see #getAtom()
	 * @generated
	 */
	EAttribute getAtom_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see com.brainspeedtech.struct.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.struct.Document#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see com.brainspeedtech.struct.Document#getStruct()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Struct();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Document#isGhost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ghost</em>'.
	 * @see com.brainspeedtech.struct.Document#isGhost()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Ghost();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.struct.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see com.brainspeedtech.struct.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.struct.Enum#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see com.brainspeedtech.struct.Enum#getTerm()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Term();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.EnumTerm <em>Enum Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Term</em>'.
	 * @see com.brainspeedtech.struct.EnumTerm
	 * @generated
	 */
	EClass getEnumTerm();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.EnumTerm#getBlurb <em>Blurb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blurb</em>'.
	 * @see com.brainspeedtech.struct.EnumTerm#getBlurb()
	 * @see #getEnumTerm()
	 * @generated
	 */
	EAttribute getEnumTerm_Blurb();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.EnumTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.struct.EnumTerm#getName()
	 * @see #getEnumTerm()
	 * @generated
	 */
	EAttribute getEnumTerm_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.EnumTerm#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.brainspeedtech.struct.EnumTerm#getValue()
	 * @see #getEnumTerm()
	 * @generated
	 */
	EAttribute getEnumTerm_Value();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see com.brainspeedtech.struct.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.struct.Field#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atom</em>'.
	 * @see com.brainspeedtech.struct.Field#getAtom()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Atom();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Field#getBlurb <em>Blurb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blurb</em>'.
	 * @see com.brainspeedtech.struct.Field#getBlurb()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Blurb();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Field#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.struct.Field#getCount()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.struct.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see com.brainspeedtech.struct.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference '{@link com.brainspeedtech.struct.Path#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see com.brainspeedtech.struct.Path#getChild()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Child();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.struct.Path#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see com.brainspeedtech.struct.Path#getField()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Field();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Path#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.brainspeedtech.struct.Path#getIndex()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Index();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.struct.Path#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see com.brainspeedtech.struct.Path#getRange()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Range();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.struct.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see com.brainspeedtech.struct.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.struct.Struct#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see com.brainspeedtech.struct.Struct#getField()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Field();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructFactory getStructFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.brainspeedtech.struct.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.impl.AtomImpl
		 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__ATOM = eINSTANCE.getAtom_Atom();

		/**
		 * The meta object literal for the '<em><b>Blurb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__BLURB = eINSTANCE.getAtom_Blurb();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__COUNT = eINSTANCE.getAtom_Count();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__NAME = eINSTANCE.getAtom_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.struct.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.impl.DocumentImpl
		 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__STRUCT = eINSTANCE.getDocument_Struct();

		/**
		 * The meta object literal for the '<em><b>Ghost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__GHOST = eINSTANCE.getDocument_Ghost();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.struct.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.impl.EnumImpl
		 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__TERM = eINSTANCE.getEnum_Term();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.struct.impl.EnumTermImpl <em>Enum Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.impl.EnumTermImpl
		 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getEnumTerm()
		 * @generated
		 */
		EClass ENUM_TERM = eINSTANCE.getEnumTerm();

		/**
		 * The meta object literal for the '<em><b>Blurb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_TERM__BLURB = eINSTANCE.getEnumTerm_Blurb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_TERM__NAME = eINSTANCE.getEnumTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_TERM__VALUE = eINSTANCE.getEnumTerm_Value();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.struct.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.impl.FieldImpl
		 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__ATOM = eINSTANCE.getField_Atom();

		/**
		 * The meta object literal for the '<em><b>Blurb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__BLURB = eINSTANCE.getField_Blurb();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__COUNT = eINSTANCE.getField_Count();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.struct.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.impl.PathImpl
		 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__CHILD = eINSTANCE.getPath_Child();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__FIELD = eINSTANCE.getPath_Field();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__INDEX = eINSTANCE.getPath_Index();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__RANGE = eINSTANCE.getPath_Range();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.struct.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.struct.impl.StructImpl
		 * @see com.brainspeedtech.struct.impl.StructPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__FIELD = eINSTANCE.getStruct_Field();

	}

} //StructPackage
