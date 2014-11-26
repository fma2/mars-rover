import java.io.*;

public class Program {

	public static void main(String[] args) {
		String inputFileName = "src/input.txt";
	
		int[] plateauCoordinates;
//		Plateau plateau;
		
		String roverPosition;
		int xCoordinate;
		int yCoordinate;
		int x; //for instructions reading
		int y; //for instructions reading
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
				for (int i = 0; i < parsedInstructions.length; i++) {
					
					if (parsedInstructions[i].equals("L")) {
//						System.out.println(parsedInstructions[i]);
						switch (rover.getDirection()) {
						case EAST: 
							rover.setDirection(Direction.NORTH);
							break;
						case NORTH:
							rover.setDirection(Direction.WEST);
							break;
						case SOUTH:
							rover.setDirection(Direction.EAST);
							break;
						case WEST:
							rover.setDirection(Direction.SOUTH);
							break;
						default:
							break;
							
						}
					} else if (parsedInstructions[i].equals("R")) {
						switch (rover.getDirection()) {
						case EAST: 
							rover.setDirection(Direction.SOUTH);
							break;
						case NORTH:
							rover.setDirection(Direction.EAST);
							break;
						case SOUTH:
							rover.setDirection(Direction.WEST);
							break;
						case WEST:
							rover.setDirection(Direction.NORTH);
							break;
						default:
							break;
						}
					} else if (parsedInstructions[i].equals("M") && rover.getDirection().equals(Direction.NORTH) || rover.getDirection().equals(Direction.SOUTH)) {
						y = rover.getY();
						switch (rover.getDirection()) {
						case SOUTH:
							rover.setY(y-1);
							break;
						case NORTH:
							rover.setY(y+1);
							break;
						default:
							break;
						}
					} else if (parsedInstructions[i].equals("M") && rover.getDirection().equals(Direction.EAST) || rover.getDirection().equals(Direction.WEST)) {
						x = rover.getX();
//						System.out.println(x-1);
						switch (rover.getDirection()) {
						case WEST:
							rover.setX(x-1);
//							System.out.println(rover.getX());
							break;
						case EAST:
							rover.setX(x+1);
							break;
						default:
							break;
						}
					}

				}
				System.out.println(rover.getX());
				System.out.println(rover.getY());
				System.out.println(rover.getDirection());				
				
//				
//				new Manager(rover, plateau).direct(br.readLine());
//				rover.printStatus();
				
			}
 
		} catch (Exception e) {
//			System.out.println(e.getMessage());
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
