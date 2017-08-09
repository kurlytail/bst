package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowFactory;
import com.brainspeedtech.swarm.flow.Tube;

public class TubeCreateFeature extends AbstractCreateConnectionFeature {

	public TubeCreateFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
		// TODO Auto-generated constructor stub
	}
	
	private Cell getCell(Anchor anchor) {
		if(anchor != null) {
			return (Cell)getBusinessObjectForPictogramElement(anchor.getParent());
		}
		return null;
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		if(getCell(context.getSourceAnchor()) != null &&
				getCell(context.getTargetAnchor()) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Cell from = getCell(context.getSourceAnchor());
		Cell to = getCell(context.getTargetAnchor());
		
		Connection newConnection = null;
		
		if (from != null && to != null) {
			Tube tube = FlowFactory.eINSTANCE.createTube();
			tube.setTo(to);
			tube.setFrom(from);
			tube.setName("New Tube");
			
			Flow flow = (Flow)from.eContainer();
			flow.getTube().add(tube);
			
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(),
					context.getTargetAnchor());
			addContext.setNewObject(tube);
			newConnection = (Connection)getFeatureProvider().addIfPossible(addContext);
			
			getFeatureProvider().getDirectEditingInfo().setActive(true);
		}
		
		return newConnection;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		if(getCell(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}
	
	

}
