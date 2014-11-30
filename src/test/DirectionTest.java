package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.lang.reflect.Method;

import main.Direction;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DirectionTest {

	private static final String String = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFromStringtoDirection() {
		String north = "N";
		Direction direction = Direction.fromStringToDirection(north);
		assertThat(direction, is(Direction.NORTH));
	}
	
	@Test
	public void testLeftChangesDirectionNorthToDirectionWest() {
		Direction direction = Direction.NORTH; 
		Direction changedDirection = direction.left();
		assertThat(changedDirection, is(Direction.WEST));
	}
	
	@Test
	public void testRightChangesDirectionEastToDirectionSouth() {
		Direction direction = Direction.EAST; 
		Direction changedDirection = direction.right();
		assertThat(changedDirection, is(Direction.SOUTH));
	}
	
	@Test
	public void testToStringReturnsString() {
		Direction direction = Direction.WEST;
		String directionStr = direction.toString();
		assertThat(directionStr, is("W"));
	}

}
