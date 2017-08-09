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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ignore Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.IgnoreFlow#getFlow <em>Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getIgnoreFlow()
 * @model extendedMetaData="name='IgnoreFlow' kind='elementOnly'"
 * @generated
 */
public interface IgnoreFlow extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Flow</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.flow.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getIgnoreFlow_Flow()
	 * @model extendedMetaData="kind='element' name='flow' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Flow> getFlow();

} // IgnoreFlow
