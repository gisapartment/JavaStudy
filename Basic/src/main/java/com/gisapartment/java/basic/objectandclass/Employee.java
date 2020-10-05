package com.gisapartment.java.basic.objectandclass;

import java.time.LocalDate;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String name, double salary) {
		this(name, salary, 0, 0, 0);
	}

	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void raiseSalary(double percent) {
		this.salary = this.salary * (1 + percent / 100);
	}

	public LocalDate getHireDay() {
		return hireDay;
	}
}
