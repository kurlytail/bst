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
package com.brainspeedtech.swarm.layer.complexity;

import com.brainspeedtech.swarm.layer.ConstraintBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getObject <em>Object</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityPackage#getInstanceConstraint()
 * @model extendedMetaData="name='InstanceConstraint' kind='elementOnly'"
 * @generated
 */
public interface InstanceConstraint extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute list.
	 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityPackage#getInstanceConstraint_Object()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getObject();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #setCount(int)
	 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityPackage#getInstanceConstraint_Count()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getCount <em>Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count</em>' attribute is set.
	 * @see #unsetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	boolean isSetCount();

} // InstanceConstraint
