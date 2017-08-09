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
 * A representation of the model object '<em><b>Time Complexity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getObject <em>Object</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityPackage#getTimeComplexity()
 * @model extendedMetaData="name='TimeComplexity' kind='elementOnly'"
 * @generated
 */
public interface TimeComplexity extends ConstraintBase {
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
	 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityPackage#getTimeComplexity_Object()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getObject();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #setUnits(float)
	 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityPackage#getTimeComplexity_Units()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='units'"
	 * @generated
	 */
	float getUnits();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(float value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnits()
	 * @see #getUnits()
	 * @see #setUnits(float)
	 * @generated
	 */
	void unsetUnits();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getUnits <em>Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Units</em>' attribute is set.
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @see #setUnits(float)
	 * @generated
	 */
	boolean isSetUnits();

} // TimeComplexity
