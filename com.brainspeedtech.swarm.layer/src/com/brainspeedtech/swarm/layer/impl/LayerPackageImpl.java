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
package com.brainspeedtech.swarm.layer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.layer.Association;
import com.brainspeedtech.swarm.layer.AssociationType;
import com.brainspeedtech.swarm.layer.CellCounter;
import com.brainspeedtech.swarm.layer.CellInstanceCount;
import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.layer.ConvertMasterToSM;
import com.brainspeedtech.swarm.layer.CopyrightMessage;
import com.brainspeedtech.swarm.layer.Counter;
import com.brainspeedtech.swarm.layer.CrossReference;
import com.brainspeedtech.swarm.layer.Custom;
import com.brainspeedtech.swarm.layer.CustomTube;
import com.brainspeedtech.swarm.layer.ExternalCell;
import com.brainspeedtech.swarm.layer.FileReference;
import com.brainspeedtech.swarm.layer.FlowAnalysisAndMerge;
import com.brainspeedtech.swarm.layer.IgnoreCell;
import com.brainspeedtech.swarm.layer.IgnoreFlow;
import com.brainspeedtech.swarm.layer.IgnoreTube;
import com.brainspeedtech.swarm.layer.InstanceTransform;
import com.brainspeedtech.swarm.layer.Layer;
import com.brainspeedtech.swarm.layer.LayerFactory;
import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.layer.MatchingFlows;
import com.brainspeedtech.swarm.layer.ModelReference;
import com.brainspeedtech.swarm.layer.NatureBase;
import com.brainspeedtech.swarm.layer.Parameter;
import com.brainspeedtech.swarm.layer.ProjectPrefixString;
import com.brainspeedtech.swarm.layer.Property;
import com.brainspeedtech.swarm.layer.QueueDepth;
import com.brainspeedtech.swarm.layer.StreamingTube;
import com.brainspeedtech.swarm.layer.Tap;
import com.brainspeedtech.swarm.layer.Template;
import com.brainspeedtech.swarm.layer.Trigger;
import com.brainspeedtech.swarm.layer.TubeDescriptorLog;
import com.brainspeedtech.swarm.layer.TubeInstanceCount;
import com.brainspeedtech.swarm.layer.TubeReceiveCounter;
import com.brainspeedtech.swarm.layer.TubeTransmitCounter;
import com.brainspeedtech.swarm.layer.WidthType;
import com.brainspeedtech.swarm.layer.util.LayerValidator;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.sm.SmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerPackageImpl extends EPackageImpl implements LayerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellInstanceCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convertMasterToSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowAnalysisAndMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreTubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceTransformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingFlowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natureBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectPrefixStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueDepthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamingTubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tubeDescriptorLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tubeInstanceCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tubeReceiveCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tubeTransmitCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum widthTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType associationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType widthTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.brainspeedtech.swarm.layer.LayerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LayerPackageImpl() {
		super(eNS_URI, LayerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LayerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LayerPackage init() {
		if (isInited) return (LayerPackage)EPackage.Registry.INSTANCE.getEPackage(LayerPackage.eNS_URI);

		// Obtain or create and register package
		LayerPackageImpl theLayerPackage = (LayerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LayerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LayerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InstPackage.eINSTANCE.eClass();
		SmPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLayerPackage.createPackageContents();

		// Initialize created meta-data
		theLayerPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLayerPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LayerValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLayerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LayerPackage.eNS_URI, theLayerPackage);
		return theLayerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Tube() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Type() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellCounter() {
		return cellCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellCounter_Cell() {
		return (EReference)cellCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellInstanceCount() {
		return cellInstanceCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellInstanceCount_Cell() {
		return (EReference)cellInstanceCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellInstanceCount_Count() {
		return (EAttribute)cellInstanceCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintBase() {
		return constraintBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintBase_ExceptFor() {
		return (EReference)constraintBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintBase_ApplyToAllNatures() {
		return (EAttribute)constraintBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintBase_Blurb() {
		return (EAttribute)constraintBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintBase_Disabled() {
		return (EAttribute)constraintBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintBase_Pinned() {
		return (EAttribute)constraintBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintBase_Process() {
		return (EAttribute)constraintBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintBase_Reason() {
		return (EAttribute)constraintBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvertMasterToSM() {
		return convertMasterToSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvertMasterToSM_StateMachine() {
		return (EReference)convertMasterToSMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvertMasterToSM_Project() {
		return (EAttribute)convertMasterToSMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_Name() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_Width() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossReference() {
		return crossReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossReference_Object() {
		return (EReference)crossReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustom() {
		return customEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustom_Properties() {
		return (EReference)customEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustom_Clazz() {
		return (EAttribute)customEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTube() {
		return customTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomTube_Tube() {
		return (EReference)customTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalCell() {
		return externalCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalCell_MasterCell() {
		return (EReference)externalCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalCell_InstanceCell() {
		return (EReference)externalCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileReference() {
		return fileReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileReference_Files() {
		return (EAttribute)fileReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowAnalysisAndMerge() {
		return flowAnalysisAndMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnoreCell() {
		return ignoreCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgnoreCell_MasterCell() {
		return (EReference)ignoreCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnoreFlow() {
		return ignoreFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgnoreFlow_Flow() {
		return (EReference)ignoreFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnoreTube() {
		return ignoreTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIgnoreTube_Tube() {
		return (EReference)ignoreTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceTransform() {
		return instanceTransformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_Constraint() {
		return (EReference)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayer_Name() {
		return (EAttribute)layerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchingFlows() {
		return matchingFlowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchingFlows_Flows() {
		return (EReference)matchingFlowsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchingFlows_Name() {
		return (EAttribute)matchingFlowsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelReference() {
		return modelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_Object() {
		return (EReference)modelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNatureBase() {
		return natureBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Object() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectPrefixString() {
		return projectPrefixStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectPrefixString_Prefix() {
		return (EAttribute)projectPrefixStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_StringValue() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_ObjectValue() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueueDepth() {
		return queueDepthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueueDepth_Tube() {
		return (EReference)queueDepthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueueDepth_Depth() {
		return (EAttribute)queueDepthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamingTube() {
		return streamingTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreamingTube_Tube() {
		return (EReference)streamingTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTap() {
		return tapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTap_Tube() {
		return (EReference)tapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTap_Cell() {
		return (EReference)tapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplate() {
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplate_Code() {
		return (EAttribute)templateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplate_Tube() {
		return (EReference)templateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplate_File() {
		return (EAttribute)templateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplate_Object() {
		return (EReference)templateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_From() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_To() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Name() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTubeDescriptorLog() {
		return tubeDescriptorLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTubeDescriptorLog_Tube() {
		return (EReference)tubeDescriptorLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTubeDescriptorLog_Count() {
		return (EAttribute)tubeDescriptorLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTubeInstanceCount() {
		return tubeInstanceCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTubeInstanceCount_Count() {
		return (EAttribute)tubeInstanceCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTubeReceiveCounter() {
		return tubeReceiveCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTubeReceiveCounter_Tube() {
		return (EReference)tubeReceiveCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTubeTransmitCounter() {
		return tubeTransmitCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTubeTransmitCounter_Tube() {
		return (EReference)tubeTransmitCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTubeInstanceCount_Tube() {
		return (EReference)tubeInstanceCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociationType() {
		return associationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWidthType() {
		return widthTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAssociationTypeObject() {
		return associationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountType() {
		return countTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountType1() {
		return countType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountTypeObject() {
		return countTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountTypeObject1() {
		return countTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWidthTypeObject() {
		return widthTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerFactory getLayerFactory() {
		return (LayerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__TUBE);
		createEAttribute(associationEClass, ASSOCIATION__TYPE);

		cellCounterEClass = createEClass(CELL_COUNTER);
		createEReference(cellCounterEClass, CELL_COUNTER__CELL);

		cellInstanceCountEClass = createEClass(CELL_INSTANCE_COUNT);
		createEReference(cellInstanceCountEClass, CELL_INSTANCE_COUNT__CELL);
		createEAttribute(cellInstanceCountEClass, CELL_INSTANCE_COUNT__COUNT);

		constraintBaseEClass = createEClass(CONSTRAINT_BASE);
		createEReference(constraintBaseEClass, CONSTRAINT_BASE__EXCEPT_FOR);
		createEAttribute(constraintBaseEClass, CONSTRAINT_BASE__APPLY_TO_ALL_NATURES);
		createEAttribute(constraintBaseEClass, CONSTRAINT_BASE__BLURB);
		createEAttribute(constraintBaseEClass, CONSTRAINT_BASE__DISABLED);
		createEAttribute(constraintBaseEClass, CONSTRAINT_BASE__PINNED);
		createEAttribute(constraintBaseEClass, CONSTRAINT_BASE__PROCESS);
		createEAttribute(constraintBaseEClass, CONSTRAINT_BASE__REASON);

		convertMasterToSMEClass = createEClass(CONVERT_MASTER_TO_SM);
		createEReference(convertMasterToSMEClass, CONVERT_MASTER_TO_SM__STATE_MACHINE);
		createEAttribute(convertMasterToSMEClass, CONVERT_MASTER_TO_SM__PROJECT);

		counterEClass = createEClass(COUNTER);
		createEAttribute(counterEClass, COUNTER__NAME);
		createEAttribute(counterEClass, COUNTER__WIDTH);

		crossReferenceEClass = createEClass(CROSS_REFERENCE);
		createEReference(crossReferenceEClass, CROSS_REFERENCE__OBJECT);

		customEClass = createEClass(CUSTOM);
		createEReference(customEClass, CUSTOM__PROPERTIES);
		createEAttribute(customEClass, CUSTOM__CLAZZ);

		customTubeEClass = createEClass(CUSTOM_TUBE);
		createEReference(customTubeEClass, CUSTOM_TUBE__TUBE);

		externalCellEClass = createEClass(EXTERNAL_CELL);
		createEReference(externalCellEClass, EXTERNAL_CELL__MASTER_CELL);
		createEReference(externalCellEClass, EXTERNAL_CELL__INSTANCE_CELL);

		fileReferenceEClass = createEClass(FILE_REFERENCE);
		createEAttribute(fileReferenceEClass, FILE_REFERENCE__FILES);

		flowAnalysisAndMergeEClass = createEClass(FLOW_ANALYSIS_AND_MERGE);

		ignoreCellEClass = createEClass(IGNORE_CELL);
		createEReference(ignoreCellEClass, IGNORE_CELL__MASTER_CELL);

		ignoreFlowEClass = createEClass(IGNORE_FLOW);
		createEReference(ignoreFlowEClass, IGNORE_FLOW__FLOW);

		ignoreTubeEClass = createEClass(IGNORE_TUBE);
		createEReference(ignoreTubeEClass, IGNORE_TUBE__TUBE);

		instanceTransformEClass = createEClass(INSTANCE_TRANSFORM);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__CONSTRAINT);
		createEAttribute(layerEClass, LAYER__NAME);

		matchingFlowsEClass = createEClass(MATCHING_FLOWS);
		createEReference(matchingFlowsEClass, MATCHING_FLOWS__FLOWS);
		createEAttribute(matchingFlowsEClass, MATCHING_FLOWS__NAME);

		modelReferenceEClass = createEClass(MODEL_REFERENCE);
		createEReference(modelReferenceEClass, MODEL_REFERENCE__OBJECT);

		natureBaseEClass = createEClass(NATURE_BASE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OBJECT);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		projectPrefixStringEClass = createEClass(PROJECT_PREFIX_STRING);
		createEAttribute(projectPrefixStringEClass, PROJECT_PREFIX_STRING__PREFIX);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEAttribute(propertyEClass, PROPERTY__STRING_VALUE);
		createEReference(propertyEClass, PROPERTY__OBJECT_VALUE);
		createEAttribute(propertyEClass, PROPERTY__NAME);

		queueDepthEClass = createEClass(QUEUE_DEPTH);
		createEReference(queueDepthEClass, QUEUE_DEPTH__TUBE);
		createEAttribute(queueDepthEClass, QUEUE_DEPTH__DEPTH);

		streamingTubeEClass = createEClass(STREAMING_TUBE);
		createEReference(streamingTubeEClass, STREAMING_TUBE__TUBE);

		tapEClass = createEClass(TAP);
		createEReference(tapEClass, TAP__TUBE);
		createEReference(tapEClass, TAP__CELL);

		templateEClass = createEClass(TEMPLATE);
		createEAttribute(templateEClass, TEMPLATE__CODE);
		createEReference(templateEClass, TEMPLATE__TUBE);
		createEAttribute(templateEClass, TEMPLATE__FILE);
		createEReference(templateEClass, TEMPLATE__OBJECT);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__FROM);
		createEReference(triggerEClass, TRIGGER__TO);
		createEAttribute(triggerEClass, TRIGGER__NAME);

		tubeDescriptorLogEClass = createEClass(TUBE_DESCRIPTOR_LOG);
		createEReference(tubeDescriptorLogEClass, TUBE_DESCRIPTOR_LOG__TUBE);
		createEAttribute(tubeDescriptorLogEClass, TUBE_DESCRIPTOR_LOG__COUNT);

		tubeInstanceCountEClass = createEClass(TUBE_INSTANCE_COUNT);
		createEReference(tubeInstanceCountEClass, TUBE_INSTANCE_COUNT__TUBE);
		createEAttribute(tubeInstanceCountEClass, TUBE_INSTANCE_COUNT__COUNT);

		tubeReceiveCounterEClass = createEClass(TUBE_RECEIVE_COUNTER);
		createEReference(tubeReceiveCounterEClass, TUBE_RECEIVE_COUNTER__TUBE);

		tubeTransmitCounterEClass = createEClass(TUBE_TRANSMIT_COUNTER);
		createEReference(tubeTransmitCounterEClass, TUBE_TRANSMIT_COUNTER__TUBE);

		// Create enums
		associationTypeEEnum = createEEnum(ASSOCIATION_TYPE);
		widthTypeEEnum = createEEnum(WIDTH_TYPE);

		// Create data types
		associationTypeObjectEDataType = createEDataType(ASSOCIATION_TYPE_OBJECT);
		countTypeEDataType = createEDataType(COUNT_TYPE);
		countType1EDataType = createEDataType(COUNT_TYPE1);
		countTypeObjectEDataType = createEDataType(COUNT_TYPE_OBJECT);
		countTypeObject1EDataType = createEDataType(COUNT_TYPE_OBJECT1);
		widthTypeObjectEDataType = createEDataType(WIDTH_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MasterPackage theMasterPackage = (MasterPackage)EPackage.Registry.INSTANCE.getEPackage(MasterPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		SmPackage theSmPackage = (SmPackage)EPackage.Registry.INSTANCE.getEPackage(SmPackage.eNS_URI);
		InstPackage theInstPackage = (InstPackage)EPackage.Registry.INSTANCE.getEPackage(InstPackage.eNS_URI);
		FlowPackage theFlowPackage = (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		associationEClass.getESuperTypes().add(this.getConstraintBase());
		cellCounterEClass.getESuperTypes().add(this.getCounter());
		cellInstanceCountEClass.getESuperTypes().add(this.getConstraintBase());
		convertMasterToSMEClass.getESuperTypes().add(this.getConstraintBase());
		counterEClass.getESuperTypes().add(this.getConstraintBase());
		crossReferenceEClass.getESuperTypes().add(this.getConstraintBase());
		customEClass.getESuperTypes().add(this.getConstraintBase());
		customTubeEClass.getESuperTypes().add(this.getConstraintBase());
		externalCellEClass.getESuperTypes().add(this.getConstraintBase());
		fileReferenceEClass.getESuperTypes().add(this.getConstraintBase());
		flowAnalysisAndMergeEClass.getESuperTypes().add(this.getNatureBase());
		ignoreCellEClass.getESuperTypes().add(this.getConstraintBase());
		ignoreFlowEClass.getESuperTypes().add(this.getConstraintBase());
		ignoreTubeEClass.getESuperTypes().add(this.getConstraintBase());
		instanceTransformEClass.getESuperTypes().add(this.getNatureBase());
		matchingFlowsEClass.getESuperTypes().add(this.getConstraintBase());
		modelReferenceEClass.getESuperTypes().add(this.getConstraintBase());
		parameterEClass.getESuperTypes().add(this.getConstraintBase());
		projectPrefixStringEClass.getESuperTypes().add(this.getConstraintBase());
		queueDepthEClass.getESuperTypes().add(this.getConstraintBase());
		streamingTubeEClass.getESuperTypes().add(this.getConstraintBase());
		tapEClass.getESuperTypes().add(this.getConstraintBase());
		templateEClass.getESuperTypes().add(this.getConstraintBase());
		triggerEClass.getESuperTypes().add(this.getConstraintBase());
		tubeDescriptorLogEClass.getESuperTypes().add(this.getConstraintBase());
		tubeInstanceCountEClass.getESuperTypes().add(this.getConstraintBase());
		tubeReceiveCounterEClass.getESuperTypes().add(this.getCounter());
		tubeTransmitCounterEClass.getESuperTypes().add(this.getCounter());

		// Initialize classes and features; add operations and parameters
		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Type(), this.getAssociationType(), "type", "One To One", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellCounterEClass, CellCounter.class, "CellCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellCounter_Cell(), theMasterPackage.getMasterCell(), null, "cell", null, 0, -1, CellCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellInstanceCountEClass, CellInstanceCount.class, "CellInstanceCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellInstanceCount_Cell(), theMasterPackage.getMasterCell(), null, "cell", null, 0, -1, CellInstanceCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCellInstanceCount_Count(), this.getCountType1(), "count", null, 0, 1, CellInstanceCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintBaseEClass, ConstraintBase.class, "ConstraintBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintBase_ExceptFor(), this.getNatureBase(), null, "exceptFor", null, 0, -1, ConstraintBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintBase_ApplyToAllNatures(), theXMLTypePackage.getBoolean(), "applyToAllNatures", "true", 0, 1, ConstraintBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintBase_Blurb(), theXMLTypePackage.getString(), "blurb", "Add Description", 0, 1, ConstraintBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintBase_Disabled(), theXMLTypePackage.getBoolean(), "disabled", "false", 0, 1, ConstraintBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintBase_Pinned(), theXMLTypePackage.getBoolean(), "pinned", "true", 0, 1, ConstraintBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintBase_Process(), theXMLTypePackage.getString(), "process", "Manually Added", 0, 1, ConstraintBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintBase_Reason(), theXMLTypePackage.getString(), "reason", "User Interaction", 0, 1, ConstraintBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convertMasterToSMEClass, ConvertMasterToSM.class, "ConvertMasterToSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConvertMasterToSM_StateMachine(), theSmPackage.getStateMachine(), null, "stateMachine", null, 1, 1, ConvertMasterToSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConvertMasterToSM_Project(), theXMLTypePackage.getString(), "project", null, 0, 1, ConvertMasterToSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCounter_Name(), theXMLTypePackage.getString(), "name", "Set Name", 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_Width(), this.getWidthType(), "width", null, 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossReferenceEClass, CrossReference.class, "CrossReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossReference_Object(), ecorePackage.getEObject(), null, "object", null, 0, -1, CrossReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customEClass, Custom.class, "Custom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustom_Properties(), this.getProperty(), null, "properties", null, 0, -1, Custom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustom_Clazz(), theXMLTypePackage.getString(), "clazz", null, 0, 1, Custom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customTubeEClass, CustomTube.class, "CustomTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomTube_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, CustomTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalCellEClass, ExternalCell.class, "ExternalCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalCell_MasterCell(), theMasterPackage.getMasterCell(), null, "masterCell", null, 0, -1, ExternalCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalCell_InstanceCell(), theInstPackage.getCellInstance(), null, "instanceCell", null, 0, -1, ExternalCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileReferenceEClass, FileReference.class, "FileReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileReference_Files(), theXMLTypePackage.getString(), "files", null, 0, -1, FileReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowAnalysisAndMergeEClass, FlowAnalysisAndMerge.class, "FlowAnalysisAndMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ignoreCellEClass, IgnoreCell.class, "IgnoreCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIgnoreCell_MasterCell(), theMasterPackage.getMasterCell(), null, "masterCell", null, 0, -1, IgnoreCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ignoreFlowEClass, IgnoreFlow.class, "IgnoreFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIgnoreFlow_Flow(), theFlowPackage.getFlow(), null, "flow", null, 0, -1, IgnoreFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ignoreTubeEClass, IgnoreTube.class, "IgnoreTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIgnoreTube_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, IgnoreTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceTransformEClass, InstanceTransform.class, "InstanceTransform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayer_Constraint(), this.getConstraintBase(), null, "constraint", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayer_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchingFlowsEClass, MatchingFlows.class, "MatchingFlows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchingFlows_Flows(), theFlowPackage.getFlow(), null, "flows", null, 0, -1, MatchingFlows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatchingFlows_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MatchingFlows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelReference_Object(), ecorePackage.getEObject(), null, "object", null, 0, -1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(natureBaseEClass, NatureBase.class, "NatureBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Object(), ecorePackage.getEObject(), null, "object", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), theXMLTypePackage.getString(), "value", "int", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectPrefixStringEClass, ProjectPrefixString.class, "ProjectPrefixString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectPrefixString_Prefix(), theXMLTypePackage.getString(), "prefix", null, 0, 1, ProjectPrefixString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Value(), ecorePackage.getEFeatureMapEntry(), "value", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_StringValue(), theXMLTypePackage.getString(), "stringValue", null, 0, -1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_ObjectValue(), ecorePackage.getEObject(), null, "objectValue", null, 0, -1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueDepthEClass, QueueDepth.class, "QueueDepth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueueDepth_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, QueueDepth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueDepth_Depth(), theXMLTypePackage.getLong(), "depth", "0", 0, 1, QueueDepth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamingTubeEClass, StreamingTube.class, "StreamingTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStreamingTube_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, StreamingTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tapEClass, Tap.class, "Tap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTap_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, Tap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTap_Cell(), theMasterPackage.getMasterCell(), null, "cell", null, 1, 1, Tap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplate_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplate_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplate_File(), theXMLTypePackage.getString(), "file", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplate_Object(), ecorePackage.getEObject(), null, "object", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_From(), theFlowPackage.getCell(), null, "from", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_To(), theFlowPackage.getCell(), null, "to", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tubeDescriptorLogEClass, TubeDescriptorLog.class, "TubeDescriptorLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTubeDescriptorLog_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, TubeDescriptorLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTubeDescriptorLog_Count(), theXMLTypePackage.getInt(), "count", "32", 0, 1, TubeDescriptorLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tubeInstanceCountEClass, TubeInstanceCount.class, "TubeInstanceCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTubeInstanceCount_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, TubeInstanceCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTubeInstanceCount_Count(), this.getCountType(), "count", null, 0, 1, TubeInstanceCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tubeReceiveCounterEClass, TubeReceiveCounter.class, "TubeReceiveCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTubeReceiveCounter_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, TubeReceiveCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tubeTransmitCounterEClass, TubeTransmitCounter.class, "TubeTransmitCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTubeTransmitCounter_Tube(), theMasterPackage.getMasterTube(), null, "tube", null, 0, -1, TubeTransmitCounter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(associationTypeEEnum, AssociationType.class, "AssociationType");
		addEEnumLiteral(associationTypeEEnum, AssociationType.ONE_TO_ONE);
		addEEnumLiteral(associationTypeEEnum, AssociationType.ONE_TO_MANY);
		addEEnumLiteral(associationTypeEEnum, AssociationType.MANY_TO_ONE);
		addEEnumLiteral(associationTypeEEnum, AssociationType.MANY_TO_MANY);

		initEEnum(widthTypeEEnum, WidthType.class, "WidthType");
		addEEnumLiteral(widthTypeEEnum, WidthType._16BIT);
		addEEnumLiteral(widthTypeEEnum, WidthType._32BIT);
		addEEnumLiteral(widthTypeEEnum, WidthType._64BIT);

		// Initialize data types
		initEDataType(associationTypeObjectEDataType, AssociationType.class, "AssociationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(countTypeEDataType, int.class, "CountType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(countType1EDataType, int.class, "CountType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(countTypeObjectEDataType, Integer.class, "CountTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(countTypeObject1EDataType, Integer.class, "CountTypeObject1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(widthTypeObjectEDataType, WidthType.class, "WidthTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.brainspeedtech.com
		createWwwAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "name", "Association",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAssociation_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociation_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (associationTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "AssociationType"
		   });		
		addAnnotation
		  (associationTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "AssociationType:Object",
			 "baseType", "AssociationType"
		   });		
		addAnnotation
		  (cellCounterEClass, 
		   source, 
		   new String[] {
			 "name", "CellCounter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCellCounter_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (cellInstanceCountEClass, 
		   source, 
		   new String[] {
			 "name", "CellInstanceCount",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCellInstanceCount_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCellInstanceCount_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (constraintBaseEClass, 
		   source, 
		   new String[] {
			 "name", "ConstraintBase",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConstraintBase_ExceptFor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "except_for",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConstraintBase_ApplyToAllNatures(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "apply_to_all_natures"
		   });		
		addAnnotation
		  (getConstraintBase_Blurb(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "blurb"
		   });		
		addAnnotation
		  (getConstraintBase_Disabled(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "disabled"
		   });		
		addAnnotation
		  (getConstraintBase_Pinned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pinned"
		   });		
		addAnnotation
		  (getConstraintBase_Process(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "process"
		   });		
		addAnnotation
		  (getConstraintBase_Reason(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "reason"
		   });		
		addAnnotation
		  (convertMasterToSMEClass, 
		   source, 
		   new String[] {
			 "name", "ConvertMasterToSM",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConvertMasterToSM_StateMachine(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stateMachine",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConvertMasterToSM_Project(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "project"
		   });		
		addAnnotation
		  (counterEClass, 
		   source, 
		   new String[] {
			 "name", "Counter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCounter_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getCounter_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (countTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "count_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1"
		   });		
		addAnnotation
		  (countType1EDataType, 
		   source, 
		   new String[] {
			 "name", "count_._1_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1"
		   });		
		addAnnotation
		  (countTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "count_._type:Object",
			 "baseType", "count_._type"
		   });		
		addAnnotation
		  (countTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "count_._1_._type:Object",
			 "baseType", "count_._1_._type"
		   });		
		addAnnotation
		  (crossReferenceEClass, 
		   source, 
		   new String[] {
			 "name", "CrossReference",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCrossReference_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (customEClass, 
		   source, 
		   new String[] {
			 "name", "Custom",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCustom_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustom_Clazz(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clazz"
		   });				
		addAnnotation
		  (customTubeEClass, 
		   source, 
		   new String[] {
			 "name", "CustomTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCustomTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (externalCellEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalCell",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExternalCell_MasterCell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterCell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExternalCell_InstanceCell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instanceCell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fileReferenceEClass, 
		   source, 
		   new String[] {
			 "name", "FileReference",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFileReference_Files(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "files",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (flowAnalysisAndMergeEClass, 
		   source, 
		   new String[] {
			 "name", "FlowAnalysisAndMerge",
			 "kind", "empty"
		   });				
		addAnnotation
		  (ignoreCellEClass, 
		   source, 
		   new String[] {
			 "name", "IgnoreCell",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIgnoreCell_MasterCell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "masterCell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (ignoreFlowEClass, 
		   source, 
		   new String[] {
			 "name", "IgnoreFlow",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIgnoreFlow_Flow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "flow",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (ignoreTubeEClass, 
		   source, 
		   new String[] {
			 "name", "IgnoreTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIgnoreTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (instanceTransformEClass, 
		   source, 
		   new String[] {
			 "name", "InstanceTransform",
			 "kind", "empty"
		   });		
		addAnnotation
		  (layerEClass, 
		   source, 
		   new String[] {
			 "name", "Layer",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLayer_Constraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constraint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLayer_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (matchingFlowsEClass, 
		   source, 
		   new String[] {
			 "name", "MatchingFlows",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMatchingFlows_Flows(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "flows",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMatchingFlows_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (modelReferenceEClass, 
		   source, 
		   new String[] {
			 "name", "ModelReference",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModelReference_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (natureBaseEClass, 
		   source, 
		   new String[] {
			 "name", "NatureBase",
			 "kind", "empty"
		   });		
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "name", "Parameter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getParameter_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParameter_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getParameter_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (projectPrefixStringEClass, 
		   source, 
		   new String[] {
			 "name", "ProjectPrefixString",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProjectPrefixString_Prefix(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prefix"
		   });		
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "name", "Property",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProperty_Value(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "value:0"
		   });		
		addAnnotation
		  (getProperty_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace",
			 "group", "#value:0"
		   });		
		addAnnotation
		  (getProperty_ObjectValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object_value",
			 "namespace", "##targetNamespace",
			 "group", "#value:0"
		   });		
		addAnnotation
		  (getProperty_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (queueDepthEClass, 
		   source, 
		   new String[] {
			 "name", "QueueDepth",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQueueDepth_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueueDepth_Depth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "depth"
		   });				
		addAnnotation
		  (streamingTubeEClass, 
		   source, 
		   new String[] {
			 "name", "StreamingTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStreamingTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tapEClass, 
		   source, 
		   new String[] {
			 "name", "Tap",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTap_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTap_Cell(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cell",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (templateEClass, 
		   source, 
		   new String[] {
			 "name", "Template",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTemplate_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTemplate_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTemplate_File(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTemplate_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (triggerEClass, 
		   source, 
		   new String[] {
			 "name", "Trigger",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrigger_From(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "from",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrigger_To(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "to",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrigger_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (tubeDescriptorLogEClass, 
		   source, 
		   new String[] {
			 "name", "TubeDescriptorLog",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTubeDescriptorLog_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTubeDescriptorLog_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (tubeInstanceCountEClass, 
		   source, 
		   new String[] {
			 "name", "TubeInstanceCount",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTubeInstanceCount_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTubeInstanceCount_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (tubeReceiveCounterEClass, 
		   source, 
		   new String[] {
			 "name", "TubeReceiveCounter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTubeReceiveCounter_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tubeTransmitCounterEClass, 
		   source, 
		   new String[] {
			 "name", "TubeTransmitCounter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTubeTransmitCounter_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (widthTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "width_._type"
		   });		
		addAnnotation
		  (widthTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "width_._type:Object",
			 "baseType", "width_._type"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.brainspeedtech.com</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createWwwAnnotations() {
		String source = "http://www.brainspeedtech.com";																																				
		addAnnotation
		  (customTubeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "com.bst.gen.swarmMasterNature"
		   });											
		addAnnotation
		  (ignoreCellEClass, 
		   source, 
		   new String[] {
			 "appinfo", "com.bst.gen.swarmMasterNature"
		   });							
		addAnnotation
		  (ignoreTubeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "com.bst.gen.swarmMasterNature"
		   });																													
		addAnnotation
		  (streamingTubeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "com.bst.gen.swarmMasterNature"
		   });																										
	}

} //LayerPackageImpl
