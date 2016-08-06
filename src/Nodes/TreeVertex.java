package Nodes;
/**
 * 
 */

public class TreeVertex extends Vertex
{
	public static final int DEFAULT_DEPTH = 0;
	public static final int DEFAULT_PARENT = 0;
	
	private int depth;			// The depth of the vertex
	private int parent;			// The parent of the vertex
	
	/******************************************************************************
	 *                                                                            *
	 *                              Constructors                                  *
	 *                                                                            *
	 ******************************************************************************/
	
	/**
	 * NO-ARG Constructor:
	 */
	public TreeVertex()
	{
		super();
		depth = DEFAULT_DEPTH;
		parent = DEFAULT_PARENT;
	}
	
	/**
	 * 1-ARG Constructor:
	 * 
	 * @param name:
	 */
	public TreeVertex(int name)
	{
		super(name);
		depth = DEFAULT_DEPTH;
		parent = DEFAULT_PARENT;
	}
	
	/**
	 * 2-ARG Constructor:
	 * 
	 * @param name:
	 * @param maxDegree:
	 */
	public TreeVertex(int name, int maxDegree)
	{
		super(name, maxDegree);
		depth = DEFAULT_DEPTH;
		parent = DEFAULT_PARENT;
	}
	
	/**
	 * 3-ARG Constructor:
	 * 
	 * @param name:
	 * @param maxDegree:
	 * @param currDegree:
	 */
	public TreeVertex(int name, int maxDegree, int currDegree)
	{
		super(name, maxDegree, currDegree);
		depth = DEFAULT_DEPTH;
		parent = DEFAULT_PARENT;
	}
	
	/**
	 * 4-ARG Constructor:
	 * 
	 * @param name:
	 * @param maxDegree:
	 * @param currDegree:
	 * @param parent:
	 */
	public TreeVertex(int name, int maxDegree, int currDegree, int parent)
	{
		super(name, maxDegree, currDegree);
		this.parent = parent;
		//depth = getDepth() + 1;
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              GETTERS                                     *
	 *                                                                          *
	 ****************************************************************************/
		
	/**
	 * getDepth:
	 * 
	 * @return depth:
	 */
	public int getDepth()
	{
		return depth;
	}
	
	/**
	 * getParent:
	 * 
	 * @return parent:
	 */
	public int getParent()
	{
		return parent;
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              SETTERS                                     *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * setDepth:
	 * 
	 * @param depth:
	 */
	public void setDepth(int depth)
	{
		this.depth = depth;
	}

	/**
	 * setParent:
	 * 
	 * @param parent:
	 */
	public void setParent(int parent)
	{
		this.parent = parent;
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              BOOLEAN                                     *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * hasParent:
	 * 
	 * @return:
	 */
	public boolean hasParent()
	{
		return (parent >= 0);
	}
	
	/**
	 * isRoot:
	 * 
	 * @return:
	 */
	public boolean isRoot()
	{
		return (parent == 0);
	}
	
	/****************************************************************************
	 *                                                                          *
	 *                              FUNCTIONS                                   *
	 *                                                                          *
	 ****************************************************************************/
	
	/**
	 * makeRoot:
	 */
	public void makeRoot()
	{
		setParent(DEFAULT_PARENT);
		setDepth(DEFAULT_DEPTH);
	}
}