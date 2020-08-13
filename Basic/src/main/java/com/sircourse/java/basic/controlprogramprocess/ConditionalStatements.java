package com.sircourse.java.basic.controlprogramprocess;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ConditionalStatements {
	public static void main(String[] args) {
		String str = "www.gisapartment.com";
		if (str.equals("www.gisapartment.com")) {
			System.out.println("这是 if 语句。");
		}

		if (str.equals("GIS 公寓")) {
			System.out.println("这是 if 语句。");
		} else {
			System.out.println("这是 else 语句。");
		}

		if (str.equals("GIS 公寓")) {
			System.out.println("这是 if 语句。");
		} else if (str.equals("www.gisapartment.com")) {
			System.out.println("这是 if else 语句。");
		} else {
			System.out.println("这是 else 语句。");
		}

		if (str.equals("www.gisapartment.com")) {
			if (str.equals("GIS 公寓")) {
				System.out.println("这是 if 嵌套 if语句。");
			} else {
				System.out.println("这是 if 嵌套 else 语句。");
			}
		}
	}
}
