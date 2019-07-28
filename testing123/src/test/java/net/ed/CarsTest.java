package net.ed;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CarsTest {
	
	@Test
	public void shouldReturnCarName() {
		Car BMW = new Car();
		assertEquals("BMW",BMW.sayCarName("BMW"));
		
		Car Porche = new Car();
		assertEquals("Porche",Porche.sayCarName("Porche"));
		assertNotEquals("Porche",Porche.sayCarName("BMW"));
	}

}
