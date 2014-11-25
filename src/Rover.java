
public class Rover {

//	private int[] position;
	private int x;
	private int y;
	
	private Direction direction;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		this.x = xCoordinate;
		this.y = yCoordinate;
//		position = currentPosition;
		this.direction = initialDirection;
	}
	
	void setDirection(Direction currentDirection) {
		direction = currentDirection;
	}
	
	Direction getDirection(){
		return direction;
	}
	

}
