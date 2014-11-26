
public class Rover {

	private int x;
	private int y;	
	private Direction direction;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		x = xCoordinate;
		y = yCoordinate;
		direction = initialDirection;
	}
	
	void setDirection(Direction currentDirection) {
		direction = currentDirection;
	}
	
	Direction getDirection(){
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

	

}
