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
package com.brainspeedtech.swarm.layer.util;

import com.brainspeedtech.swarm.layer.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.layer.LayerPackage
 * @generated
 */
public class LayerValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LayerValidator INSTANCE = new LayerValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.brainspeedtech.swarm.layer";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LayerPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LayerPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case LayerPackage.CELL_COUNTER:
				return validateCellCounter((CellCounter)value, diagnostics, context);
			case LayerPackage.CELL_INSTANCE_COUNT:
				return validateCellInstanceCount((CellInstanceCount)value, diagnostics, context);
			case LayerPackage.CONSTRAINT_BASE:
				return validateConstraintBase((ConstraintBase)value, diagnostics, context);
			case LayerPackage.CONVERT_MASTER_TO_SM:
				return validateConvertMasterToSM((ConvertMasterToSM)value, diagnostics, context);
			case LayerPackage.COUNTER:
				return validateCounter((Counter)value, diagnostics, context);
			case LayerPackage.CROSS_REFERENCE:
				return validateCrossReference((CrossReference)value, diagnostics, context);
			case LayerPackage.CUSTOM:
				return validateCustom((Custom)value, diagnostics, context);
			case LayerPackage.CUSTOM_TUBE:
				return validateCustomTube((CustomTube)value, diagnostics, context);
			case LayerPackage.EXTERNAL_CELL:
				return validateExternalCell((ExternalCell)value, diagnostics, context);
			case LayerPackage.FILE_REFERENCE:
				return validateFileReference((FileReference)value, diagnostics, context);
			case LayerPackage.FLOW_ANALYSIS_AND_MERGE:
				return validateFlowAnalysisAndMerge((FlowAnalysisAndMerge)value, diagnostics, context);
			case LayerPackage.IGNORE_CELL:
				return validateIgnoreCell((IgnoreCell)value, diagnostics, context);
			case LayerPackage.IGNORE_FLOW:
				return validateIgnoreFlow((IgnoreFlow)value, diagnostics, context);
			case LayerPackage.IGNORE_TUBE:
				return validateIgnoreTube((IgnoreTube)value, diagnostics, context);
			case LayerPackage.INSTANCE_TRANSFORM:
				return validateInstanceTransform((InstanceTransform)value, diagnostics, context);
			case LayerPackage.LAYER:
				return validateLayer((Layer)value, diagnostics, context);
			case LayerPackage.MATCHING_FLOWS:
				return validateMatchingFlows((MatchingFlows)value, diagnostics, context);
			case LayerPackage.MODEL_REFERENCE:
				return validateModelReference((ModelReference)value, diagnostics, context);
			case LayerPackage.NATURE_BASE:
				return validateNatureBase((NatureBase)value, diagnostics, context);
			case LayerPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case LayerPackage.PROJECT_PREFIX_STRING:
				return validateProjectPrefixString((ProjectPrefixString)value, diagnostics, context);
			case LayerPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case LayerPackage.QUEUE_DEPTH:
				return validateQueueDepth((QueueDepth)value, diagnostics, context);
			case LayerPackage.STREAMING_TUBE:
				return validateStreamingTube((StreamingTube)value, diagnostics, context);
			case LayerPackage.TAP:
				return validateTap((Tap)value, diagnostics, context);
			case LayerPackage.TEMPLATE:
				return validateTemplate((Template)value, diagnostics, context);
			case LayerPackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case LayerPackage.TUBE_DESCRIPTOR_LOG:
				return validateTubeDescriptorLog((TubeDescriptorLog)value, diagnostics, context);
			case LayerPackage.TUBE_INSTANCE_COUNT:
				return validateTubeInstanceCount((TubeInstanceCount)value, diagnostics, context);
			case LayerPackage.TUBE_RECEIVE_COUNTER:
				return validateTubeReceiveCounter((TubeReceiveCounter)value, diagnostics, context);
			case LayerPackage.TUBE_TRANSMIT_COUNTER:
				return validateTubeTransmitCounter((TubeTransmitCounter)value, diagnostics, context);
			case LayerPackage.ASSOCIATION_TYPE:
				return validateAssociationType((AssociationType)value, diagnostics, context);
			case LayerPackage.WIDTH_TYPE:
				return validateWidthType((WidthType)value, diagnostics, context);
			case LayerPackage.ASSOCIATION_TYPE_OBJECT:
				return validateAssociationTypeObject((AssociationType)value, diagnostics, context);
			case LayerPackage.COUNT_TYPE:
				return validateCountType((Integer)value, diagnostics, context);
			case LayerPackage.COUNT_TYPE1:
				return validateCountType1((Integer)value, diagnostics, context);
			case LayerPackage.COUNT_TYPE_OBJECT:
				return validateCountTypeObject((Integer)value, diagnostics, context);
			case LayerPackage.COUNT_TYPE_OBJECT1:
				return validateCountTypeObject1((Integer)value, diagnostics, context);
			case LayerPackage.WIDTH_TYPE_OBJECT:
				return validateWidthTypeObject((WidthType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(association, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellCounter(CellCounter cellCounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellCounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellInstanceCount(CellInstanceCount cellInstanceCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellInstanceCount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintBase(ConstraintBase constraintBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConvertMasterToSM(ConvertMasterToSM convertMasterToSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(convertMasterToSM, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCounter(Counter counter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(counter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossReference(CrossReference crossReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustom(Custom custom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(custom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomTube(CustomTube customTube, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customTube, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCell(ExternalCell externalCell, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalCell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileReference(FileReference fileReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowAnalysisAndMerge(FlowAnalysisAndMerge flowAnalysisAndMerge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowAnalysisAndMerge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIgnoreCell(IgnoreCell ignoreCell, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ignoreCell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIgnoreFlow(IgnoreFlow ignoreFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ignoreFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIgnoreTube(IgnoreTube ignoreTube, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ignoreTube, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceTransform(InstanceTransform instanceTransform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceTransform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayer(Layer layer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchingFlows(MatchingFlows matchingFlows, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matchingFlows, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelReference(ModelReference modelReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNatureBase(NatureBase natureBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(natureBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectPrefixString(ProjectPrefixString projectPrefixString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectPrefixString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueueDepth(QueueDepth queueDepth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queueDepth, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamingTube(StreamingTube streamingTube, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamingTube, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTap(Tap tap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplate(Template template, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(template, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTubeDescriptorLog(TubeDescriptorLog tubeDescriptorLog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tubeDescriptorLog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTubeInstanceCount(TubeInstanceCount tubeInstanceCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tubeInstanceCount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTubeReceiveCounter(TubeReceiveCounter tubeReceiveCounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tubeReceiveCounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTubeTransmitCounter(TubeTransmitCounter tubeTransmitCounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tubeTransmitCounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationType(AssociationType associationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthType(WidthType widthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationTypeObject(AssociationType associationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountType(int countType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCountType_Min(countType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCountType_Min
	 */
	public static final int COUNT_TYPE__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountType_Min(int countType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = countType >= COUNT_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(LayerPackage.Literals.COUNT_TYPE, countType, COUNT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountType1(int countType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCountType1_Min(countType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCountType1_Min
	 */
	public static final int COUNT_TYPE1__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Count Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountType1_Min(int countType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = countType1 >= COUNT_TYPE1__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(LayerPackage.Literals.COUNT_TYPE1, countType1, COUNT_TYPE1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountTypeObject(Integer countTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCountType_Min(countTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountTypeObject1(Integer countTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCountType1_Min(countTypeObject1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthTypeObject(WidthType widthTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LayerValidator
