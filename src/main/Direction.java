package main;
//Direction enum - maybe need to add to a Position interface to hide implementation
//Each constant has methods: left(), right(), toString()
//Abstract methods included at bottom of page

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
	
	static Direction fromStringToDirection(String directionStr){
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

