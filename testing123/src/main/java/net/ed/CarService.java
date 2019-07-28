package net.ed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * see these resources for logging
 * https://www.slf4j.org/docs.html
 * https://www.mkyong.com/logging/slf4j-logback-tutorial/
 */

public class CarService {
	
	private final Logger logger = LoggerFactory.getLogger(CarService.class);
	
	public void process(String input) {
		try {
			logger.debug("processing car: {}", input);
			isValid(input);
			CarState carState = CarState.from(input);
		} catch (Exception e) {
			logger.error("error: " + input);
		}
		
	}
	
	boolean isValid(String argument) {
		// TODO Auto-generated method stub
		try {
			CarState carState = CarState.valueOf(argument);
			logger.info(argument + " is valid");
		} catch (IllegalStateException e) {
			return false;
		}
		return false;
		
	}

}
