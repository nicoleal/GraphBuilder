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
	protected void setName(int name)
	{
		this.name = name;
	}
		
	/**
	* setMaxDegree: 
	* 
	* @param maxDegree:
	*/
	protected void setMaxDegree(int maxDegree)
	{
		this.maxDegree = maxDegree;
	}	
	
	/**
	* setCurrDegree: 
	* 
	* @param currDegree:
	* @throws Exception 
	*/
	protected void setCurrDegree(int currDegree) throws Exception
	{
		if (canAddNeighbors())
		{
			this.currDegree = currDegree;
		}
		else
		{
			throw new Exception("This vertex is already at its max degree");
		}
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
		return (getCurrDegree() < getMaxDegree());
	}
	
	/**
	* hasNeighbors: 
	* 
	* @return 
	*/
	public boolean hasNeighbors()
	{
		return (getCurrDegree() >= 1);
	}
	
	/**
	 * hasName:
	 * 
	 * @return
	 */
	public boolean hasName()
	{
		return (getName() >= 0);
	}
	
	/**
	* isLeaf: 
	* 
	* @return 
	*/
	public boolean isLeaf()
	{
		return (getCurrDegree() == 1);
	}
		
	
	/****************************************************************************
	 *                                                                          *
	 *                              FUNCTIONS                                   *
	 *                                                                          *
	 ****************************************************************************/
		
	/**
	* makeLeaf:  
	 * @throws Exception 
	*/
	protected void makeLeaf() throws Exception
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
	 * @throws Exception 
	*/
	protected void reset() throws Exception
	{
		setMaxDegree(DEFAULT_MAX_DEGREE);
		setCurrDegree(DEFAULT_CURR_DEGREE);
	}
	
}
