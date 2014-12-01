package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Plateau;
import main.Position;
import main.Rover;
import main.Direction;

public class RoverTest {
	
	Rover rover1;
	Rover rover2;
	Plateau plateau1;
	Plateau plateau2;
	Plateau plateau3;
	
	@Before
	public void setUp() throws Exception {
		rover1 = new Rover(1,2,Direction.NORTH);
		rover2 = new Rover(3,3, Direction.NORTH);
		plateau1 = new Plateau(5,5);
		plateau2 = new Plateau(10, 10);
		plateau3 = new Plateau(20,20);
	}
	
	@Test
	public void testRoverHasPosition() {
		assertNotNull(rover1.getPosition());
	}
	
	@Test
	public void testDirectMovesRoverXCoordinate() {
		int beforeDirectXCoordinate = rover1.getPosition().getX();
		String[] instructions = "RM".split(""); 
		rover1.direct(instructions, plateau1);
		Position afterDirectPosition = rover1.getPosition();
		assertNotSame(afterDirectPosition.getX(), beforeDirectXCoordinate);
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testExceptionRoverisOutofBoundsatBeginningofInstructions() {
		Rover rover3 = new Rover(6, 6, Direction.NORTH);
		rover3.direct("LMMMMM".split(""), plateau1);
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testExceptionRoverisOutofBoundsatEndofMove() {
		rover2.direct("LMMMMM".split(""), plateau1);		
	}

	@Test
	public void testEndCoordinatesforRover4() {
		Rover rover4 = new Rover(8, 1, Direction.EAST);
		String[] instructions = "LMLMLMLMRM".split(""); 
		rover4.direct(instructions, plateau2);
		Position position4 = new Position(8,0,Direction.SOUTH);
		assertTrue("End coordinates are not as expected", arePositionObjectsEqual(rover4.getPosition(), position4));
	}
	
	@Test
	public void testEndCoordinatesforRover5() {
		Rover rover5 = new Rover(3, 5, Direction.NORTH);
		String[] instructions = "MMRMMRMRRM".split("");
		rover5.direct(instructions, plateau2);
		Position position5 = new Position(5,7,Direction.NORTH);
		assertTrue("End coordinates are not as expected", arePositionObjectsEqual(rover5.getPosition(), position5));
	}
	
	@Test
	public void testEndCoordinatesforRover6() {
		Rover rover6 = new Rover(10, 13, Direction.EAST);
		String[] instructions = "LMLMLMLMRM".split("");
		rover6.direct(instructions, plateau3);
		Position position6 = new Position(10,12,Direction.SOUTH);
		assertTrue("End coordinates are not as expected", arePositionObjectsEqual(rover6.getPosition(), position6));
	}
	
	@Test
	public void testEndCoordinatesforRover7() {
		Rover rover7 = new Rover(13, 15, Direction.SOUTH);
		String[] instructions = "MMRMMRMRRM".split("");
		rover7.direct(instructions, plateau3);
		Position position7 = new Position(11,13, Direction.SOUTH);
		assertTrue("End coordinates are not as expected", arePositionObjectsEqual(rover7.getPosition(), position7));
	}
	
	public boolean arePositionObjectsEqual(Position position1, Position position2) {
		if (position1.getX() == position2.getX() && position1.getY() == position2.getY() && position1.getDirection() == position2.getDirection()){
			return true;
		} else return false;
	}
}
