package main;

import java.util.List;

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
		List<ICommand> roverCommands = StringCommandParser.buildCommandsList(instructions);
		if (plateau.isRoverOutOfBounds(position)){
			throw new UnsupportedOperationException("Rover out of bounds!!!");
		}
		for(ICommand command : roverCommands) {
			command.execute(this);
		}
	}
	
	public void turnRight(){
		direction = direction.right();
	}

	public void turnLeft() {
		direction = direction.left();
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
		System.out.println(""+position.getX()+" "+position.getY()+" " +direction.toString()+"");
	}
}
