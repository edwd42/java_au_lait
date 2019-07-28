package net.ed;

public enum CarState {
	
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
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("error: " + state);
			}
		}
		return null;
	}

}