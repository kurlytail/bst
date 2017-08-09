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
package com.brainspeedtech.swarm.layer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Width Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getWidthType()
 * @model extendedMetaData="name='width_._type'"
 * @generated
 */
public enum WidthType implements Enumerator {
	/**
	 * The '<em><b>16bit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_16BIT_VALUE
	 * @generated
	 * @ordered
	 */
	_16BIT(0, "_16bit", "16bit"),

	/**
	 * The '<em><b>32bit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_32BIT_VALUE
	 * @generated
	 * @ordered
	 */
	_32BIT(1, "_32bit", "32bit"),

	/**
	 * The '<em><b>64bit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_64BIT_VALUE
	 * @generated
	 * @ordered
	 */
	_64BIT(2, "_64bit", "64bit");

	/**
	 * The '<em><b>16bit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>16bit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_16BIT
	 * @model name="_16bit" literal="16bit"
	 * @generated
	 * @ordered
	 */
	public static final int _16BIT_VALUE = 0;

	/**
	 * The '<em><b>32bit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>32bit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_32BIT
	 * @model name="_32bit" literal="32bit"
	 * @generated
	 * @ordered
	 */
	public static final int _32BIT_VALUE = 1;

	/**
	 * The '<em><b>64bit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>64bit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_64BIT
	 * @model name="_64bit" literal="64bit"
	 * @generated
	 * @ordered
	 */
	public static final int _64BIT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Width Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WidthType[] VALUES_ARRAY =
		new WidthType[] {
			_16BIT,
			_32BIT,
			_64BIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Width Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WidthType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Width Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WidthType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WidthType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Width Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WidthType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WidthType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Width Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WidthType get(int value) {
		switch (value) {
			case _16BIT_VALUE: return _16BIT;
			case _32BIT_VALUE: return _32BIT;
			case _64BIT_VALUE: return _64BIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WidthType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //WidthType
