package net.ed.fcc;

import java.util.regex.Pattern;

import net.ed.utils.ILoggable;

// convert the fCC javascript algorithms in java
// https://learn.freecodecamp.org/javascript-algorithms-and-data-structures/basic-algorithm-scripting/convert-celsius-to-fahrenheit

public class ConvertToF implements ILoggable {
	
	public double convertToF(double celsius) {

		// Fahrenheit = Celsius times 9/5, plus 32
		logger.info("input: " + celsius);
		return (celsius * 9/5) + 32;
	}
}
