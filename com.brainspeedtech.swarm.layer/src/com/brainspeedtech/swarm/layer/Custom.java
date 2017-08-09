/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.swarm.layer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.Custom#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Custom#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCustom()
 * @model extendedMetaData="name='Custom' kind='elementOnly'"
 * @generated
 */
public interface Custom extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.brainspeedtech.swarm.layer.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCustom_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getCustom_Clazz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clazz'"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.Custom#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(String value);

} // Custom
