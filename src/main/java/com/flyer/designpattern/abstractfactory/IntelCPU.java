/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class IntelCPU implements CpuApi {
	
	private int pin;
	

	/**
	 * @param pin
	 */
	public IntelCPU(int pin) {
		this.pin = pin;
	}



	/* (non-Javadoc)
	 * @see com.flyer.basic.designpattern.abstractfactory.CpuApi#caculate()
	 */
	public void caculate() {
		System.out.println("intel cpu, pin number: " + pin);

	}

}
