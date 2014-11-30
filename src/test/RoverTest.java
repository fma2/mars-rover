package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Position;
import main.Rover;
import main.Direction;


public class RoverTest {
	
	Rover rover;
	Rover rover2;
	Position position;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		rover = new Rover(1,2,Direction.NORTH);
		rover2 = new Rover(3,3, Direction.NORTH);
		position = rover.getPosition();
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void tearDown() throws Exception {
		
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
		rover.direct("LMLMLMMMM".split(""));
		Position afterDirectPosition = rover.getPosition();
		assertThat(beforeDirectXCoordinate, is(not(afterDirectPosition.getX())));
	}
	
	@Test
	public void testPrintPosition(){
		rover2.printPosition();
		assertThat("3 3 N", is(outContent.toString().trim()));
	}

}
