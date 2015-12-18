/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class ImproveComputerEngineer {
	private CpuApi cpu;
	
	private MainboardApi mainboard;
	
	public void makeComputer(AbstractFactory shema){
		//准备硬件
		prepareHardwares(shema);
		//组装机器
		//测试机器
		//交付客户
	}

	/**
	 * @param cpuType
	 * @param mainboardType
	 */
	private void prepareHardwares(AbstractFactory shema) {
		this.cpu = shema.createCpuApi();
		this.mainboard = shema.createMainboardApi();
		
		//测试一下
		cpu.caculate();
		mainboard.installCPU();
		
	}
}
