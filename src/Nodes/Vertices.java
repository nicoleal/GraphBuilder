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
	 */
	protected void setCommunityItems(int communityItems)
	{
		this.communityItems = communityItems;
	}
	
	/**
	 * setGraphSize:
	 * 
	 * @param graphSize:
	 */
	protected void setGraphSize(int graphSize)
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
	 * fullCommunity:
	 * 
	 * @return
	 */
	public boolean fullCommunity()
	{
		return (getCommunityItems() == getGraphSize());
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              FUNCTIONS                                   *
	 *                                                                          *
	 ****************************************************************************/
	
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
	 */
	protected Vertex[] copyToTemp(Vertex[] temp)
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
}
