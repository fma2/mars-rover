
public class Rover {
	int[] position;
	Direction direction;
	
	public Rover(int[] currentPosition, Direction initialDirection) {
		position = currentPosition;
		direction = initialDirection;
	}
	
	void move() {
		position = direction.move(position);
	}
	
	void turnLeft() {
		direction = direction.turnLeft();	
	}
	
	void turnRight() {
		direction = direction.turnRight();
	}
	
	void printStatus(){
		System.out.print(position[0]);
		System.out.print(position[1]);
		System.out.print(direction.print());
	}
}
