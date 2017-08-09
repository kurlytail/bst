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
 * A representation of the model object '<em><b>File Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.FileReference#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.swarm.layer.LayerPackage#getFileReference()
 * @model extendedMetaData="name='FileReference' kind='elementOnly'"
 * @generated
 */
public interface FileReference extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' attribute list.
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#getFileReference_Files()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='files' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFiles();

} // FileReference
