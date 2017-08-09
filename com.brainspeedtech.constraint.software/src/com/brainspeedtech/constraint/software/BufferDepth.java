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

import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.master.MasterTube;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer Depth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.BufferDepth#getMasterTube <em>Master Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.BufferDepth#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getBufferDepth()
 * @model extendedMetaData="name='BufferDepth' kind='elementOnly'"
 * @generated
 */
public interface BufferDepth extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Master Tube</b></em>' reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.master.MasterTube}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Tube</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Tube</em>' reference list.
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getBufferDepth_MasterTube()
	 * @model extendedMetaData="kind='element' name='masterTube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterTube> getMasterTube();

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #isSetDepth()
	 * @see #unsetDepth()
	 * @see #setDepth(int)
	 * @see com.brainspeedtech.constraint.software.SoftwarePackage#getBufferDepth_Depth()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='depth'"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.software.BufferDepth#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #isSetDepth()
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.constraint.software.BufferDepth#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepth()
	 * @see #getDepth()
	 * @see #setDepth(int)
	 * @generated
	 */
	void unsetDepth();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.constraint.software.BufferDepth#getDepth <em>Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depth</em>' attribute is set.
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @see #setDepth(int)
	 * @generated
	 */
	boolean isSetDepth();

} // BufferDepth
