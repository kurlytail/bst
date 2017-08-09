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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.layer.LayerPackage
 * @generated
 */
public class LayerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LayerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerSwitch() {
		if (modelPackage == null) {
			modelPackage = LayerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LayerPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseConstraintBase(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.CELL_COUNTER: {
				CellCounter cellCounter = (CellCounter)theEObject;
				T result = caseCellCounter(cellCounter);
				if (result == null) result = caseCounter(cellCounter);
				if (result == null) result = caseConstraintBase(cellCounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.CELL_INSTANCE_COUNT: {
				CellInstanceCount cellInstanceCount = (CellInstanceCount)theEObject;
				T result = caseCellInstanceCount(cellInstanceCount);
				if (result == null) result = caseConstraintBase(cellInstanceCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.CONSTRAINT_BASE: {
				ConstraintBase constraintBase = (ConstraintBase)theEObject;
				T result = caseConstraintBase(constraintBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.CONVERT_MASTER_TO_SM: {
				ConvertMasterToSM convertMasterToSM = (ConvertMasterToSM)theEObject;
				T result = caseConvertMasterToSM(convertMasterToSM);
				if (result == null) result = caseConstraintBase(convertMasterToSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T result = caseCounter(counter);
				if (result == null) result = caseConstraintBase(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.CROSS_REFERENCE: {
				CrossReference crossReference = (CrossReference)theEObject;
				T result = caseCrossReference(crossReference);
				if (result == null) result = caseConstraintBase(crossReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.CUSTOM: {
				Custom custom = (Custom)theEObject;
				T result = caseCustom(custom);
				if (result == null) result = caseConstraintBase(custom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.CUSTOM_TUBE: {
				CustomTube customTube = (CustomTube)theEObject;
				T result = caseCustomTube(customTube);
				if (result == null) result = caseConstraintBase(customTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.EXTERNAL_CELL: {
				ExternalCell externalCell = (ExternalCell)theEObject;
				T result = caseExternalCell(externalCell);
				if (result == null) result = caseConstraintBase(externalCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.FILE_REFERENCE: {
				FileReference fileReference = (FileReference)theEObject;
				T result = caseFileReference(fileReference);
				if (result == null) result = caseConstraintBase(fileReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.FLOW_ANALYSIS_AND_MERGE: {
				FlowAnalysisAndMerge flowAnalysisAndMerge = (FlowAnalysisAndMerge)theEObject;
				T result = caseFlowAnalysisAndMerge(flowAnalysisAndMerge);
				if (result == null) result = caseNatureBase(flowAnalysisAndMerge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.IGNORE_CELL: {
				IgnoreCell ignoreCell = (IgnoreCell)theEObject;
				T result = caseIgnoreCell(ignoreCell);
				if (result == null) result = caseConstraintBase(ignoreCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.IGNORE_FLOW: {
				IgnoreFlow ignoreFlow = (IgnoreFlow)theEObject;
				T result = caseIgnoreFlow(ignoreFlow);
				if (result == null) result = caseConstraintBase(ignoreFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.IGNORE_TUBE: {
				IgnoreTube ignoreTube = (IgnoreTube)theEObject;
				T result = caseIgnoreTube(ignoreTube);
				if (result == null) result = caseConstraintBase(ignoreTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.INSTANCE_TRANSFORM: {
				InstanceTransform instanceTransform = (InstanceTransform)theEObject;
				T result = caseInstanceTransform(instanceTransform);
				if (result == null) result = caseNatureBase(instanceTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.MATCHING_FLOWS: {
				MatchingFlows matchingFlows = (MatchingFlows)theEObject;
				T result = caseMatchingFlows(matchingFlows);
				if (result == null) result = caseConstraintBase(matchingFlows);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.MODEL_REFERENCE: {
				ModelReference modelReference = (ModelReference)theEObject;
				T result = caseModelReference(modelReference);
				if (result == null) result = caseConstraintBase(modelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.NATURE_BASE: {
				NatureBase natureBase = (NatureBase)theEObject;
				T result = caseNatureBase(natureBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseConstraintBase(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.PROJECT_PREFIX_STRING: {
				ProjectPrefixString projectPrefixString = (ProjectPrefixString)theEObject;
				T result = caseProjectPrefixString(projectPrefixString);
				if (result == null) result = caseConstraintBase(projectPrefixString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.QUEUE_DEPTH: {
				QueueDepth queueDepth = (QueueDepth)theEObject;
				T result = caseQueueDepth(queueDepth);
				if (result == null) result = caseConstraintBase(queueDepth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.STREAMING_TUBE: {
				StreamingTube streamingTube = (StreamingTube)theEObject;
				T result = caseStreamingTube(streamingTube);
				if (result == null) result = caseConstraintBase(streamingTube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.TAP: {
				Tap tap = (Tap)theEObject;
				T result = caseTap(tap);
				if (result == null) result = caseConstraintBase(tap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = caseConstraintBase(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseConstraintBase(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.TUBE_DESCRIPTOR_LOG: {
				TubeDescriptorLog tubeDescriptorLog = (TubeDescriptorLog)theEObject;
				T result = caseTubeDescriptorLog(tubeDescriptorLog);
				if (result == null) result = caseConstraintBase(tubeDescriptorLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.TUBE_INSTANCE_COUNT: {
				TubeInstanceCount tubeInstanceCount = (TubeInstanceCount)theEObject;
				T result = caseTubeInstanceCount(tubeInstanceCount);
				if (result == null) result = caseConstraintBase(tubeInstanceCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.TUBE_RECEIVE_COUNTER: {
				TubeReceiveCounter tubeReceiveCounter = (TubeReceiveCounter)theEObject;
				T result = caseTubeReceiveCounter(tubeReceiveCounter);
				if (result == null) result = caseCounter(tubeReceiveCounter);
				if (result == null) result = caseConstraintBase(tubeReceiveCounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayerPackage.TUBE_TRANSMIT_COUNTER: {
				TubeTransmitCounter tubeTransmitCounter = (TubeTransmitCounter)theEObject;
				T result = caseTubeTransmitCounter(tubeTransmitCounter);
				if (result == null) result = caseCounter(tubeTransmitCounter);
				if (result == null) result = caseConstraintBase(tubeTransmitCounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellCounter(CellCounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Instance Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Instance Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellInstanceCount(CellInstanceCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintBase(ConstraintBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert Master To SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert Master To SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvertMasterToSM(ConvertMasterToSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossReference(CrossReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustom(Custom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTube(CustomTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalCell(ExternalCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileReference(FileReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Analysis And Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Analysis And Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowAnalysisAndMerge(FlowAnalysisAndMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreCell(IgnoreCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreFlow(IgnoreFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreTube(IgnoreTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceTransform(InstanceTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matching Flows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching Flows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchingFlows(MatchingFlows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelReference(ModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nature Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nature Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatureBase(NatureBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Prefix String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Prefix String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectPrefixString(ProjectPrefixString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Depth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Depth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueDepth(QueueDepth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Streaming Tube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Streaming Tube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamingTube(StreamingTube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTap(Tap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tube Descriptor Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tube Descriptor Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTubeDescriptorLog(TubeDescriptorLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tube Instance Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tube Instance Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTubeInstanceCount(TubeInstanceCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tube Receive Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tube Receive Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTubeReceiveCounter(TubeReceiveCounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tube Transmit Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tube Transmit Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTubeTransmitCounter(TubeTransmitCounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LayerSwitch
