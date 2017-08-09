/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * Copyright @2012 BrainSpeed Technolgoies
 */
package com.brainspeedtech.reg;

import com.brainspeedtech.struct.StructPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.brainspeedtech.reg.RegFactory
 * @model kind="package"
 * @generated
 */
public interface RegPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/reg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegPackage eINSTANCE = com.brainspeedtech.reg.impl.RegPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.reg.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.reg.impl.RegisterImpl
	 * @see com.brainspeedtech.reg.impl.RegPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 0;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__ATOM = StructPackage.STRUCT__ATOM;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__BLURB = StructPackage.STRUCT__BLURB;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__COUNT = StructPackage.STRUCT__COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__NAME = StructPackage.STRUCT__NAME;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__FIELD = StructPackage.STRUCT__FIELD;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = StructPackage.STRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.reg.impl.RegisterInstanceImpl <em>Register Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.reg.impl.RegisterInstanceImpl
	 * @see com.brainspeedtech.reg.impl.RegPackageImpl#getRegisterInstance()
	 * @generated
	 */
	int REGISTER_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INSTANCE__ATOM = StructPackage.FIELD__ATOM;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INSTANCE__BLURB = StructPackage.FIELD__BLURB;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INSTANCE__COUNT = StructPackage.FIELD__COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INSTANCE__NAME = StructPackage.FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INSTANCE__LOCATION = StructPackage.FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INSTANCE__TYPE = StructPackage.FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Register Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INSTANCE_FEATURE_COUNT = StructPackage.FIELD_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link com.brainspeedtech.reg.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.reg.TypeType
	 * @see com.brainspeedtech.reg.impl.RegPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 2;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.reg.TypeType
	 * @see com.brainspeedtech.reg.impl.RegPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 3;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.reg.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see com.brainspeedtech.reg.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.reg.RegisterInstance <em>Register Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Instance</em>'.
	 * @see com.brainspeedtech.reg.RegisterInstance
	 * @generated
	 */
	EClass getRegisterInstance();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.reg.RegisterInstance#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see com.brainspeedtech.reg.RegisterInstance#getLocation()
	 * @see #getRegisterInstance()
	 * @generated
	 */
	EAttribute getRegisterInstance_Location();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.reg.RegisterInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.brainspeedtech.reg.RegisterInstance#getType()
	 * @see #getRegisterInstance()
	 * @generated
	 */
	EAttribute getRegisterInstance_Type();

	/**
	 * Returns the meta object for enum '{@link com.brainspeedtech.reg.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see com.brainspeedtech.reg.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for data type '{@link com.brainspeedtech.reg.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see com.brainspeedtech.reg.TypeType
	 * @model instanceClass="com.brainspeedtech.reg.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegFactory getRegFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.reg.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.reg.impl.RegisterImpl
		 * @see com.brainspeedtech.reg.impl.RegPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.reg.impl.RegisterInstanceImpl <em>Register Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.reg.impl.RegisterInstanceImpl
		 * @see com.brainspeedtech.reg.impl.RegPackageImpl#getRegisterInstance()
		 * @generated
		 */
		EClass REGISTER_INSTANCE = eINSTANCE.getRegisterInstance();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER_INSTANCE__LOCATION = eINSTANCE.getRegisterInstance_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER_INSTANCE__TYPE = eINSTANCE.getRegisterInstance_Type();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.reg.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.reg.TypeType
		 * @see com.brainspeedtech.reg.impl.RegPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.reg.TypeType
		 * @see com.brainspeedtech.reg.impl.RegPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

	}

} //RegPackage
