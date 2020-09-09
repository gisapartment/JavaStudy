package com.sircourse.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArraySort {
	public static void main(String[] args) {
		int[] test = new int[10];
		for (int i = 0; i < test.length; i++) {
			test[i] = i;
		}
		System.out.println("排序前:" + Arrays.toString(test));
		Arrays.sort(test);
		System.out.println("排序后:" + Arrays.toString(test));
		Arrays.sort(test);
		System.out.println("再排序后:" + Arrays.toString(test));
	}
}
