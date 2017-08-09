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

import com.brainspeedtech.swarm.master.MasterCell;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Instance Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.CellInstanceCount#getCell <em>Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.CellInstanceCount#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCellInstanceCount()
 * @model extendedMetaData="name='CellInstanceCount' kind='elementOnly'"
 * @generated
 */
public interface CellInstanceCount extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterCell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCellInstanceCount_Cell()
	 * @model extendedMetaData="kind='element' name='cell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterCell> getCell();

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
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCellInstanceCount_Count()
	 * @model unsettable="true" dataType="com.brainspeedtech.swarm.layer.CountType1"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.CellInstanceCount#getCount <em>Count</em>}' attribute.
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
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.CellInstanceCount#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.CellInstanceCount#getCount <em>Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count</em>' attribute is set.
	 * @see #unsetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	boolean isSetCount();

} // CellInstanceCount
