/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.opencl;

import com.brainspeedtech.swarm.layer.ConstraintBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ignore Open CL Tube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube#getTube <em>Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.opencl.OpenclPackage#getIgnoreOpenCLTube()
 * @model extendedMetaData="name='IgnoreOpenCLTube' kind='elementOnly'"
 * @generated
 */
public interface IgnoreOpenCLTube extends ConstraintBase {
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
	 * @see com.brainspeedtech.constraint.software.opencl.OpenclPackage#getIgnoreOpenCLTube_Tube()
	 * @model type="com.brainspeedtech.swarm.master.MasterTube"
	 *        extendedMetaData="kind='element' name='tube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getTube();

} // IgnoreOpenCLTube
