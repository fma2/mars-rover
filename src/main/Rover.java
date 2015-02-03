package main;

// The Rover object with a position field
public class Rover {

	private Position position;
	private boolean isAlive;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		this.position = new Position(xCoordinate, yCoordinate, initialDirection);
		this.isAlive = true;
	}

	// Takes string of instructions input and parses to move the the rover
	public void direct(String[] instructions, Plateau plateau){
		for (int i=0; i < instructions.length; i++) {	
			if(instructions[i].equals("L")){
				position.setDirectionLeft();
			} else if(instructions[i].equals("R")){
				position.setDirectionRight();
			} else if(instructions[i].equals("M")) {
				
				position.move();
				if (plateau.isRoverOutOfBounds(position)){
					plateau.leaveBeacon(position);
					roverDeath();
				}
			}
		}
	}
	
	public void roverDeath() {
		isAlive = false;
	}
	
	public boolean getIsAlive() {
		return isAlive;
	}
	// Get information on the position of the rover
	public Position getPosition(){
		return position;
	}
	
	// Print the rover's position to the console
	public void printPosition() {
		if (getIsAlive() == false) System.out.println(""+position.getX()+" "+position.getY()+" " +position.getDirection()+"" + " RIP");
		else System.out.println(""+position.getX()+" "+position.getY()+" " +position.getDirection()+"");
	}
}
