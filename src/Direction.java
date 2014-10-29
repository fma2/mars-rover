
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
	
}

class East extends Direction {
	
}

class West extends Direction {
	
}