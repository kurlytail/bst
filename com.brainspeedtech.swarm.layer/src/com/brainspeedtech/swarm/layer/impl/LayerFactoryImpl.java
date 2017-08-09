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

import com.brainspeedtech.swarm.layer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerFactoryImpl extends EFactoryImpl implements LayerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayerFactory init() {
		try {
			LayerFactory theLayerFactory = (LayerFactory)EPackage.Registry.INSTANCE.getEFactory(LayerPackage.eNS_URI);
			if (theLayerFactory != null) {
				return theLayerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LayerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerFactoryImpl() {
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
			case LayerPackage.ASSOCIATION: return createAssociation();
			case LayerPackage.CELL_COUNTER: return createCellCounter();
			case LayerPackage.CELL_INSTANCE_COUNT: return createCellInstanceCount();
			case LayerPackage.CONVERT_MASTER_TO_SM: return createConvertMasterToSM();
			case LayerPackage.COUNTER: return createCounter();
			case LayerPackage.CROSS_REFERENCE: return createCrossReference();
			case LayerPackage.CUSTOM: return createCustom();
			case LayerPackage.CUSTOM_TUBE: return createCustomTube();
			case LayerPackage.EXTERNAL_CELL: return createExternalCell();
			case LayerPackage.FILE_REFERENCE: return createFileReference();
			case LayerPackage.FLOW_ANALYSIS_AND_MERGE: return createFlowAnalysisAndMerge();
			case LayerPackage.IGNORE_CELL: return createIgnoreCell();
			case LayerPackage.IGNORE_FLOW: return createIgnoreFlow();
			case LayerPackage.IGNORE_TUBE: return createIgnoreTube();
			case LayerPackage.INSTANCE_TRANSFORM: return createInstanceTransform();
			case LayerPackage.LAYER: return createLayer();
			case LayerPackage.MATCHING_FLOWS: return createMatchingFlows();
			case LayerPackage.MODEL_REFERENCE: return createModelReference();
			case LayerPackage.PARAMETER: return createParameter();
			case LayerPackage.PROJECT_PREFIX_STRING: return createProjectPrefixString();
			case LayerPackage.PROPERTY: return createProperty();
			case LayerPackage.QUEUE_DEPTH: return createQueueDepth();
			case LayerPackage.STREAMING_TUBE: return createStreamingTube();
			case LayerPackage.TAP: return createTap();
			case LayerPackage.TEMPLATE: return createTemplate();
			case LayerPackage.TRIGGER: return createTrigger();
			case LayerPackage.TUBE_DESCRIPTOR_LOG: return createTubeDescriptorLog();
			case LayerPackage.TUBE_INSTANCE_COUNT: return createTubeInstanceCount();
			case LayerPackage.TUBE_RECEIVE_COUNTER: return createTubeReceiveCounter();
			case LayerPackage.TUBE_TRANSMIT_COUNTER: return createTubeTransmitCounter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LayerPackage.ASSOCIATION_TYPE:
				return createAssociationTypeFromString(eDataType, initialValue);
			case LayerPackage.WIDTH_TYPE:
				return createWidthTypeFromString(eDataType, initialValue);
			case LayerPackage.ASSOCIATION_TYPE_OBJECT:
				return createAssociationTypeObjectFromString(eDataType, initialValue);
			case LayerPackage.COUNT_TYPE:
				return createCountTypeFromString(eDataType, initialValue);
			case LayerPackage.COUNT_TYPE1:
				return createCountType1FromString(eDataType, initialValue);
			case LayerPackage.COUNT_TYPE_OBJECT:
				return createCountTypeObjectFromString(eDataType, initialValue);
			case LayerPackage.COUNT_TYPE_OBJECT1:
				return createCountTypeObject1FromString(eDataType, initialValue);
			case LayerPackage.WIDTH_TYPE_OBJECT:
				return createWidthTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LayerPackage.ASSOCIATION_TYPE:
				return convertAssociationTypeToString(eDataType, instanceValue);
			case LayerPackage.WIDTH_TYPE:
				return convertWidthTypeToString(eDataType, instanceValue);
			case LayerPackage.ASSOCIATION_TYPE_OBJECT:
				return convertAssociationTypeObjectToString(eDataType, instanceValue);
			case LayerPackage.COUNT_TYPE:
				return convertCountTypeToString(eDataType, instanceValue);
			case LayerPackage.COUNT_TYPE1:
				return convertCountType1ToString(eDataType, instanceValue);
			case LayerPackage.COUNT_TYPE_OBJECT:
				return convertCountTypeObjectToString(eDataType, instanceValue);
			case LayerPackage.COUNT_TYPE_OBJECT1:
				return convertCountTypeObject1ToString(eDataType, instanceValue);
			case LayerPackage.WIDTH_TYPE_OBJECT:
				return convertWidthTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellCounter createCellCounter() {
		CellCounterImpl cellCounter = new CellCounterImpl();
		return cellCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstanceCount createCellInstanceCount() {
		CellInstanceCountImpl cellInstanceCount = new CellInstanceCountImpl();
		return cellInstanceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConvertMasterToSM createConvertMasterToSM() {
		ConvertMasterToSMImpl convertMasterToSM = new ConvertMasterToSMImpl();
		return convertMasterToSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter createCounter() {
		CounterImpl counter = new CounterImpl();
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossReference createCrossReference() {
		CrossReferenceImpl crossReference = new CrossReferenceImpl();
		return crossReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custom createCustom() {
		CustomImpl custom = new CustomImpl();
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTube createCustomTube() {
		CustomTubeImpl customTube = new CustomTubeImpl();
		return customTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCell createExternalCell() {
		ExternalCellImpl externalCell = new ExternalCellImpl();
		return externalCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileReference createFileReference() {
		FileReferenceImpl fileReference = new FileReferenceImpl();
		return fileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowAnalysisAndMerge createFlowAnalysisAndMerge() {
		FlowAnalysisAndMergeImpl flowAnalysisAndMerge = new FlowAnalysisAndMergeImpl();
		return flowAnalysisAndMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreCell createIgnoreCell() {
		IgnoreCellImpl ignoreCell = new IgnoreCellImpl();
		return ignoreCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreFlow createIgnoreFlow() {
		IgnoreFlowImpl ignoreFlow = new IgnoreFlowImpl();
		return ignoreFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreTube createIgnoreTube() {
		IgnoreTubeImpl ignoreTube = new IgnoreTubeImpl();
		return ignoreTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceTransform createInstanceTransform() {
		InstanceTransformImpl instanceTransform = new InstanceTransformImpl();
		return instanceTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingFlows createMatchingFlows() {
		MatchingFlowsImpl matchingFlows = new MatchingFlowsImpl();
		return matchingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference createModelReference() {
		ModelReferenceImpl modelReference = new ModelReferenceImpl();
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectPrefixString createProjectPrefixString() {
		ProjectPrefixStringImpl projectPrefixString = new ProjectPrefixStringImpl();
		return projectPrefixString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueDepth createQueueDepth() {
		QueueDepthImpl queueDepth = new QueueDepthImpl();
		return queueDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamingTube createStreamingTube() {
		StreamingTubeImpl streamingTube = new StreamingTubeImpl();
		return streamingTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tap createTap() {
		TapImpl tap = new TapImpl();
		return tap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TubeDescriptorLog createTubeDescriptorLog() {
		TubeDescriptorLogImpl tubeDescriptorLog = new TubeDescriptorLogImpl();
		return tubeDescriptorLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TubeInstanceCount createTubeInstanceCount() {
		TubeInstanceCountImpl tubeInstanceCount = new TubeInstanceCountImpl();
		return tubeInstanceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TubeReceiveCounter createTubeReceiveCounter() {
		TubeReceiveCounterImpl tubeReceiveCounter = new TubeReceiveCounterImpl();
		return tubeReceiveCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TubeTransmitCounter createTubeTransmitCounter() {
		TubeTransmitCounterImpl tubeTransmitCounter = new TubeTransmitCounterImpl();
		return tubeTransmitCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType createAssociationTypeFromString(EDataType eDataType, String initialValue) {
		AssociationType result = AssociationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidthType createWidthTypeFromString(EDataType eDataType, String initialValue) {
		WidthType result = WidthType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWidthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType createAssociationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAssociationTypeFromString(LayerPackage.Literals.ASSOCIATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssociationTypeToString(LayerPackage.Literals.ASSOCIATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createCountTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createCountType1FromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createCountTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCountTypeFromString(LayerPackage.Literals.COUNT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCountTypeToString(LayerPackage.Literals.COUNT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createCountTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createCountType1FromString(LayerPackage.Literals.COUNT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertCountType1ToString(LayerPackage.Literals.COUNT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidthType createWidthTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWidthTypeFromString(LayerPackage.Literals.WIDTH_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWidthTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWidthTypeToString(LayerPackage.Literals.WIDTH_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerPackage getLayerPackage() {
		return (LayerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LayerPackage getPackage() {
		return LayerPackage.eINSTANCE;
	}

} //LayerFactoryImpl
