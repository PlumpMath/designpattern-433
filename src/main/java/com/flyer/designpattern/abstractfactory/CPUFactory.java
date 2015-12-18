/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public final class CPUFactory {

	private CPUFactory() {

	}

	/**
	 * @param type
	 * @return
	 */
	public static CpuApi createCpuApi(CPUType type) {
		switch (type) {
		case AMD:
			return new AmdCPU(939);
		case INTEL:
			return new IntelCPU(1156);
		default:
			throw new IllegalArgumentException("type is not illegal");
		}
	}

}
