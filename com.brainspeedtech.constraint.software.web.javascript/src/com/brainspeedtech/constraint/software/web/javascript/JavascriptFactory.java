/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.web.javascript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.software.web.javascript.JavascriptPackage
 * @generated
 */
public interface JavascriptFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavascriptFactory eINSTANCE = com.brainspeedtech.constraint.software.web.javascript.impl.JavascriptFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation</em>'.
	 * @generated
	 */
	JavascriptGeneration createJavascriptGeneration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavascriptPackage getJavascriptPackage();

} //JavascriptFactory
