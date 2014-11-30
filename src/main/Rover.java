package main;

// The Rover object with a position field
public class Rover {

	private Position position;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		this.position = new Position(xCoordinate, yCoordinate, initialDirection); 
	}

	// Takes string of instructions input and parses to move the the rover
	public void direct(String[] instructions, Plateau plateau){
		if (plateau.isRoverOutOfBounds(position)){
			throw new UnsupportedOperationException("Rover out of bounds!!!");
		}
		for (int i=0; i < instructions.length; i++) {	
			if(instructions[i].equals("L")){
				position.setDirectionLeft();
			} else if(instructions[i].equals("R")){
				position.setDirectionRight();
			} else if(instructions[i].equals("M")) {
				position.move();
				if (plateau.isRoverOutOfBounds(position)){
					throw new UnsupportedOperationException("Rover out of bounds!!!");
				}
			}
		}
	}
	
	// Get information on the position of the rover
	public Position getPosition(){
		return position;
	}
	
	// Print the rover's position to the console
	public void printPosition() {
		System.out.print(position.getX());
		System.out.print(" ");
		
		System.out.print(position.getY());
		System.out.print(" ");
		
		System.out.print(position.getDirection());
		System.out.println(" ");
	}
}
