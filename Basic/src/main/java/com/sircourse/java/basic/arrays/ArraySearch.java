package com.sircourse.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArraySearch {
	public static void main(String[] args) {
		int[] test = new int[10];
		for (int i = 0; i < test.length; i++) {
			test[i] = i;
		}
		System.out.println("排好序的升序数组搜索下标:" + Arrays.binarySearch(test, 5));
		for (int length = test.length - 1; length >= 0; length--) {
			test[length] = length;
		}
		System.out.println("排好序的降序数组搜索下标:" + Arrays.binarySearch(test, 5));
		for (int i = 0; i < test.length; i++) {
			test[i] = (int) (i * Math.random());
		}
		System.out.println("乱序数组搜索下标:" + Arrays.binarySearch(test, 5));
	}
}
