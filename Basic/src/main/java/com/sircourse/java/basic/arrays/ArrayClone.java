package com.sircourse.java.basic.arrays;

import java.util.Arrays;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ArrayClone implements Cloneable {
	public static void main(String[] args) {
		// first method
		int[] a = {1, 2, 3, 4};
		int[] b = a;
		System.out.println(a == b);
		int[] ints = Arrays.copyOf(a, 10);
		System.out.println(Arrays.toString(ints));
		ints = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(ints));
		ArrayClone[] test1 = new ArrayClone[]{new ArrayClone()};
		ArrayClone[] arrayClones = Arrays.copyOf(test1, 2);
		System.out.println(test1 == arrayClones);
		System.out.println(test1[0] == arrayClones[0]);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
