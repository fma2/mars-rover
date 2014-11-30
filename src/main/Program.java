package main;
import java.io.*;
// Runs program to take starting position of rover and move rover on plateau
public class Program {

	public static void main(String[] args) {
		String inputFileName = "src/input.txt";

		int[] plateauCoordinates;
		Plateau plateau;
		
		String roverPosition;
		int xCoordinate;
		int yCoordinate;

		Direction direction;
		Rover rover;
		
		String[] instructions;
		String[] parsedInstructions;
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName)))
		{
 
			String sCurrentLine;
			
			plateauCoordinates = Plateau.convertStringToIntArray(br.readLine());
			plateau = new Plateau(plateauCoordinates);
			
			while ((sCurrentLine = br.readLine()) != null) {						
				roverPosition = sCurrentLine;
				String[] parts = roverPosition.split(" ");
				if (parts.length != 3){
					throw new UnsupportedOperationException("Invalid input!");
				}
				xCoordinate = Integer.valueOf(parts[0]);
				yCoordinate = Integer.valueOf(parts[1]);
				direction = Direction.fromStringToDirection(parts[2]);
				
				rover = new Rover(xCoordinate, yCoordinate, direction);
				
				instructions = br.readLine().split("");
				
				rover.direct(instructions);
				rover.printPosition();				
				
			}
 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
