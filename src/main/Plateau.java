package main;

public class Plateau {

	private static int[] plateauCoordinates;

	public Plateau (int[] coordinates){
		plateauCoordinates = coordinates;
	}
	
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
	
	public boolean isRoverOutOfBounds(Position roverPosition){
		if (roverPosition.getX() > plateauCoordinates[0]) {
			return true;
		}
		
		if (roverPosition.getY() > plateauCoordinates[1]) {
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
