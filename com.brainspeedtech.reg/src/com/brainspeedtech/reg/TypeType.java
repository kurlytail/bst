/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * Copyright @2012 BrainSpeed Technolgoies
 */
package com.brainspeedtech.reg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.reg.RegPackage#getTypeType()
 * @model extendedMetaData="name='type_._type'"
 * @generated
 */
public enum TypeType implements Enumerator {
	/**
	 * The '<em><b>Read Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE(0, "readWrite", "read write"),

	/**
	 * The '<em><b>Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONLY(1, "readOnly", "read only"),

	/**
	 * The '<em><b>Write Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_ONLY(2, "writeOnly", "write only"),

	/**
	 * The '<em><b>Reserved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVED(3, "reserved", "reserved"),

	/**
	 * The '<em><b>Read Clear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_CLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	READ_CLEAR(4, "readClear", "read clear"),

	/**
	 * The '<em><b>Write Clear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_CLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_CLEAR(5, "writeClear", "write clear"),

	/**
	 * The '<em><b>Write Lost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_LOST_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_LOST(6, "writeLost", "write lost"),

	/**
	 * The '<em><b>External</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL(7, "external", "external");

	/**
	 * The '<em><b>Read Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE
	 * @model name="readWrite" literal="read write"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_VALUE = 0;

	/**
	 * The '<em><b>Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @model name="readOnly" literal="read only"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY_VALUE = 1;

	/**
	 * The '<em><b>Write Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY
	 * @model name="writeOnly" literal="write only"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ONLY_VALUE = 2;

	/**
	 * The '<em><b>Reserved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reserved</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESERVED
	 * @model name="reserved"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVED_VALUE = 3;

	/**
	 * The '<em><b>Read Clear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Clear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_CLEAR
	 * @model name="readClear" literal="read clear"
	 * @generated
	 * @ordered
	 */
	public static final int READ_CLEAR_VALUE = 4;

	/**
	 * The '<em><b>Write Clear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Clear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_CLEAR
	 * @model name="writeClear" literal="write clear"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_CLEAR_VALUE = 5;

	/**
	 * The '<em><b>Write Lost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Lost</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_LOST
	 * @model name="writeLost" literal="write lost"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_LOST_VALUE = 6;

	/**
	 * The '<em><b>External</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>External</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL
	 * @model name="external"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType[] VALUES_ARRAY =
		new TypeType[] {
			READ_WRITE,
			READ_ONLY,
			WRITE_ONLY,
			RESERVED,
			READ_CLEAR,
			WRITE_CLEAR,
			WRITE_LOST,
			EXTERNAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType get(int value) {
		switch (value) {
			case READ_WRITE_VALUE: return READ_WRITE;
			case READ_ONLY_VALUE: return READ_ONLY;
			case WRITE_ONLY_VALUE: return WRITE_ONLY;
			case RESERVED_VALUE: return RESERVED;
			case READ_CLEAR_VALUE: return READ_CLEAR;
			case WRITE_CLEAR_VALUE: return WRITE_CLEAR;
			case WRITE_LOST_VALUE: return WRITE_LOST;
			case EXTERNAL_VALUE: return EXTERNAL;
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
	private TypeType(int value, String name, String literal) {
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
	
} //TypeType
