/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class ImporveClient {
	
	public static void main(String[] args) {
		ImproveComputerEngineer engineer = new ImproveComputerEngineer();
		AbstractFactory schema = new Schema1();
		engineer.makeComputer(schema);
	}

}
