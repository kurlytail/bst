package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddBendpointFeature;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveAnchorFeature;
import org.eclipse.graphiti.features.IMoveBendpointFeature;
import org.eclipse.graphiti.features.IMoveConnectionDecoratorFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IPrintFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IRemoveBendpointFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.ISaveImageFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddBendpointContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveAnchorContext;
import org.eclipse.graphiti.features.context.IMoveBendpointContext;
import org.eclipse.graphiti.features.context.IMoveConnectionDecoratorContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveBendpointContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.features.impl.AbstractFeatureProvider;
import org.eclipse.graphiti.features.impl.DefaultAddBendpointFeature;
import org.eclipse.graphiti.features.impl.DefaultDirectEditingInfo;
import org.eclipse.graphiti.features.impl.DefaultMoveAnchorFeature;
import org.eclipse.graphiti.features.impl.DefaultMoveBendpointFeature;
import org.eclipse.graphiti.features.impl.DefaultMoveConnectionDecoratorFeature;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.features.impl.DefaultReconnectionFeature;
import org.eclipse.graphiti.features.impl.DefaultRemoveBendpointFeature;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.graphiti.ui.features.DefaultSaveImageFeature;
import org.eclipse.graphiti.ui.internal.policy.DefaultDirectEditPolicy;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.Tube;

public class FlowFeatureProvider extends AbstractFeatureProvider {

	public FlowFeatureProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		return new CellUpdateFeature(this);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if(context.getNewObject() instanceof Cell) {
			return new CellAddFeature(this);
		} else if(context.getNewObject() instanceof Tube) {
			return new TubeAddFeature(this);
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { new CellCreateFeature(this, "Cell", "Cell") };
	}

	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		return new DefaultDeleteFeature(this);
	}

	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		return new DefaultRemoveFeature(this);
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] { new TubeCreateFeature(this, "Tube", "Tube") };
	}

	@Override
	public IMoveAnchorFeature getMoveAnchorFeature(IMoveAnchorContext context) {
		return new DefaultMoveAnchorFeature(this);
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		return new LayoutFeature(this);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		return new DefaultMoveShapeFeature(this);
	}

	@Override
	public IMoveConnectionDecoratorFeature getMoveConnectionDecoratorFeature(
			IMoveConnectionDecoratorContext context) {
		return new DefaultMoveConnectionDecoratorFeature(this);
	}

	@Override
	public IMoveBendpointFeature getMoveBendpointFeature(
			IMoveBendpointContext context) {
		return new DefaultMoveBendpointFeature(this);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		return new DefaultResizeShapeFeature(this);
	}

	@Override
	public IRemoveBendpointFeature getRemoveBendpointFeature(
			IRemoveBendpointContext context) {
		return new DefaultRemoveBendpointFeature(this);
	}

	@Override
	public IDirectEditingFeature getDirectEditingFeature(
			IDirectEditingContext context) {
		return new DirectEditFeature(this);
	}

	@Override
	public IReconnectionFeature getReconnectionFeature(
			IReconnectionContext context) {
		return new DefaultReconnectionFeature(this);
	}

	@Override
	public ISaveImageFeature getSaveImageFeature() {
		return new DefaultSaveImageFeature(this);

	}

	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
		// TODO Auto-generated method stub
		return super.getDragAndDropFeatures(context);
	}
	

	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
	       return new ICustomFeature[] 
	          { new SwarmToolCollapseFeature(this)};
	}

	@Override
	public IAddBendpointFeature getAddBendpointFeature(
			IAddBendpointContext context) {
		return new DefaultAddBendpointFeature(this);
	}

	@Override
	public IPrintFeature getPrintFeature() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
