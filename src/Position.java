// stores and manipulates the position of the Rover
public class Position {

	private int x;
	private int y;	
	private Direction direction;
	
	public Position (int xCoordinate, int yCoordinate, Direction direction) {
		this.x = xCoordinate;
		this.y = yCoordinate;
		this.direction = direction;
	}
	
	void setDirectionRight(){
		direction = direction.right();
	}
	
	void setDirectionLeft() {
		direction = direction.left();
	}
	
	Direction getDirection() {
		return direction;
	}
	
	void setX(int xCoordinate) {
		x = xCoordinate;
	}

	int getX() {
		return x;
	}

	void setY(int yCoordinate) {
		y = yCoordinate;
	}

	int getY() {
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
	
//	String toString
	
}
