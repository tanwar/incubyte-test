package com.tanwar.test;

public class LeapYearCalculator {

	/*
	 * Acceptance Criteria:
	 * 
	 * All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a
	 * leap year).
	 * 
	 * All years divisible by 100 but not by 400 are NOT leap years (so, for
	 * example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap
	 * year).
	 * 
	 * 
	 * All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012,
	 * 2016).
	 * 
	 * All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
	 */

	public boolean isLeapYear(long year) {
		return isMultipleOf4(year) && isNotMiltipleOf100_or_isMiltipleOf100And400(year);
	}

	private boolean isNotMiltipleOf100_or_isMiltipleOf100And400(long year) {
		return (isNotMiltipleOf100(year) || (isMiltipleOf100And400(year)));
	}

	private boolean isMiltipleOf100And400(long year) {
		return isPerfectlyDivisible(year, 100) && isPerfectlyDivisible(year, 400);
	}

	private boolean isNotMiltipleOf100(long year) {
		return !isPerfectlyDivisible(year, 100);
	}

	private boolean isMultipleOf4(long year) {
		return isPerfectlyDivisible(year, 4);
	}

	private boolean isPerfectlyDivisible(long year, long base) {
		return year % base == 0;
	}

}
