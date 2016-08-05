package Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{ ColorTest.class, EdgesTest.class, EdgeTest.class, GraphTest.class, 
			MenuTest.class, TreeTest.class, TreeVertexTest.class, TreeVerticiesTest.class, 
			UserInputGraphTest.class, VertexTest.class, VerticiesTest.class }
		)
public class AllTests
{

}
