package main;

public class TurnLeftCommand implements ICommand {

	public void execute(Rover rover) {
		rover.turnLeft();		
	}

}
