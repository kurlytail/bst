package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import com.brainspeedtech.swarm.flow.Cell;

public class RenameCellFeature extends AbstractCustomFeature {

	public RenameCellFeature(IFeatureProvider featureProvider) {
		super(featureProvider);
	}

	@Override
	public void execute(ICustomContext context) {
		IDirectEditingInfo directEditingInfo = 
				getFeatureProvider().getDirectEditingInfo();
		PictogramElement pe = context.getInnerPictogramElement();
		GraphicsAlgorithm ga = context.getInnerGraphicsAlgorithm();
		
		directEditingInfo.setMainPictogramElement((PictogramElement)pe.eContainer());
		directEditingInfo.setPictogramElement(pe);
		directEditingInfo.setGraphicsAlgorithm(ga);
		directEditingInfo.setActive(true);
	}
	
	@Override
	public boolean canExecute(ICustomContext context) {
		PictogramElement pe = context.getInnerPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		GraphicsAlgorithm ga = context.getInnerGraphicsAlgorithm();
		
		return bo instanceof Cell && ga instanceof Text;
	}


}
