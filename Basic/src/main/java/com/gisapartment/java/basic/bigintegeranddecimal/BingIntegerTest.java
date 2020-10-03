package com.gisapartment.java.basic.bigintegeranddecimal;

import java.math.BigInteger;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class BingIntegerTest {
	public static void main(String[] args) {
		BigInteger bigInteger1 = BigInteger.valueOf(100);
		BigInteger bigInteger2 = BigInteger.valueOf(200);
		System.out.println("加:" + bigInteger1.add(bigInteger2));
		System.out.println("减:" + bigInteger1.subtract(bigInteger2));
		System.out.println("乘:" + bigInteger1.multiply(bigInteger2));
		System.out.println("除:" + bigInteger1.divide(bigInteger2));
		System.out.println("取余:" + bigInteger1.mod(bigInteger2));
		System.out.println("比较:" + bigInteger1.compareTo(bigInteger2));
	}
}
