import java.io.*;

public class Program {

	public static void main(String[] args) {
		String inputFileName = "src/input.txt";

		int[] plateauCoordinates;
//		Plateau plateau;
		
		String roverPosition;
		int xCoordinate;
		int yCoordinate;

		Direction direction;
		Rover rover;
		
		String instructions;
		String[] parsedInstructions;
		
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
				xCoordinate = Integer.valueOf(parts[0]);
				yCoordinate = Integer.valueOf(parts[1]);
				direction = fromStringToDirection(parts[2]);
				
				rover = new Rover(xCoordinate, yCoordinate, direction);
				
				instructions = br.readLine();
				parsedInstructions = instructions.split("");
				
				rover.direct(rover, parsedInstructions);
				
				rover.getPosition();				
				
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
	
	static Direction fromStringToDirection(String directionStr){
		Direction direction = null;
		if (directionStr.equals("N")) {
			direction = Direction.NORTH;
		} else if (directionStr.equals("S")) {
			direction = Direction.SOUTH;
		} else if (directionStr.equals("E")) {
			direction = Direction.EAST;
		} else if (directionStr.equals("W")) {
			direction = Direction.WEST;
		}
		return direction;
	}

}
