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

import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.layer.complexity.ComplexityFactory
 * @model kind="package"
 * @generated
 */
public interface ComplexityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "complexity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/swarm/layer/complexity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "complexity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComplexityPackage eINSTANCE = com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.complexity.impl.ContainerConstraintImpl <em>Container Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.complexity.impl.ContainerConstraintImpl
	 * @see com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl#getContainerConstraint()
	 * @generated
	 */
	int CONTAINER_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSTRAINT__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSTRAINT__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSTRAINT__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSTRAINT__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSTRAINT__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSTRAINT__OBJECT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSTRAINT__NAME = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSTRAINT_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.complexity.impl.InstanceConstraintImpl <em>Instance Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.complexity.impl.InstanceConstraintImpl
	 * @see com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl#getInstanceConstraint()
	 * @generated
	 */
	int INSTANCE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONSTRAINT__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONSTRAINT__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONSTRAINT__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONSTRAINT__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONSTRAINT__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONSTRAINT__OBJECT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONSTRAINT__COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONSTRAINT_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.complexity.impl.SpaceComplexityImpl <em>Space Complexity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.complexity.impl.SpaceComplexityImpl
	 * @see com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl#getSpaceComplexity()
	 * @generated
	 */
	int SPACE_COMPLEXITY = 2;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_COMPLEXITY__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_COMPLEXITY__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_COMPLEXITY__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_COMPLEXITY__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_COMPLEXITY__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_COMPLEXITY__OBJECT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_COMPLEXITY__UNITS = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Space Complexity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_COMPLEXITY_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.complexity.impl.TimeComplexityImpl <em>Time Complexity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.complexity.impl.TimeComplexityImpl
	 * @see com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl#getTimeComplexity()
	 * @generated
	 */
	int TIME_COMPLEXITY = 3;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COMPLEXITY__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COMPLEXITY__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COMPLEXITY__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COMPLEXITY__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COMPLEXITY__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COMPLEXITY__OBJECT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COMPLEXITY__UNITS = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Complexity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_COMPLEXITY_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.complexity.ContainerConstraint <em>Container Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Constraint</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.ContainerConstraint
	 * @generated
	 */
	EClass getContainerConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link com.brainspeedtech.swarm.layer.complexity.ContainerConstraint#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.ContainerConstraint#getObject()
	 * @see #getContainerConstraint()
	 * @generated
	 */
	EAttribute getContainerConstraint_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.complexity.ContainerConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.ContainerConstraint#getName()
	 * @see #getContainerConstraint()
	 * @generated
	 */
	EAttribute getContainerConstraint_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.complexity.InstanceConstraint <em>Instance Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Constraint</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.InstanceConstraint
	 * @generated
	 */
	EClass getInstanceConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getObject()
	 * @see #getInstanceConstraint()
	 * @generated
	 */
	EAttribute getInstanceConstraint_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.InstanceConstraint#getCount()
	 * @see #getInstanceConstraint()
	 * @generated
	 */
	EAttribute getInstanceConstraint_Count();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.complexity.SpaceComplexity <em>Space Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Complexity</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.SpaceComplexity
	 * @generated
	 */
	EClass getSpaceComplexity();

	/**
	 * Returns the meta object for the attribute list '{@link com.brainspeedtech.swarm.layer.complexity.SpaceComplexity#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.SpaceComplexity#getObject()
	 * @see #getSpaceComplexity()
	 * @generated
	 */
	EAttribute getSpaceComplexity_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.complexity.SpaceComplexity#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.SpaceComplexity#getUnits()
	 * @see #getSpaceComplexity()
	 * @generated
	 */
	EAttribute getSpaceComplexity_Units();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.complexity.TimeComplexity <em>Time Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Complexity</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.TimeComplexity
	 * @generated
	 */
	EClass getTimeComplexity();

	/**
	 * Returns the meta object for the attribute list '{@link com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getObject()
	 * @see #getTimeComplexity()
	 * @generated
	 */
	EAttribute getTimeComplexity_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see com.brainspeedtech.swarm.layer.complexity.TimeComplexity#getUnits()
	 * @see #getTimeComplexity()
	 * @generated
	 */
	EAttribute getTimeComplexity_Units();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComplexityFactory getComplexityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.complexity.impl.ContainerConstraintImpl <em>Container Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.complexity.impl.ContainerConstraintImpl
		 * @see com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl#getContainerConstraint()
		 * @generated
		 */
		EClass CONTAINER_CONSTRAINT = eINSTANCE.getContainerConstraint();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CONSTRAINT__OBJECT = eINSTANCE.getContainerConstraint_Object();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CONSTRAINT__NAME = eINSTANCE.getContainerConstraint_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.complexity.impl.InstanceConstraintImpl <em>Instance Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.complexity.impl.InstanceConstraintImpl
		 * @see com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl#getInstanceConstraint()
		 * @generated
		 */
		EClass INSTANCE_CONSTRAINT = eINSTANCE.getInstanceConstraint();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_CONSTRAINT__OBJECT = eINSTANCE.getInstanceConstraint_Object();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_CONSTRAINT__COUNT = eINSTANCE.getInstanceConstraint_Count();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.complexity.impl.SpaceComplexityImpl <em>Space Complexity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.complexity.impl.SpaceComplexityImpl
		 * @see com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl#getSpaceComplexity()
		 * @generated
		 */
		EClass SPACE_COMPLEXITY = eINSTANCE.getSpaceComplexity();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE_COMPLEXITY__OBJECT = eINSTANCE.getSpaceComplexity_Object();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE_COMPLEXITY__UNITS = eINSTANCE.getSpaceComplexity_Units();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.complexity.impl.TimeComplexityImpl <em>Time Complexity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.complexity.impl.TimeComplexityImpl
		 * @see com.brainspeedtech.swarm.layer.complexity.impl.ComplexityPackageImpl#getTimeComplexity()
		 * @generated
		 */
		EClass TIME_COMPLEXITY = eINSTANCE.getTimeComplexity();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_COMPLEXITY__OBJECT = eINSTANCE.getTimeComplexity_Object();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_COMPLEXITY__UNITS = eINSTANCE.getTimeComplexity_Units();

	}

} //ComplexityPackage
