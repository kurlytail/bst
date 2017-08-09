package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class DirectEditFeature extends AbstractDirectEditingFeature {

	public DirectEditFeature(IFeatureProvider fp) {
		super(fp);
	}

	public int getEditingType() {
		// there are several possible editor-types supported:
		// text-field, checkbox, color-chooser, combobox, ...
		return TYPE_TEXT;
	}

	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
		// support direct editing, if it is a EClass, and the user clicked
		// directly on the text and not somewhere else in the rectangle
		if (ga instanceof Text) {
			return true;
		}
		// direct editing not supported in all other cases
		return false;
	}

	@Override
	public String getInitialValue(IDirectEditingContext context) {
		// return the current name of the EClass
		PictogramElement pe = context.getPictogramElement();
		EObject obj = (EObject) getBusinessObjectForPictogramElement(pe);
		if (obj == null) return "";
		
		String oldName = (String)obj.eGet(obj.eClass().getEStructuralFeature("name"));
		if(oldName == null) 
			return obj.eClass().getName();
		return oldName;
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		return null;
	}

	public void setValue(String value, IDirectEditingContext context) {
		// set the new name for the EClass
		PictogramElement pe = context.getPictogramElement();
		EObject obj;
		if (pe instanceof ConnectionDecorator) {
			Connection connection = ((ConnectionDecorator) pe).getConnection();
			obj = (EObject) getBusinessObjectForPictogramElement(connection);
		} else {
			obj = (EObject) getBusinessObjectForPictogramElement(pe);
		}
		if (obj == null) return;
		obj.eSet(obj.eClass().getEStructuralFeature("name"), value);

		// Explicitly update the shape to display the new value in the diagram
		// Note, that this might not be necessary in future versions of Graphiti
		// (currently in discussion)

		// we know, that pe is the Shape of the Text, so its container is the
		// main shape of the EClass
		updatePictogramElement(((Shape)pe).getContainer());
	}

	@Override
	public boolean stretchFieldToFitText() {
		return true;
	}
	
	

}
