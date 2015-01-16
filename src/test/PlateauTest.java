package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import main.Direction;
import main.Plateau;
import main.Position;

import org.junit.Test;

public class PlateauTest {

	@Test
	public void testConvertStringToIntArray() {
		String coordinates = "5 5";
		int[] coordinatesArr = Plateau.convertStringToIntArray(coordinates);
		int[] expectedArr = {5, 5};
		assertThat(coordinatesArr, is(expectedArr));
	}
	
	@Test
	public void testIsRoverisOutofBoundsReturnsTrueWhenOutofBounds() {
		Plateau plateau = new Plateau (5,5);
		Position position = new Position(6, 5);
		boolean actual = plateau.isRoverOutOfBounds(position);
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
