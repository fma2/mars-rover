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
			
			plateauCoordinates = Plateau.convertString(br.readLine());
			plateau = new Plateau(plateauCoordinates);
			System.out.println(plateauCoordinates);
			
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
		
			
			while ((sCurrentLine = br.readLine()) != null) {						

				//maybe the information above should go here?
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
