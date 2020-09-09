package com.sircourse.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArrayEqual {
	public static void main(String[] args) {
		int[] test1 = new int[10];
		int[] test2 = new int[10];
		System.out.println("test1数组是否等于test2数组:" + Arrays.equals(test1, test2));
		Arrays.fill(test1, 1);
		Arrays.fill(test2, 2);
		System.out.println("test1数组是否等于test2数组:" + Arrays.equals(test1, test2));
	}
}
