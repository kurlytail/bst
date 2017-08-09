package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class DiagramTypeProvider extends AbstractDiagramTypeProvider implements
		IDiagramTypeProvider {
	
	private IToolBehaviorProvider[] toolBehaviorProviders;

	public DiagramTypeProvider() {
		setFeatureProvider(new FlowFeatureProvider(this));
	}

	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if(toolBehaviorProviders == null) {
			toolBehaviorProviders = new IToolBehaviorProvider[] { 
					new SwarmToolBehaviorProvider(this)
			};
		}
		
		return toolBehaviorProviders;
	}

	@Override
	public boolean isAutoUpdateAtRuntime() {
		return true;
	}

	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;
	}

	@Override
	public boolean isAutoUpdateAtReset() {
		return true;
	}
	
}
