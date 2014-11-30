package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import main.Plateau;
import main.Position;
import main.Rover;
import main.Direction;


public class RoverTest {
	
	Rover rover;
	Rover rover2;
	Position position;
	Plateau plateau;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		rover = new Rover(1,2,Direction.NORTH);
		rover2 = new Rover(3,3, Direction.NORTH);
		position = rover.getPosition();
		int[] plateauCoordinates = {5, 5};
		plateau = new Plateau(plateauCoordinates);
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testRoverHasPosition() {
		assertNotNull(rover.getPosition());
	}
	
	@Test
	public void testGetPositionReturnsCurrentPosition() {
		Position currentPosition = position;
		assertEquals(currentPosition, rover.getPosition());
	}
	
	@Test
	public void testDirectMovesRover() {
		int beforeDirectXCoordinate = rover.getPosition().getX();
		String[] instructions = "RM".split(""); 
		rover.direct(instructions, plateau);
		Position afterDirectPosition = rover.getPosition();
		assertThat(beforeDirectXCoordinate, is(not(afterDirectPosition.getX())));
	}
	
	@Test
	public void testPrintPosition(){
		rover2.printPosition();
		assertThat("3 3 N", is(outContent.toString().trim()));
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testExceptionRoverisOutofBoundsatBeginningofInstructions() {
		Rover rover3 = new Rover(6, 6, Direction.NORTH);
		rover3.direct("LMMMMM".split(""), plateau);
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testExceptionRoverisOutofBoundsatEndofMove() {
		rover2.direct("LMMMMM".split(""), plateau);		
	}

}
