package net.ed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface ILogger {
	
	final Logger logger = LoggerFactory.getLogger(CarService.class);

}
