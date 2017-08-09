package com.brainspeedtech.gen.verilog;

import java.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import com.brainspeedtech.struct.Enum;
import org.eclipse.emf.ecore.util.*;;

public class DescriptorFile
{
  protected static String nl;
  public static synchronized DescriptorFile create(String lineSeparator)
  {
    nl = lineSeparator;
    DescriptorFile result = new DescriptorFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + "// Format for enumeration ";
  protected final String TEXT_4 = NL + "// ";
  protected final String TEXT_5 = NL + "// ";
  protected final String TEXT_6 = NL + "`define ";
  protected final String TEXT_7 = " ";
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL + "// Format for ";
  protected final String TEXT_10 = NL + "// ";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "`define ";
  protected final String TEXT_13 = "_";
  protected final String TEXT_14 = "_OFFSET_256\t";
  protected final String TEXT_15 = NL + "`define ";
  protected final String TEXT_16 = "_";
  protected final String TEXT_17 = "_LOC_256\t\t";
  protected final String TEXT_18 = ":";
  protected final String TEXT_19 = NL + "`define ";
  protected final String TEXT_20 = "_";
  protected final String TEXT_21 = "_OFFSET_128\t";
  protected final String TEXT_22 = NL + "`define ";
  protected final String TEXT_23 = "_";
  protected final String TEXT_24 = "_LOC_128\t\t";
  protected final String TEXT_25 = ":";
  protected final String TEXT_26 = NL + "`define ";
  protected final String TEXT_27 = "_";
  protected final String TEXT_28 = "_OFFSET_64\t";
  protected final String TEXT_29 = NL + "`define ";
  protected final String TEXT_30 = "_";
  protected final String TEXT_31 = "_LOC_64\t\t";
  protected final String TEXT_32 = ":";
  protected final String TEXT_33 = NL + "`define ";
  protected final String TEXT_34 = "_";
  protected final String TEXT_35 = "_OFFSET_32\t";
  protected final String TEXT_36 = NL + "`define ";
  protected final String TEXT_37 = "_";
  protected final String TEXT_38 = "_LOC_32\t\t";
  protected final String TEXT_39 = ":";
  protected final String TEXT_40 = NL + "`define ";
  protected final String TEXT_41 = "_";
  protected final String TEXT_42 = "_OFFSET_16 \t";
  protected final String TEXT_43 = NL + "`define ";
  protected final String TEXT_44 = "_";
  protected final String TEXT_45 = "_LOC_16\t\t";
  protected final String TEXT_46 = ":";
  protected final String TEXT_47 = NL + "`define ";
  protected final String TEXT_48 = "_";
  protected final String TEXT_49 = "_OFFSET_8\t\t";
  protected final String TEXT_50 = NL + "`define ";
  protected final String TEXT_51 = "_";
  protected final String TEXT_52 = "_LOC_8\t\t";
  protected final String TEXT_53 = ":";
  protected final String TEXT_54 = NL;
  protected final String TEXT_55 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Resource resource = (Resource) argument;  	
	Document doc = (Document) EcoreUtil.getObjectByType(
	resource.getContents(), StructPackage.eINSTANCE.getDocument());
	if (doc == null)
		return "";
	Collection<Struct> structs = EcoreUtil.getObjectsByType(
			doc.getStruct(), StructPackage.eINSTANCE.getStruct());
	Collection<Enum> enumerations = EcoreUtil.getObjectsByType(
			doc.getStruct(), StructPackage.eINSTANCE.getEnum());
	if (structs.isEmpty() && enumerations.isEmpty())
		return "";
	String[] copyrightMessage = LayerUtil.getCopyrightMessage(doc);	

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    }
    stringBuffer.append(TEXT_2);
    for(Enum enumeration:enumerations) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(enumeration.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(GenUtil.sanitize(enumeration.getBlurb()));
    	for(EnumTerm term: enumeration.getTerm()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(GenUtil.sanitize(term.getBlurb()));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(term.getName().toUpperCase());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(term.getValue());
     	}
    }
    stringBuffer.append(TEXT_8);
    for(Struct struct: structs) {
	long currentLocation = 0;
	long iterateLocation = 0;

    stringBuffer.append(TEXT_9);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(GenUtil.sanitize(struct.getBlurb()));
    	for(Field field: struct.getField()) {
	currentLocation = iterateLocation;
	long nextLocation = currentLocation + StructUtil.getFieldCount(field) * 
			StructUtil.getAtomSize(field.getAtom()) - 1;
	iterateLocation = nextLocation + 1;

    stringBuffer.append(TEXT_11);
    if((currentLocation/256) != (nextLocation/256)) continue; 
    stringBuffer.append(TEXT_12);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_14);
    stringBuffer.append((currentLocation/256));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_17);
    stringBuffer.append((nextLocation%256));
    stringBuffer.append(TEXT_18);
    stringBuffer.append((currentLocation%256));
    if((currentLocation/128) != (nextLocation/128)) continue; 
    stringBuffer.append(TEXT_19);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_21);
    stringBuffer.append((currentLocation/128));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_24);
    stringBuffer.append((nextLocation%128));
    stringBuffer.append(TEXT_25);
    stringBuffer.append((currentLocation%128));
    if((currentLocation/64) != (nextLocation/64)) continue; 
    stringBuffer.append(TEXT_26);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_28);
    stringBuffer.append((currentLocation/64));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_31);
    stringBuffer.append((nextLocation%64));
    stringBuffer.append(TEXT_32);
    stringBuffer.append((currentLocation%64));
    if((currentLocation/32) != (nextLocation/32)) continue; 
    stringBuffer.append(TEXT_33);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_35);
    stringBuffer.append((currentLocation/32));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_38);
    stringBuffer.append((nextLocation%32));
    stringBuffer.append(TEXT_39);
    stringBuffer.append((currentLocation%32));
    if((currentLocation/16) != (nextLocation/16)) continue; 
    stringBuffer.append(TEXT_40);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_42);
    stringBuffer.append((currentLocation/16));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_45);
    stringBuffer.append((nextLocation%16));
    stringBuffer.append(TEXT_46);
    stringBuffer.append((currentLocation%16));
    if((currentLocation/8) != (nextLocation/8)) continue; 
    stringBuffer.append(TEXT_47);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_49);
    stringBuffer.append((currentLocation/8));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_52);
    stringBuffer.append((nextLocation%8));
    stringBuffer.append(TEXT_53);
    stringBuffer.append((currentLocation%8));
    }
    }
    stringBuffer.append(TEXT_54);
    stringBuffer.append(TEXT_55);
    return stringBuffer.toString();
  }
}
