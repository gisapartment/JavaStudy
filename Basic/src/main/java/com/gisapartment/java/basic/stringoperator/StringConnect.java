package com.gisapartment.java.basic.stringoperator;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class StringConnect {
	public static void main(String[] args) {
		String str1 = "www.";
		String str2 = "gisapartment";
		String str3 = ".com";

		System.out.println("连接字符串方法1，使用+号:");
		String string = str1 + str2 + str3;
		System.out.println(string);

		System.out.println("连接字符串方法2，使用concat方法:");
		string = str1.concat(str2).concat(str3);
		System.out.println(string);

		System.out.println("连接字符串方法3，使用静态方法join方法:");
		string = String.join("", str1, str2, str3);
		System.out.println(string);
	}
}
