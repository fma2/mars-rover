package main;
// The Position class stores and manipulates the position of the Rover
public class Position {

	private int x;
	private int y;	
	
	public Position (int xCoordinate, int yCoordinate) {
		this.x = xCoordinate;
		this.y = yCoordinate;
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
