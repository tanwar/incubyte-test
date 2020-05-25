package com.tanwar.test;

public class LeapYearCalculator {
	public boolean isLeapYear(long number) {

		if (number % 400 == 0) {
			return true;
		}

		return false;

	}
}
