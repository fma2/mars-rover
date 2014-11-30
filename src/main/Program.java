package main;
import java.io.*;
// Runs program to take starting position of rover and move rover on plateau
public class Program {

	public static void main(String[] args) {
		String inputFileName = "src/input.txt";
		
		// When running other input files besides default
		if (args.length == 1) {
			inputFileName = args[0];
		}
		
		Plateau plateau;
		Rover rover;
		String[] instructions;
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
 
			String sCurrentLine;
			
			int[] plateauCoordinates = Plateau.convertStringToIntArray(br.readLine());
			plateau = new Plateau(plateauCoordinates[0], plateauCoordinates[1]);
			
			while ((sCurrentLine = br.readLine()) != null) {						
				String roverPosition = sCurrentLine;
				String[] parts = roverPosition.split(" ");
				if (parts.length != 3){
					throw new UnsupportedOperationException("Invalid input!");
				}
				
				int xCoordinate = Integer.valueOf(parts[0]); int yCoordinate = Integer.valueOf(parts[1]);
				Direction direction = Direction.fromStringToDirection(parts[2]);
				rover = new Rover(xCoordinate, yCoordinate, direction);
				
				instructions = br.readLine().split("");
				
				rover.direct(instructions, plateau);
				rover.printPosition();					
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
