
//public interface Position {
////	int[] move(int[] currentPosition);
//	
//	public abstract Direction turnLeft();
//	
////	public abstract Direction turnRight();
//	
//	
//};

public class Position {

//	private int x;
//	private int y;	
//	private Direction direction;
	
	public Position (int xCoordinate, int yCoordinate, Direction direction) {
//		this.x = xCoordinate;
//		this.y = yCoordinate;
//		this.direction = direction;
	}
	
	public static void turnLeft(Rover rover) {
		switch (rover.getDirection()) {
		case EAST: 
			rover.setDirection(Direction.NORTH);
			break;
		case NORTH:
			rover.setDirection(Direction.WEST);
			break;
		case SOUTH:
			rover.setDirection(Direction.EAST);
			break;
		case WEST:
			rover.setDirection(Direction.SOUTH);
			break;
		default:
			break;
		}
	}
	
	public static void turnRight(Rover rover) {
		switch (rover.getDirection()) {
		case EAST: 
			rover.setDirection(Direction.SOUTH);
			break;
		case NORTH:
			rover.setDirection(Direction.EAST);
			break;
		case SOUTH:
			rover.setDirection(Direction.WEST);
			break;
		case WEST:
			rover.setDirection(Direction.NORTH);
			break;
		default:
			break;
		}
	}

	public static void move(Rover rover) {
		int x = rover.getX();
		int y = rover.getY();
		if (rover.getDirection().equals(Direction.NORTH) || rover.getDirection().equals(Direction.SOUTH)) {
			switch (rover.getDirection()) {
			case SOUTH:
				rover.setY(y-1);
				break;
			case NORTH:
				rover.setY(y+1);
				break;
			default:
				break;
			}
		} else if (rover.getDirection().equals(Direction.EAST) || rover.getDirection().equals(Direction.WEST)){
			switch (rover.getDirection()) {
			case WEST:
				rover.setX(x-1);
				break;
			case EAST:
				rover.setX(x+1);
				break;
			default:
				break;
			}
		}
	}
	
}
