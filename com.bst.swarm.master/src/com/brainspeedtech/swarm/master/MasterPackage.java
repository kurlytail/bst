/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master;

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
 * @see com.brainspeedtech.swarm.master.MasterFactory
 * @model kind="package"
 * @generated
 */
public interface MasterPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "master";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/swarm/master";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "master";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MasterPackage eINSTANCE = com.brainspeedtech.swarm.master.impl.MasterPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.master.impl.MasterCellImpl
	 * @see com.brainspeedtech.swarm.master.impl.MasterPackageImpl#getMasterCell()
	 * @generated
	 */
	int MASTER_CELL = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Design Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL__DESIGN_CELLS = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL__COUNT = 3;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL__EXTERNAL = 4;

	/**
	 * The feature id for the '<em><b>Internal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL__INTERNAL_NAME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL__NAME = 6;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL__PINNED = 7;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_CELL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.master.impl.MasterDesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.master.impl.MasterDesignImpl
	 * @see com.brainspeedtech.swarm.master.impl.MasterPackageImpl#getMasterDesign()
	 * @generated
	 */
	int MASTER_DESIGN = 1;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DESIGN__CELL = 0;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DESIGN__TUBE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DESIGN__NAME = 2;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DESIGN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.master.impl.MasterTubeImpl <em>Tube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.master.impl.MasterTubeImpl
	 * @see com.brainspeedtech.swarm.master.impl.MasterPackageImpl#getMasterTube()
	 * @generated
	 */
	int MASTER_TUBE = 2;

	/**
	 * The feature id for the '<em><b>Design Tubes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_TUBE__DESIGN_TUBES = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_TUBE__FROM = 1;

	/**
	 * The feature id for the '<em><b>Internal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_TUBE__INTERNAL_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_TUBE__NAME = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_TUBE__TO = 4;

	/**
	 * The number of structural features of the '<em>Tube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_TUBE_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.master.MasterCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell
	 * @generated
	 */
	EClass getMasterCell();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.master.MasterCell#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell#getInput()
	 * @see #getMasterCell()
	 * @generated
	 */
	EReference getMasterCell_Input();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.master.MasterCell#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell#getOutput()
	 * @see #getMasterCell()
	 * @generated
	 */
	EReference getMasterCell_Output();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.master.MasterCell#getDesignCells <em>Design Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Cells</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell#getDesignCells()
	 * @see #getMasterCell()
	 * @generated
	 */
	EReference getMasterCell_DesignCells();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.master.MasterCell#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell#getCount()
	 * @see #getMasterCell()
	 * @generated
	 */
	EAttribute getMasterCell_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.master.MasterCell#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell#isExternal()
	 * @see #getMasterCell()
	 * @generated
	 */
	EAttribute getMasterCell_External();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.master.MasterCell#getInternalName <em>Internal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Name</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell#getInternalName()
	 * @see #getMasterCell()
	 * @generated
	 */
	EAttribute getMasterCell_InternalName();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.master.MasterCell#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell#getName()
	 * @see #getMasterCell()
	 * @generated
	 */
	EAttribute getMasterCell_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.master.MasterCell#isPinned <em>Pinned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinned</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterCell#isPinned()
	 * @see #getMasterCell()
	 * @generated
	 */
	EAttribute getMasterCell_Pinned();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.master.MasterDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterDesign
	 * @generated
	 */
	EClass getMasterDesign();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.master.MasterDesign#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterDesign#getCell()
	 * @see #getMasterDesign()
	 * @generated
	 */
	EReference getMasterDesign_Cell();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.master.MasterDesign#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterDesign#getTube()
	 * @see #getMasterDesign()
	 * @generated
	 */
	EReference getMasterDesign_Tube();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.master.MasterDesign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterDesign#getName()
	 * @see #getMasterDesign()
	 * @generated
	 */
	EAttribute getMasterDesign_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.master.MasterTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterTube
	 * @generated
	 */
	EClass getMasterTube();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.master.MasterTube#getDesignTubes <em>Design Tubes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Tubes</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterTube#getDesignTubes()
	 * @see #getMasterTube()
	 * @generated
	 */
	EReference getMasterTube_DesignTubes();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.master.MasterTube#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterTube#getFrom()
	 * @see #getMasterTube()
	 * @generated
	 */
	EReference getMasterTube_From();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.master.MasterTube#getInternalName <em>Internal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Name</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterTube#getInternalName()
	 * @see #getMasterTube()
	 * @generated
	 */
	EAttribute getMasterTube_InternalName();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.master.MasterTube#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterTube#getName()
	 * @see #getMasterTube()
	 * @generated
	 */
	EAttribute getMasterTube_Name();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.master.MasterTube#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see com.brainspeedtech.swarm.master.MasterTube#getTo()
	 * @see #getMasterTube()
	 * @generated
	 */
	EReference getMasterTube_To();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MasterFactory getMasterFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.master.impl.MasterCellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.master.impl.MasterCellImpl
		 * @see com.brainspeedtech.swarm.master.impl.MasterPackageImpl#getMasterCell()
		 * @generated
		 */
		EClass MASTER_CELL = eINSTANCE.getMasterCell();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_CELL__INPUT = eINSTANCE.getMasterCell_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_CELL__OUTPUT = eINSTANCE.getMasterCell_Output();

		/**
		 * The meta object literal for the '<em><b>Design Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_CELL__DESIGN_CELLS = eINSTANCE.getMasterCell_DesignCells();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_CELL__COUNT = eINSTANCE.getMasterCell_Count();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_CELL__EXTERNAL = eINSTANCE.getMasterCell_External();

		/**
		 * The meta object literal for the '<em><b>Internal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_CELL__INTERNAL_NAME = eINSTANCE.getMasterCell_InternalName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_CELL__NAME = eINSTANCE.getMasterCell_Name();

		/**
		 * The meta object literal for the '<em><b>Pinned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_CELL__PINNED = eINSTANCE.getMasterCell_Pinned();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.master.impl.MasterDesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.master.impl.MasterDesignImpl
		 * @see com.brainspeedtech.swarm.master.impl.MasterPackageImpl#getMasterDesign()
		 * @generated
		 */
		EClass MASTER_DESIGN = eINSTANCE.getMasterDesign();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_DESIGN__CELL = eINSTANCE.getMasterDesign_Cell();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_DESIGN__TUBE = eINSTANCE.getMasterDesign_Tube();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_DESIGN__NAME = eINSTANCE.getMasterDesign_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.master.impl.MasterTubeImpl <em>Tube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.master.impl.MasterTubeImpl
		 * @see com.brainspeedtech.swarm.master.impl.MasterPackageImpl#getMasterTube()
		 * @generated
		 */
		EClass MASTER_TUBE = eINSTANCE.getMasterTube();

		/**
		 * The meta object literal for the '<em><b>Design Tubes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_TUBE__DESIGN_TUBES = eINSTANCE.getMasterTube_DesignTubes();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_TUBE__FROM = eINSTANCE.getMasterTube_From();

		/**
		 * The meta object literal for the '<em><b>Internal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_TUBE__INTERNAL_NAME = eINSTANCE.getMasterTube_InternalName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_TUBE__NAME = eINSTANCE.getMasterTube_Name();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_TUBE__TO = eINSTANCE.getMasterTube_To();

	}

} //MasterPackage
