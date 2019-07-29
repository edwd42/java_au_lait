package net.ed.car;

import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * see these resources for logging
 * https://www.slf4j.org/docs.html
 * https://www.mkyong.com/logging/slf4j-logback-tutorial/
 */

public class CarService implements ILogger {
	
	public CarState process(String input) {
			logger.debug("processing car: {}", input);
			isValid(input);
			CarState carState = CarState.from(input);
			return carState;
	}
	
	boolean isValid(String argument) {
		try {
			CarState carState = CarState.valueOf(argument);
			logger.info(argument + " is valid");
		} catch (RuntimeException e) {
			// alert the user to what went wrong
			// JOptionPane.showMessageDialog(null, "Invalid car state: " + argument);
			logger.error(e.getMessage());
			// wrap a RuntimeException around a checked exception
			// its a nasty hack but better than throwing checked exceptions all over the place, IMHO
			IOException iox = new IOException(e.getMessage());
			throw new RuntimeException(iox);
		}
		return false;
	}

}
