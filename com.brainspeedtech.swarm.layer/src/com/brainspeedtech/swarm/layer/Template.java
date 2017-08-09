/**
 */
package com.brainspeedtech.swarm.layer;

import com.brainspeedtech.swarm.master.MasterTube;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.Template#getCode <em>Code</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Template#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Template#getFile <em>File</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.Template#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getTemplate()
 * @model extendedMetaData="name='Template' kind='elementOnly'"
 * @generated
 */
public interface Template extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getTemplate_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.swarm.layer.Template#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

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
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getTemplate_Tube()
	 * @model extendedMetaData="kind='element' name='tube' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterTube> getTube();

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getTemplate_File()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFile();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getTemplate_Object()
	 * @model extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getObject();

} // Template
