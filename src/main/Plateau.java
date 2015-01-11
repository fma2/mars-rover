package main;

// Needs more description comments.
// The Plateau object with x and y fields;
// Also, use spaces instead of tabs. Tabs behave strangely across different people's editors, and in email
// formatting.
public class Plateau {

  	// These should have better names
	// Also, add a comment that x and y are the upper bounds, and that 0, 0 are
	// the lower bounds.
	// Also, generally private members (and member functions go at the bottome of the class, and the
	// public methods go at the top.
	private int x;
	private int y;

  // xCoordinate and yCoordinate should have better names.
	public Plateau (int xCoordinate, int yCoordinate){
		this.x = xCoordinate;
		this.y = yCoordinate;
	}
	
	public void setX(int xCoordinate) {
		x = xCoordinate;
	}

	public int getX() {
		return x;
	}
	
	public void setY(int yCoordinate) {
		y = yCoordinate;
	}

	public int getY() {
		return y;
	}
	
	// Converts the string provided by input into an array of integers
	public static int[] convertStringToIntArray(String str) {
		String[] items = str.split(" ");

		int[] results = new int[items.length];
	
		for (int i = 0; i < items.length; i++) {
		    try {
		        results[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {};
		}
		return results;
	}
	
	// Checks if rover is out of bounds of the plateau
	// Also, you aren't really checking if the Rover is out of bounds, you've
        // checking a possible Rover position I think. Also maybe isPositionInBounds is 
        // more natural.
	public boolean isRoverOutOfBounds(Position roverPosition){

	  // These can be a single if:
	  // if (roverPosition.getX() > getX() ||
	  //	 roverPosition.getY() > getY() ||
	  //     ...


		if (roverPosition.getX() > getX()) {
			return true;
		}
		
		if (roverPosition.getY() > getY()) {
			return true;
		}
		
		if (roverPosition.getX() < 0){
			return true;
		}
		
		if (roverPosition.getY() < 0) {
			return true;
		}
		return false;
	}
}
