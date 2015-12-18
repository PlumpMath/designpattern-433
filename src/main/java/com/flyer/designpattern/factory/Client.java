/**
 * 
 */
package com.flyer.designpattern.factory;

/**
 * @author flyer
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExportOperate operate = new ExportDBOperate();
		operate.export("测试数据");
	}

}
