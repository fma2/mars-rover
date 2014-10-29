
abstract class Direction {	
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
		return North();
	}
	
	Direction turnLeft(){
		return South();
	}
	
	int[] move(int[] currentPosition){
		currentPosition[0]--;
		return currentPosition;
	}
}