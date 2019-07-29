package net.ed.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface ILoggable {
	
	final Logger logger = LoggerFactory.getLogger(CarService.class);

}
