
public class Manager {
	
	Rover rover;

	public Manager(Rover newRover) {
		rover = newRover;
	}

	public void direct(String instructions){
		for (char ch: instructions.toCharArray()) {
			switch (Character.toString(ch)) {
				case "L": rover.turnLeft();
				case "R": rover.turnRight();
				case "M": rover.move();
			}
		}
		//iterate over each character in instructions to see if L, R, or M
		// not sure if need something that comes out of this...
	}

}
