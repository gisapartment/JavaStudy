package com.gisapartment.java.basic.operator;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class LogicalOperators {
	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "1234";
		String str3 = "www.gisapartment.com";
		String str4 = "www.gisapartment.com";
		if (str1 == str2 && str3.equals(str4)) {
			System.out.println("str1 == str2 并且 str3 equals str4");
		}

		if (str1 == str2 || str3.equals(str4)) {
			System.out.println("str1 == str2 || str3 equals str4");
		}
	}
}
