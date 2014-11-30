package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Position;
import main.Rover;
import main.Direction;


public class RoverTest {
	
	Rover rover;
	Rover rover2;
	Position position;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		rover = new Rover(1,2,Direction.NORTH);
		rover2 = new Rover(3,3, Direction.NORTH);
		position = rover.getPosition();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test // probably don't need
	public void testNewRoverisInstanceofRoverClass() {
//		Rover rover2 = new Rover(1,2,Direction.NORTH);
//		assertEquals(rover,rover);
		assertThat(rover, instanceOf(Rover.class));
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
	

}
