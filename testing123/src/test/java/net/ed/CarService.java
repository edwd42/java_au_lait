package net.ed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * see these resources for logging
 * https://www.slf4j.org/docs.html
 * https://www.mkyong.com/logging/slf4j-logback-tutorial/
 */

public class CarService {
	
	private final Logger log = LoggerFactory.getLogger(CarService.class);
	
	public void process(String input) {
		
		log.debug("processing car: {}", input);
	}

}
