
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
	}
	
	abstract int[] move(int[] currentPosition);
	
	abstract Direction turnLeft();
	
	abstract Direction turnRight();
	
	abstract String print();
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
	
	String print(){
		return "N";
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
	
	String print(){
		return "S";
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

	String print() {
		return "E";
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
	
	String print() {
		return "W";
	}
}
