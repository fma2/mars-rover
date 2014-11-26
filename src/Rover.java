
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

	void direct(String[] instructions){
//		if (plateau.isRoverOutOfBounds(rover.position)){
//			throw new UnsupportedOperationException("Rover out of bounds!!!");
//		}
		for (int i=0; i < instructions.length; i++) {	
			if(instructions[i].equals("L")){
//				rover.turnLeft();
			} else if(instructions[i].equals("R")){
//				rover.turnRight();
			} else if(instructions[i].equals("M")){
//				rover.move();
//				if (plateau.isRoverOutOfBounds(rover.position)){
//					throw new UnsupportedOperationException("Rover out of bounds!!!");
//				}
			}
		}
	}

}
