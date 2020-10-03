package com.gisapartment.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArrayFill {
	public static void main(String[] args) {
		int[] test = new int[10];
		System.out.println("填充前数组:" + Arrays.toString(test));
		Arrays.fill(test, 1);
		System.out.println("填充后数组:" + Arrays.toString(test));
	}
}
