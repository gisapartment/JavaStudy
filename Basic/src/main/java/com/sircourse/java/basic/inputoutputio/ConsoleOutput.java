package com.sircourse.java.basic.inputoutputio;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ConsoleOutput {
	public static void main(String[] args) {
		System.out.printf("Hello,%s,我是第%d个会员！", "www.gisapartment.com", 100000000);
		System.out.println();
		System.out.printf("%1$s, %2$s, and %3$s %n", "Hello", "SirCourse", "com");
		System.out.printf("%3$s, %2$s, and %1$s %n", "Hello", "SirCourse", "com");

		System.out.printf("%1$4d, %2$4d, %3$4d %n", 1, 10, 100);
		System.out.printf("%1$4d, %2$4d, %3$4d %n", 10, 100, 1000);
		System.out.printf("%1$-4d, %2$-4d, %3$-4d %n", 1, 10, 100);
		System.out.printf("%1$-4d, %2$-4d, %3$-4d %n", 10, 100, 1000);
	}
}
