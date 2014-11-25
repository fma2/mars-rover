
public class Rover {

	private int[] position;
//	private int x;
//	private int y;
	
	private Direction direction;
	
	public Rover(int[] currentPosition, Direction initialDirection) {
//		this.x = xCoordinate;
//		this.y = yCoordinate;
		position = currentPosition;
		this.direction = initialDirection;
	}
	
	void setDirection(Direction currentDirection) {
		direction = currentDirection;
	}
	
	Direction getDirection(){
		return direction;
	}
	
	void setPosition(int[] currentPosition) {
		position = currentPosition;
	}
	
	int[] getPosition(){
		return position;
		
	}
	
//	void setXCoordinate(int xCoordinate) {
//		x = xCoordinate;
//	}
//	
//	int getXCoordinate() {
//		return x;
//	}
//	
//	void setYCoordinate(int yCoordinate) {
//		y = yCoordinate;
//	}
//	
//	int getYCoordinate() {
//		return y;
//	}
	

}
