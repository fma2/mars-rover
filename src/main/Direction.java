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

		@Override
		public int getDeltaX() {
			return 0;
		}

		@Override
		public int getDeltaY() {
			return 1;
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

		@Override
		public int getDeltaX() {
			return 0;
		}

		@Override
		public int getDeltaY() {
			return -1;
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

		@Override
		public int getDeltaX() {
			return 1;
		}

		@Override
		public int getDeltaY() {
			return 0;
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

		@Override
		public int getDeltaX() {
			return -1;
		}

		@Override
		public int getDeltaY() {
			return 0;
		}
	},;
	
	public abstract Direction left();
	public abstract Direction right();
	public abstract int getDeltaX();
	public abstract int getDeltaY();
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

