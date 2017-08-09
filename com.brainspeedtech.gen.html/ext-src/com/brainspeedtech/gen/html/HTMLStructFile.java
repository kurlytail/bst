package com.brainspeedtech.gen.html;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.resource.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.reg.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.flow.*;;

public class HTMLStructFile
{
  protected static String nl;
  public static synchronized HTMLStructFile create(String lineSeparator)
  {
    nl = lineSeparator;
    HTMLStructFile result = new HTMLStructFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Strict//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">" + NL + "<html>" + NL + "<head>" + NL + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" + NL + "<title>";
  protected final String TEXT_2 = "</title>" + NL + "</head>" + NL + "<body>";
  protected final String TEXT_3 = NL + "\t<h1><a name=\"";
  protected final String TEXT_4 = "\">";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = "</a></h1>" + NL + "\t<p>";
  protected final String TEXT_7 = "</p>";
  protected final String TEXT_8 = NL + "\t<table border=\"1\" cellpadding=\"5\" cellspacing=\"0\">" + NL + "\t<tr>" + NL + "\t\t<th>" + NL + "\t\t\tField" + NL + "\t\t</th>" + NL + "\t\t<th>" + NL + "\t\t\tType" + NL + "\t\t</th>" + NL + "\t\t<th>" + NL + "\t\t\tUnit Size" + NL + "\t\t</th>" + NL + "\t\t<th>" + NL + "\t\t\tCount" + NL + "\t\t</th>" + NL + "\t\t<th>" + NL + "\t\t\tDescription" + NL + "\t\t</th>" + NL + "\t</tr>";
  protected final String TEXT_9 = NL + "\t<tr>" + NL + "\t\t<td>" + NL + "\t\t\t";
  protected final String TEXT_10 = NL + "\t\t</td>" + NL + "\t\t<td>";
  protected final String TEXT_11 = NL + "\t\t\t\t<a href=\"#";
  protected final String TEXT_12 = "\">";
  protected final String TEXT_13 = "</a>";
  protected final String TEXT_14 = NL + "\t\t\t\tbit";
  protected final String TEXT_15 = NL + "\t\t</td>" + NL + "\t\t<td>";
  protected final String TEXT_16 = NL + "\t\t\t";
  protected final String TEXT_17 = " Bytes";
  protected final String TEXT_18 = NL + "\t\t\t";
  protected final String TEXT_19 = " Bit";
  protected final String TEXT_20 = NL + "\t\t</td>" + NL + "\t\t<td>" + NL + "\t\t\t";
  protected final String TEXT_21 = NL + "\t\t</td>" + NL + "\t\t<td>" + NL + "\t\t\t";
  protected final String TEXT_22 = NL + "\t\t</td>" + NL + "\t</tr>";
  protected final String TEXT_23 = NL + "\t</table>";
  protected final String TEXT_24 = NL + "\t<table border=\"1\" cellpadding=\"5\" cellspacing=\"0\">" + NL + "\t<tr>" + NL + "\t\t<th>" + NL + "\t\t\tEnumeration" + NL + "\t\t</th>" + NL + "\t\t<th>" + NL + "\t\t\tValue" + NL + "\t\t</th>" + NL + "\t\t<th>" + NL + "\t\t\tDescription" + NL + "\t\t</th>" + NL + "\t</tr>";
  protected final String TEXT_25 = NL + "\t<tr>" + NL + "\t\t<td>" + NL + "\t\t\t";
  protected final String TEXT_26 = NL + "\t\t</td>" + NL + "\t\t<td>" + NL + "\t\t\t";
  protected final String TEXT_27 = NL + "\t\t</td>" + NL + "\t\t<td>" + NL + "\t\t\t";
  protected final String TEXT_28 = NL + "\t\t</td>" + NL + "\t</tr>";
  protected final String TEXT_29 = NL + "\t</table>";
  protected final String TEXT_30 = NL + NL + "</body>" + NL + "</html>";
  protected final String TEXT_31 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Document doc = (Document) argument;
  String fileName = doc.eResource().getURI().lastSegment().replaceAll(".struct", "");

    stringBuffer.append(TEXT_1);
    stringBuffer.append(fileName);
    stringBuffer.append(TEXT_2);
    
Collection<Atom> atoms = EcoreUtil.getObjectsByType(doc.eContents(),
		StructPackage.eINSTANCE.getAtom());
for(Atom atom: atoms) {

    stringBuffer.append(TEXT_3);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(atom.eClass().getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(atom.getBlurb());
    stringBuffer.append(TEXT_7);
    	if(atom instanceof Struct) {
		Struct struct = (Struct)atom;
		
    stringBuffer.append(TEXT_8);
    
	for(Field field : struct.getField()) {

    stringBuffer.append(TEXT_9);
    stringBuffer.append(field.getName());
    stringBuffer.append(TEXT_10);
    
			if(field.getAtom() != null) {

    stringBuffer.append(TEXT_11);
    stringBuffer.append(field.getAtom().getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(field.getAtom().getName());
    stringBuffer.append(TEXT_13);
    
			} else {

    stringBuffer.append(TEXT_14);
    
			}

    stringBuffer.append(TEXT_15);
    
			long unitSize = StructUtil.getAtomSize(field.getAtom());
			if ((unitSize % 8) == 0) {

    stringBuffer.append(TEXT_16);
    stringBuffer.append((unitSize/8));
    stringBuffer.append(TEXT_17);
    
			} else {

    stringBuffer.append(TEXT_18);
    stringBuffer.append(unitSize);
    stringBuffer.append(TEXT_19);
    
			}

    stringBuffer.append(TEXT_20);
    stringBuffer.append(StructUtil.getFieldCount(field));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(field.getBlurb());
    stringBuffer.append(TEXT_22);
    		} 
    stringBuffer.append(TEXT_23);
    
	}

    	if(atom instanceof com.brainspeedtech.struct.Enum) {
		com.brainspeedtech.struct.Enum enumeration = (com.brainspeedtech.struct.Enum)atom;
		
    stringBuffer.append(TEXT_24);
    
	for(EnumTerm term : enumeration.getTerm()) {

    stringBuffer.append(TEXT_25);
    stringBuffer.append(term.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(term.getValue());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(term.getBlurb());
    stringBuffer.append(TEXT_28);
    		} 
    stringBuffer.append(TEXT_29);
    
	}
}
    stringBuffer.append(TEXT_30);
    stringBuffer.append(TEXT_31);
    return stringBuffer.toString();
  }
}
