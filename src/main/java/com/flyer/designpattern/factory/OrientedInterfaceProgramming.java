/**
 * 
 */
package com.flyer.designpattern.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 面向接口编程
 * @author flyer
 *
 */
public class OrientedInterfaceProgramming {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//推荐
		Map<String,String> cache = new HashMap<String,String>();
		cache.put("key", "value");
		
		//不推荐
		HashMap<String,String> cache1 = new HashMap<String,String>();
		cache1.put("key", "value");
	}

}
