package com.gisapartment.java.basic.objectandclass;


/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class EmployeeInit {
	private static int nextID;

	private int id;
	private String name;
	private double salary;

	{
		id = nextID;
		nextID++;
	}

	public EmployeeInit() {
		this.name = "";
		this.salary = 0;
	}

	public EmployeeInit(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

}
