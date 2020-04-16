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


package assignment;


public class DoubleLinkedListElement {
	
	/**
	 *  reference to the parent list of this double linked list element
	 */
	public DoubleLinkedList parentList;
	
	/** 
	 * reference to the previous element in the list
	 *
	 * NOTE: if this element is the first in the list, then the previous
	 * element is null
	 */ 
	public DoubleLinkedListElement prevElement;
	
	/** 
	 * reference to the next element in the list
	 *
	 * NOTE: if this element is the last in the list, then the next
	 * element is null
	 */
	public DoubleLinkedListElement nextElement;
	
	/**
	 * value stored by the list element.  To keep things simple, we use
	 * an int instead of a more general Object type (we'll talk about 
	 * this in more detail in the coming weeks).
	 */
	public int elementValue;
	
	/**
	 * Constructor for double linked list element.
	 * 
	 * NOTE: does not add the created element to a list, that's what
	 * you are going to have to do in the DoubleLinkedList Class!
	 */
	public DoubleLinkedListElement(int elementValue)
	{
		// set the parent to be null
		this.parentList = null;
		
		// set the prev element to be null
		this.prevElement = null;
		
		// set the next element to be null
		this.nextElement = null;
		
		// set the value stored in the list element
		this.elementValue = elementValue;
	}

}
