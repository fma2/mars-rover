package main;

// The Rover object with a position field
public class Rover {

	private Position position;
	private Direction direction;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		this.position = new Position(xCoordinate, yCoordinate);
		this.direction = initialDirection;
	}

	// Takes string of instructions input and parses to move the the rover
	public void direct(String[] instructions, Plateau plateau){
		if (plateau.isRoverOutOfBounds(position)){
			throw new UnsupportedOperationException("Rover out of bounds!!!");
		}
		for (int i=0; i < instructions.length; i++) {	
			if(instructions[i].equals("L")){
				this.setDirectionLeft();
			} else if(instructions[i].equals("R")){
				this.setDirectionRight();
			} else if(instructions[i].equals("M")) {
				this.move();
				if (plateau.isRoverOutOfBounds(position)){
					throw new UnsupportedOperationException("Rover out of bounds!!!");
				}
			}
		}
	}
	public void setDirectionRight(){
		this.direction = direction.right();
	}

	public void setDirectionLeft() {
		this.direction = direction.left();
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	// Get information on the position of the rover
	public Position getPosition(){
		return position;
	}
	
	public void move() {
		position.setX(position.getX() + direction.getDeltaX());
		position.setY(position.getY() + direction.getDeltaY());
	}
	
	// Print the rover's position to the console
	public void printPosition() {
		System.out.println(""+position.getX()+" "+position.getY()+" " +getDirection()+"");
	}
}
