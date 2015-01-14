package commands;

public class TurnLeftCommand implements ICommand {

    // @Override
    public void execute(final Rover rover) {
        rover.turnLeft();
    }

}
