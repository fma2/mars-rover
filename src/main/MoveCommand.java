package main;

public class MoveCommand implements ICommand {

	public void execute(Rover rover) {
		rover.move();		
	}

}
