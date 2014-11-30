package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import main.Direction;
import main.Plateau;
import main.Position;
import main.Rover;

import org.junit.Before;
import org.junit.Test;

public class PositionTest {
	
	Rover rover;
	Rover rover2;
	Plateau plateau;
	int x;
	int y;

	@Before
	public void setUp() throws Exception {
		x = 1;
		y = 2;
		rover = new Rover(x,y, Direction.EAST);
		rover2 = new Rover(x,y, Direction.NORTH);
		int[] plateauCoordinates = {5,5};
		plateau = new Plateau(plateauCoordinates);
	}

	@Test
	public void testMoveDoesNotChangeDirection() {
		Position position = rover.getPosition();
		Direction direction = position.getDirection();
		position.move();
		Direction newDirection = position.getDirection();
		assertThat(newDirection, is(direction));	
	}

	@Test
	public void testMoveChangesXCoordinateByOneWhenDirectionIsEast(){
		Position position = rover.getPosition();
		int xCoordinate = position.getX();
		position.move();
		int newXCoordinate = position.getX();
		assertThat(newXCoordinate - 1, is((xCoordinate)));
	}
	
	@Test
	public void testMoveChangesYCoordinateByOneWhenDirectionIsNorth(){
		Position position = rover2.getPosition();
		int yCoordinate = position.getY();
		position.move();
		int newYCoordinate = position.getY();
		assertThat(newYCoordinate - 1, is((yCoordinate)));
	}
	
}
