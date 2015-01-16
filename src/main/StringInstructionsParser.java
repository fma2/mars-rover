package main;

import java.util.*;

import commands.*;

public class StringInstructionsParser {
	
	private static HashMap<String, ICommand> stringToCommandMap = new HashMap<String, ICommand>() {
		{
			put("L", new TurnLeftCommand());
			put("R", new TurnRightCommand());
			put("M", new MoveCommand());
		}
	};
	
	private static ICommand lookupEquivalentCommand(final String commandString) {
        return stringToCommandMap.get(commandString);
    }
	
	public static List<ICommand> buildCommandsList(String[] instructions) { 
		List<ICommand> roverCommands = new ArrayList<ICommand>();
		for (int i=0; i<instructions.length; i++) {
			roverCommands.add(lookupEquivalentCommand(instructions[i]));
		}
		return roverCommands;
	}
}
