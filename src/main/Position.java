package main;
// The Position class stores and manipulates the position of the Rover
public class Position {

	private int xCoordinate;
	private int yCoordinate;	
	
	public Position (int x, int y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
	// Sets the direction of the rover to turn right from the current direction
//	public void setDirectionRight(){
//		direction = direction.right();
//	}
	
	// Sets the direction of the rover to turn left from the current direction
//	public void setDirectionLeft() {
//		direction = direction.left();
//	}
	
//	public Direction getDirection() {
//		return direction;
//	}
	
	public void setX(int x) {
		xCoordinate = x;
	}

	public int getX() {
		return xCoordinate;
	}

	public void setY(int y) {
		yCoordinate = y;
	}

	public int getY() {
		return yCoordinate;
	}
	

	// Moves the rover along x or y depending on its current direction
//	public void move() {
//		switch (getDirection()) {
//		case NORTH:
//			y++;
//			break;
//		case SOUTH:
//			y--;
//			break;
//		case EAST:
//			x++;
//			break;
//		case WEST:
//			x--;
//			break;
//		default:
//			break;
//		}
//	}
}
