/**
 * 
 */
package com.flyer.designpattern.factory;

/**
 * @author flyer
 *
 */
public class ExportDBFile implements ExportFileApi {

	/* (non-Javadoc)
	 * @see com.flyer.basic.designpattern.factory.ExportFileApi#export(java.lang.String)
	 */
	public boolean export(String data) {
		System.out.println("导出数据" + data + "到数据库备份文件");
		return true;
	}

}
