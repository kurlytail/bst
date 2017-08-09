package com.brainspeedtech.swarm.layer.edit;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;

import com.brainspeedtech.swarm.layer.CellCounter;
import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.layer.Counter;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.project.util.EclipseProjectUtil;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class LayerDecoratorProvider implements IDecoratorProvider {

	
	@Override
	public void addProviderChangeListener(IProviderChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean provides(IOperation operation) {
		if (!(operation instanceof CreateDecoratorsOperation)) {
			return false;
		}
		
		CreateDecoratorsOperation cdo = (CreateDecoratorsOperation)operation;
		IDecoratorTarget target = cdo.getDecoratorTarget();
		
		MasterCell mc = (MasterCell)target.getAdapter(MasterCell.class);
		if (mc == null) return false;
		
		return true;
	}

	@Override
	public void removeProviderChangeListener(IProviderChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createDecorators(final IDecoratorTarget target) {
		MasterCell mc = (MasterCell)target.getAdapter(MasterCell.class);
		if (mc == null) return;
		
		mc = (MasterCell) EclipseProjectUtil.getSwarmObject(mc);
		if (mc == null) return;
		
		ConstraintBase base = ProjectUtil.getReferringInstance(mc, Counter.class);
		if (base == null) return;
		
		if (!(base instanceof Counter)) return;
		
		IDecorator decorator = new IDecorator() {
			
			@Override
			public void refresh() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deactivate() {
			}
			
			@Override
			public void activate() {
			}
		};
		
		
		target.installDecorator(mc, decorator);
		
	}
	
	/**
	 * @generated
	 */
	public class CounterFigure extends ImageFigure {



	}
}
