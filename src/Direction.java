
abstract class Direction {	
	
	static Direction direction;
	
	static Direction fromString(String directionStr){
		if (directionStr.equals("N")) {
			direction = new North();
		} else if (directionStr.equals("S")) {
			direction = new South();
		} else if (directionStr.equals("E")) {
			direction = new East();
		} else if (directionStr.equals("W")) {
			direction = new West();
		}
		return direction;
//		switch (direction) {
//			case "N": return new North();
//			case "S": return new South();
//			case "E": return new East();
//			case "W": return new West();
////			default : return new North(); // needs to be redone
//		}
		//return new North(); // needs to be redone
	}
	
	abstract int[] move(int[] currentPosition);
	
	abstract Direction turnLeft();
	
	abstract Direction turnRight();
}

class North extends Direction {
	Direction turnRight(){
		return new East();
	}
	
	Direction turnLeft(){
		return new West();
	}
	
	int[] move(int[] currentPosition){
		currentPosition[1]++;
		return currentPosition;
	}
	
}

class South extends Direction {
	
	Direction turnRight(){
		return new West();
	}
	
	Direction turnLeft(){
		return new East();
	}
	
	int[] move(int[] currentPosition){
		currentPosition[1]--;
		return currentPosition;
	}
	
}

class East extends Direction {
	Direction turnRight(){
		return new South();
	}
	
	Direction turnLeft(){
		return new North();
	}
	
	int[] move(int[] currentPosition){
		currentPosition[0]++;
		return currentPosition;
	}
}

class West extends Direction {
	Direction turnRight(){
		return new North();
	}
	
	Direction turnLeft(){
		return new South();
	}
	
	int[] move(int[] currentPosition){
		currentPosition[0]--;
		return currentPosition;
	}
}