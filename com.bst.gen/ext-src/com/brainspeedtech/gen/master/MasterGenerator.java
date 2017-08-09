/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.master;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.Tube;
import com.brainspeedtech.swarm.layer.IgnoreFlow;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterFactory;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class MasterGenerator {

	public static void generate(SwarmCachingEditingDomain domain,
			String outputDir, final String designName, PrintStream log) throws IOException {

		// Get the resource
		Resource masterResource = null;
		URI masterURI = URI.createFileURI(outputDir + "/" + designName
				+ ".master");
		try {
			masterResource = domain.getResourceSet().getResource(masterURI,
					true);
		} catch (Exception e) {
			masterResource = domain.getResourceSet().getResource(masterURI,
					false);
		}

		log.println("Generating resource " + masterURI.toFileString());
		MasterDesign masterDesign = (MasterDesign) EcoreUtil.getObjectByType(
				masterResource.getContents(),
				MasterPackage.eINSTANCE.getMasterDesign());

		if (masterDesign == null) {
			masterDesign = MasterFactory.eINSTANCE.createMasterDesign();
		}

		/* Save all older objects */
		final Map<String, MasterCell> oldCellMap = new HashMap<String, MasterCell>();
		final Map<String, MasterTube> oldTubeMap = new HashMap<String, MasterTube>();

		/* Diagram already present, translate the differences */
		Diagram diagram = (Diagram) EcoreUtil.getObjectByType(
				masterResource.getContents(),
				NotationPackage.eINSTANCE.getDiagram());

		if (diagram == null) {
			diagram = NotationFactory.eINSTANCE.createDiagram();
			diagram.setType("Master");
			diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
			diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		}

		/* Save all older objects */
		final Map<MasterCell, Shape> oldShapeMap = new HashMap<MasterCell, Shape>();
		final Map<MasterTube, Edge> oldEdgeMap = new HashMap<MasterTube, Edge>();

		final Diagram finalDiagram = diagram;
		final MasterDesign finalMasterDesign = masterDesign;
		final Resource finalMasterResource = masterResource;

		final List<Flow> flows = new LinkedList<Flow>();

		synchronized (domain) {
			for (Resource res : domain.getResourceSet().getResources()) {
				@SuppressWarnings("unchecked")
				Collection<? extends Flow> flowObjects = (Collection<? extends Flow>) EcoreUtil
						.getObjectsByType(res.getContents(),
								FlowPackage.eINSTANCE.getFlow());
				for (Flow flow : flowObjects) {
					if (ProjectUtil
							.getReferringInstance(flow, IgnoreFlow.class) == null) {
						flows.add(flow);
					}
				}
			}
		}

		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {

				for (MasterCell mCell : finalMasterDesign.getCell()) {
					mCell.getDesignCells().clear();
					oldCellMap.put(mCell.getName(), mCell);
					oldShapeMap.put(mCell, ProjectUtil.getReferringInstance(
							mCell, Shape.class));
				}
				finalMasterDesign.getCell().clear();
				for (MasterTube mTube : finalMasterDesign.getTube()) {
					mTube.getDesignTubes().clear();
					oldTubeMap.put(mTube.getName(), mTube);
					oldEdgeMap.put(mTube,
							ProjectUtil.getReferringInstance(mTube, Edge.class));
				}
				finalMasterDesign.getTube().clear();
				/* Clear all contents, this saves the object ids */
				finalMasterResource.getContents().clear();

				Map<String, MasterCell> cellMap = new HashMap<String, MasterCell>();
				Map<String, MasterTube> tubeMap = new HashMap<String, MasterTube>();

				for (Flow flow : flows) {
					for (Cell cell : flow.getCell()) {
						MasterCell masterCell;
						if (cellMap.get(cell.getName()) == null) {
							masterCell = oldCellMap.get(cell.getName());
							if (masterCell == null)
								masterCell = MasterFactory.eINSTANCE
										.createMasterCell();
							masterCell.getInput().clear();
							masterCell.getOutput().clear();

							masterCell.setName(cell.getName());
							masterCell.setCount(cell.getCount());
							cellMap.put(cell.getName(), masterCell);
							masterCell.setExternal(cell.isExternal());
							finalMasterDesign.getCell().add(masterCell);
						} else {
							masterCell = cellMap.get(cell.getName());
						}

						if (masterCell.getCount() < cell.getCount()) {
							masterCell.setCount(cell.getCount());
						}

						if (!cell.isExternal()) {
							masterCell.setExternal(false);
						}
						masterCell.getDesignCells().add(cell);
					}
				}

				for (Flow flow : flows) {
					for (Tube tube : flow.getTube()) {
						MasterTube masterTube;
						if (tubeMap.get(tube.getName()) == null) {

							masterTube = oldTubeMap.get(tube.getName());
							if (masterTube == null)
								masterTube = MasterFactory.eINSTANCE
										.createMasterTube();


							masterTube.setName(tube.getName());
							tubeMap.put(tube.getName(), masterTube);
							finalMasterDesign.getTube().add(masterTube);

							MasterCell sourceMaster = cellMap.get(tube
									.getFrom().getName());
							MasterCell destinMaster = cellMap.get(tube.getTo()
									.getName());

							masterTube.setFrom(sourceMaster);
							masterTube.setTo(destinMaster);
						} else {
							masterTube = tubeMap.get(tube.getName());
						}

						masterTube.getDesignTubes().add(tube);
					}
				}

				finalMasterDesign.setName(designName);
				finalDiagram.removeChild(finalDiagram.getDiagram());
				finalDiagram.setElement(finalMasterDesign);
				finalMasterResource.getContents().add(finalDiagram);
				finalMasterResource.getContents()
						.add(finalDiagram.getElement());

				Collection<MasterCell> remainingCells = oldCellMap.values();
				remainingCells.removeAll(finalMasterDesign.getCell());
				Collection<MasterTube> remainingTubes = oldTubeMap.values();
				remainingTubes.removeAll(finalMasterDesign.getTube());
				
				ProjectUtil.sanitizeDiagram(finalDiagram);
				
				LinkedList<MasterCell> sortCellList = new LinkedList<MasterCell>();
				LinkedList<MasterTube> sortTubeList = new LinkedList<MasterTube>();
				
				sortCellList.addAll(finalMasterDesign.getCell());
				sortTubeList.addAll(finalMasterDesign.getTube());
				
				Collections.sort(sortCellList, new Comparator<MasterCell>() {

					@Override
					public int compare(MasterCell o1, MasterCell o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				
				Collections.sort(sortTubeList, new Comparator<MasterTube>() {

					@Override
					public int compare(MasterTube o1, MasterTube o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				
				finalMasterDesign.getCell().clear();
				finalMasterDesign.getCell().addAll(sortCellList);
				finalMasterDesign.getTube().clear();
				finalMasterDesign.getTube().addAll(sortTubeList);
			}
		});
		Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		log.println("Saving resource " + masterResource.getURI().toFileString());
		masterResource.save(saveOptions);
		domain.buildReferenceCache();
	}
}
