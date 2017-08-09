package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import com.brainspeedtech.swarm.flow.Cell;

public class CellAddFeature extends AbstractAddFeature {

	public CellAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		Object newObject = context.getNewObject();
		if (newObject instanceof Cell) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}

		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {

		Cell addedClass = (Cell) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);
		
	    peCreateService.createChopboxAnchor(containerShape);


		// define a default size for the shape
		int width = 100;
		int height = 50;
		IGaService gaService = Graphiti.getGaService();

		{
			// create and set graphics algorithm
			RoundedRectangle roundedRectangle = gaService
					.createRoundedRectangle(containerShape, 5, 5);
			roundedRectangle.setForeground(manageColor(IColorConstant.BLACK));
			roundedRectangle.setBackground(manageColor(IColorConstant.WHITE));
			roundedRectangle.setLineWidth(2);
			gaService.setLocationAndSize(roundedRectangle, context.getX(),
					context.getY(), width, height);

			// if added Class has no resource we add it to the resource
			// of the diagram
			// in a real scenario the business model would have its own resource
			if (addedClass.eResource() == null) {
				getDiagram().eResource().getContents().add(addedClass);
			}
			// create link and wire it
			link(containerShape, addedClass);
		}

//		// SHAPE WITH LINE
//		{
//			// create shape for line
//			Shape shape = peCreateService.createShape(containerShape, false);
//
//			// create and set graphics algorithm
//			Polyline polyline = gaService.createPolyline(shape, new int[] { 0,
//					20, width, 20 });
//			polyline.setForeground(manageColor(IColorConstant.BLACK));
//			polyline.setLineWidth(2);
//		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);

			// create and set text graphics algorithm
			Text text = gaService.createDefaultText(getDiagram(), shape,
					addedClass.getName());
			text.setForeground(manageColor(IColorConstant.BLACK));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			gaService.setLocationAndSize(text, 0, height/2 - text.getFont().getSize(), width, 20);

			link(shape, addedClass);
			// provide information to support direct-editing directly
			// after object creation (must be activated additionally)
			IDirectEditingInfo directEditingInfo = getFeatureProvider()
					.getDirectEditingInfo();
			// set container shape for direct editing after object creation
			directEditingInfo.setMainPictogramElement(containerShape);
			// set shape and graphics algorithm where the editor for
			// direct editing shall be opened after object creation
			directEditingInfo.setPictogramElement(shape);
			directEditingInfo.setGraphicsAlgorithm(text);
		}
		
		layoutPictogramElement(containerShape);

		return containerShape;
		//
		// Cell addedCell = (Cell) context.getNewObject();
		// Diagram targetDiagram = (Diagram) context.getTargetContainer();
		//
		// IPeCreateService peCreateService = Graphiti.getPeCreateService();
		// ContainerShape containerShape = peCreateService.createContainerShape(
		// targetDiagram, true);
		//
		// int width = context.getWidth() <= 0 ? 100 : context.getWidth();
		// int height = context.getHeight() <= 0 ? 50 : context.getHeight();
		//
		// IGaService gaService = Graphiti.getGaService();
		// RoundedRectangle roundedRectangle;
		//
		// roundedRectangle = gaService.createRoundedRectangle(containerShape,
		// 5,
		// 5);
		// roundedRectangle.setForeground(manageColor(IColorConstant.BLUE));
		// roundedRectangle
		// .setBackground(manageColor(IColorConstant.LIGHT_ORANGE));
		// roundedRectangle.setLineWidth(2);
		// gaService.setLocationAndSize(roundedRectangle, context.getX(),
		// context.getY(), width, height);
		//
		// link(containerShape, addedCell);
		//
		// // create shape for text
		// Shape shape = peCreateService.createShape(containerShape, false);
		//
		// // create and set text graphics algorithm
		// Text text = gaService.createText(shape, addedCell.getName());
		// text.setForeground(manageColor(IColorConstant.BLACK));
		// text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		// // vertical alignment has as default value "center"
		// text.setFont(gaService.manageFont(getDiagram(), "Arial", 12));
		// gaService.setLocationAndSize(text, 0, 0, width, 40);
		//
		// // create link and wire it
		// link(shape, addedCell);
		//
		// // provide information to support direct-editing directly
		// // after object creation (must be activated additionally)
		// IDirectEditingInfo directEditingInfo = getFeatureProvider()
		// .getDirectEditingInfo();
		// // set container shape for direct editing after object creation
		// directEditingInfo.setMainPictogramElement(containerShape);
		// // set shape and graphics algorithm where the editor for
		// // direct editing shall be opened after object creation
		// directEditingInfo.setPictogramElement(shape);
		// directEditingInfo.setGraphicsAlgorithm(text);
		// directEditingInfo.setActive(true);
		//
		// peCreateService.createChopboxAnchor(containerShape);
		// layoutPictogramElement(containerShape);
		// return containerShape;
	}

}
