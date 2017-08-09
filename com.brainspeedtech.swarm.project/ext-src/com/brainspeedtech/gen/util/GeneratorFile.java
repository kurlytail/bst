/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;



public abstract class GeneratorFile {	

	private static List<File> fileList = new LinkedList<File>();
	private OutputStreamWriter writer;
	protected File file;
	
	
	public GeneratorFile(String path) throws Exception {
		file = new File(path);
		
		File directory = file.getParentFile();
		if(!directory.exists()) {
			directory.mkdirs();
		}
		
		FileOutputStream outputStream = new FileOutputStream(file);
		writer = new OutputStreamWriter(outputStream);
		
		writer.write(getFileContents());
		writer.flush();
		writer.close();
		outputStream.close();

		
		fileList.add(file);
	}
	
	public GeneratorFile(String path, boolean overwrite) throws Exception {
		file = new File(path);
		
		File directory = file.getParentFile();
		if(!directory.exists()) {
			directory.mkdirs();
		}
		
		if(!overwrite) {
			if (file.exists()) return;
		}
		
		FileOutputStream outputStream = new FileOutputStream(file);
		writer = new OutputStreamWriter(outputStream);
		
		writer.write(getFileContents());
		writer.flush();
		writer.close();
		outputStream.close();

		
		fileList.add(file);
	}
	
	protected void write(String str) throws Exception {
		writer.write(str);
	}

	public abstract String getFileContents() throws Exception;

	public static void resetFileList() {
		fileList.clear();
	}

	public static List<File> getFileList() {
		return fileList;
	}
	
}
