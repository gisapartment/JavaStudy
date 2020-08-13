package com.sircourse.java.basic.stringoperator;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class StringCut {
	public static void main(String[] args) {
		String url = "www.gisapartment.com";
		System.out.println("原始字符串:" + url);

		String subString = url.substring(4);
		System.out.println("指定开始索引裁剪:" + subString);
		subString = url.substring(4, url.length() - 4);
		System.out.println("指定开始与结尾索引裁剪:" + subString);
	}
}
