package main;
// The Position class stores and manipulates the position of the Rover
public class Position {

	private int xCoordinate;
	private int yCoordinate;	
	
	public Position (int x, int y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
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
	
}
