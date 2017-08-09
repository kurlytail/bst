/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.struct;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.Enum#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.struct.StructPackage#getEnum()
 * @model extendedMetaData="name='Enum' kind='elementOnly'"
 * @generated
 */
public interface Enum extends Atom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link com.brainspeedtech.struct.EnumTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see com.brainspeedtech.struct.StructPackage#getEnum_Term()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumTerm> getTerm();

} // Enum
