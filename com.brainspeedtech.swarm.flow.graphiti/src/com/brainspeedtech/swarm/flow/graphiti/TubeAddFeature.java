package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import com.brainspeedtech.swarm.flow.Tube;

public class TubeAddFeature extends AbstractAddFeature {

	public TubeAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if(context instanceof IAddConnectionContext &&
				context.getNewObject() instanceof Tube) {
			return true;
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		Tube tube = (Tube) context.getNewObject();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// CONNECTION WITH POLYLINE
		Connection connection = peCreateService
				.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);
		polyline.setLineWidth(2);
		polyline.setForeground(manageColor(IColorConstant.BLACK));

		// create link and wire it
		link(connection, tube);

		ConnectionDecorator textDecorator = peCreateService
				.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createDefaultText(getDiagram(), textDecorator);
		text.setForeground(manageColor(IColorConstant.BLACK));
		gaService.setLocation(text, 10, 0);
		// set reference name in the text decorator
		text.setValue(tube.getName());

		// add static graphical decorator (composition and navigable)
		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0,
				true);
		createArrow(cd);
		
		// provide information to support direct-editing directly
		// after object creation (must be activated additionally)
		IDirectEditingInfo directEditingInfo = getFeatureProvider()
				.getDirectEditingInfo();
		// set container shape for direct editing after object creation
		directEditingInfo.setMainPictogramElement(connection);
		// set shape and graphics algorithm where the editor for
		// direct editing shall be opened after object creation
		//directEditingInfo.setPictogramElement(connection);
		directEditingInfo.setGraphicsAlgorithm(text);
		
		layoutPictogramElement(connection);
		return connection;
	}
	
	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
	    IGaService gaService = Graphiti.getGaService();
	    Polyline polyline =
	        gaService.createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15,
	                -10 });
	    polyline.setForeground(manageColor(IColorConstant.BLACK));
	    polyline.setLineWidth(2);
	    return polyline;
	}

}
