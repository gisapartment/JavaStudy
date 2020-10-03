package com.gisapartment.java.basic.controlprogramprocess;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class WhileCycle {
	public static void main(String[] args) {
		int i = 5;
		while (i < 10) {
			System.out.println("循环内：");
			System.out.println(i);
			i++;
		}
		System.out.println("循环外：");
		System.out.println(i);
	}
}
