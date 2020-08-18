package com.sircourse.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArrayToString {
	public static void main(String[] args) {
		int[] ints = new int[]{1, 2, 3, 4};
		int[][] ints1 = new int[][]{{1, 2}, {3, 4}};
		Integer[] integers = new Integer[]{1, 2, 3, 4};
		System.out.println(Arrays.toString(ints));
		System.out.println(Arrays.deepToString(ints1));
		//System.out.println(Arrays.deepToString(ints));
		System.out.println(Arrays.deepToString(integers));
	}


}
