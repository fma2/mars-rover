package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DirectionTest.class, PlateauTest.class, PositionTest.class,
		RoverTest.class })
public class AllTests {

}
