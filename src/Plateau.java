
public class Plateau {
	
	public int[] plateauCoordinates;
	
	public Plateau(int[] coordinates) {
		plateauCoordinates = coordinates;
	}
	
	static int[] convertString(String str) {
		String[] items = str.split(" ");

		int[] results = new int[items.length];
	
		for (int i = 0; i < items.length; i++) {
		    try {
		        results[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {};
		}
		return results;
	}
	
	boolean isRoverOutOfBounds(int[] roverPosition){
		if (roverPosition[0] > plateauCoordinates[0]) {
			return true;
		}
		
		if (roverPosition[1] > plateauCoordinates[1]) {
			return true;
		}
		
		if (roverPosition[0] < 0){
			return true;
		}
		
		if (roverPosition[1] < 0) {
			return true;
		}
		return false;
	}

}
