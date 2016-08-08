package Nodes;

/**
 * Vertices Class
 * 
 * 		Vertices are a fundamental unit from which graphs are formed. They are 
 * 		featureless and indivisible objects. Two vertices may serve as the end 
 * 		points of an edge. Two vertices are adjacent if an edge connects them.
 * 		The neighborhood of a graph is all the vertices adjacent to a vertex. 
 * 
 * @author Nicole Loew
 * @version 07 August 2016
 */

public class Vertices
{
	public static final int DEFAULT_VERTICES = 10;
	public static final int DEFAULT_COUNT = 0;
	
	public Vertex[] community;			// The set of all vertices in a graph
	public int communityItems;			// Counter for community
	
	/****************************************************************************
	 *                                                                          *
	 *                              CONSTRUCTORS                                *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * NO-ARG Constructor:
	 */
	public Vertices()
	{
		community = new Vertex[DEFAULT_VERTICES];
		communityItems = DEFAULT_COUNT;
	}
	
	/**
	 * 1-ARG Constructor:
	 * 
	 * @param graphSize:
	 */
	public Vertices(int graphSize)
	{
		community = new Vertex[graphSize];
		communityItems = DEFAULT_COUNT;
	}
	
	/**
	 * 2-ARG Constructor:
	 * 
	 * @param graphSize:
	 * @param communityItems
	 */
	public Vertices(int graphSize, int communityItems)
	{
		community = new Vertex[graphSize];
		this.communityItems = communityItems;
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              GETTERS                                     *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * getCommunity:
	 * 
	 * @return community[]:
	 */
	public Vertex[] getCommunity()
	{
		return community;
	}
	
	/**
	 * getCommunityItems:
	 * 
	 * @return communityItems:
	 */
	public int getCommunityItems()
	{
		return communityItems;
	}
	
	/**
	 * getGraphSize:
	 * 
	 * @return graphSize:
	 */
	public int getGraphSize()
	{
		return community.length;
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              SETTERS                                     *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * setCommunity:
	 * 
	 * @param community[]:
	 */
	protected void setCommunity(Vertex[] community)
	{
		this.community = community;
	}
	
	/**
	 * setCommunityItems:
	 * 
	 * @param communityItems:
	 * @throws Exception 
	 */
	protected void setCommunityItems(int communityItems) throws Exception
	{
		if (getCommunityItems() <= getGraphSize())
		{
			this.communityItems = communityItems;
		}
		else
		{
			throw new Exception("There can't be more items in the graph than the number of vertices");
		}
	}
	
	/**
	 * setGraphSize:
	 * 
	 * @param graphSize:
	 * @throws Exception 
	 */
	protected void setGraphSize(int graphSize) throws Exception
	{
		Vertex[] temp = new Vertex[graphSize];
		setCommunity(copyToTemp(temp));
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              BOOLEAN                                     *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * hasCommunity:
	 * 
	 * @return
	 */
	public boolean hasCommunity()
	{
		return (getCommunityItems() > 0);
	}
	
	/**
	 * isEmpty:
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return (getCommunityItems() == 0);
	}
	
	/**
	 * isFull:
	 * 
	 * @return
	 */
	public boolean isFull()
	{
		return (getCommunityItems() == getGraphSize());
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              FUNCTIONS                                   *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * addVertex - No-ARG Version:
	 */
	protected void addVertex()
	{
		//TODO
	}
	
	/**
	 * addVertex - 1-ARG Version:
	 * 
	 * @param v:
	 */
	protected void addVertex(Vertex v)
	{
		//TODO
	}
	
	
	/**
	 * copyToNew:
	 * 
	 * @return newArray[]:
	 */
 	protected Vertex[] copyToNew()
	{
		Vertex[] newArray = new Vertex[getGraphSize()];
		
		for (int i = 0; i < getGraphSize(); i++)
		{
			newArray[i] = getCommunity()[i];
		}
		
		return newArray;
	}
	
	/**
	 * copyToTemp:
	 * 
	 * @param temp[]:
	 * @return temp[]:
	 * @throws Exception 
	 */
	protected Vertex[] copyToTemp(Vertex[] temp) throws Exception
	{
		if (temp.length < getGraphSize())
		{
			for (int i = 0; i < temp.length; i++)
			{
				temp[i] = getCommunity()[i];
			}
		}
		else
		{
			for (int i = 0; i < getGraphSize(); i++)
			{
				temp[i] = getCommunity()[i];
			}
		}
		
		if (temp.length < getCommunityItems())
		{
			setCommunityItems(temp.length);
		}
		
		return temp;
	}
	
	/**
	 * removeVertex:
	 * 
	 * @param location:
	 */
	protected void removeVertex(int location)
	{
		//TODO
	}
	
	/**
	 * reset:
	 */
	protected void reset()
	{
		//TODO
	}
	
	/**
	 * sort:
	 */
	protected void sort()
	{
		//TODO
	}
}
