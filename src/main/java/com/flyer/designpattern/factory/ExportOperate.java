/**
 * 
 */
package com.flyer.designpattern.factory;

/**
 * @author flyer
 *
 */
public abstract class ExportOperate {

	/**
	 * @param data
	 * @return
	 */
	public boolean export(String data) {
		ExportFileApi exportFile = createExportFileApi();
		return exportFile.export(data);
	}

	protected abstract ExportFileApi createExportFileApi();

}
