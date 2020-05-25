package com.tanwar.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeapYearCalculatorTest {

	private LeapYearCalculator leapYearCalculator;

	@Before
	public void setup() {
		leapYearCalculator = new LeapYearCalculator();
	}


	// All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year)
	@Test
	public void shouldVerifyLeapYearDivisibleBy400() {
		Assert.assertTrue(leapYearCalculator.isLeapYear(1600));
	}

	
	// All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
	@Test
	public void shouldVerifyLeapYearDivisibleBy100ButNot400() {
		Assert.assertTrue(leapYearCalculator.isLeapYear(1700));
	}

}