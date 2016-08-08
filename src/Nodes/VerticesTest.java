package Nodes;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

/**
 * VerticesTest Class
 * 
 * 		A JUnit test class for the Vertices Class.
 * 
 *  
 * @author Nicole Loew
 * @version 07 August 2016
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VerticesTest
{
	public Vertices v;
	public ExpectedException thrown;
	

	@Test
	public void testNoArgConstructor()
	{
		v = new Vertices();
		assertEquals(Vertices.DEFAULT_VERTICES, v.getGraphSize());
		assertEquals(Vertices.DEFAULT_COUNT, v.getCommunityItems());
	}
	
	@Test
	public void testOneArgConstructor()
	{
		int i = 17;
		v = new Vertices(i);
		assertEquals(i, v.getGraphSize());
		assertEquals(Vertices.DEFAULT_COUNT, v.getCommunityItems());
	}
	
	@Test
	public void testTwoArgConstructor()
	{
		int i = 11;
		int j = 8;
		v = new Vertices(i, j);
		assertEquals(i, v.getGraphSize());
		assertEquals(j, v.getCommunityItems());
	}
	
	@Test
	public void testSetters() throws Exception
	{
		v = new Vertices(15, 10);
		Vertex[] w = new Vertex[18];
		assertEquals(15, v.getGraphSize());
		v.setCommunity(w);
		assertEquals(18, v.getGraphSize());
		v.setGraphSize(20);
		assertEquals(20, v.getGraphSize());
		assertEquals(10, v.getCommunityItems());
		v.setCommunityItems(15);
		assertEquals(15, v.getCommunityItems());
		thrown = ExpectedException.none();
		v.setCommunityItems(25);
		thrown.expect(Exception.class);
		thrown.expectMessage("There can't be more items in the graph than the number of vertices");
		thrown = ExpectedException.none();	
	}

	@Test
	public void testBooleans() throws Exception
	{
		v = new Vertices(10, 10);
		assertTrue(v.isFull());
		assertFalse(v.isEmpty());
		assertTrue(v.hasCommunity());
		v.setCommunityItems(0);
		assertFalse(v.isFull());
		assertTrue(v.isEmpty());
		assertFalse(v.hasCommunity());
	}
}
