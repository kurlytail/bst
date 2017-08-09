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
package com.brainspeedtech.swarm.layer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.brainspeedtech.swarm.layer.LayerFactory
 * @model kind="package"
 * @generated
 */
public interface LayerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "layer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/swarm/layer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "layer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayerPackage eINSTANCE = com.brainspeedtech.swarm.layer.impl.LayerPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl <em>Constraint Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getConstraintBase()
	 * @generated
	 */
	int CONSTRAINT_BASE = 3;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BASE__EXCEPT_FOR = 0;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BASE__APPLY_TO_ALL_NATURES = 1;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BASE__BLURB = 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BASE__DISABLED = 3;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BASE__PINNED = 4;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BASE__PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BASE__REASON = 6;

	/**
	 * The number of structural features of the '<em>Constraint Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_BASE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.AssociationImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPE = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.CellInstanceCountImpl <em>Cell Instance Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.CellInstanceCountImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCellInstanceCount()
	 * @generated
	 */
	int CELL_INSTANCE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.ConvertMasterToSMImpl <em>Convert Master To SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.ConvertMasterToSMImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getConvertMasterToSM()
	 * @generated
	 */
	int CONVERT_MASTER_TO_SM = 4;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.CounterImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 5;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__NAME = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__WIDTH = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.CellCounterImpl <em>Cell Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.CellCounterImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCellCounter()
	 * @generated
	 */
	int CELL_COUNTER = 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__EXCEPT_FOR = COUNTER__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__APPLY_TO_ALL_NATURES = COUNTER__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__BLURB = COUNTER__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__DISABLED = COUNTER__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__PINNED = COUNTER__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__PROCESS = COUNTER__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__REASON = COUNTER__REASON;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__NAME = COUNTER__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__WIDTH = COUNTER__WIDTH;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER__CELL = COUNTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cell Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_COUNTER_FEATURE_COUNT = COUNTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__CELL = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT__COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cell Instance Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_COUNT_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__STATE_MACHINE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM__PROJECT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Convert Master To SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_MASTER_TO_SM_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.CrossReferenceImpl <em>Cross Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.CrossReferenceImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCrossReference()
	 * @generated
	 */
	int CROSS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__OBJECT = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cross Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.CustomImpl <em>Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.CustomImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCustom()
	 * @generated
	 */
	int CUSTOM = 7;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__PROPERTIES = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__CLAZZ = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.CustomTubeImpl <em>Custom Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.CustomTubeImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCustomTube()
	 * @generated
	 */
	int CUSTOM_TUBE = 8;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TUBE_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.ExternalCellImpl <em>External Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.ExternalCellImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getExternalCell()
	 * @generated
	 */
	int EXTERNAL_CELL = 9;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Master Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__MASTER_CELL = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL__INSTANCE_CELL = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CELL_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.FileReferenceImpl <em>File Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.FileReferenceImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getFileReference()
	 * @generated
	 */
	int FILE_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Files</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__FILES = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.IgnoreCellImpl <em>Ignore Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.IgnoreCellImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getIgnoreCell()
	 * @generated
	 */
	int IGNORE_CELL = 12;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.IgnoreFlowImpl <em>Ignore Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.IgnoreFlowImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getIgnoreFlow()
	 * @generated
	 */
	int IGNORE_FLOW = 13;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.IgnoreTubeImpl <em>Ignore Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.IgnoreTubeImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getIgnoreTube()
	 * @generated
	 */
	int IGNORE_TUBE = 14;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.InstanceTransformImpl <em>Instance Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.InstanceTransformImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getInstanceTransform()
	 * @generated
	 */
	int INSTANCE_TRANSFORM = 15;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.LayerImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 16;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.ModelReferenceImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 18;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.NatureBaseImpl <em>Nature Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.NatureBaseImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getNatureBase()
	 * @generated
	 */
	int NATURE_BASE = 19;

	/**
	 * The number of structural features of the '<em>Nature Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_BASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.FlowAnalysisAndMergeImpl <em>Flow Analysis And Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.FlowAnalysisAndMergeImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getFlowAnalysisAndMerge()
	 * @generated
	 */
	int FLOW_ANALYSIS_AND_MERGE = 11;

	/**
	 * The number of structural features of the '<em>Flow Analysis And Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ANALYSIS_AND_MERGE_FEATURE_COUNT = NATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Master Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL__MASTER_CELL = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ignore Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_CELL_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW__FLOW = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ignore Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FLOW_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ignore Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_TUBE_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TRANSFORM_FEATURE_COUNT = NATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.MatchingFlowsImpl <em>Matching Flows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.MatchingFlowsImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getMatchingFlows()
	 * @generated
	 */
	int MATCHING_FLOWS = 17;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__FLOWS = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS__NAME = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matching Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FLOWS_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__OBJECT = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.ParameterImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OBJECT = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.ProjectPrefixStringImpl <em>Project Prefix String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.ProjectPrefixStringImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getProjectPrefixString()
	 * @generated
	 */
	int PROJECT_PREFIX_STRING = 21;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING__PREFIX = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Prefix String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PREFIX_STRING_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.PropertyImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Object Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OBJECT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.QueueDepthImpl <em>Queue Depth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.QueueDepthImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getQueueDepth()
	 * @generated
	 */
	int QUEUE_DEPTH = 23;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH__DEPTH = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Queue Depth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_DEPTH_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.StreamingTubeImpl <em>Streaming Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.StreamingTubeImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getStreamingTube()
	 * @generated
	 */
	int STREAMING_TUBE = 24;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Streaming Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_TUBE_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.TapImpl <em>Tap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.TapImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTap()
	 * @generated
	 */
	int TAP = 25;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP__CELL = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.TemplateImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 26;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CODE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__FILE = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__OBJECT = CONSTRAINT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.TriggerImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 27;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__FROM = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TO = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.TubeDescriptorLogImpl <em>Tube Descriptor Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.TubeDescriptorLogImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTubeDescriptorLog()
	 * @generated
	 */
	int TUBE_DESCRIPTOR_LOG = 28;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG__COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tube Descriptor Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_DESCRIPTOR_LOG_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.TubeInstanceCountImpl <em>Tube Instance Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.TubeInstanceCountImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTubeInstanceCount()
	 * @generated
	 */
	int TUBE_INSTANCE_COUNT = 29;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__EXCEPT_FOR = CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__APPLY_TO_ALL_NATURES = CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__BLURB = CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__DISABLED = CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__PINNED = CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__PROCESS = CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__REASON = CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__TUBE = CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT__COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tube Instance Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_COUNT_FEATURE_COUNT = CONSTRAINT_BASE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.TubeReceiveCounterImpl <em>Tube Receive Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.TubeReceiveCounterImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTubeReceiveCounter()
	 * @generated
	 */
	int TUBE_RECEIVE_COUNTER = 30;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__EXCEPT_FOR = COUNTER__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__APPLY_TO_ALL_NATURES = COUNTER__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__BLURB = COUNTER__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__DISABLED = COUNTER__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__PINNED = COUNTER__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__PROCESS = COUNTER__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__REASON = COUNTER__REASON;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__NAME = COUNTER__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__WIDTH = COUNTER__WIDTH;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER__TUBE = COUNTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tube Receive Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_RECEIVE_COUNTER_FEATURE_COUNT = COUNTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.impl.TubeTransmitCounterImpl <em>Tube Transmit Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.TubeTransmitCounterImpl
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTubeTransmitCounter()
	 * @generated
	 */
	int TUBE_TRANSMIT_COUNTER = 31;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__EXCEPT_FOR = COUNTER__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__APPLY_TO_ALL_NATURES = COUNTER__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__BLURB = COUNTER__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__DISABLED = COUNTER__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__PINNED = COUNTER__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__PROCESS = COUNTER__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__REASON = COUNTER__REASON;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__NAME = COUNTER__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__WIDTH = COUNTER__WIDTH;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER__TUBE = COUNTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tube Transmit Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_TRANSMIT_COUNTER_FEATURE_COUNT = COUNTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.AssociationType <em>Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.AssociationType
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 32;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.layer.WidthType <em>Width Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.WidthType
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getWidthType()
	 * @generated
	 */
	int WIDTH_TYPE = 33;

	/**
	 * The meta object id for the '<em>Association Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.AssociationType
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getAssociationTypeObject()
	 * @generated
	 */
	int ASSOCIATION_TYPE_OBJECT = 34;

	/**
	 * The meta object id for the '<em>Count Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCountType()
	 * @generated
	 */
	int COUNT_TYPE = 35;

	/**
	 * The meta object id for the '<em>Count Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCountType1()
	 * @generated
	 */
	int COUNT_TYPE1 = 36;

	/**
	 * The meta object id for the '<em>Count Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCountTypeObject()
	 * @generated
	 */
	int COUNT_TYPE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Count Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCountTypeObject1()
	 * @generated
	 */
	int COUNT_TYPE_OBJECT1 = 38;


	/**
	 * The meta object id for the '<em>Width Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.layer.WidthType
	 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getWidthTypeObject()
	 * @generated
	 */
	int WIDTH_TYPE_OBJECT = 39;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see com.brainspeedtech.swarm.layer.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.Association#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.Association#getTube()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Tube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Association#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.brainspeedtech.swarm.layer.Association#getType()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Type();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.CellCounter <em>Cell Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Counter</em>'.
	 * @see com.brainspeedtech.swarm.layer.CellCounter
	 * @generated
	 */
	EClass getCellCounter();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.CellCounter#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.layer.CellCounter#getCell()
	 * @see #getCellCounter()
	 * @generated
	 */
	EReference getCellCounter_Cell();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.CellInstanceCount <em>Cell Instance Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Instance Count</em>'.
	 * @see com.brainspeedtech.swarm.layer.CellInstanceCount
	 * @generated
	 */
	EClass getCellInstanceCount();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.CellInstanceCount#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.layer.CellInstanceCount#getCell()
	 * @see #getCellInstanceCount()
	 * @generated
	 */
	EReference getCellInstanceCount_Cell();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.CellInstanceCount#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.swarm.layer.CellInstanceCount#getCount()
	 * @see #getCellInstanceCount()
	 * @generated
	 */
	EAttribute getCellInstanceCount_Count();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.ConstraintBase <em>Constraint Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Base</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase
	 * @generated
	 */
	EClass getConstraintBase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getExceptFor <em>Except For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Except For</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase#getExceptFor()
	 * @see #getConstraintBase()
	 * @generated
	 */
	EReference getConstraintBase_ExceptFor();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isApplyToAllNatures <em>Apply To All Natures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To All Natures</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase#isApplyToAllNatures()
	 * @see #getConstraintBase()
	 * @generated
	 */
	EAttribute getConstraintBase_ApplyToAllNatures();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getBlurb <em>Blurb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blurb</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase#getBlurb()
	 * @see #getConstraintBase()
	 * @generated
	 */
	EAttribute getConstraintBase_Blurb();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase#isDisabled()
	 * @see #getConstraintBase()
	 * @generated
	 */
	EAttribute getConstraintBase_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.ConstraintBase#isPinned <em>Pinned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinned</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase#isPinned()
	 * @see #getConstraintBase()
	 * @generated
	 */
	EAttribute getConstraintBase_Pinned();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase#getProcess()
	 * @see #getConstraintBase()
	 * @generated
	 */
	EAttribute getConstraintBase_Process();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.ConstraintBase#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase#getReason()
	 * @see #getConstraintBase()
	 * @generated
	 */
	EAttribute getConstraintBase_Reason();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.ConvertMasterToSM <em>Convert Master To SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert Master To SM</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConvertMasterToSM
	 * @generated
	 */
	EClass getConvertMasterToSM();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.layer.ConvertMasterToSM#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Machine</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConvertMasterToSM#getStateMachine()
	 * @see #getConvertMasterToSM()
	 * @generated
	 */
	EReference getConvertMasterToSM_StateMachine();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.ConvertMasterToSM#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see com.brainspeedtech.swarm.layer.ConvertMasterToSM#getProject()
	 * @see #getConvertMasterToSM()
	 * @generated
	 */
	EAttribute getConvertMasterToSM_Project();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see com.brainspeedtech.swarm.layer.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Counter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.layer.Counter#getName()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Counter#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.brainspeedtech.swarm.layer.Counter#getWidth()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Width();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.CrossReference <em>Cross Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Reference</em>'.
	 * @see com.brainspeedtech.swarm.layer.CrossReference
	 * @generated
	 */
	EClass getCrossReference();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.CrossReference#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.CrossReference#getObject()
	 * @see #getCrossReference()
	 * @generated
	 */
	EReference getCrossReference_Object();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom</em>'.
	 * @see com.brainspeedtech.swarm.layer.Custom
	 * @generated
	 */
	EClass getCustom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.layer.Custom#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.brainspeedtech.swarm.layer.Custom#getProperties()
	 * @see #getCustom()
	 * @generated
	 */
	EReference getCustom_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Custom#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see com.brainspeedtech.swarm.layer.Custom#getClazz()
	 * @see #getCustom()
	 * @generated
	 */
	EAttribute getCustom_Clazz();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.CustomTube <em>Custom Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.CustomTube
	 * @generated
	 */
	EClass getCustomTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.CustomTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.CustomTube#getTube()
	 * @see #getCustomTube()
	 * @generated
	 */
	EReference getCustomTube_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.ExternalCell <em>External Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Cell</em>'.
	 * @see com.brainspeedtech.swarm.layer.ExternalCell
	 * @generated
	 */
	EClass getExternalCell();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.ExternalCell#getMasterCell <em>Master Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Cell</em>'.
	 * @see com.brainspeedtech.swarm.layer.ExternalCell#getMasterCell()
	 * @see #getExternalCell()
	 * @generated
	 */
	EReference getExternalCell_MasterCell();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.ExternalCell#getInstanceCell <em>Instance Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance Cell</em>'.
	 * @see com.brainspeedtech.swarm.layer.ExternalCell#getInstanceCell()
	 * @see #getExternalCell()
	 * @generated
	 */
	EReference getExternalCell_InstanceCell();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.FileReference <em>File Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Reference</em>'.
	 * @see com.brainspeedtech.swarm.layer.FileReference
	 * @generated
	 */
	EClass getFileReference();

	/**
	 * Returns the meta object for the attribute list '{@link com.brainspeedtech.swarm.layer.FileReference#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Files</em>'.
	 * @see com.brainspeedtech.swarm.layer.FileReference#getFiles()
	 * @see #getFileReference()
	 * @generated
	 */
	EAttribute getFileReference_Files();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.FlowAnalysisAndMerge <em>Flow Analysis And Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Analysis And Merge</em>'.
	 * @see com.brainspeedtech.swarm.layer.FlowAnalysisAndMerge
	 * @generated
	 */
	EClass getFlowAnalysisAndMerge();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.IgnoreCell <em>Ignore Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Cell</em>'.
	 * @see com.brainspeedtech.swarm.layer.IgnoreCell
	 * @generated
	 */
	EClass getIgnoreCell();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.IgnoreCell#getMasterCell <em>Master Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Cell</em>'.
	 * @see com.brainspeedtech.swarm.layer.IgnoreCell#getMasterCell()
	 * @see #getIgnoreCell()
	 * @generated
	 */
	EReference getIgnoreCell_MasterCell();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.IgnoreFlow <em>Ignore Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Flow</em>'.
	 * @see com.brainspeedtech.swarm.layer.IgnoreFlow
	 * @generated
	 */
	EClass getIgnoreFlow();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.IgnoreFlow#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow</em>'.
	 * @see com.brainspeedtech.swarm.layer.IgnoreFlow#getFlow()
	 * @see #getIgnoreFlow()
	 * @generated
	 */
	EReference getIgnoreFlow_Flow();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.IgnoreTube <em>Ignore Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.IgnoreTube
	 * @generated
	 */
	EClass getIgnoreTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.IgnoreTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.IgnoreTube#getTube()
	 * @see #getIgnoreTube()
	 * @generated
	 */
	EReference getIgnoreTube_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.InstanceTransform <em>Instance Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Transform</em>'.
	 * @see com.brainspeedtech.swarm.layer.InstanceTransform
	 * @generated
	 */
	EClass getInstanceTransform();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see com.brainspeedtech.swarm.layer.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.layer.Layer#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see com.brainspeedtech.swarm.layer.Layer#getConstraint()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Layer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.layer.Layer#getName()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.MatchingFlows <em>Matching Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Flows</em>'.
	 * @see com.brainspeedtech.swarm.layer.MatchingFlows
	 * @generated
	 */
	EClass getMatchingFlows();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.MatchingFlows#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flows</em>'.
	 * @see com.brainspeedtech.swarm.layer.MatchingFlows#getFlows()
	 * @see #getMatchingFlows()
	 * @generated
	 */
	EReference getMatchingFlows_Flows();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.MatchingFlows#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.layer.MatchingFlows#getName()
	 * @see #getMatchingFlows()
	 * @generated
	 */
	EAttribute getMatchingFlows_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see com.brainspeedtech.swarm.layer.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.ModelReference#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.ModelReference#getObject()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_Object();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.NatureBase <em>Nature Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nature Base</em>'.
	 * @see com.brainspeedtech.swarm.layer.NatureBase
	 * @generated
	 */
	EClass getNatureBase();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.brainspeedtech.swarm.layer.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.Parameter#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.Parameter#getObject()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.layer.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.brainspeedtech.swarm.layer.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.ProjectPrefixString <em>Project Prefix String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Prefix String</em>'.
	 * @see com.brainspeedtech.swarm.layer.ProjectPrefixString
	 * @generated
	 */
	EClass getProjectPrefixString();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.ProjectPrefixString#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.brainspeedtech.swarm.layer.ProjectPrefixString#getPrefix()
	 * @see #getProjectPrefixString()
	 * @generated
	 */
	EAttribute getProjectPrefixString_Prefix();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.brainspeedtech.swarm.layer.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute list '{@link com.brainspeedtech.swarm.layer.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see com.brainspeedtech.swarm.layer.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute list '{@link com.brainspeedtech.swarm.layer.Property#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Value</em>'.
	 * @see com.brainspeedtech.swarm.layer.Property#getStringValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_StringValue();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.Property#getObjectValue <em>Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Value</em>'.
	 * @see com.brainspeedtech.swarm.layer.Property#getObjectValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ObjectValue();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.layer.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.QueueDepth <em>Queue Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Depth</em>'.
	 * @see com.brainspeedtech.swarm.layer.QueueDepth
	 * @generated
	 */
	EClass getQueueDepth();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.QueueDepth#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.QueueDepth#getTube()
	 * @see #getQueueDepth()
	 * @generated
	 */
	EReference getQueueDepth_Tube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.QueueDepth#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see com.brainspeedtech.swarm.layer.QueueDepth#getDepth()
	 * @see #getQueueDepth()
	 * @generated
	 */
	EAttribute getQueueDepth_Depth();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.StreamingTube <em>Streaming Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streaming Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.StreamingTube
	 * @generated
	 */
	EClass getStreamingTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.StreamingTube#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.StreamingTube#getTube()
	 * @see #getStreamingTube()
	 * @generated
	 */
	EReference getStreamingTube_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Tap <em>Tap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap</em>'.
	 * @see com.brainspeedtech.swarm.layer.Tap
	 * @generated
	 */
	EClass getTap();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.Tap#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.Tap#getTube()
	 * @see #getTap()
	 * @generated
	 */
	EReference getTap_Tube();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.layer.Tap#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.layer.Tap#getCell()
	 * @see #getTap()
	 * @generated
	 */
	EReference getTap_Cell();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see com.brainspeedtech.swarm.layer.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Template#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.brainspeedtech.swarm.layer.Template#getCode()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Code();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.Template#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.Template#getTube()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Tube();

	/**
	 * Returns the meta object for the attribute list '{@link com.brainspeedtech.swarm.layer.Template#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>File</em>'.
	 * @see com.brainspeedtech.swarm.layer.Template#getFile()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_File();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.Template#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.Template#getObject()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Object();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see com.brainspeedtech.swarm.layer.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.layer.Trigger#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see com.brainspeedtech.swarm.layer.Trigger#getFrom()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_From();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.layer.Trigger#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see com.brainspeedtech.swarm.layer.Trigger#getTo()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_To();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.layer.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.TubeDescriptorLog <em>Tube Descriptor Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tube Descriptor Log</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeDescriptorLog
	 * @generated
	 */
	EClass getTubeDescriptorLog();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.TubeDescriptorLog#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeDescriptorLog#getTube()
	 * @see #getTubeDescriptorLog()
	 * @generated
	 */
	EReference getTubeDescriptorLog_Tube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.TubeDescriptorLog#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeDescriptorLog#getCount()
	 * @see #getTubeDescriptorLog()
	 * @generated
	 */
	EAttribute getTubeDescriptorLog_Count();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.TubeInstanceCount <em>Tube Instance Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tube Instance Count</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeInstanceCount
	 * @generated
	 */
	EClass getTubeInstanceCount();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.layer.TubeInstanceCount#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeInstanceCount#getCount()
	 * @see #getTubeInstanceCount()
	 * @generated
	 */
	EAttribute getTubeInstanceCount_Count();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.TubeReceiveCounter <em>Tube Receive Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tube Receive Counter</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeReceiveCounter
	 * @generated
	 */
	EClass getTubeReceiveCounter();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.TubeReceiveCounter#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeReceiveCounter#getTube()
	 * @see #getTubeReceiveCounter()
	 * @generated
	 */
	EReference getTubeReceiveCounter_Tube();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.layer.TubeTransmitCounter <em>Tube Transmit Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tube Transmit Counter</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeTransmitCounter
	 * @generated
	 */
	EClass getTubeTransmitCounter();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.TubeTransmitCounter#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeTransmitCounter#getTube()
	 * @see #getTubeTransmitCounter()
	 * @generated
	 */
	EReference getTubeTransmitCounter_Tube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.layer.TubeInstanceCount#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.layer.TubeInstanceCount#getTube()
	 * @see #getTubeInstanceCount()
	 * @generated
	 */
	EReference getTubeInstanceCount_Tube();

	/**
	 * Returns the meta object for enum '{@link com.brainspeedtech.swarm.layer.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Type</em>'.
	 * @see com.brainspeedtech.swarm.layer.AssociationType
	 * @generated
	 */
	EEnum getAssociationType();

	/**
	 * Returns the meta object for enum '{@link com.brainspeedtech.swarm.layer.WidthType <em>Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Width Type</em>'.
	 * @see com.brainspeedtech.swarm.layer.WidthType
	 * @generated
	 */
	EEnum getWidthType();

	/**
	 * Returns the meta object for data type '{@link com.brainspeedtech.swarm.layer.AssociationType <em>Association Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Association Type Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.AssociationType
	 * @model instanceClass="com.brainspeedtech.swarm.layer.AssociationType"
	 *        extendedMetaData="name='AssociationType:Object' baseType='AssociationType'"
	 * @generated
	 */
	EDataType getAssociationTypeObject();

	/**
	 * Returns the meta object for data type '<em>Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Count Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='count_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1'"
	 * @generated
	 */
	EDataType getCountType();

	/**
	 * Returns the meta object for data type '<em>Count Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Count Type1</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='count_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1'"
	 * @generated
	 */
	EDataType getCountType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Count Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Count Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='count_._type:Object' baseType='count_._type'"
	 * @generated
	 */
	EDataType getCountTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Count Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Count Type Object1</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='count_._1_._type:Object' baseType='count_._1_._type'"
	 * @generated
	 */
	EDataType getCountTypeObject1();

	/**
	 * Returns the meta object for data type '{@link com.brainspeedtech.swarm.layer.WidthType <em>Width Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Width Type Object</em>'.
	 * @see com.brainspeedtech.swarm.layer.WidthType
	 * @model instanceClass="com.brainspeedtech.swarm.layer.WidthType"
	 *        extendedMetaData="name='width_._type:Object' baseType='width_._type'"
	 * @generated
	 */
	EDataType getWidthTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LayerFactory getLayerFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.AssociationImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TUBE = eINSTANCE.getAssociation_Tube();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TYPE = eINSTANCE.getAssociation_Type();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.CellCounterImpl <em>Cell Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.CellCounterImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCellCounter()
		 * @generated
		 */
		EClass CELL_COUNTER = eINSTANCE.getCellCounter();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_COUNTER__CELL = eINSTANCE.getCellCounter_Cell();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.CellInstanceCountImpl <em>Cell Instance Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.CellInstanceCountImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCellInstanceCount()
		 * @generated
		 */
		EClass CELL_INSTANCE_COUNT = eINSTANCE.getCellInstanceCount();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_INSTANCE_COUNT__CELL = eINSTANCE.getCellInstanceCount_Cell();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_INSTANCE_COUNT__COUNT = eINSTANCE.getCellInstanceCount_Count();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl <em>Constraint Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getConstraintBase()
		 * @generated
		 */
		EClass CONSTRAINT_BASE = eINSTANCE.getConstraintBase();

		/**
		 * The meta object literal for the '<em><b>Except For</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_BASE__EXCEPT_FOR = eINSTANCE.getConstraintBase_ExceptFor();

		/**
		 * The meta object literal for the '<em><b>Apply To All Natures</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_BASE__APPLY_TO_ALL_NATURES = eINSTANCE.getConstraintBase_ApplyToAllNatures();

		/**
		 * The meta object literal for the '<em><b>Blurb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_BASE__BLURB = eINSTANCE.getConstraintBase_Blurb();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_BASE__DISABLED = eINSTANCE.getConstraintBase_Disabled();

		/**
		 * The meta object literal for the '<em><b>Pinned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_BASE__PINNED = eINSTANCE.getConstraintBase_Pinned();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_BASE__PROCESS = eINSTANCE.getConstraintBase_Process();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_BASE__REASON = eINSTANCE.getConstraintBase_Reason();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.ConvertMasterToSMImpl <em>Convert Master To SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.ConvertMasterToSMImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getConvertMasterToSM()
		 * @generated
		 */
		EClass CONVERT_MASTER_TO_SM = eINSTANCE.getConvertMasterToSM();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERT_MASTER_TO_SM__STATE_MACHINE = eINSTANCE.getConvertMasterToSM_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERT_MASTER_TO_SM__PROJECT = eINSTANCE.getConvertMasterToSM_Project();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.CounterImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__NAME = eINSTANCE.getCounter_Name();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__WIDTH = eINSTANCE.getCounter_Width();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.CrossReferenceImpl <em>Cross Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.CrossReferenceImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCrossReference()
		 * @generated
		 */
		EClass CROSS_REFERENCE = eINSTANCE.getCrossReference();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_REFERENCE__OBJECT = eINSTANCE.getCrossReference_Object();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.CustomImpl <em>Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.CustomImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCustom()
		 * @generated
		 */
		EClass CUSTOM = eINSTANCE.getCustom();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM__PROPERTIES = eINSTANCE.getCustom_Properties();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM__CLAZZ = eINSTANCE.getCustom_Clazz();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.CustomTubeImpl <em>Custom Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.CustomTubeImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCustomTube()
		 * @generated
		 */
		EClass CUSTOM_TUBE = eINSTANCE.getCustomTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_TUBE__TUBE = eINSTANCE.getCustomTube_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.ExternalCellImpl <em>External Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.ExternalCellImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getExternalCell()
		 * @generated
		 */
		EClass EXTERNAL_CELL = eINSTANCE.getExternalCell();

		/**
		 * The meta object literal for the '<em><b>Master Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CELL__MASTER_CELL = eINSTANCE.getExternalCell_MasterCell();

		/**
		 * The meta object literal for the '<em><b>Instance Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CELL__INSTANCE_CELL = eINSTANCE.getExternalCell_InstanceCell();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.FileReferenceImpl <em>File Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.FileReferenceImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getFileReference()
		 * @generated
		 */
		EClass FILE_REFERENCE = eINSTANCE.getFileReference();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REFERENCE__FILES = eINSTANCE.getFileReference_Files();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.FlowAnalysisAndMergeImpl <em>Flow Analysis And Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.FlowAnalysisAndMergeImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getFlowAnalysisAndMerge()
		 * @generated
		 */
		EClass FLOW_ANALYSIS_AND_MERGE = eINSTANCE.getFlowAnalysisAndMerge();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.IgnoreCellImpl <em>Ignore Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.IgnoreCellImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getIgnoreCell()
		 * @generated
		 */
		EClass IGNORE_CELL = eINSTANCE.getIgnoreCell();

		/**
		 * The meta object literal for the '<em><b>Master Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGNORE_CELL__MASTER_CELL = eINSTANCE.getIgnoreCell_MasterCell();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.IgnoreFlowImpl <em>Ignore Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.IgnoreFlowImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getIgnoreFlow()
		 * @generated
		 */
		EClass IGNORE_FLOW = eINSTANCE.getIgnoreFlow();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGNORE_FLOW__FLOW = eINSTANCE.getIgnoreFlow_Flow();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.IgnoreTubeImpl <em>Ignore Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.IgnoreTubeImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getIgnoreTube()
		 * @generated
		 */
		EClass IGNORE_TUBE = eINSTANCE.getIgnoreTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGNORE_TUBE__TUBE = eINSTANCE.getIgnoreTube_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.InstanceTransformImpl <em>Instance Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.InstanceTransformImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getInstanceTransform()
		 * @generated
		 */
		EClass INSTANCE_TRANSFORM = eINSTANCE.getInstanceTransform();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.LayerImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__CONSTRAINT = eINSTANCE.getLayer_Constraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.MatchingFlowsImpl <em>Matching Flows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.MatchingFlowsImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getMatchingFlows()
		 * @generated
		 */
		EClass MATCHING_FLOWS = eINSTANCE.getMatchingFlows();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_FLOWS__FLOWS = eINSTANCE.getMatchingFlows_Flows();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHING_FLOWS__NAME = eINSTANCE.getMatchingFlows_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.ModelReferenceImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REFERENCE__OBJECT = eINSTANCE.getModelReference_Object();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.NatureBaseImpl <em>Nature Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.NatureBaseImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getNatureBase()
		 * @generated
		 */
		EClass NATURE_BASE = eINSTANCE.getNatureBase();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.ParameterImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OBJECT = eINSTANCE.getParameter_Object();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.ProjectPrefixStringImpl <em>Project Prefix String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.ProjectPrefixStringImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getProjectPrefixString()
		 * @generated
		 */
		EClass PROJECT_PREFIX_STRING = eINSTANCE.getProjectPrefixString();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_PREFIX_STRING__PREFIX = eINSTANCE.getProjectPrefixString_Prefix();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.PropertyImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__STRING_VALUE = eINSTANCE.getProperty_StringValue();

		/**
		 * The meta object literal for the '<em><b>Object Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OBJECT_VALUE = eINSTANCE.getProperty_ObjectValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.QueueDepthImpl <em>Queue Depth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.QueueDepthImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getQueueDepth()
		 * @generated
		 */
		EClass QUEUE_DEPTH = eINSTANCE.getQueueDepth();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUE_DEPTH__TUBE = eINSTANCE.getQueueDepth_Tube();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUE_DEPTH__DEPTH = eINSTANCE.getQueueDepth_Depth();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.StreamingTubeImpl <em>Streaming Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.StreamingTubeImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getStreamingTube()
		 * @generated
		 */
		EClass STREAMING_TUBE = eINSTANCE.getStreamingTube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_TUBE__TUBE = eINSTANCE.getStreamingTube_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.TapImpl <em>Tap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.TapImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTap()
		 * @generated
		 */
		EClass TAP = eINSTANCE.getTap();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP__TUBE = eINSTANCE.getTap_Tube();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP__CELL = eINSTANCE.getTap_Cell();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.TemplateImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__CODE = eINSTANCE.getTemplate_Code();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__TUBE = eINSTANCE.getTemplate_Tube();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__FILE = eINSTANCE.getTemplate_File();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__OBJECT = eINSTANCE.getTemplate_Object();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.TriggerImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__FROM = eINSTANCE.getTrigger_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TO = eINSTANCE.getTrigger_To();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.TubeDescriptorLogImpl <em>Tube Descriptor Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.TubeDescriptorLogImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTubeDescriptorLog()
		 * @generated
		 */
		EClass TUBE_DESCRIPTOR_LOG = eINSTANCE.getTubeDescriptorLog();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE_DESCRIPTOR_LOG__TUBE = eINSTANCE.getTubeDescriptorLog_Tube();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUBE_DESCRIPTOR_LOG__COUNT = eINSTANCE.getTubeDescriptorLog_Count();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.TubeInstanceCountImpl <em>Tube Instance Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.TubeInstanceCountImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTubeInstanceCount()
		 * @generated
		 */
		EClass TUBE_INSTANCE_COUNT = eINSTANCE.getTubeInstanceCount();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUBE_INSTANCE_COUNT__COUNT = eINSTANCE.getTubeInstanceCount_Count();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.TubeReceiveCounterImpl <em>Tube Receive Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.TubeReceiveCounterImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTubeReceiveCounter()
		 * @generated
		 */
		EClass TUBE_RECEIVE_COUNTER = eINSTANCE.getTubeReceiveCounter();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE_RECEIVE_COUNTER__TUBE = eINSTANCE.getTubeReceiveCounter_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.impl.TubeTransmitCounterImpl <em>Tube Transmit Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.TubeTransmitCounterImpl
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getTubeTransmitCounter()
		 * @generated
		 */
		EClass TUBE_TRANSMIT_COUNTER = eINSTANCE.getTubeTransmitCounter();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE_TRANSMIT_COUNTER__TUBE = eINSTANCE.getTubeTransmitCounter_Tube();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE_INSTANCE_COUNT__TUBE = eINSTANCE.getTubeInstanceCount_Tube();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.AssociationType <em>Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.AssociationType
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getAssociationType()
		 * @generated
		 */
		EEnum ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.layer.WidthType <em>Width Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.WidthType
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getWidthType()
		 * @generated
		 */
		EEnum WIDTH_TYPE = eINSTANCE.getWidthType();

		/**
		 * The meta object literal for the '<em>Association Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.AssociationType
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getAssociationTypeObject()
		 * @generated
		 */
		EDataType ASSOCIATION_TYPE_OBJECT = eINSTANCE.getAssociationTypeObject();

		/**
		 * The meta object literal for the '<em>Count Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCountType()
		 * @generated
		 */
		EDataType COUNT_TYPE = eINSTANCE.getCountType();

		/**
		 * The meta object literal for the '<em>Count Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCountType1()
		 * @generated
		 */
		EDataType COUNT_TYPE1 = eINSTANCE.getCountType1();

		/**
		 * The meta object literal for the '<em>Count Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCountTypeObject()
		 * @generated
		 */
		EDataType COUNT_TYPE_OBJECT = eINSTANCE.getCountTypeObject();

		/**
		 * The meta object literal for the '<em>Count Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getCountTypeObject1()
		 * @generated
		 */
		EDataType COUNT_TYPE_OBJECT1 = eINSTANCE.getCountTypeObject1();

		/**
		 * The meta object literal for the '<em>Width Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.layer.WidthType
		 * @see com.brainspeedtech.swarm.layer.impl.LayerPackageImpl#getWidthTypeObject()
		 * @generated
		 */
		EDataType WIDTH_TYPE_OBJECT = eINSTANCE.getWidthTypeObject();

	}

} //LayerPackage
