package com.sircourse.java.basic.operator;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class RelationalOperator {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		if (x == y) {
			System.out.println("x==y");
		} else if (x != y) {
			System.out.println("x!=y");
		} else if (x > y) {
			System.out.println("x>y");
		} else if (x < y) {
			System.out.println("x<y");
		} else if (x >= y) {
			System.out.println("x>=y");
		} else if (x <= y) {
			System.out.println("x<=y");
		}

		String str1 = "123";
		String str2 = "123";

		System.out.println("str1==str2:" + (str1 == str2));
		System.out.println("str1 equals str2:" + str1.equals(str2));

	}
}
