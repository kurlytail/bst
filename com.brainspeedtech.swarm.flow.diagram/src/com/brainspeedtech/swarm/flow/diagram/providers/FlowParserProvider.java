/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.providers;

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

import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.CellNameEditPart;
import com.brainspeedtech.swarm.flow.diagram.edit.parts.TubeNameEditPart;
import com.brainspeedtech.swarm.flow.diagram.parsers.MessageFormatParser;
import com.brainspeedtech.swarm.flow.diagram.part.FlowVisualIDRegistry;

/**
 * @generated
 */
public class FlowParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser cellName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCellName_5001Parser() {
		if (cellName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { FlowPackage.eINSTANCE
					.getCell_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FlowPackage.eINSTANCE
					.getCell_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			cellName_5001Parser = parser;
		}
		return cellName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser tubeName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTubeName_6001Parser() {
		if (tubeName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { FlowPackage.eINSTANCE
					.getTube_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FlowPackage.eINSTANCE
					.getTube_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			tubeName_6001Parser = parser;
		}
		return tubeName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CellNameEditPart.VISUAL_ID:
			return getCellName_5001Parser();
		case TubeNameEditPart.VISUAL_ID:
			return getTubeName_6001Parser();
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
			return getParser(FlowVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FlowVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FlowElementTypes.getElement(hint) == null) {
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
