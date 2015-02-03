package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringCommandParser {
	private static HashMap<String, ICommand> stringToCommandMap = new HashMap<String, ICommand>() { 
		{
			put("L", new TurnLeftCommand());
			put("R", new TurnRightCommand());
			put("M", new MoveCommand());
		}
	};
	
	public static ICommand lookupCommandEquivalent(final String str) {
		return stringToCommandMap.get(str);
	}
	
	public static List<ICommand> buildCommandsList(String[] instructions) {
		List<ICommand> roverCommands = new ArrayList<ICommand>();
		for(int i = 0; i<instructions.length; i++) {
			roverCommands.add(lookupCommandEquivalent(instructions[i]));
		}
		return roverCommands;
	}
}
