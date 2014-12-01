package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import main.Direction;

import org.junit.Test;

public class DirectionTest {

	String message = "Pass";	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testFromStringtoDirection() {
		String north = "N";
		Direction direction = Direction.fromStringToDirection(north);
		assertThat(message, direction, is(Direction.NORTH));
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
