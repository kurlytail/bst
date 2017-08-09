/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.inst.diagram.providers;

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

import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.CellInstanceNameEditPart;
import com.brainspeedtech.swarm.inst.diagram.edit.parts.TubeInstanceNameEditPart;
import com.brainspeedtech.swarm.inst.diagram.parsers.MessageFormatParser;
import com.brainspeedtech.swarm.inst.diagram.part.InstVisualIDRegistry;

/**
 * @generated
 */
public class InstParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser cellInstanceName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCellInstanceName_5001Parser() {
		if (cellInstanceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { InstPackage.eINSTANCE
					.getCellInstance_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { InstPackage.eINSTANCE
					.getCellInstance_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			cellInstanceName_5001Parser = parser;
		}
		return cellInstanceName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser tubeInstanceName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTubeInstanceName_6001Parser() {
		if (tubeInstanceName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { InstPackage.eINSTANCE
					.getTubeInstance_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { InstPackage.eINSTANCE
					.getTubeInstance_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			tubeInstanceName_6001Parser = parser;
		}
		return tubeInstanceName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CellInstanceNameEditPart.VISUAL_ID:
			return getCellInstanceName_5001Parser();
		case TubeInstanceNameEditPart.VISUAL_ID:
			return getTubeInstanceName_6001Parser();
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
			return getParser(InstVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(InstVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (InstElementTypes.getElement(hint) == null) {
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
