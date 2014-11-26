
public class Rover {

	private int x;
	private int y;	
	private Direction direction;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		this.x = xCoordinate;
		this.y = yCoordinate;
		this.direction = initialDirection;
	}
	
	void setDirection(Direction currentDirection) {
		direction = currentDirection;
	}
	
	Direction getDirection(){
		return direction;
	}
	
	
	void setXCoordinate(int xCoordinate) {
		x = xCoordinate;
	}
	
	int getXCoordinate() {
		return x;
	}
	
	void setYCoordinate(int yCoordinate) {
		y = yCoordinate;
	}
	
	int getYCoordinate() {
		return y;
	}
	

}
