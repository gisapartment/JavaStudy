package com.gisapartment.java.basic.stringoperator;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class StringNullAndEmpty {
	public static void main(String[] args) {
		String str1 = "";
		if (str1.length() == 0) {
			System.out.println("str1 是空字符串");
		}
		if (str1.isEmpty()) {
			System.out.println("str1 是空字符串");
		}
		if (str1.equals("")) {
			System.out.println("str1 是空字符串");
		}
		String str2 = null;
		if (str2 == null) {
			System.out.println("str2 是null字符串");
		}
	}
}
