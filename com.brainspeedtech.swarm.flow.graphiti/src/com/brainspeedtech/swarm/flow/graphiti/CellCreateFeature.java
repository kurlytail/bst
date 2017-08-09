package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowFactory;
import com.brainspeedtech.swarm.flow.FlowPackage;

public class CellCreateFeature extends AbstractCreateFeature {

	public CellCreateFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return true;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Cell cell = FlowFactory.eINSTANCE.createCell();
		
		initializeModel(cell);
		
		addGraphicalRepresentation(context, cell);
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return new Object[] { cell };
	}

	private void initializeModel(Cell cell) {
		Flow flow = (Flow)EcoreUtil.getObjectByType(getDiagram().eResource().getContents(), FlowPackage.eINSTANCE.getFlow());
		if(flow == null) {
			flow = FlowFactory.eINSTANCE.createFlow();
			IFile file = WorkspaceSynchronizer.getFile(getDiagram().eResource());
			flow.setName(file.getFullPath().removeFileExtension().lastSegment());
			getDiagram().eResource().getContents().add(flow);
		}
		
		flow.getCell().add(cell);
	}
}
