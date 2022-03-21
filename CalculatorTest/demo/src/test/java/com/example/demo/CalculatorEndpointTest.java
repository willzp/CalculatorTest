package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculatorEndpointTest {

	private String sut;
	
	@Before
	public void setUp() throws Exception {
		sut = "http://localhost:8080";
	}

	@Test
	public void testCalculatorPlus() throws IOException {
		
		String typeData = "plus";
		String nr1 = "5";
		String nr2 = "5";
		String url = sut + "/kalkylator";
		String params = "?typ=" + typeData + "&nr1=" + nr1 + "&nr2=" + nr2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		String expected = "Summan av " + nr1 + " + " + nr2 + " = " + "10";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculatorMinus() throws IOException {
		
		String typeData = "minus";
		String nr1 = "5";
		String nr2 = "5";
		String url = sut + "/kalkylator";
		String params = "?typ=" + typeData + "&nr1=" + nr1 + "&nr2=" + nr2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		String expected = "Summan av " + nr1 + " - " + nr2 + " = " + "0";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculatorTimes() throws IOException {
		
		String typeData = "ganger";
		String nr1 = "5";
		String nr2 = "5";
		String url = sut + "/kalkylator";
		String params = "?typ=" + typeData + "&nr1=" + nr1 + "&nr2=" + nr2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		String expected = "Summan av " + nr1 + " * " + nr2 + " = " + "25";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculatorFail() throws IOException {
		
		String typeData = "minus";
		String nr1 = "5";
		String nr2 = "5";
		String url = sut + "/kalkylator";
		String params = "?typ=" + typeData + "&nr1=" + nr1 + "&nr2=" + nr2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		String expected = "Summan av " + nr1 + " - " + nr2 + " = " + "999999";
		
		assertEquals(expected, actual);
	}
	
	
	
	
	
}
