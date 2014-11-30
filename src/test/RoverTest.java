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
	
	Rover rover1;
	Rover rover2;
	Position position;
	Plateau plateau1;
	Plateau plateau2;
	Plateau plateau3;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		rover1 = new Rover(1,2,Direction.NORTH);
		rover2 = new Rover(3,3, Direction.NORTH);
		position = rover1.getPosition();
		plateau1 = new Plateau(5,5);
		plateau2 = new Plateau(10, 10);
		plateau3 = new Plateau(20,20);
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testRoverHasPosition() {
		assertNotNull(rover1.getPosition());
	}
	
	@Test
	public void testGetPositionReturnsCurrentPosition() {
		Position currentPosition = position;
		assertEquals(rover1.getPosition(), currentPosition);
	}
	
	@Test
	public void testDirectMovesRoverXCoordinate() {
		int beforeDirectXCoordinate = rover1.getPosition().getX();
		String[] instructions = "RM".split(""); 
		rover1.direct(instructions, plateau1);
		Position afterDirectPosition = rover1.getPosition();
		assertNotSame(afterDirectPosition.getX(), beforeDirectXCoordinate);
	}
	
	@Test
	public void testPrintPosition(){
		rover2.printPosition();
		assertThat(outContent.toString().trim(), is("3 3 N"));
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
		rover4.printPosition();
		assertThat(outContent.toString().trim(), is("8 0 S"));
	}
	
	@Test
	public void testEndCoordinatesforRover5() {
		Rover rover5 = new Rover(3, 5, Direction.NORTH);
		String[] instructions = "MMRMMRMRRM".split("");
		rover5.direct(instructions, plateau2);
		rover5.printPosition();
		assertThat(outContent.toString().trim(), is("5 7 N"));
	}
	
	@Test
	public void testEndCoordinatesforRover6() {
		Rover rover6 = new Rover(10, 13, Direction.EAST);
		String[] instructions = "LMLMLMLMRM".split("");
		rover6.direct(instructions, plateau3);
		rover6.printPosition();
		assertThat(outContent.toString().trim(), is("10 12 S"));
	}
	
	@Test
	public void testEndCoordinatesforRover7() {
		Rover rover7 = new Rover(13, 15, Direction.SOUTH);
		String[] instructions = "MMRMMRMRRM".split("");
		rover7.direct(instructions, plateau3);
		rover7.printPosition();
		assertThat(outContent.toString().trim(), is("11 13 S"));
	}
}
