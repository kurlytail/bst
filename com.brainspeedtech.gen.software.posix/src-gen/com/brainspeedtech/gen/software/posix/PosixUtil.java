/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.posix;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import com.brainspeedtech.constraint.software.SocketTube;
import com.brainspeedtech.constraint.software.TCPSocketTube;
import com.brainspeedtech.constraint.software.posix.IgnorePosixTube;
import com.brainspeedtech.constraint.software.posix.UnixSocketTube;
import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class PosixUtil {

	public static Map<TubeInstance, SocketTube> getServerSocketTubes(
			CellInstance instance) {
		Map<TubeInstance, SocketTube> map = new HashMap<TubeInstance, SocketTube>();
		for(TubeInstance tInstance: instance.getInput()) {
			if (ProjectUtil.getReferringInstance(tInstance.getTube(), IgnorePosixTube.class) != null) continue;
			SocketTube socket = ProjectUtil.getReferringInstance(tInstance, SocketTube.class);
			if (socket != null && !socket.isClientReceiver()) {
				map.put(tInstance, socket);
			}
		}
		
		for(TubeInstance tInstance: instance.getOutput()) {
			if (ProjectUtil.getReferringInstance(tInstance.getTube(), IgnorePosixTube.class) != null) continue;
			SocketTube socket = ProjectUtil.getReferringInstance(tInstance, SocketTube.class);
			if (socket != null && socket.isClientReceiver()) {
				map.put(tInstance, socket);
			}
		}
		
		return map;
	}

	public static Map<TubeInstance, SocketTube> getClientSocketTubes(
			CellInstance instance) {
		Map<TubeInstance, SocketTube> map = new HashMap<TubeInstance, SocketTube>();
		for(TubeInstance tInstance: instance.getInput()) {
			if (ProjectUtil.getReferringInstance(tInstance.getTube(), IgnorePosixTube.class) != null) continue;
			SocketTube socket = ProjectUtil.getReferringInstance(tInstance, SocketTube.class);
			if (socket != null && socket.isClientReceiver()) {
				map.put(tInstance, socket);
			}
		}
		
		for(TubeInstance tInstance: instance.getOutput()) {
			if (ProjectUtil.getReferringInstance(tInstance.getTube(), IgnorePosixTube.class) != null) continue;
			SocketTube socket = ProjectUtil.getReferringInstance(tInstance, SocketTube.class);
			if (socket != null && !socket.isClientReceiver()) {
				map.put(tInstance, socket);
			}
		}

		return map;
	}

}
