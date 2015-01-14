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

	public void turnLeft() {}
	public void turnRight() {}
	public void move() {}

	
	// Get information on the position of the rover
	public Position getPosition(){
		return position;
	}
	
	// Print the rover's position to the console
	public void printPosition() {
		System.out.println(""+position.getX()+" "+position.getY()+" " +position.getDirection()+"");
	}
}
