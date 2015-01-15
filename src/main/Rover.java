package main;

import java.util.*;

import commands.*;

// The Rover object with a position field
public class Rover {

//	private Position position;
	
	private Position currentPosition;
	private Direction currentDirection;
	private Plateau plateau;
	
	public Rover(Plateau plateau, Position position, Direction direction) {
		this.plateau = plateau;
		this.currentPosition = position;
		this.currentDirection = direction;
//		this.position = new Position(xCoordinate, yCoordinate, initialDirection); 
	}

	// Takes string of instructions input and parses to move the the rover
	public void direct(List<ICommand> instructions){
//		if (plateau.isRoverOutOfBounds(position)){
//			throw new UnsupportedOperationException("Rover out of bounds!!!");
//		}
		for (ICommand command : instructions) {	
			command.execute(this);
		}
	}
	
	public void turnLeft() {
		currentDirection = currentDirection.left();
	}
	public void turnRight() {
		currentDirection = currentDirection.right();
	}
	
	public void move() {
		//below needs to exist in position class!
		switch (this.currentDirection) {
		case NORTH:
			int y = currentPosition.getY();
			currentPosition.setY(y+1);
			break;
//		case SOUTH:
//			y--;
//			break;
//		case EAST:
//			x++;
//			break;
//		case WEST:
//			x--;
//			break;
		default:
			break;
		}
	}
	
	
	// Get information on the position of the rover
//	public Position getPosition(){
//		return position;
//	}
	
	// Print the rover's position to the console
	public void printPosition() {
//		System.out.println(""+position.getX()+" "+position.getY()+" " +position.getDirection()+"");
	}
}
