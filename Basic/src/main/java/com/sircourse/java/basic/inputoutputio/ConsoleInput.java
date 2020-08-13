package com.sircourse.java.basic.inputoutputio;

import java.util.Scanner;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class ConsoleInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("读取一行:");
		System.out.println("输入:" + scanner.nextLine());
		System.out.println("读取 int 值:");
		System.out.println("输入:" + scanner.nextInt());
		System.out.println("读取 double 值:");
		System.out.println("输入:" + scanner.nextDouble());
		System.out.println("读取 float 值:");
		System.out.println("输入:" + scanner.nextFloat());
		System.out.println("读取 boolean 值:");
		System.out.println("输入:" + scanner.nextBoolean());
		System.out.println("读取以空格分隔的内容:");
		System.out.println("输入:" + scanner.next());
	}
}
