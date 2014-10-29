
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

}
