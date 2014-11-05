
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
		String status = position[0] + " " + position[1] + " " + direction.print();
		System.out.println(status);
		System.out.println("======");
	}
}
