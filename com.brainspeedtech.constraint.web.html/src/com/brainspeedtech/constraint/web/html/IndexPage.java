/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.web.html;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.layer.ConstraintBase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.web.html.IndexPage#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.brainspeedtech.constraint.web.html.HtmlPackage#getIndexPage()
 * @model extendedMetaData="name='IndexPage' kind='elementOnly'"
 * @generated
 */
public interface IndexPage extends ConstraintBase {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(CellInstance)
	 * @see com.brainspeedtech.constraint.web.html.HtmlPackage#getIndexPage_Instance()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	CellInstance getInstance();

	/**
	 * Sets the value of the '{@link com.brainspeedtech.constraint.web.html.IndexPage#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(CellInstance value);

} // IndexPage
