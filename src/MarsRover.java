import java.io.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarsRover {
	
	public static void main(String[] args) {
		
		int[] plateauCoordinates;
		String roverPosition;
		int[] position;
		Direction direction;
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
			direction = Direction.fromString(parts[2]);
					
//			if (parts[2].equals("N")) {
//				direction = new North();
//			} else if (parts[2].equals("S")) {
//				direction = new South();
//			} else if (parts[2].equals("E")) {
//				direction = new East();
//			} else if (parts[2].equals("W")) {
//				direction = new West();
//			}
			rover = new Rover(position, direction);
			
			new Manager(rover).direct(br.readLine());
			
			
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
