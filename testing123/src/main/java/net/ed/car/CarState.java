package net.ed.car;

import net.ed.utils.ILoggable;

public enum CarState implements ILoggable {
	
	DRIVING, WAITING, PARKING;
	
	public static CarState from (String state) {
		switch(state) {
		case "DRIVING":
			return DRIVING;
		case "WAITING":
			return WAITING;
		case "PARKING":
			return PARKING;
		default:
			try {
				throw new Exception("error: invalid CarState" + state);
			} catch (Exception e) {
				logger.error("error: " + state);
			}
		}
		return null;
	}

}
