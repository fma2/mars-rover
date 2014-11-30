package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import main.Direction;
import main.Plateau;
import main.Position;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlateauTest {


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
	public void testConvertStringToIntArray() {
		String coordinates = "5 5";
		int[] coordinatesArr = Plateau.convertStringToIntArray(coordinates);
		int[] expectedArr = {5, 5};
		assertThat(coordinatesArr, is(expectedArr));
	}
	
	@Test
	public void testIsRoverisOutofBoundsReturnsTrueWhenOutofBounds() {
		int[] plateauCoordinates = {5, 5};
		Plateau plateau = new Plateau (plateauCoordinates);
		Position position = new Position(6, 5, Direction.NORTH);
		boolean actual = plateau.isRoverOutOfBounds(position);
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
