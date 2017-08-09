/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
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
import com.brainspeedtech.swarm.master.diagram.edit.policies.MasterTubeItemSemanticEditPolicy;
import com.brainspeedtech.swarm.project.providers.OpenDiagramEditPolicy;

/**
 * @generated
 */
public class MasterTubeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public MasterTubeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MasterTubeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE,
				new SelectionFocusEditPolicy(this));
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new OpenDiagramEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MasterTubeNameEditPart) {
			((MasterTubeNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureMasterTubeNameFigure());
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
		if (childEditPart instanceof MasterTubeNameEditPart) {
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
		return new MasterTubeFigure();
	}

	/**
	 * @generated
	 */
	public MasterTubeFigure getPrimaryShape() {
		return (MasterTubeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class MasterTubeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMasterTubeNameFigure;

		/**
		 * @generated
		 */
		public MasterTubeFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMasterTubeNameFigure = new WrappingLabel();
			fFigureMasterTubeNameFigure.setText("<...>");

			this.add(fFigureMasterTubeNameFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMasterTubeNameFigure() {
			return fFigureMasterTubeNameFigure;
		}

	}

}
