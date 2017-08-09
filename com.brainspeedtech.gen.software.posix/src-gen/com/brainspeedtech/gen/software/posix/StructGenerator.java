/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.posix;

import java.io.PrintStream;
import java.util.Collection;

import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.struct.Document;
import com.brainspeedtech.struct.StructPackage;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;

public class StructGenerator {

	@SuppressWarnings("unchecked")
	public static void generate(SwarmCachingEditingDomain domain,
			String outputDir, String designName, final PrintStream log) throws Exception {

		Collection<? extends Document> structs = (Collection<? extends Document>) domain
				.getObjectsByType(StructPackage.eINSTANCE.getDocument());
		String genPrefix = outputDir + "/gen_";

		for (final Document struct : structs) {

			String name = struct.eResource().getURI().lastSegment()
					.replaceAll("\\.struct$", "");
			
			new GeneratorFile(genPrefix + name + ".h") {
				@Override
				public String getFileContents() {
					log.println("Generating structure header " + file.getAbsolutePath());
					return new StructHeaderFile().generate(struct.eResource());
				}
			};

			new GeneratorFile(genPrefix + name + ".c") {
				@Override
				public String getFileContents() {
					log.println("Generating structure print routines " + file.getAbsolutePath());
					return new StructSourceFile().generate(struct.eResource());
				}
			};
		}
	}
}
