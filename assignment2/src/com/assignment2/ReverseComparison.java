package com.assignment2;

/**
 * 
 * @author Deep
 *
 */

public class ReverseComparison implements TreeStrategy {

	@Override
	public String getData(String value) {
		String reverse = new StringBuffer(value).reverse().toString();
		return reverse;
	}
}