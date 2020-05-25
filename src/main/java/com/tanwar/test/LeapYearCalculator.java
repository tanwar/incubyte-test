package com.tanwar.test;

public class LeapYearCalculator {
	public boolean isLeapYear(long year) {

		// All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
		if(year % 400 == 0) {
			return true;
		}
		
		// All years divisible by 4 but not by 100 ARE leap years
		else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}

		return false;

	}
}
