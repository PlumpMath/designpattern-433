package com.flyer.designpattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author xingzhan
 * 
 */
public interface TestRemoteInterface extends Remote {

	String concat(String a, String b) throws RemoteException;

	String concat() throws RemoteException;

}
