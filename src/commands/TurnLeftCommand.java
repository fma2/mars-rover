package commands;

import main.Rover;

public class TurnLeftCommand implements ICommand {

	@Override
	public void execute(Rover rover) {
		rover.turnLeft();
	}
	

}
