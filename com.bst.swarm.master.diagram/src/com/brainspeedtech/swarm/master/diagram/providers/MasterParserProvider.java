/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.providers;

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

import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterCellNameEditPart;
import com.brainspeedtech.swarm.master.diagram.edit.parts.MasterTubeNameEditPart;
import com.brainspeedtech.swarm.master.diagram.parsers.MessageFormatParser;
import com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry;

/**
 * @generated
 */
public class MasterParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser masterCellName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getMasterCellName_5001Parser() {
		if (masterCellName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MasterPackage.eINSTANCE
					.getMasterCell_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MasterPackage.eINSTANCE
					.getMasterCell_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			masterCellName_5001Parser = parser;
		}
		return masterCellName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser masterTubeName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getMasterTubeName_6001Parser() {
		if (masterTubeName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { MasterPackage.eINSTANCE
					.getMasterTube_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { MasterPackage.eINSTANCE
					.getMasterTube_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			masterTubeName_6001Parser = parser;
		}
		return masterTubeName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MasterCellNameEditPart.VISUAL_ID:
			return getMasterCellName_5001Parser();
		case MasterTubeNameEditPart.VISUAL_ID:
			return getMasterTubeName_6001Parser();
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
			return getParser(MasterVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MasterVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MasterElementTypes.getElement(hint) == null) {
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
