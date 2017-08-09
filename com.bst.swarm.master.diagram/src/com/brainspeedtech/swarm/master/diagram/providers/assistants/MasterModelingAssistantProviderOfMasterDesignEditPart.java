package com.brainspeedtech.swarm.master.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.brainspeedtech.swarm.master.diagram.providers.MasterElementTypes;
import com.brainspeedtech.swarm.master.diagram.providers.MasterModelingAssistantProvider;

/**
 * @generated
 */
public class MasterModelingAssistantProviderOfMasterDesignEditPart extends
		MasterModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MasterElementTypes.MasterCell_2002);
		return types;
	}

}
