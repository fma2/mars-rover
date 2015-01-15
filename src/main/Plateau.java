package main;

// The Plateau object with x and y fields;
public class Plateau {

	private int xCoordinate;
	private int yCoordinate;

	public Plateau (int xCoordinate, int yCoordinate){
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public void setX(int xCoordinate) {
		xCoordinate = xCoordinate;
	}

	public int getX() {
		return xCoordinate;
	}
	
	public void setY(int yCoordinate) {
		yCoordinate = yCoordinate;
	}

	public int getY() {
		return yCoordinate;
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
	public boolean isRoverOutOfBounds(Position roverPosition){
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
