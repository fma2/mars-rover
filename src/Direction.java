
public enum Direction {
	NORTH {
		public Direction left() {
			return WEST;
		}
		
		public Direction right() {
			return EAST;
		}
	},
	
	SOUTH {
		public Direction left() {
			return EAST;
		}
		
		public Direction right() {
			return WEST;
		}
		
	},
	
	EAST {
		public Direction left() {
			return NORTH;
		}
		
		public Direction right() {
			return SOUTH;
		}
	},
	
	WEST {
		public Direction left() {
			return SOUTH;
		}
		
		public Direction right() {
			return NORTH;
		}
	},;
	
	public abstract Direction left();
	public abstract Direction right();

};

