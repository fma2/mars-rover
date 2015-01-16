package main;

import java.util.ArrayList;
import java.util.List;

import commands.*;

public class StringInstructionsParser {
	
	public static List<ICommand> buildCommands(String[] instructions) { 
		List<ICommand> roverCommands = new ArrayList<ICommand>();
		for (int i=0; i<instructions.length; i++) {
			if(instructions[i].equals("L")){
				roverCommands.add(new TurnLeftCommand());
			} else if(instructions[i].equals("R")){
				roverCommands.add(new TurnRightCommand());
			} else if(instructions[i].equals("M")) {
				roverCommands.add(new MoveCommand());
			}
		}
		return roverCommands;
	}
}
