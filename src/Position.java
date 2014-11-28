
//public interface Position {
////	int[] move(int[] currentPosition);
//	
//	public abstract Direction turnLeft();
//	
////	public abstract Direction turnRight();
//	
//	
//};

// stores and manipulates the position of the rover
public class Position {

	private int x;
	private int y;	
	private Direction direction;
	
	public Position (int xCoordinate, int yCoordinate, Direction direction) {
		this.x = xCoordinate;
		this.y = yCoordinate;
		this.direction = direction;
	}
	
	void setDirectionRight(){
		direction = direction.right();
	}
	
	void setDirectionLeft() {
		direction = direction.left();
	}
	
	Direction getDirection() {
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

	public void move() {
		int x = getX();
		int y = getY();
		switch (getDirection()) {
		case NORTH:
			y++;
			break;
		case SOUTH:
			setY(y-1);
			break;
		case EAST:
			setX(x+1);
			break;
		case WEST:
			setX(x-1);
			break;
		default:
			break;
		}
	}
	
}
