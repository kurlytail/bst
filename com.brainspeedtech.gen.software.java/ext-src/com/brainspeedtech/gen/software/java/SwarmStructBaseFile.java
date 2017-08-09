package com.brainspeedtech.gen.software.java;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.core.resources.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.java.*;
import java.io.*;
import org.eclipse.emf.common.util.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.util.*;
import java.util.*;;

public class SwarmStructBaseFile
{
  protected static String nl;
  public static synchronized SwarmStructBaseFile create(String lineSeparator)
  {
    nl = lineSeparator;
    SwarmStructBaseFile result = new SwarmStructBaseFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.nio.ByteBuffer;" + NL + "import java.io.IOException;" + NL + "import java.io.InputStream;" + NL + "import java.io.OutputStream;" + NL + "" + NL + "public abstract class SwarmStructBase {" + NL + "" + NL + "\tpublic abstract void pack(ByteBuffer byteBuffer);" + NL + "\t" + NL + "\tpublic abstract void unpack(ByteBuffer byteBuffer);" + NL + "\t" + NL + "\tpublic abstract long getByteSize();" + NL + "\t" + NL + "\tpublic void recv(InputStream stream) throws IOException {" + NL + "\t\tlong bufferSize = getByteSize();" + NL + "\t\tByteBuffer byteBuffer = ByteBuffer.allocate((int) bufferSize);" + NL + "\t\tbyteBuffer.position((int) bufferSize);" + NL + "\t\t" + NL + "\t\twhile(stream.available() < bufferSize);" + NL + "\t\tstream.read(byteBuffer.array());" + NL + "\t\t" + NL + "\t\tbyteBuffer.flip();" + NL + "\t\tunpack(byteBuffer);" + NL + "\t}" + NL + "\t" + NL + "\tpublic void send(OutputStream stream) throws IOException {" + NL + "\t\tlong bufferSize = getByteSize();" + NL + "\t\tByteBuffer byteBuffer = ByteBuffer.allocate((int) bufferSize);" + NL + "\t\tpack(byteBuffer);" + NL + "" + NL + "\t\tbyteBuffer.flip();" + NL + "\t\tstream.write(byteBuffer.array());" + NL + "\t}" + NL + "}";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append((String)argument);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
