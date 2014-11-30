package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import main.Plateau;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlateauTest {

	private String coordinates;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		coordinates = "5 5";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertStringToIntArray() {
		int[] coordinatesArr = Plateau.convertStringToIntArray(coordinates);
		int[] expectedArr = {5, 5};
		assertThat(coordinatesArr, is(expectedArr));
	}
	

}
