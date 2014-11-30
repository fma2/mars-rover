package main;
// Stores and manipulates the position of the Rover -- maybe should be called from position interface??
public class Position {

	private int x;
	private int y;	
	private Direction direction;
	
	public Position (int xCoordinate, int yCoordinate, Direction direction) {
		this.x = xCoordinate;
		this.y = yCoordinate;
		this.direction = direction;
	}
	
	public void setDirectionRight(){
		direction = direction.right();
	}
	
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
