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
package com.brainspeedtech.swarm.flow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.brainspeedtech.swarm.flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/swarm/flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = com.brainspeedtech.swarm.flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.flow.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.flow.impl.CellImpl
	 * @see com.brainspeedtech.swarm.flow.impl.FlowPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COUNT = 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__EXTERNAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__NAME = 5;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.flow.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.flow.impl.FlowImpl
	 * @see com.brainspeedtech.swarm.flow.impl.FlowPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 1;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CELL = 0;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TUBE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.flow.impl.TubeImpl <em>Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.flow.impl.TubeImpl
	 * @see com.brainspeedtech.swarm.flow.impl.FlowPackageImpl#getTube()
	 * @generated
	 */
	int TUBE = 2;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE__DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE__FROM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE__NAME = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE__TO = 3;

	/**
	 * The number of structural features of the '<em>Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.flow.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.flow.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.flow.Cell#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see com.brainspeedtech.swarm.flow.Cell#getInput()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Input();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.flow.Cell#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see com.brainspeedtech.swarm.flow.Cell#getOutput()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Output();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.flow.Cell#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.swarm.flow.Cell#getCount()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.flow.Cell#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.brainspeedtech.swarm.flow.Cell#getDomain()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Domain();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.flow.Cell#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see com.brainspeedtech.swarm.flow.Cell#isExternal()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_External();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.flow.Cell#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.flow.Cell#getName()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.flow.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see com.brainspeedtech.swarm.flow.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.flow.Flow#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.flow.Flow#getCell()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Cell();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.flow.Flow#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.flow.Flow#getTube()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Tube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.flow.Flow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.flow.Flow#getName()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.flow.Tube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.flow.Tube
	 * @generated
	 */
	EClass getTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.flow.Tube#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Descriptor</em>'.
	 * @see com.brainspeedtech.swarm.flow.Tube#getDescriptor()
	 * @see #getTube()
	 * @generated
	 */
	EReference getTube_Descriptor();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.flow.Tube#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see com.brainspeedtech.swarm.flow.Tube#getFrom()
	 * @see #getTube()
	 * @generated
	 */
	EReference getTube_From();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.flow.Tube#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.flow.Tube#getName()
	 * @see #getTube()
	 * @generated
	 */
	EAttribute getTube_Name();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.flow.Tube#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see com.brainspeedtech.swarm.flow.Tube#getTo()
	 * @see #getTube()
	 * @generated
	 */
	EReference getTube_To();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.flow.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.flow.impl.CellImpl
		 * @see com.brainspeedtech.swarm.flow.impl.FlowPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__INPUT = eINSTANCE.getCell_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__OUTPUT = eINSTANCE.getCell_Output();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__COUNT = eINSTANCE.getCell_Count();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__DOMAIN = eINSTANCE.getCell_Domain();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__EXTERNAL = eINSTANCE.getCell_External();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__NAME = eINSTANCE.getCell_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.flow.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.flow.impl.FlowImpl
		 * @see com.brainspeedtech.swarm.flow.impl.FlowPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__CELL = eINSTANCE.getFlow_Cell();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TUBE = eINSTANCE.getFlow_Tube();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__NAME = eINSTANCE.getFlow_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.flow.impl.TubeImpl <em>Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.flow.impl.TubeImpl
		 * @see com.brainspeedtech.swarm.flow.impl.FlowPackageImpl#getTube()
		 * @generated
		 */
		EClass TUBE = eINSTANCE.getTube();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE__DESCRIPTOR = eINSTANCE.getTube_Descriptor();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE__FROM = eINSTANCE.getTube_From();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUBE__NAME = eINSTANCE.getTube_Name();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE__TO = eINSTANCE.getTube_To();

	}

} //FlowPackage
