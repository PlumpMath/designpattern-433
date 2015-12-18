/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class Schema1 implements AbstractFactory{

	/* (non-Javadoc)
	 * @see com.flyer.basic.designpattern.abstractfactory.AbstractFactory#createCpuApi()
	 */
	public CpuApi createCpuApi() {
		return new IntelCPU(1156);
	}

	/* (non-Javadoc)
	 * @see com.flyer.basic.designpattern.abstractfactory.AbstractFactory#createMainboardApi()
	 */
	public MainboardApi createMainboardApi() {
		return new GAMainboard(1156);
	}

}
