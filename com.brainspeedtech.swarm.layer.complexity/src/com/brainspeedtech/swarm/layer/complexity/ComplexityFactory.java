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
package com.brainspeedtech.swarm.layer.complexity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityPackage
 * @generated
 */
public interface ComplexityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComplexityFactory eINSTANCE = com.brainspeedtech.swarm.layer.complexity.impl.ComplexityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Constraint</em>'.
	 * @generated
	 */
	ContainerConstraint createContainerConstraint();

	/**
	 * Returns a new object of class '<em>Instance Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Constraint</em>'.
	 * @generated
	 */
	InstanceConstraint createInstanceConstraint();

	/**
	 * Returns a new object of class '<em>Space Complexity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Space Complexity</em>'.
	 * @generated
	 */
	SpaceComplexity createSpaceComplexity();

	/**
	 * Returns a new object of class '<em>Time Complexity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Complexity</em>'.
	 * @generated
	 */
	TimeComplexity createTimeComplexity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComplexityPackage getComplexityPackage();

} //ComplexityFactory
