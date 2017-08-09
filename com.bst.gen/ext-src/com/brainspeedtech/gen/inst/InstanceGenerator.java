/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.inst;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.InstFactory;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.layer.Association;
import com.brainspeedtech.swarm.layer.AssociationType;
import com.brainspeedtech.swarm.layer.CellInstanceCount;
import com.brainspeedtech.swarm.layer.IgnoreCell;
import com.brainspeedtech.swarm.layer.IgnoreTube;
import com.brainspeedtech.swarm.layer.Tap;
import com.brainspeedtech.swarm.layer.TubeInstanceCount;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class InstanceGenerator {
	public static void generate(SwarmCachingEditingDomain domain,
			String outputDir, final String designName, PrintStream log) throws IOException {
		// Get the resource
		Resource instanceSource = null;
		URI instURI = URI.createFileURI(outputDir + "/" + designName + ".inst");
		try {
			instanceSource = domain.getResourceSet().getResource(instURI, true);
		} catch (Exception e) {
			instanceSource = domain.getResourceSet()
					.getResource(instURI, false);
		}

		log.println("Generating " + instURI.toFileString());
		
		MasterDesign masterDesign = (MasterDesign)domain
				.getObjectByType(MasterPackage.eINSTANCE.getMasterDesign());

		if (masterDesign == null) 
			return;


		/* Diagram already present, translate the differences */
		Instance instance = (Instance) EcoreUtil.getObjectByType(
				instanceSource.getContents(), InstPackage.eINSTANCE.getInstance());

		if (instance == null) {
			instance = InstFactory.eINSTANCE.createInstance();
		}
		
		/* Diagram already present, translate the differences */
		Diagram diagram = (Diagram) EcoreUtil.getObjectByType(
				instanceSource.getContents(),
				NotationPackage.eINSTANCE.getDiagram());

		if (diagram == null) {
			diagram = NotationFactory.eINSTANCE.createDiagram();
			diagram.setType("Inst");
			diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
			diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		}

		/* Save all older objects */
		final Map<String, CellInstance> oldCellMap = new HashMap<String, CellInstance>();
		final Map<String, TubeInstance> oldTubeMap = new HashMap<String, TubeInstance>();
		final Map<CellInstance, Shape> oldShapeMap = new HashMap<CellInstance, Shape>();
		final Map<TubeInstance, Edge> oldEdgeMap = new HashMap<TubeInstance, Edge>();

		final Diagram finalDiagram = diagram;
		final Instance finalInstance = instance;
		final Resource finalInstanceSource = instanceSource;
		final MasterDesign finalMasterDesign = masterDesign;

		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {

				for (CellInstance mCell : finalInstance.getCell()) {
					oldCellMap.put(mCell.getName(), mCell);
					oldShapeMap.put(mCell, ProjectUtil.getReferringInstance(mCell, Shape.class));
				}
				finalInstance.getCell().clear();

				for (TubeInstance mTube : finalInstance.getTube()) {
					oldTubeMap.put(mTube.getName(), mTube);
					oldEdgeMap.put(mTube, ProjectUtil.getReferringInstance(mTube, Edge.class));
				}
				finalInstance.getTube().clear();

				/* Clear all contents, this saves the object ids */
				finalInstanceSource.getContents().clear();

				for (MasterCell masterCell : finalMasterDesign.getCell()) {
					if(ProjectUtil.getReferringInstance(masterCell,
							IgnoreCell.class) != null)
						continue;
					
					CellInstanceCount instanceCount = ProjectUtil
							.getReferringInstance(masterCell,
									CellInstanceCount.class);
					int count = 1;
					if (instanceCount != null) {
						count = instanceCount.getCount();
					}
					for (int i = 0; i < count; ++i) {
						String cellName = masterCell.getName() + "_" + i;
						CellInstance cellInstance = oldCellMap.get(cellName);
						if (cellInstance != null) {
							cellInstance.getInput().clear();
							cellInstance.getOutput().clear();
							oldCellMap.remove(cellName);
						} else {
							cellInstance = InstFactory.eINSTANCE
									.createCellInstance();
						}

						cellInstance.setName(cellName);
						cellInstance.setInstance(i);
						cellInstance.setCell(masterCell);
						finalInstance.getCell().add(cellInstance);
					}
				}

				for (MasterTube masterTube : finalMasterDesign.getTube()) {
					MasterCell tapCell = null;
					
					if (ProjectUtil.getReferringInstance(masterTube,
							IgnoreTube.class) != null)
						continue;
					Tap tap = ProjectUtil.getReferringInstance(masterTube, Tap.class);
					if (tap != null) {
						tapCell = tap.getCell();
					}

					Queue<CellInstance> from = new LinkedList<CellInstance>();
					Queue<CellInstance> to = new LinkedList<CellInstance>();
					Queue<CellInstance> fromTap = new LinkedList<CellInstance>();
					Queue<CellInstance> toTap = new LinkedList<CellInstance>();

					for (CellInstance cellInstance : finalInstance.getCell()) {
						if (tapCell != null) {
							if(tapCell == cellInstance.getCell()) {
								fromTap.add(cellInstance);
							}
						}
						if (cellInstance.getCell() == masterTube.getFrom()) {
							from.add(cellInstance);
						}
					}
					for (CellInstance cellInstance : finalInstance.getCell()) {
						if (tapCell != null) {
							if(tapCell == cellInstance.getCell()) {
								toTap.add(cellInstance);
							}
						}
						if (cellInstance.getCell() == masterTube.getTo()) {
							to.add(cellInstance);
						}
					}

					AssociationType assocType = AssociationType.MANY_TO_MANY;
					Association assoc = ProjectUtil.getReferringInstance(masterTube, Association.class);
					if (assoc != null) {
						assocType = assoc.getType();
					}
					
					int tubeCount;
					switch(assocType) {
					case MANY_TO_MANY:
						tubeCount = from.size() * to.size();
						break;
					case ONE_TO_MANY:
						tubeCount = to.size();
						break;
					case MANY_TO_ONE:
						tubeCount = from.size();
						break;
					case ONE_TO_ONE:
						tubeCount = from.size();
						break;
					default:
						tubeCount = from.size();
						break;
					}
					
					// Override tube count
					TubeInstanceCount tCount = ProjectUtil.getReferringInstance(masterTube, TubeInstanceCount.class);
					if (tCount != null) tubeCount = tCount.getCount();

					
					Queue<CellInstance> origTo = new LinkedList<CellInstance>();
					origTo.addAll(to);
					while (to.size() < tubeCount) {
//						if (assocType == AssociationType.MANY_TO_MANY) {
//							CellInstance head = origTo.remove();
//							origTo.add(head);
//						}
						to.addAll(origTo);
					}
					
					Queue<CellInstance> origFrom = new LinkedList<CellInstance>();
					origFrom.addAll(from);
					if(assocType == AssociationType.MANY_TO_MANY) from.clear();
					Iterator<CellInstance> it = origFrom.iterator();
					while (from.size() < tubeCount) {
						if(assocType == AssociationType.MANY_TO_MANY) {
							CellInstance inst = it.next();
							for(int i = 0; i < origTo.size(); i ++) {
								from.add(inst);
							}
						} else {
							from.addAll(origFrom);
						}
					}

					
					if(tapCell != null) {
						Queue<CellInstance> origToTap = new LinkedList<CellInstance>();
						origToTap.addAll(toTap);
						while (toTap.size() < tubeCount) {
//							if (assocType == AssociationType.MANY_TO_MANY) {
//								CellInstance head = origToTap.remove();
//								origToTap.add(head);
//							}
							toTap.addAll(origToTap);
						}
						Queue<CellInstance> origFromTap = new LinkedList<CellInstance>();
						origFromTap.addAll(fromTap);
						while (fromTap.size() < tubeCount) {
							fromTap.addAll(origFromTap);
						}
					}

					Iterator<CellInstance> fromIterator = from.iterator();
					Iterator<CellInstance> toIterator = to.iterator();
					Iterator<CellInstance> fromTapIterator = fromTap.iterator();
					Iterator<CellInstance> toTapIterator = toTap.iterator();
					

					for (int i = 0; i < tubeCount; ++i) {
						if (tap != null) {
							String tubeNameIn = masterTube.getName() + "_bypass_in_" + i;
							String tubeNameOut = masterTube.getName() + "_bypass_out_" + i;
							if (masterTube.getTo().isExternal()) { 
								tubeNameOut = masterTube.getName() + "_" + i;
							} 
							if (masterTube.getFrom().isExternal()) {
								tubeNameIn = masterTube.getName() + "_" + i;
							}
							stitchTubeInstance(oldTubeMap, finalInstance,
									masterTube, fromIterator, toTapIterator, i,
									tubeNameIn);
							stitchTubeInstance(oldTubeMap, finalInstance,
									masterTube, fromTapIterator, toIterator, i,
									tubeNameOut);
						} else {
							String tubeName = masterTube.getName() + "_" + i;
							stitchTubeInstance(oldTubeMap, finalInstance,
									masterTube, fromIterator, toIterator, i,
									tubeName);

						}
					}

				}

				/* Restore other cells and tubes */
				// finalInstance.getCell().addAll(oldCellMap.values());
				// finalInstance.getTube().addAll(oldTubeMap.values());

				finalInstance.setName(designName);
				finalDiagram.removeChild(finalDiagram.getDiagram());
				finalDiagram.setElement(finalInstance);
				finalInstanceSource.getContents().add(finalDiagram);
				finalInstanceSource.getContents()
						.add(finalDiagram.getElement());
				
				Collection<CellInstance> remainingCells = oldCellMap.values();
				remainingCells.removeAll(finalMasterDesign.getCell());
				Collection<TubeInstance> remainingTubes = oldTubeMap.values();
				remainingTubes.removeAll(finalMasterDesign.getTube());
				
				ProjectUtil.sanitizeDiagram(finalDiagram);
			}

		});

		Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		log.println("Saving " + instanceSource.getURI().toFileString());
		instanceSource.save(saveOptions);	
		domain.buildReferenceCache();
	}



	private static void stitchTubeInstance(final Map<String, TubeInstance> oldTubeMap,
			final Instance finalInstance, MasterTube masterTube,
			Iterator<CellInstance> fromIterator,
			Iterator<CellInstance> toIterator, int i, String tubeName) {
		TubeInstance tubeInstance = oldTubeMap.get(tubeName);
		if (tubeInstance == null) {
			tubeInstance = InstFactory.eINSTANCE
					.createTubeInstance();
		} else {
			tubeInstance.setTo(null);
			tubeInstance.setFrom(null);
		}

		tubeInstance.setName(tubeName);
		tubeInstance.setInstance(i);
		tubeInstance.setTube(masterTube);
		tubeInstance.setFrom(fromIterator.next());
		tubeInstance.setTo(toIterator.next());

		finalInstance.getTube().add(tubeInstance);
	}
}
