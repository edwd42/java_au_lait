package net.ed.fcc;

// convert the fCC javascript algorithms in java
// https://learn.freecodecamp.org/javascript-algorithms-and-data-structures/basic-algorithm-scripting/convert-celsius-to-fahrenheit

public class ConvertToF {
	
	private double fahrenheit;
	
	public double convertToF(double celsius) {

		// Celsius times 9/5, plus 32
		return (celsius * 9/5) + 32;
	}

}
