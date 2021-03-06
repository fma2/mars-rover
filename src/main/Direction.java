package main;
// The Direction enum contains direction constants.
// Each constant has methods, left(), right(), toString().

public enum Direction {
	NORTH {
		public Direction left() {
			return WEST;
		}
		
		public Direction right() {
			return EAST;
		}
		
		public String toString() {
			return "N";
		}
	},
	
	SOUTH {
		public Direction left() {
			return EAST;
		}
		
		public Direction right() {
			return WEST;
		}
		
		public String toString() {
			return "S";
		}
		
	},
	
	EAST {
		public Direction left() {
			return NORTH;
		}
		
		public Direction right() {
			return SOUTH;
		}
		
		public String toString() {
			return "E";
		}
	},
	
	WEST {
		public Direction left() {
			return SOUTH;
		}
		
		public Direction right() {
			return NORTH;
		}
		
		public String toString() {
			return "W";
		}
	},;
	
	public abstract Direction left();
	public abstract Direction right();
	@Override
	public abstract String toString();
	
	// Turns string provided by input to a Direction constant
	public static Direction fromStringToDirection(String directionStr){
		Direction direction = null;
		if (directionStr.equals("N")) {
			direction = Direction.NORTH;
		} else if (directionStr.equals("S")) {
			direction = Direction.SOUTH;
		} else if (directionStr.equals("E")) {
			direction = Direction.EAST;
		} else if (directionStr.equals("W")) {
			direction = Direction.WEST;
		}
		return direction;
	}
};

