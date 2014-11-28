
public class Rover {

	private Position position;
	
	public Rover(int xCoordinate, int yCoordinate, Direction initialDirection) {
		this.position = new Position(xCoordinate, yCoordinate, initialDirection); 
	}

	void direct(String[] instructions){
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
