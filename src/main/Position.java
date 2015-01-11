package main;
// The Position class stores and manipulates the position of the Rover
// I would suggest naming this class RoverPosition, because this type of position is very
// closely related to the Rover.
public class Position {

	private int x;
	private int y;	
	private Direction direction;
	
	public Position (int xCoordinate, int yCoordinate, Direction direction) {
		this.x = xCoordinate;
		this.y = yCoordinate;
		this.direction = direction;
	}
	
  // Positions don't really have directions, its more like turnDirectionLeft, turnDirectionRight.
  // But another way, would be turnRover(Direction direction);
	// Sets the direction of the rover to turn right from the current direction
	public void setDirectionRight(){
		direction = direction.right();
	}
	
	// Sets the direction of the rover to turn left from the current direction
	public void setDirectionLeft() {
		direction = direction.left();
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setX(int xCoordinate) {
		x = xCoordinate;
	}

	public int getX() {
		return x;
	}

	public void setY(int yCoordinate) {
		y = yCoordinate;
	}

	public int getY() {
		return y;
	}

	// Moves the rover along x or y depending on its current direction
	// nit, suggest naming this moveRover()
	public void move() {
		switch (getDirection()) {
		case NORTH:
			y++;
			break;
		case SOUTH:
			y--;
			break;
		case EAST:
			x++;
			break;
		case WEST:
			x--;
			break;
		default:
			break;
		}
	}
}
