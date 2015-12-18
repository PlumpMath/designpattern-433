/**
 * 
 */
package com.flyer.designpattern.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author xingzhan
 *
 */
public class TestRemoteImpl extends UnicastRemoteObject implements TestRemoteInterface {


	protected TestRemoteImpl() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5291065387333109826L;

	/* (non-Javadoc)
	 * @see com.flyer.box.designpattern.proxy.TestRemoteInterface#concat(java.lang.String, java.lang.String)
	 */
	@Override
	public String concat(String a, String b) throws RemoteException {
		return a+b;
	}

	/* (non-Javadoc)
	 * @see com.flyer.box.designpattern.proxy.TestRemoteInterface#concat()
	 */
	@Override
	public String concat() throws RemoteException {
		return "Hello World";
	}

}
