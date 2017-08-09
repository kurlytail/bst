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
package com.brainspeedtech.constraint.software.posix;

import com.brainspeedtech.swarm.layer.ConstraintBase;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.layer.CustomTube;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ignore Posix Tube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.posix.IgnorePosixTube#getTube <em>Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.posix.PosixPackage#getIgnorePosixTube()
 * @model extendedMetaData="name='IgnorePosixTube' kind='elementOnly'"
 * @generated
 */
public interface IgnorePosixTube extends ConstraintBase {

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
	 * @see com.brainspeedtech.constraint.software.posix.PosixPackage#getIgnorePosixTube_Tube()
	 * @model type="com.brainspeedtech.swarm.master.MasterTube"
	 *        extendedMetaData="kind='element' name='tube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTube();
} // IgnorePosixTube
