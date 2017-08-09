package com.brainspeedtech.swarm.sm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.brainspeedtech.swarm.sm.diagram.providers.SmElementTypes;
import com.brainspeedtech.swarm.sm.diagram.providers.SmModelingAssistantProvider;

/**
 * @generated
 */
public class SmModelingAssistantProviderOfStateMachineEditPart extends
		SmModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SmElementTypes.State_2001);
		return types;
	}

}
