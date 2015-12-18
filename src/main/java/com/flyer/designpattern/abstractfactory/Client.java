/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class Client {
	
	public static void main(String[] args) {
		ComputerEngineer engineer = new ComputerEngineer();
		engineer.makeComputer(CPUType.AMD, MainboardType.GA);
	}

}
