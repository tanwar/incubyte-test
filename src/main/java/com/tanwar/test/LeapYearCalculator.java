package com.tanwar.test;

public class LeapYearCalculator {
	public boolean isLeapYear(long number) {

		// All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
		if(number % 400 == 0) {
			return true;
		}
		
		//All years divisible by 100 but not by 400 are NOT leap years
		else if (number % 100 == 0 && number % 400 != 0) {
			return false;
		}
		// All years divisible by 4 but not by 100 ARE leap years
		else if (number % 4 == 0 && number % 100 != 0) {
			return true;
		}

		return false;

	}
}
