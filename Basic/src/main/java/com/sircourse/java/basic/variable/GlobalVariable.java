package com.sircourse.java.basic.variable;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class GlobalVariable {

	private String title = "";

	public GlobalVariable(String t) {
		this.title = t;
	}

	public void run() {
		System.out.println(this.title);
	}

	public static void main(String[] args) {
		GlobalVariable globalVariable = new GlobalVariable("Test");
		globalVariable.run();
	}

}
