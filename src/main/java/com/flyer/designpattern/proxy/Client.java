package com.flyer.designpattern.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	
	public static void main(String[] args) {
		try {
			TestRemoteInterface test = (TestRemoteInterface) Naming.lookup("rmi://127.0.0.1/server");
			System.out.println(test.concat("I am ", "Zhang xingguo"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
