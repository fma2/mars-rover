package commands;

import main.Rover;

public class TurnRightCommand implements ICommand {

	@Override
	public void execute(Rover rover) {
		rover.turnRight();
	}

}
