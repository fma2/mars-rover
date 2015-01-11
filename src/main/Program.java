package main;
import java.io.*;

// The Program class contains the main method to run the program. 
// It uses the input.txt file to create the plateau and rovers and move each rover.  
public class Program {

	public static void main(String[] args) {

	  // input.txt shouldn't be hard coded here, and you probably don't want to have 'src' in the path.
	  // I would suggest not having a default input, just like other command line programs don't have a default input.
	  // ie, git doesn't have a default input, if there's no input file it will print an error and exit.
		String inputFileName = "src/input.txt";
		
		// When running other input files besides default - input.txt
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
				  throw new UnsupportedOperationException("Invalid input!"); // provide a better error message, why is the input invalid?
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
