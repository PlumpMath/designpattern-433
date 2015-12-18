/**
 * 
 */
package com.flyer.designpattern.abstractfactory;

/**
 * @author flyer
 *
 */
public final class MainboardFactory {
	private MainboardFactory() {

	}

	public static MainboardApi createMainboardApi(MainboardType type) {
		switch (type) {
		case GA:
			return new GAMainboard(1156);
		case MSI:
			return new MSIMainBoard(939);

		default:
			throw new IllegalArgumentException("type is not illegal");
		}
	}

}
