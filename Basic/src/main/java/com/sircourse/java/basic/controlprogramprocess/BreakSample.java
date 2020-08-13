package com.sircourse.java.basic.controlprogramprocess;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class BreakSample {
	public static void main(String[] args) {
		int[] data = {5, 6, 7, 8, 9, 10};
		for (int i : data) {
			if (i == 8) {
				break;
			}
			System.out.println("循环内：");
			System.out.println(i);
		}
		System.out.println("循环外：");
	}
}
