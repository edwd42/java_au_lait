package net.ed.fcc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertToFTest {

	@Test
	public void shouldReturnTemperatureF() {
		ConvertToF fahrenheit = new ConvertToF();
		
		assertEquals(0,fahrenheit.convertToF(-17.78),.01);
		assertEquals(32,fahrenheit.convertToF(0),.001);
		assertEquals(14,fahrenheit.convertToF(-10),.001);
		assertEquals(86,fahrenheit.convertToF(30),.001);
	}

}
