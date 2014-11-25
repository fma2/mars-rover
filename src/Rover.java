
public class Rover {

//	private int[] position;
	private int x;
	private int y;
	
	private Direction direction;
	
	public Rover(int x, int y, Direction initialDirection) {
		this.x = x;
		this.y = y;
//		position = currentPosition;
		this.direction = initialDirection;
	}

}
