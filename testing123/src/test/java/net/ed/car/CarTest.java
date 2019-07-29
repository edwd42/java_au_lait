package net.ed.car;

import org.junit.Test;

import net.ed.car.Car;
import net.ed.car.CarService;
import net.ed.car.ILoggable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CarTest implements ILoggable {

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
		assertEquals("PARKING",carService.process("PARKING").toString());
	}

}
