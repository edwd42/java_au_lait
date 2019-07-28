package net.ed;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CarsTest {
	
	private final Logger logger = LoggerFactory.getLogger(CarsTest.class);
	
	@Test
	public void shouldReturnCarName() {
		Car BMW = new Car();
		assertEquals("BMW",BMW.sayCarName("BMW"));
		
		Car Porche = new Car();
		assertEquals("Porche",Porche.sayCarName("Porche"));
		assertNotEquals("Porche",Porche.sayCarName("BMW"));
	}
	
	@Test
	public void shouldReturnCarState() {
		CarService carService = new CarService();
		String service = "PARKING";
		try {
			carService.isValid(service);
			carService.process(service);
		} catch (RuntimeException e) {
			logger.error(e.getMessage());
		}
		
	}



}
