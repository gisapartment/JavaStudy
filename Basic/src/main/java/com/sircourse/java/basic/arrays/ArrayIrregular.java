package com.sircourse.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArrayIrregular {
	public static void main(String[] args) {
		int[][] test = new int[10][];
		for (int i = 0; i < test.length; i++) {
			test[i] = new int[i + 1];
		}
		System.out.println("数组:");
		for (int[] ints : test) {
			System.out.println(Arrays.toString(ints));
		}
	}
}
