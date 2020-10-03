package com.gisapartment.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArrayCopy implements Cloneable {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = a;
		// 数组引用
		System.out.println(a == b);
		int[] ints = Arrays.copyOf(a, 10);
		System.out.println(Arrays.toString(ints));
		ints = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(ints));
		ArrayCopy[] test1 = new ArrayCopy[]{new ArrayCopy()};
		ArrayCopy[] arrayCopies = Arrays.copyOf(test1, 1);
		System.out.println(test1 == arrayCopies);
		System.out.println(test1[0] == arrayCopies[0]);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
