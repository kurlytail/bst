package com.bst.swarm.master.diagram;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;

public class TestDecoratorProvider implements IDecoratorProvider {

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
		
		EditPart ep = (EditPart)target.getAdapter(EditPart.class);
		
		return true;
	}

	@Override
	public void removeProviderChangeListener(IProviderChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createDecorators(IDecoratorTarget decoratorTarget) {
		
	}

}
