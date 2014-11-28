
public class Rover {

//	private int x;
//	private int y;	
//	private Direction direction;
	private Position position;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		this.position = new Position(xCoordinate, yCoordinate, initialDirection); 
//		x = xCoordinate;
//		y = yCoordinate;
//		direction = initialDirection;
	}
//	void setDirection(Direction currentDirection) {
//		direction = currentDirection;
//	}
//	
//	Direction getDirection(){
//		return direction;
//	}
//	
//	
//	void setX(int xCoordinate) {
//		x = xCoordinate;
//	}
//	
//	int getX() {
//		return x;
//	}
//	
//	void setY(int yCoordinate) {
//		y = yCoordinate;
//	}
//	
//	int getY() {
//		return y;
//	}

	void direct(Rover rover, String[] instructions){
//		if (plateau.isRoverOutOfBounds(rover.position)){
//			throw new UnsupportedOperationException("Rover out of bounds!!!");
//		}
		for (int i=0; i < instructions.length; i++) {	
			if(instructions[i].equals("L")){
				position.setDirectionLeft();
			} else if(instructions[i].equals("R")){
				position.setDirectionRight();
			} else if(instructions[i].equals("M")) {
				position.move();
			}
		}
	}
	
	public void getPosition(){
		System.out.println(position.getX());
		System.out.println(position.getY());
		System.out.println(position.getDirection());
	}

}
