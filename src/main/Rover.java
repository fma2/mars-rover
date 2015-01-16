package main;

import java.util.*;

import commands.*;

// The Rover object with a position field
public class Rover {
	
	private Position currentPosition;
	private Direction currentDirection;
	private Plateau plateau;
	
	public Rover(Plateau plateau, Position position, Direction direction) {
		this.plateau = plateau;
		this.currentPosition = position;
		this.currentDirection = direction;
	}

	// Takes string of instructions input and parses to move the the rover
	public void direct(String[] instructions){
		List<ICommand> roverCommands = StringInstructionsParser.buildCommandsList(instructions);
		if (plateau.isRoverOutOfBounds(currentPosition)){
			throw new UnsupportedOperationException("Rover out of bounds!!!");
		}
		for (ICommand command : roverCommands) {	
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
		currentPosition.setX(currentPosition.getX() + currentDirection.getDeltaX());
		currentPosition.setY(currentPosition.getY() + currentDirection.getDeltaY());
	}
	
	// Print the rover's position to the console
	public void printPosition() {
		System.out.println(""+currentPosition.getX()+" "+currentPosition.getY()+" " +currentDirection.toString()+"");
	}
}
