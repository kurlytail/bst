/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.opencl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.software.opencl.OpenclPackage
 * @generated
 */
public interface OpenclFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenclFactory eINSTANCE = com.brainspeedtech.constraint.software.opencl.impl.OpenclFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Custom Open CL Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Open CL Tube</em>'.
	 * @generated
	 */
	CustomOpenCLTube createCustomOpenCLTube();

	/**
	 * Returns a new object of class '<em>Ignore Open CL Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore Open CL Tube</em>'.
	 * @generated
	 */
	IgnoreOpenCLTube createIgnoreOpenCLTube();

	/**
	 * Returns a new object of class '<em>Open CL Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open CL Generator</em>'.
	 * @generated
	 */
	OpenCLGenerator createOpenCLGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenclPackage getOpenclPackage();

} //OpenclFactory
