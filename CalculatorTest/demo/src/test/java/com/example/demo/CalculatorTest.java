package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	

	@Test
	public void TestTimes() {
		String actual = calculator.Times("5","5");
		String expected = "25";
		assertEquals(actual, expected); 
	}
	
	@Test
	public void TestPlus() {
		String actual = calculator.Plus("5","5");
		String expected = "10";
		assertEquals(actual, expected); 
	}
	
	@Test
	public void TestMinus() {
		String actual = calculator.Minus("5","5");
		String expected = "0";
		assertEquals(actual, expected); 
	}
}
