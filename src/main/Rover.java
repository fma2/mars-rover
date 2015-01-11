package main;

// The Rover object with a position field
public class Rover {

	private Position position;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		this.position = new Position(xCoordinate, yCoordinate, initialDirection); 
	}

	// Takes string of instructions input and parses to move the the rover
  // Its nice that you pass in the Plateau, because then if we want to change the implementation of Plateau, its very modular.
  // Like a more complicated plateau that's not just a square. Nice! :)
	public void direct(String[] instructions, Plateau plateau){

	  // Add a comment that this check is for checking if the initial position is out of bounds.
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
	// Is this for testing?
	public Position getPosition(){
		return position;
	}
	
	// Print the rover's position to the console
	public void printPosition() {
		System.out.println(""+position.getX()+" "+position.getY()+" " +position.getDirection()+"");
	}
}
