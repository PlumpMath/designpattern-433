package com.flyer.designpattern.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author xingzhan
 *
 */
public class Server {
	
	public Server(){
		try {
			TestRemoteInterface test = new TestRemoteImpl();
			Naming.rebind("rmi://127.0.0.1/server", test);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Server server = new Server();
	}

}
