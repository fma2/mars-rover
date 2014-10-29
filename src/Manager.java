
public class Manager {
	
	Rover rover;

	public Manager(Rover newRover) {
		rover = newRover;
	}

	public void direct(String instructions){
		for (char ch: instructions.toCharArray()) {	
			if(Character.toString(ch).equals("L")){
				rover.turnLeft();
			} else if(Character.toString(ch).equals("R")){
				rover.turnRight();
			} else if(Character.toString(ch).equals("M")){
				rover.move();
			}
		}
	}

}
