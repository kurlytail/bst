/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.swarm.layer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.Property#getValue <em>Value</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Property#getStringValue <em>String Value</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Property#getObjectValue <em>Object Value</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Property#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getProperty()
 * @model extendedMetaData="name='Property' kind='elementOnly'"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getProperty_Value()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='value:0'"
	 * @generated
	 */
	FeatureMap getValue();

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getProperty_StringValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string_value' namespace='##targetNamespace' group='#value:0'"
	 * @generated
	 */
	EList<String> getStringValue();

	/**
	 * Returns the value of the '<em><b>Object Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Value</em>' reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getProperty_ObjectValue()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object_value' namespace='##targetNamespace' group='#value:0'"
	 * @generated
	 */
	EList<EObject> getObjectValue();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getProperty_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Property
