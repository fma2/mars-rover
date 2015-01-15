package commands;

import main.Rover;

public interface ICommand {
	public void execute(final Rover rover);
}
