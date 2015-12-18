/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public interface AbstractFactory {
	
	CpuApi createCpuApi();
	
	MainboardApi createMainboardApi();

}
