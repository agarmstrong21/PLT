package assignment;
/**
 * 
 * @author Ryan Brummet
 * 
 * Instructions:
 * None.  This is a supplemental class used for the assignment.
 * There is nothing that you need to do here.  However, you  will
 * need to use objects of this class.
 * 
 * NOTE: do not change anything in this class!
 */


public class Tree {

	public Tree left;

	public Tree right;

	public int elementValue;
	
	public Tree(int elementValue)
	{
		this.elementValue = elementValue;
		this.left = null;
		this.right = null;
	}

}
