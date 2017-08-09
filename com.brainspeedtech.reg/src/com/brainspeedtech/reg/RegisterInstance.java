/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * Copyright @2012 BrainSpeed Technolgoies
 */
package com.brainspeedtech.reg;

import com.brainspeedtech.struct.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.reg.RegisterInstance#getLocation <em>Location</em>}</li>
 *   <li>{@link com.brainspeedtech.reg.RegisterInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.reg.RegPackage#getRegisterInstance()
 * @model extendedMetaData="name='RegisterInstance' kind='empty'"
 * @generated
 */
public interface RegisterInstance extends Field {

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #setLocation(int)
	 * @see com.brainspeedtech.reg.RegPackage#getRegisterInstance_Location()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='location'"
	 * @generated
	 */
	int getLocation();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.reg.RegisterInstance#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.reg.RegisterInstance#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocation()
	 * @see #getLocation()
	 * @see #setLocation(int)
	 * @generated
	 */
	void unsetLocation();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.reg.RegisterInstance#getLocation <em>Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location</em>' attribute is set.
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @see #setLocation(int)
	 * @generated
	 */
	boolean isSetLocation();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.brainspeedtech.reg.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.brainspeedtech.reg.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see com.brainspeedtech.reg.RegPackage#getRegisterInstance_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.reg.RegisterInstance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.brainspeedtech.reg.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.reg.RegisterInstance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.reg.RegisterInstance#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();
} // RegisterInstance
