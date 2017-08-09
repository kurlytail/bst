/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.java;

import java.util.Collection;

import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.struct.Document;
import com.brainspeedtech.struct.Field;
import com.brainspeedtech.struct.StructPackage;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;

public class StructGenerator {
	
	public static String getHeirarchicalName(Field field) {
		if (field.eResource() == field.getAtom().eResource()) {
			return field.getAtom().getName();
		}
		if (field.getAtom() instanceof com.brainspeedtech.struct.Enum) {
			return field.getAtom().eResource().getURI().lastSegment().replaceAll("\\.struct$", "") + ".ENUM_" +
					field.getAtom().getName();
		
		} else {
			return field.getAtom().eResource().getURI().lastSegment().replaceAll("\\.struct$", "") + "." +
					field.getAtom().getName();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void generate(final SwarmCachingEditingDomain domain,
			String outputDir, String designName) throws Exception {

		Collection<? extends Document> structs = (Collection<? extends Document>) domain
				.getObjectsByType(StructPackage.eINSTANCE.getDocument());
		String genPrefix = outputDir + "/gen_";

		for (final Document struct : structs) {

			String name = struct.eResource().getURI().lastSegment()
					.replaceAll("\\.struct$", "");
			new GeneratorFile(genPrefix + name + ".java") {
				@Override
				public String getFileContents() {
					return new StructHeaderFile().generate(struct.eResource());
				}
			};

		}
		
		new GeneratorFile(genPrefix + "SwarmStructBase.java") {
			@Override
			public String getFileContents() {
				return new SwarmStructBaseFile().generate(domain.getID());
			}
		};
	}

}
