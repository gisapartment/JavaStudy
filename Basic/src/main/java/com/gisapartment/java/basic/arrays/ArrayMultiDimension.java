package com.gisapartment.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArrayMultiDimension {
	public static void main(String[] args) {
		int[][] test1 = new int[2][2];
		for (int i = 0; i < test1.length; i++) {
			for (int j = 0; j < test1[i].length; j++) {
				test1[i][j] = (int) (10 * Math.random());
			}
		}
		System.out.println("数组test1:" + Arrays.deepToString(test1));
		int[][] test2 = {{1, 2}, {3, 4}};
		System.out.println("数组test2:" + Arrays.deepToString(test2));
	}
}
