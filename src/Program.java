import java.io.*;

public class Program {

	public static void main(String[] args) {
		String inputFileName = "src/input.txt";
	
		int[] plateauCoordinates;
//		Plateau plateau;
		
		String roverPosition;
		int[] position;
		Direction direction;
		Rover rover;
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName)))
		{
 
			String sCurrentLine;
			
			plateauCoordinates = convertString(br.readLine());
//			plateau = new Plateau(plateauCoordinates);
			
			while ((sCurrentLine = br.readLine()) != null) {						
				roverPosition = sCurrentLine;
				String[] parts = roverPosition.split(" ");
//				if (parts.length != 3){
//					throw new UnsupportedOperationException("Invalid input!");
//				}
//				position = new int[] {Integer.valueOf(parts[0]), Integer.valueOf(parts[1])};
//				direction = Direction.fromString(parts[2]);
//				rover = new Rover(position, direction);
//				
//				new Manager(rover, plateau).direct(br.readLine());
//				rover.printStatus();
			}
 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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
