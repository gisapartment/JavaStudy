package com.gisapartment.java.basic.stringoperator;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class StringEquals {
	public static void main(String[] args) {
		String str1 = "www.gisapartment.com";
		String str2 = "www.GISApartment.com";
		System.out.println("使用equals方法判断是否相等:" + str1.equals(str2));
		System.out.println("使用equalsIgnoreCase方法判断是否相等:" + str1.equalsIgnoreCase(str2));
	}
}
