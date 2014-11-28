
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
	
	public static void turnLeft(Rover rover) {
//		rover.getDirection().left();
//		switch (rover.getDirection()) {
//		case EAST: 
//			rover.setDirection(Direction.NORTH);
//			break;
//		case NORTH:
//			rover.setDirection(Direction.WEST);
//			break;
//		case SOUTH:
//			rover.setDirection(Direction.EAST);
//			break;
//		case WEST:
//			rover.setDirection(Direction.SOUTH);
//			break;
//		default:
//			break;
//		}
	}
	
	public static void turnRight(Rover rover) {
//		switch (rover.getDirection()) {
//		case EAST: 
//			rover.setDirection(Direction.SOUTH);
//			break;
//		case NORTH:
//			rover.setDirection(Direction.EAST);
//			break;
//		case SOUTH:
//			rover.setDirection(Direction.WEST);
//			break;
//		case WEST:
//			rover.setDirection(Direction.NORTH);
//			break;
//		default:
//			break;
//		}
	}

	public void move() {
		int x = getX();
		int y = getY();
//		System.out.println(y);
		switch (getDirection()) {
		case NORTH:
			setY(y+1);
//			System.out.println(getY());
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
//		if (getDirection().equals(Direction.NORTH) || getDirection().equals(Direction.SOUTH)) {
//			switch (rover.getDirection()) {
//			case SOUTH:
//				y--;
//				break;
//			case NORTH:
//				y++;
//				break;
//			default:
//				break;
//			}
//		} else if (rover.getDirection().equals(Direction.EAST) || rover.getDirection().equals(Direction.WEST)){
//			switch (rover.getDirection()) {
//			case WEST:
//				rover.setX(x-1);
//				break;
//			case EAST:
//				rover.setX(x+1);
//				break;
//			default:
//				break;
//			}
//		}
//	}
	
}
