
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
				switch (getDirection()) {
				case EAST: 
					setDirection(Direction.NORTH);
					break;
				case NORTH:
					setDirection(Direction.WEST);
					break;
				case SOUTH:
					setDirection(Direction.EAST);
					break;
				case WEST:
					setDirection(Direction.SOUTH);
					break;
				default:
					break;
				}
			} else if(instructions[i].equals("R")){
//				rover.turnRight();
				switch (getDirection()) {
				case EAST: 
					setDirection(Direction.SOUTH);
					break;
				case NORTH:
					setDirection(Direction.EAST);
					break;
				case SOUTH:
					setDirection(Direction.WEST);
					break;
				case WEST:
					setDirection(Direction.NORTH);
					break;
				default:
					break;
				}
			} else if(instructions[i].equals("M") && getDirection().equals(Direction.NORTH) || getDirection().equals(Direction.SOUTH)){
					y = getY();
					switch (getDirection()) {
					case SOUTH:
						setY(y-1);
						break;
					case NORTH:
						setY(y+1);
						break;
					default:
						break;
					}
			} else if (instructions[i].equals("M") && getDirection().equals(Direction.EAST) || getDirection().equals(Direction.WEST)) {
				x = getX();
				switch (getDirection()) {
				case WEST:
					setX(x-1);
					break;
				case EAST:
					setX(x+1);
					break;
				default:
					break;
				}
//				rover.move();
//				if (plateau.isRoverOutOfBounds(rover.position)){
//					throw new UnsupportedOperationException("Rover out of bounds!!!");
//				}
			}
		}
	}

}
