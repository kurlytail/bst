/**
 */
package com.brainspeedtech.constraint.web.gwt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.web.gwt.GWTPackage
 * @generated
 */
public interface GWTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GWTFactory eINSTANCE = com.brainspeedtech.constraint.web.gwt.impl.GWTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation</em>'.
	 * @generated
	 */
	GWTGeneration createGWTGeneration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GWTPackage getGWTPackage();

} //GWTFactory
