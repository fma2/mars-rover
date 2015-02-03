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
}
