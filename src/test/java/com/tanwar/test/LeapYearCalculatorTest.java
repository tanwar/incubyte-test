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
	
	@Test
	public void shouldVerifyLeapYear() {
		Assert.assertTrue(leapYearCalculator.isLeapYear(1600));
	}
	
	
}