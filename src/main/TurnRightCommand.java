package main;

public class TurnRightCommand implements ICommand {

	public void execute(Rover rover) {
		rover.turnRight();		
	}

}
