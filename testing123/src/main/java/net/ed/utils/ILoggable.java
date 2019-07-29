package net.ed.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.ed.car.CarService;

public interface ILoggable {
	
	final Logger logger = LoggerFactory.getLogger(CarService.class);

}
