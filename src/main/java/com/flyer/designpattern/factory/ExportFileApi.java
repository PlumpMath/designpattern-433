/**
 * 
 */
package com.flyer.designpattern.factory;

/**
 * @author flyer
 *
 */
public interface ExportFileApi {
	
	/**
	 * 导出数据
	 * @param data 要导出的数据
	 * @return true 导出成功  false 导出失败
	 */
	boolean export(String data);

}
