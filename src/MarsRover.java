import java.io.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarsRover {
	
	public static void main(String[] args) {
		
		int[] plateauCoordinates;
		String roverPosition;
		int[] position;
		String direction;
		Rover rover;
		Plateau plateau;
//		Manager manager;
		
		try (BufferedReader br = new BufferedReader(new FileReader("src/input.txt")))
		{
 
			String sCurrentLine;
			
			plateauCoordinates = convertString(br.readLine());
			plateau = new Plateau(plateauCoordinates);
			
			roverPosition = br.readLine();
			String[] parts = roverPosition.split(" ");
			position = new int[] {Integer.valueOf(parts[0]), Integer.valueOf(parts[1])};
			direction = parts[2];
			rover = new Rover(position, direction);
			
			new Manager(rover).direct(br.readLine());
			
//			System.out.println(rover.direction );

			
			while ((sCurrentLine = br.readLine()) != null) {						
//				roverPosition = sCurrentLine;
//				String[] parts = roverPosition.split(" ");
//				position = new int[] {Integer.valueOf(parts[0]), Integer.valueOf(parts[1])};
//				direction = parts[2];
//				rover = new Rover(position, direction);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	static int[] convertString(String str) {
		String[] items = str.replaceAll("\\[", "").replaceAll("\\]", "").split(",");
	
		int[] results = new int[items.length];
	
		for (int i = 0; i < items.length; i++) {
		    try {
		        results[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {};
		}
		return results;
	}

}
