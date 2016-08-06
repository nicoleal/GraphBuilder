package Nodes;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

/**
 * VertexTest Class
 * 
 * 		A JUnit test class for the Vertex Class.
 * 
 *  
 * @author Nicole Loew
 * @version 06 August 2016
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VertexTest
{
	public Vertex v;
	public ExpectedException thrown;

	@Test
	public void testNoArgConstructor()
	{
		v = new Vertex();
		assertEquals(-1, v.getName());
		assertEquals(Vertex.DEFAULT_MAX_DEGREE, v.getMaxDegree());
		assertEquals(Vertex.DEFAULT_CURR_DEGREE, v.getCurrDegree());
	}
	
	@Test
	public void testOneArgConstructor()
	{
		int i = 1772;
		v = new Vertex(i);
		assertEquals(i, v.getName());
		assertEquals(Vertex.DEFAULT_MAX_DEGREE, v.getMaxDegree());
		assertEquals(Vertex.DEFAULT_CURR_DEGREE, v.getCurrDegree());
	}
	
	@Test
	public void testTwoArgConstructor()
	{
		int i = 1492;
		int j = 33;
		v = new Vertex(i, j);
		assertEquals(i, v.getName());
		assertEquals(j, v.getMaxDegree());
		assertEquals(Vertex.DEFAULT_CURR_DEGREE, v.getCurrDegree());
	}
	
	@Test
	public void testThreeArgConstructor()
	{
		int i = 1066;
		int j = 12;
		int k = 3;
		v = new Vertex(i, j, k);
		assertEquals(i, v.getName());
		assertEquals(j, v.getMaxDegree());
		assertEquals(k, v.getCurrDegree());
	}
	
	@Test
	public void testSetters() throws Exception
	{
		v = new Vertex(154, 9, 8);
		assertEquals(154, v.getName());
		v.setName(298);
		assertEquals(298, v.getName());
		assertEquals(9, v.getMaxDegree());
		v.setMaxDegree(16);
		assertEquals(16, v.getMaxDegree());
		assertEquals(8, v.getCurrDegree());
		v.setCurrDegree(7);
		assertEquals(7, v.getCurrDegree());
		thrown = ExpectedException.none();
		v.setCurrDegree(88);
		thrown.expect(Exception.class);
		thrown.expectMessage("This vertex is already at its max degree");
		thrown = ExpectedException.none();	
	}

	@Test
	public void testBooleans() throws Exception
	{
		v = new Vertex(99, 15, 0);
		assertTrue(v.canAddNeighbors());
		assertFalse(v.hasNeighbors());
		v.setCurrDegree(14);
		assertTrue(v.canAddNeighbors());
		assertFalse(v.isLeaf());
		assertTrue(v.hasNeighbors());
		v.setCurrDegree(15);
		assertFalse(v.canAddNeighbors());
	}
	
	@Test
	public void testFunctions() throws Exception
	{
		v = new Vertex();
		assertEquals(Vertex.DEFAULT_NAME, v.getName());
		v.rename(2001);
		assertEquals(2001, v.getName());
		assertEquals(Vertex.DEFAULT_MAX_DEGREE, v.getMaxDegree());
		assertEquals(Vertex.DEFAULT_CURR_DEGREE, v.getCurrDegree());
		v.makeLeaf();
		assertEquals(1, v.getMaxDegree());
		assertEquals(1, v.getCurrDegree());
		v.reset();
		assertEquals(Vertex.DEFAULT_MAX_DEGREE, v.getMaxDegree());
		assertEquals(Vertex.DEFAULT_CURR_DEGREE, v.getCurrDegree());
	}
	
}