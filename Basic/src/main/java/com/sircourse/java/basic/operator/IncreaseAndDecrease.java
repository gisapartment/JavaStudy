package com.sircourse.java.basic.operator;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class IncreaseAndDecrease {
	public static void main(String[] args) {

		int x = 6;
		int y = 6;
		int m = 2 * ++x;
		int n = 2 * y++;
		System.out.println("m:" + m);
		System.out.println("n:" + n);

		System.out.println("i++");
		for (int i = 0; i < 2; i++) {
			System.out.println(i);
		}
		System.out.println("++i");
		for (int i = 0; i < 3; ++i) {
			System.out.println(i);
		}
	}
}
