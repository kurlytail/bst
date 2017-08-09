/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.sm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import com.brainspeedtech.swarm.sm.SmPackage;
import com.brainspeedtech.swarm.sm.diagram.edit.parts.StateNameEditPart;
import com.brainspeedtech.swarm.sm.diagram.edit.parts.TransitionNameEditPart;
import com.brainspeedtech.swarm.sm.diagram.parsers.MessageFormatParser;
import com.brainspeedtech.swarm.sm.diagram.part.SmVisualIDRegistry;

/**
 * @generated
 */
public class SmParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser stateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5001Parser() {
		if (stateName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SmPackage.eINSTANCE
					.getState_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SmPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			stateName_5001Parser = parser;
		}
		return stateName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionName_6001Parser() {
		if (transitionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { SmPackage.eINSTANCE
					.getTransition_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SmPackage.eINSTANCE
					.getTransition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			transitionName_6001Parser = parser;
		}
		return transitionName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StateNameEditPart.VISUAL_ID:
			return getStateName_5001Parser();
		case TransitionNameEditPart.VISUAL_ID:
			return getTransitionName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SmVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SmVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SmElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
