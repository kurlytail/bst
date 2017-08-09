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
package com.brainspeedtech.swarm.inst;

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
 * @see com.brainspeedtech.swarm.inst.InstFactory
 * @model kind="package"
 * @generated
 */
public interface InstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inst";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/swarm/inst";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstPackage eINSTANCE = com.brainspeedtech.swarm.inst.impl.InstPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl <em>Cell Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.inst.impl.CellInstanceImpl
	 * @see com.brainspeedtech.swarm.inst.impl.InstPackageImpl#getCellInstance()
	 * @generated
	 */
	int CELL_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE__CELL = 2;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE__INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Internal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE__INTERNAL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE__PINNED = 6;

	/**
	 * The number of structural features of the '<em>Cell Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INSTANCE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.inst.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.inst.impl.InstanceImpl
	 * @see com.brainspeedtech.swarm.inst.impl.InstPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TUBE = 0;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CELL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl <em>Tube Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl
	 * @see com.brainspeedtech.swarm.inst.impl.InstPackageImpl#getTubeInstance()
	 * @generated
	 */
	int TUBE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE__TO = 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE__INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Internal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE__INTERNAL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Tube</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE__TUBE = 5;

	/**
	 * The number of structural features of the '<em>Tube Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBE_INSTANCE_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.inst.CellInstance <em>Cell Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Instance</em>'.
	 * @see com.brainspeedtech.swarm.inst.CellInstance
	 * @generated
	 */
	EClass getCellInstance();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.inst.CellInstance#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see com.brainspeedtech.swarm.inst.CellInstance#getInput()
	 * @see #getCellInstance()
	 * @generated
	 */
	EReference getCellInstance_Input();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.inst.CellInstance#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see com.brainspeedtech.swarm.inst.CellInstance#getOutput()
	 * @see #getCellInstance()
	 * @generated
	 */
	EReference getCellInstance_Output();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.inst.CellInstance#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.inst.CellInstance#getCell()
	 * @see #getCellInstance()
	 * @generated
	 */
	EReference getCellInstance_Cell();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.inst.CellInstance#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see com.brainspeedtech.swarm.inst.CellInstance#getInstance()
	 * @see #getCellInstance()
	 * @generated
	 */
	EAttribute getCellInstance_Instance();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.inst.CellInstance#getInternalName <em>Internal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Name</em>'.
	 * @see com.brainspeedtech.swarm.inst.CellInstance#getInternalName()
	 * @see #getCellInstance()
	 * @generated
	 */
	EAttribute getCellInstance_InternalName();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.inst.CellInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.inst.CellInstance#getName()
	 * @see #getCellInstance()
	 * @generated
	 */
	EAttribute getCellInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.inst.CellInstance#isPinned <em>Pinned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinned</em>'.
	 * @see com.brainspeedtech.swarm.inst.CellInstance#isPinned()
	 * @see #getCellInstance()
	 * @generated
	 */
	EAttribute getCellInstance_Pinned();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.inst.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see com.brainspeedtech.swarm.inst.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.inst.Instance#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.inst.Instance#getTube()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Tube();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.inst.Instance#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell</em>'.
	 * @see com.brainspeedtech.swarm.inst.Instance#getCell()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Cell();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.inst.Instance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.inst.Instance#getName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.inst.TubeInstance <em>Tube Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tube Instance</em>'.
	 * @see com.brainspeedtech.swarm.inst.TubeInstance
	 * @generated
	 */
	EClass getTubeInstance();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.inst.TubeInstance#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see com.brainspeedtech.swarm.inst.TubeInstance#getFrom()
	 * @see #getTubeInstance()
	 * @generated
	 */
	EReference getTubeInstance_From();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.inst.TubeInstance#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see com.brainspeedtech.swarm.inst.TubeInstance#getTo()
	 * @see #getTubeInstance()
	 * @generated
	 */
	EReference getTubeInstance_To();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.inst.TubeInstance#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see com.brainspeedtech.swarm.inst.TubeInstance#getInstance()
	 * @see #getTubeInstance()
	 * @generated
	 */
	EAttribute getTubeInstance_Instance();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.inst.TubeInstance#getInternalName <em>Internal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Name</em>'.
	 * @see com.brainspeedtech.swarm.inst.TubeInstance#getInternalName()
	 * @see #getTubeInstance()
	 * @generated
	 */
	EAttribute getTubeInstance_InternalName();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.inst.TubeInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.inst.TubeInstance#getName()
	 * @see #getTubeInstance()
	 * @generated
	 */
	EAttribute getTubeInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.inst.TubeInstance#getTube <em>Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tube</em>'.
	 * @see com.brainspeedtech.swarm.inst.TubeInstance#getTube()
	 * @see #getTubeInstance()
	 * @generated
	 */
	EReference getTubeInstance_Tube();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstFactory getInstFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.inst.impl.CellInstanceImpl <em>Cell Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.inst.impl.CellInstanceImpl
		 * @see com.brainspeedtech.swarm.inst.impl.InstPackageImpl#getCellInstance()
		 * @generated
		 */
		EClass CELL_INSTANCE = eINSTANCE.getCellInstance();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_INSTANCE__INPUT = eINSTANCE.getCellInstance_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_INSTANCE__OUTPUT = eINSTANCE.getCellInstance_Output();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_INSTANCE__CELL = eINSTANCE.getCellInstance_Cell();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_INSTANCE__INSTANCE = eINSTANCE.getCellInstance_Instance();

		/**
		 * The meta object literal for the '<em><b>Internal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_INSTANCE__INTERNAL_NAME = eINSTANCE.getCellInstance_InternalName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_INSTANCE__NAME = eINSTANCE.getCellInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Pinned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_INSTANCE__PINNED = eINSTANCE.getCellInstance_Pinned();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.inst.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.inst.impl.InstanceImpl
		 * @see com.brainspeedtech.swarm.inst.impl.InstPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__TUBE = eINSTANCE.getInstance_Tube();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CELL = eINSTANCE.getInstance_Cell();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl <em>Tube Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.inst.impl.TubeInstanceImpl
		 * @see com.brainspeedtech.swarm.inst.impl.InstPackageImpl#getTubeInstance()
		 * @generated
		 */
		EClass TUBE_INSTANCE = eINSTANCE.getTubeInstance();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE_INSTANCE__FROM = eINSTANCE.getTubeInstance_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE_INSTANCE__TO = eINSTANCE.getTubeInstance_To();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUBE_INSTANCE__INSTANCE = eINSTANCE.getTubeInstance_Instance();

		/**
		 * The meta object literal for the '<em><b>Internal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUBE_INSTANCE__INTERNAL_NAME = eINSTANCE.getTubeInstance_InternalName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUBE_INSTANCE__NAME = eINSTANCE.getTubeInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Tube</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBE_INSTANCE__TUBE = eINSTANCE.getTubeInstance_Tube();

	}

} //InstPackage
