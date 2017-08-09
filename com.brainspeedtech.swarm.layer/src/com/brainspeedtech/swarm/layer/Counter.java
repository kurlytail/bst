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

import com.brainspeedtech.swarm.flow.Flow;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.TubeInstance;

import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterTube;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.Counter#getName <em>Name</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Counter#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCounter()
 * @model extendedMetaData="name='Counter' kind='elementOnly'"
 * @generated
 */
public interface Counter extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Set Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCounter_Name()
	 * @model default="Set Name" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.Counter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.Counter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.Counter#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The literals are from the enumeration {@link com.brainspeedtech.swarm.layer.WidthType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see com.brainspeedtech.swarm.layer.WidthType
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(WidthType)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCounter_Width()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	WidthType getWidth();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.Counter#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see com.brainspeedtech.swarm.layer.WidthType
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(WidthType value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.Counter#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(WidthType)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.Counter#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(WidthType)
	 * @generated
	 */
	boolean isSetWidth();

} // Counter
