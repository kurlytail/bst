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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructFactoryImpl extends EFactoryImpl implements StructFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructFactory init() {
		try {
			StructFactory theStructFactory = (StructFactory)EPackage.Registry.INSTANCE.getEFactory(StructPackage.eNS_URI);
			if (theStructFactory != null) {
				return theStructFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructPackage.ATOM: return createAtom();
			case StructPackage.DOCUMENT: return createDocument();
			case StructPackage.ENUM: return createEnum();
			case StructPackage.ENUM_TERM: return createEnumTerm();
			case StructPackage.FIELD: return createField();
			case StructPackage.PATH: return createPath();
			case StructPackage.STRUCT: return createStruct();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.brainspeedtech.struct.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTerm createEnumTerm() {
		EnumTermImpl enumTerm = new EnumTermImpl();
		return enumTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructPackage getStructPackage() {
		return (StructPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructPackage getPackage() {
		return StructPackage.eINSTANCE;
	}

} //StructFactoryImpl
