
public class Manager {
	
	Rover rover;
	Plateau plateau;

	public Manager(Rover newRover, Plateau newPlateau) {
		rover = newRover;
		plateau = newPlateau;
	}

	public void direct(String instructions){
		for (char ch: instructions.toCharArray()) {	
			if(Character.toString(ch).equals("L")){
				rover.turnLeft();
			} else if(Character.toString(ch).equals("R")){
				rover.turnRight();
			} else if(Character.toString(ch).equals("M")){
				rover.move();
				if (plateau.isRoverOutOfBounds(rover.position)){
					throw new UnsupportedOperationException("Rover out of bounds!!!");
				}
			}
		}
	}

}
