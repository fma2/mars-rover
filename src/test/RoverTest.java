package test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Rover;
import main.Direction;

public class RoverTest {
	
	Rover rover;
	Rover rover2;
	
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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNewRoverisInstanceofRoverClass() {
//		Rover rover2 = new Rover(1,2,Direction.NORTH);
//		assertEquals(rover,rover);
		assertThat(rover, instanceOf(Rover.class));
	}
	
	@Test
	public void testRoverHasPosition() {
		
	}
	
	@Test
	public void testGetPositionOfRover() {
//		assertEquals(rover.getPosition(), "1 2 N");
	}
	
//	@Test
//	public void testDirectRover() {
//		
//	}
	

}
