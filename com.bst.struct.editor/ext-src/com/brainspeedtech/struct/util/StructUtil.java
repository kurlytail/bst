/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.struct.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.brainspeedtech.struct.Atom;
import com.brainspeedtech.struct.Field;
import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.layer.Parameter;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class StructUtil {
	static ScriptEngineManager mgr = new ScriptEngineManager();
	static ScriptEngine engine = mgr.getEngineByName("JavaScript");
	
	public static long getFieldCount(Field field) {
		Parameter param = ProjectUtil.getReferringInstance(field, Parameter.class);
		Object value = null;
		if (param != null) {
 			
			Collection<Object> objects = EcoreUtil.getObjectsByType(param.eContainer().eContents(),
					LayerPackage.eINSTANCE.getParameter());
			for(Object obj: objects) {
				if (obj.equals(param)) break;

				Parameter p = (Parameter)obj;
				try {
					engine.put(p.getName(), engine.eval(p.getValue()));
				} catch (ScriptException e) {
				}
				
			}
			
			try {
				value = engine.eval(param.getValue());
			} catch (ScriptException e) {
			}
			
			if(value instanceof Double) {
				return ((Double)value).longValue();
			}

		}
		return field.getCount();
	}
	
	public static String getFieldCountString(Field field) {
		Parameter param = ProjectUtil.getReferringInstance(field, Parameter.class);
		if (param != null) {
			return param.getName();
		}
		return Long.toString(field.getCount());
	}

	public static long getAtomSize(Atom atom) {
		if (atom == null)
			return 1;
		
		if (!(atom instanceof Struct))
			return 0;

		Struct struct = (Struct) atom;
		long size = 0;
		for (Field field : struct.getField()) {
			size = size + getFieldCount(field) * getAtomSize(field.getAtom());
		}
		return ((size + 7)/8) * 8;
	}

	public static List<Entry<String, Field>> squash(String prefix, Struct struct) {
		List<Entry<String, Field>> fields = new ArrayList<Entry<String, Field>>();
		
		for (final Field field: struct.getField()) {
			if (field.getAtom() == null) {
				final String fieldName = prefix + field.getName();
				fields.add(new Entry<String, Field>() {
					
					@Override
					public Field setValue(Field value) {
						return field;
					}
					
					@Override
					public Field getValue() {
						return field;
					}
					
					@Override
					public String getKey() {
						return fieldName;
					}
				});
			} else {
				fields.addAll(squash(field.getName() + "_", (Struct)field.getAtom()));
			}
		}
		
		return fields;
	}
	
	public static List<Entry<String, Field>> squash(Struct struct) {
		return squash("", struct);
	}
}
