
abstract class Direction {
	static Direction fromString(String direction){
		switch (direction) {
			case "N": return new North();
			case "S": return new South();
			case "E": return new East();
			case "W": return new West();
//			default : return new North(); // needs to be redone
		}
		return new North(); // needs to be redone
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
	
}

class East extends Direction {
	
}

class West extends Direction {
	
}