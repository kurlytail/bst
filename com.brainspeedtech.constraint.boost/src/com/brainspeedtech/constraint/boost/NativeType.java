/**
 * <copyright>
 * Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.boost;

import com.brainspeedtech.struct.Atom;
import com.brainspeedtech.swarm.layer.ConstraintBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.boost.NativeType#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.boost.BoostPackage#getNativeType()
 * @model extendedMetaData="name='NativeType' kind='elementOnly'"
 * @generated
 */
public interface NativeType extends ConstraintBase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright @2011-2013 BrainSpeed Technologies - All rights reserved";

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.struct.Atom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference list.
	 * @see com.brainspeedtech.constraint.boost.BoostPackage#getNativeType_Object()
	 * @model extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Atom> getObject();

} // NativeType
