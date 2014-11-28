
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
	
}
