/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.sm.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import com.brainspeedtech.swarm.diagram.custom.SelectionFocusEditPolicy;
import com.brainspeedtech.swarm.project.providers.OpenDiagramEditPolicy;
import com.brainspeedtech.swarm.sm.diagram.edit.policies.TransitionItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransitionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public TransitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TransitionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE,
				new SelectionFocusEditPolicy(this));
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new OpenDiagramEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TransitionNameEditPart) {
			((TransitionNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureTransitionNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TransitionNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new TransitionFigure();
	}

	/**
	 * @generated
	 */
	public TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TransitionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransitionNameFigure;

		/**
		 * @generated
		 */
		public TransitionFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTransitionNameFigure = new WrappingLabel();
			fFigureTransitionNameFigure.setText("<...>");

			this.add(fFigureTransitionNameFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransitionNameFigure() {
			return fFigureTransitionNameFigure;
		}

	}

}
