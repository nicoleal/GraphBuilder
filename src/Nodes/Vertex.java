package Nodes;

/**
 * Vertex Class
 * 
 * 		Vertices are a fundamental unit from which graphs are formed. They are 
 * 		featureless and indivisible objects. Two vertices may serve as the end 
 * 		points of an edge. Two vertices are adjacent if an edge connects them.
 * 		The neighborhood of a graph is all the vertices adjacent to a vertex. 
 * 
 * @author Nicole Loew
 * @version 05 August 2016
 */

public class Vertex
{
	public static final int DEFAULT_NAME = -1;
	public static final int DEFAULT_MAX_DEGREE = 20;
	public static final int DEFAULT_CURR_DEGREE = 0;
	
	private int name;			// The unique identifier for the vertex
	private int maxDegree;		// The maximum number of edges which can extend from the vertex
	private int currDegree;		// The current number of edges actually extending from the vertex
	
	
	/****************************************************************************
	 *                                                                          *
	 *                              CONSTRUCTORS                                *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * NO-ARG Constructor
	 */
	public Vertex()
	{
		name = DEFAULT_NAME;
		maxDegree = DEFAULT_MAX_DEGREE;
		currDegree = DEFAULT_CURR_DEGREE;
	}
	
	/**
	 * 1-ARG Constructor
	 * 
	 * @param name: 
	 */
	public Vertex(int name)
	{
		this.name = name;
		maxDegree = DEFAULT_MAX_DEGREE;
		currDegree = DEFAULT_CURR_DEGREE;
	}
	
	/**
	 * 2-ARG Constructor
	 * 
	 * @param name:
	 * @param maxDegree:
	 */
	public Vertex(int name, int maxDegree)
	{
		this.name = name;
		this.maxDegree = maxDegree;
		currDegree = DEFAULT_CURR_DEGREE;
	}
	
	/**
	 * 2-ARG Constructor
	 * 
	 * @param name:
	 * @param maxDegree:
	 * @param currDegree:
	 */
	public Vertex(int name, int maxDegree, int currDegree)
	{
		this.name = name;
		this.maxDegree = maxDegree;
		this.currDegree = currDegree;
	}
	
	
	/****************************************************************************
	 *                                                                          *
	 *                              GETTERS                                     *
	 *                                                                          *
	 ****************************************************************************/
		
	/**
	* getName: 
	* 
	* @return name:
	*/
	public int getName()
	{
		return name;
	}
		
	/**
	* getMaxDegree: 
	* 
	* @return maxDegree:
	*/
	public int getMaxDegree()
	{
		return maxDegree;
	}	
	
	/**
	* getCurrDegree: 
	* 
	* @return currDegree:
	*/
	public int getCurrDegree()
	{
		return currDegree;
	}

	/****************************************************************************
	 *                                                                          *
	 *                              SETTERS                                     *
	 *                                                                          *
	 ****************************************************************************/
		
	/**
	* setName: 
	* 
	* @param name:
	*/
	private void setName(int name)
	{
		this.name = name;
	}
		
	/**
	* setMaxDegree: 
	* 
	* @param maxDegree:
	*/
	private void setMaxDegree(int maxDegree)
	{
		this.maxDegree = maxDegree;
	}	
	
	/**
	* setCurrDegree: 
	* 
	* @param currDegree:
	*/
	private void setCurrDegree(int currDegree)
	{
		this.currDegree = currDegree;
	}
	
	
	/****************************************************************************
	 *                                                                          *
	 *                              BOOLEAN                                     *
	 *                                                                          *
	 ****************************************************************************/
		
	/**
	* canAddNeighbors: 
	* 
	* @return 
	*/
	public boolean canAddNeighbors()
	{
		return (currDegree != maxDegree);
	}
	
	/**
	* hasNeighbors: 
	* 
	* @return 
	*/
	public boolean hasNeighbors()
	{
		return (currDegree >= 1);
	}
	
	/**
	 * hasName:
	 * 
	 * @return
	 */
	public boolean hasName()
	{
		return (name >= 0);
	}
	
	/**
	* isLeaf: 
	* 
	* @return 
	*/
	public boolean isLeaf()
	{
		return (currDegree == 1);
	}
		
	
	/****************************************************************************
	 *                                                                          *
	 *                              FUNCTIONS                                   *
	 *                                                                          *
	 ****************************************************************************/
		
	/**
	* makeLeaf:  
	*/
	protected void makeLeaf()
	{
		setMaxDegree(1);
		setCurrDegree(1);
	}
	
	/**
	* rename:  
	* 
	* @param
	*/
	protected void rename(int name)
	{
		setName(name);
	}
	
	/**
	* reset:  
	*/
	protected void reset()
	{
		setMaxDegree(DEFAULT_MAX_DEGREE);
		setCurrDegree(DEFAULT_CURR_DEGREE);
	}
	
}
