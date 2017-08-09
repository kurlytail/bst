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
package com.brainspeedtech.constraint.software;

import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.layer.ConstraintBase;

import com.brainspeedtech.swarm.master.MasterDesign;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Size Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.StructSizeLimit#getStructure <em>Structure</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.StructSizeLimit#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getStructSizeLimit()
 * @model extendedMetaData="name='StructSizeLimit' kind='elementOnly'"
 * @generated
 */
public interface StructSizeLimit extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.struct.Struct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getStructSizeLimit_Structure()
	 * @model extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Struct> getStructure();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #isSetLimit()
	 * @see #unsetLimit()
	 * @see #setLimit(long)
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getStructSizeLimit_Limit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='limit'"
	 * @generated
	 */
	long getLimit();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.StructSizeLimit#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #isSetLimit()
	 * @see #unsetLimit()
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(long value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.software.StructSizeLimit#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLimit()
	 * @see #getLimit()
	 * @see #setLimit(long)
	 * @generated
	 */
	void unsetLimit();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.software.StructSizeLimit#getLimit <em>Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Limit</em>' attribute is set.
	 * @see #unsetLimit()
	 * @see #getLimit()
	 * @see #setLimit(long)
	 * @generated
	 */
	boolean isSetLimit();

} // StructSizeLimit
