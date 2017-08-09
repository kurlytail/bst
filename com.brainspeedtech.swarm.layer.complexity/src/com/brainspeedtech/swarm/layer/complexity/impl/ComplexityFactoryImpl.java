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
package com.brainspeedtech.swarm.layer.complexity.impl;

import com.brainspeedtech.swarm.layer.complexity.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexityFactoryImpl extends EFactoryImpl implements ComplexityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComplexityFactory init() {
		try {
			ComplexityFactory theComplexityFactory = (ComplexityFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.brainspeedtech.com/swarm/layer/complexity"); 
			if (theComplexityFactory != null) {
				return theComplexityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComplexityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComplexityPackage.CONTAINER_CONSTRAINT: return createContainerConstraint();
			case ComplexityPackage.INSTANCE_CONSTRAINT: return createInstanceConstraint();
			case ComplexityPackage.SPACE_COMPLEXITY: return createSpaceComplexity();
			case ComplexityPackage.TIME_COMPLEXITY: return createTimeComplexity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerConstraint createContainerConstraint() {
		ContainerConstraintImpl containerConstraint = new ContainerConstraintImpl();
		return containerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceConstraint createInstanceConstraint() {
		InstanceConstraintImpl instanceConstraint = new InstanceConstraintImpl();
		return instanceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceComplexity createSpaceComplexity() {
		SpaceComplexityImpl spaceComplexity = new SpaceComplexityImpl();
		return spaceComplexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeComplexity createTimeComplexity() {
		TimeComplexityImpl timeComplexity = new TimeComplexityImpl();
		return timeComplexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexityPackage getComplexityPackage() {
		return (ComplexityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComplexityPackage getPackage() {
		return ComplexityPackage.eINSTANCE;
	}

} //ComplexityFactoryImpl
