import java.io.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Nasa {
	
	public static void main(String[] args) {
		
		int[] plateauCoordinates;
		Plateau plateau;
		
		String roverPosition1;
		int[] position1;
		Direction direction1;
		Rover rover1;
		
		String roverPosition2;
		int[] position2;
		Direction direction2;
		Rover rover2;
//		Manager manager;
		
		try (BufferedReader br = new BufferedReader(new FileReader("src/input.txt")))
		{
 
			String sCurrentLine;
			
			plateauCoordinates = convertString(br.readLine());
			plateau = new Plateau(plateauCoordinates);
			
			roverPosition1 = br.readLine();
			String[] parts1 = roverPosition1.split(" ");
			position1 = new int[] {Integer.valueOf(parts1[0]), Integer.valueOf(parts1[1])};
			direction1 = Direction.fromString(parts1[2]);
			rover1 = new Rover(position1, direction1);
			new Manager(rover1).direct(br.readLine());
			rover1.printStatus();
			
			roverPosition2 = br.readLine();
			String[] parts2 = roverPosition2.split(" ");
			position2 = new int[] {Integer.valueOf(parts2[0]), Integer.valueOf(parts2[1])};
			direction2 = Direction.fromString(parts2[2]);
			rover2 = new Rover(position2, direction2);
			new Manager(rover2).direct(br.readLine());
			rover2.printStatus();
//			
			
			while ((sCurrentLine = br.readLine()) != null) {						
//				roverPosition = sCurrentLine;
//				System.out.println(roverPosition);
//				String[] parts = roverPosition.split(" ");
//				position = new int[] {Integer.valueOf(parts[0]), Integer.valueOf(parts[1])};
//				direction = Direction.fromString(parts[2]);
//				rover = new Rover(position, direction);
				
//				new Manager(rover).direct(sCurrentLine);
//				System.out.println(manager);
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
