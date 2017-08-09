/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.verilog;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import com.brainspeedtech.constraint.hardware.verilog.BusWidth;
import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.util.MasterUtil;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class ImplementationGenerator {


	public static void generate(SwarmCachingEditingDomain domain,
			String outputDir, String designName) throws Exception {

		final Instance instance = (Instance) domain
				.getObjectByType(InstPackage.eINSTANCE.getInstance());
		if (instance == null)
			return;

		final MasterDesign mDesign = (MasterDesign) domain
				.getObjectByType(MasterPackage.eINSTANCE.getMasterDesign());
		if (mDesign == null)
			return;

		String genPrefix = outputDir + "/gen_";
		
		new GeneratorFile(genPrefix + designName + "_design.vh") {
			@Override
			public String getFileContents() {
				return new DesignHeaderFile().generate(instance);
			}
		};

		for (final CellInstance cellInstance : instance.getCell()) {

			if (cellInstance.getCell().isExternal())
				continue;

			new GeneratorFile(genPrefix + cellInstance.getName() + "_wrapper.v") {
				@Override
				public String getFileContents() {
					return new DesignModuleFile().generate(cellInstance);
				}

			};

		}

		new GeneratorFile(genPrefix + designName + "_top.v") {
			@Override
			public String getFileContents() {
				return new DesignTopFile().generate(instance);
			}
		};


		HashMap<String, Struct> packStructMap = new HashMap<String, Struct>();
		HashMap<String, Struct> unpackStructMap = new HashMap<String, Struct>();
		
		for (CellInstance cell : instance.getCell()) {

			for (TubeInstance ti : cell.getInput()) {
				Collection<Struct> structList = MasterUtil.getDescriptors(ti
						.getTube());
				if (structList.isEmpty())
					continue;

				Struct descriptorStruct = null;
				for (Struct struct : structList) {
					descriptorStruct = struct;
					break;
				}

				BusWidth widthConstraint = ProjectUtil.getReferringInstance(ti,
						BusWidth.class);
				if (widthConstraint == null) {
					widthConstraint = ProjectUtil.getReferringInstance(
							ti.getTube(), BusWidth.class);
				}
				Integer width = 32;
				if (widthConstraint != null) {
					width = widthConstraint.getWidth();
				}
				
				packStructMap.put(descriptorStruct.getName() + "_" + width.toString(), descriptorStruct);
			}

			for (TubeInstance ti : cell.getOutput()) {
				Collection<Struct> structList = MasterUtil.getDescriptors(ti
						.getTube());
				if (structList.isEmpty())
					continue;

				Struct descriptorStruct = null;
				for (Struct struct : structList) {
					descriptorStruct = struct;
					break;
				}

				BusWidth widthConstraint = ProjectUtil.getReferringInstance(ti,
						BusWidth.class);
				if (widthConstraint == null) {
					widthConstraint = ProjectUtil.getReferringInstance(
							ti.getTube(), BusWidth.class);
				}
				Integer width = 32;
				if (widthConstraint != null) {
					width = widthConstraint.getWidth();
				}
				
				unpackStructMap.put(descriptorStruct.getName() + "_" + width.toString(), descriptorStruct);
			}
		}
		
		for (final Entry<String, Struct> structEntry: packStructMap.entrySet()) {
			new GeneratorFile(genPrefix + structEntry.getKey() + "_pack.v") {
				@Override
				public String getFileContents() {
					return new PackFile().generate(structEntry);
				}
			};

		}
		
		for (final Entry<String, Struct> structEntry: unpackStructMap.entrySet()) {
			new GeneratorFile(genPrefix + structEntry.getKey() + "_unpack.v") {
				@Override
				public String getFileContents() {
					return new UnpackFile().generate(structEntry);
				}
			};
		}
	}
}
