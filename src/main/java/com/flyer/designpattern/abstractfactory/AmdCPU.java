/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class AmdCPU implements CpuApi {
	
	private int pin;
	
	/**
	 * @param pin
	 */
	public AmdCPU(int pin) {
		super();
		this.pin = pin;
	}



	/* (non-Javadoc)
	 * @see com.flyer.basic.designpattern.abstractfactory.CpuApi#caculate()
	 */
	public void caculate() {
		System.out.println("AMD cpu, pin number: " + pin);
	}

}
