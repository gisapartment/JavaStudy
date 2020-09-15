package com.sircourse.java.basic.objectandclass;

import java.time.LocalDate;

/**
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class CalendarTest {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		int dayOfMonth = localDate.getDayOfMonth();
		LocalDate localDate1 = localDate.minusDays(dayOfMonth - 1);
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 0; i < localDate1.getDayOfWeek().getValue() - 1; i++) {
			System.out.print("    ");
		}
		while (localDate1.getMonthValue() == localDate.getMonthValue()) {
			if (localDate1.getDayOfWeek().getValue() == 1) {
				System.out.println("");
				//for (int i = 0; i <= 2-String.valueOf(localDate1.getDayOfMonth()).length(); i++) {
				//	System.out.print(" ");
				//}
				printSpace(String.valueOf(localDate1.getDayOfMonth()).length(), true);
				System.out.print(localDate1.getDayOfMonth());
				printSpace(String.valueOf(localDate1.getDayOfMonth()).length(), false);
			} else {
				printSpace(String.valueOf(localDate1.getDayOfMonth()).length(), true);
				System.out.print(localDate1.getDayOfMonth());
				printSpace(String.valueOf(localDate1.getDayOfMonth()).length(), false);
			}
			localDate1 = localDate1.plusDays(1);
		}
	}

	private static void printSpace(int length, boolean start) {
		if (length == 2) {
			System.out.print(" ");
		} else {
			System.out.print(" ");
			if (!start) {
				System.out.print(" ");
			}
		}
	}

}
