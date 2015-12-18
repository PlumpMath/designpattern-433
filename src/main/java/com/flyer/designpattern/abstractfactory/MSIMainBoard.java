/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class MSIMainBoard implements MainboardApi {

	private int cpuHoles;

	/**
	 * @param cpuHoles
	 */
	public MSIMainBoard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.flyer.basic.designpattern.abstractfactory.MainboardApi#installCPU()
	 */
	public void installCPU() {
		System.out.println("MSI mainboard, CPU holes : " + cpuHoles);
	}

}
