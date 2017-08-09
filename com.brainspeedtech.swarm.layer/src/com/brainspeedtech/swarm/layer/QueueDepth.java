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

import com.brainspeedtech.swarm.master.MasterTube;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue Depth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.QueueDepth#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.QueueDepth#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getQueueDepth()
 * @model extendedMetaData="name='QueueDepth' kind='elementOnly'"
 * @generated
 */
public interface QueueDepth extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Tube</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterTube}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tube</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tube</em>' reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getQueueDepth_Tube()
	 * @model extendedMetaData="kind='element' name='tube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterTube> getTube();

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #isSetDepth()
	 * @see #unsetDepth()
	 * @see #setDepth(long)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getQueueDepth_Depth()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='depth'"
	 * @generated
	 */
	long getDepth();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.QueueDepth#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #isSetDepth()
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(long value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.QueueDepth#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepth()
	 * @see #getDepth()
	 * @see #setDepth(long)
	 * @generated
	 */
	void unsetDepth();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.QueueDepth#getDepth <em>Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depth</em>' attribute is set.
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @see #setDepth(long)
	 * @generated
	 */
	boolean isSetDepth();

} // QueueDepth
