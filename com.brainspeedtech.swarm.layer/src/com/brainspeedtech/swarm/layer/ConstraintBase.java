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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConstraintBase#getExceptFor <em>Except For</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConstraintBase#isApplyToAllNatures <em>Apply To All Natures</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConstraintBase#getBlurb <em>Blurb</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConstraintBase#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConstraintBase#isPinned <em>Pinned</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConstraintBase#getProcess <em>Process</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.ConstraintBase#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConstraintBase()
 * @model abstract="true"
 *        extendedMetaData="name='ConstraintBase' kind='elementOnly'"
 * @generated
 */
public interface ConstraintBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Except For</b></em>' containment reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.layer.NatureBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Except For</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Except For</em>' containment reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConstraintBase_ExceptFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='except_for' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NatureBase> getExceptFor();

	/**
	 * Returns the value of the '<em><b>Apply To All Natures</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply To All Natures</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To All Natures</em>' attribute.
	 * @see #isSetApplyToAllNatures()
	 * @see #unsetApplyToAllNatures()
	 * @see #setApplyToAllNatures(boolean)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConstraintBase_ApplyToAllNatures()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='apply_to_all_natures'"
	 * @generated
	 */
	boolean isApplyToAllNatures();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isApplyToAllNatures <em>Apply To All Natures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To All Natures</em>' attribute.
	 * @see #isSetApplyToAllNatures()
	 * @see #unsetApplyToAllNatures()
	 * @see #isApplyToAllNatures()
	 * @generated
	 */
	void setApplyToAllNatures(boolean value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isApplyToAllNatures <em>Apply To All Natures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplyToAllNatures()
	 * @see #isApplyToAllNatures()
	 * @see #setApplyToAllNatures(boolean)
	 * @generated
	 */
	void unsetApplyToAllNatures();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isApplyToAllNatures <em>Apply To All Natures</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Apply To All Natures</em>' attribute is set.
	 * @see #unsetApplyToAllNatures()
	 * @see #isApplyToAllNatures()
	 * @see #setApplyToAllNatures(boolean)
	 * @generated
	 */
	boolean isSetApplyToAllNatures();

	/**
	 * Returns the value of the '<em><b>Blurb</b></em>' attribute.
	 * The default value is <code>"Add Description"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blurb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blurb</em>' attribute.
	 * @see #isSetBlurb()
	 * @see #unsetBlurb()
	 * @see #setBlurb(String)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConstraintBase_Blurb()
	 * @model default="Add Description" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='blurb'"
	 * @generated
	 */
	String getBlurb();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getBlurb <em>Blurb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blurb</em>' attribute.
	 * @see #isSetBlurb()
	 * @see #unsetBlurb()
	 * @see #getBlurb()
	 * @generated
	 */
	void setBlurb(String value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getBlurb <em>Blurb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlurb()
	 * @see #getBlurb()
	 * @see #setBlurb(String)
	 * @generated
	 */
	void unsetBlurb();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getBlurb <em>Blurb</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blurb</em>' attribute is set.
	 * @see #unsetBlurb()
	 * @see #getBlurb()
	 * @see #setBlurb(String)
	 * @generated
	 */
	boolean isSetBlurb();

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #setDisabled(boolean)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConstraintBase_Disabled()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='disabled'"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabled()
	 * @see #isDisabled()
	 * @see #setDisabled(boolean)
	 * @generated
	 */
	void unsetDisabled();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isDisabled <em>Disabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disabled</em>' attribute is set.
	 * @see #unsetDisabled()
	 * @see #isDisabled()
	 * @see #setDisabled(boolean)
	 * @generated
	 */
	boolean isSetDisabled();

	/**
	 * Returns the value of the '<em><b>Pinned</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinned</em>' attribute.
	 * @see #isSetPinned()
	 * @see #unsetPinned()
	 * @see #setPinned(boolean)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConstraintBase_Pinned()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='pinned'"
	 * @generated
	 */
	boolean isPinned();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isPinned <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinned</em>' attribute.
	 * @see #isSetPinned()
	 * @see #unsetPinned()
	 * @see #isPinned()
	 * @generated
	 */
	void setPinned(boolean value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isPinned <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPinned()
	 * @see #isPinned()
	 * @see #setPinned(boolean)
	 * @generated
	 */
	void unsetPinned();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isPinned <em>Pinned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pinned</em>' attribute is set.
	 * @see #unsetPinned()
	 * @see #isPinned()
	 * @see #setPinned(boolean)
	 * @generated
	 */
	boolean isSetPinned();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' attribute.
	 * The default value is <code>"Manually Added"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' attribute.
	 * @see #isSetProcess()
	 * @see #unsetProcess()
	 * @see #setProcess(String)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConstraintBase_Process()
	 * @model default="Manually Added" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='process'"
	 * @generated
	 */
	String getProcess();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getProcess <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' attribute.
	 * @see #isSetProcess()
	 * @see #unsetProcess()
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(String value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getProcess <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcess()
	 * @see #getProcess()
	 * @see #setProcess(String)
	 * @generated
	 */
	void unsetProcess();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getProcess <em>Process</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process</em>' attribute is set.
	 * @see #unsetProcess()
	 * @see #getProcess()
	 * @see #setProcess(String)
	 * @generated
	 */
	boolean isSetProcess();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * The default value is <code>"User Interaction"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #setReason(String)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getConstraintBase_Reason()
	 * @model default="User Interaction" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='reason'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Unsets the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	void unsetReason();

	/**
	 * Returns whether the value of the '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getReason <em>Reason</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason</em>' attribute is set.
	 * @see #unsetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	boolean isSetReason();

} // ConstraintBase
