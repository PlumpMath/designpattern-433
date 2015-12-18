/**
 * 
 */
package com.flyer.designpattern.factory;

/**
 * @author flyer
 *
 */
public class ExportTxtOperate extends ExportOperate {

	/* (non-Javadoc)
	 * @see com.flyer.basic.designpattern.factory.ExportOperate#createExportFileApi()
	 */
	@Override
	protected ExportFileApi createExportFileApi() {
		return new ExportTxtFile();
	}

}
