package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;

public class SwarmToolBehaviorProvider extends DefaultToolBehaviorProvider {

	public SwarmToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
		// TODO Auto-generated constructor stub
	}
	@Override
	public IContextButtonPadData getContextButtonPad(
	                                   IPictogramElementContext context) {
	    IContextButtonPadData data = super.getContextButtonPad(context);
	    PictogramElement pe = context.getPictogramElement();
	 
	    // 1. set the generic context buttons
	    // note, that we do not add 'remove' (just as an example)
	    setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE);
	        	        
	    // 3.b. create context button and add all applicable features
	    ContextButtonEntry button = new ContextButtonEntry(null, context);
	    button.setText("Show Layers");
	    button.setIconId(IPlatformImageConstants.IMG_ECLIPSE_INFORMATION_TSK);

	    data.getDomainSpecificContextButtons().add(button);
	    
	    return data;
	}
	
    @Override
    public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
        ICustomFeature customFeature =
            new RenameCellFeature(getFeatureProvider());
        // canExecute() tests especially if the context contains a EClass
        if (customFeature.canExecute(context)) {
            return customFeature;
        }
 
        return super.getDoubleClickFeature(context);
    }
}
