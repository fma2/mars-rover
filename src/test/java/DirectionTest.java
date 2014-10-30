package test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DirectionTest {

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
	public void test() {	
//		fail("Not yet implemented");
	}
	
	@Test
	public void testAssertEquals() {
		Direction expected = DirectionTest.fromString("N");
		Direction actual = DirectionTest.fromString("N");
//	    byte[] expected = "trial".getBytes();
//	    byte[] actual = "trial".getBytes();
	    org.junit.Assert.assertEquals("failure - byte arrays not same", expected, actual);
	  }
	

}
