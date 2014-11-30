package main;

// The Plateau object with x and y fields;
public class Plateau {

	private int x;
	private int y;

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
