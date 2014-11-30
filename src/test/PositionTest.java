package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import main.Direction;
import main.Position;
import main.Rover;

import org.junit.Before;
import org.junit.Test;

public class PositionTest {

	int x;
	int y;
	Rover rover;
	Rover rover2;
	Position position;
	Position position2;

	@Before
	public void setUp() throws Exception {
		x = 1;
		y = 2;
		rover = new Rover(x,y, Direction.EAST);
		position = rover.getPosition();
		rover2 = new Rover(x,y, Direction.NORTH);
		position2 = rover2.getPosition();
	}

	@Test
	public void testMoveDoesNotChangeDirection() {
		Direction direction = position.getDirection();
		position.move();
		Direction newDirection = position.getDirection();
		assertThat(newDirection, is(direction));	
	}

	@Test
	public void testMoveChangesXCoordinateByOneWhenDirectionIsEast(){
		int xCoordinate = position.getX();
		position.move();
		int newXCoordinate = position.getX();
		assertThat(newXCoordinate - 1, is((xCoordinate)));
	}
	
	@Test
	public void testMoveChangesYCoordinateByOneWhenDirectionIsNorth(){
		int yCoordinate = position2.getY();
		position2.move();
		int newYCoordinate = position2.getY();
		assertThat(newYCoordinate - 1, is((yCoordinate)));
	}
	
	@Test
	public void testSetDirectionRightChangesDirection() {
		Direction direction = position.getDirection();
		position.setDirectionRight();
		Direction newDirection = position.getDirection();
		assertThat(newDirection, is(not(direction)));
	}
	
	@Test 
	public void testSetDirectionLeftChangedDirectionNorthtoWest(){
		position2.setDirectionLeft();
		Direction newDirection = position2.getDirection();
		assertThat(newDirection, is(Direction.WEST));
	}
	
}
