package com.gisapartment.java.basic.bigintegeranddecimal;

import java.math.BigDecimal;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class BingDecimalTest {
	public static void main(String[] args) {
		BigDecimal bigDecimal1 = BigDecimal.valueOf(100.1);
		BigDecimal bigDecimal2 = BigDecimal.valueOf(200.1);
		System.out.println("加:" + bigDecimal1.add(bigDecimal2));
		System.out.println("减:" + bigDecimal1.subtract(bigDecimal2));
		System.out.println("乘:" + bigDecimal1.multiply(bigDecimal2));
		System.out.println("除:" + bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_HALF_UP));
		System.out.println("比较:" + bigDecimal1.compareTo(bigDecimal2));
	}
}
