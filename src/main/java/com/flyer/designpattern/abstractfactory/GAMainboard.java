/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class GAMainboard implements MainboardApi {

	private int cpuHoles;

	/**
	 * @param cpuHoles
	 */
	public GAMainboard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.flyer.basic.designpattern.abstractfactory.MainboardApi#installCPU()
	 */
	public void installCPU() {
		System.out.println("GA mainboard, CPU holes : " + cpuHoles);
	}

}
