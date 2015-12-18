/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public class ComputerEngineer {
	
	private CpuApi cpu;
	
	private MainboardApi mainboard;
	
	public void makeComputer(CPUType cpuType, MainboardType mainboardType){
		//准备硬件
		prepareHardwares(cpuType,mainboardType);
		//组装机器
		//测试机器
		//交付客户
	}

	/**
	 * @param cpuType
	 * @param mainboardType
	 */
	private void prepareHardwares(CPUType cpuType, MainboardType mainboardType) {
		this.cpu = CPUFactory.createCpuApi(cpuType);
		this.mainboard = MainboardFactory.createMainboardApi(mainboardType);
		
		//测试一下
		cpu.caculate();
		mainboard.installCPU();
		
	}

}
