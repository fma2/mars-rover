package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import main.Direction;

import org.junit.Before;
import org.junit.Test;

public class DirectionTest {

	Direction direction;
	
	@Before
	public void setUp() throws Exception {
		direction = Direction.NORTH;
	}

	@Test
	public void testFromStringtoDirection() {
		String north = "N";
		Direction direction2 = Direction.fromStringToDirection(north);
		assertThat(direction2, is(Direction.NORTH));
	}
	
	@Test
	public void testLeftChangesDirectionNorthToDirectionWest() {
		Direction changedDirection = direction.left();
		assertThat(changedDirection, is(Direction.WEST));
	}
	
	@Test
	public void testRightChangesDirectionNorthToDirectionEast() {
		Direction changedDirection = direction.right();
		assertThat(changedDirection, is(Direction.EAST));
	}
	
	@Test
	public void testToStringReturnsString() {
		String directionStr = direction.toString();
		assertThat(directionStr, is("N"));
	}

}
