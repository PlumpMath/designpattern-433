/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class Schema2 implements AbstractFactory {

	/* (non-Javadoc)
	 * @see com.flyer.basic.designpattern.abstractfactory.AbstractFactory#createCpuApi()
	 */
	public CpuApi createCpuApi() {
		return new AmdCPU(939);
	}

	/* (non-Javadoc)
	 * @see com.flyer.basic.designpattern.abstractfactory.AbstractFactory#createMainboardApi()
	 */
	public MainboardApi createMainboardApi() {
		return new MSIMainBoard(939);
	}

}
