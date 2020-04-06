/**
 * 
 * @author YOUR NAME GOES HERE
 * 
 * Instructions:
 * Finish each of the methods such that each satisfies the instructions
 * given for each.  This is an individual assignment, do not work with
 * others.  Each question will be graded individually using an autograder.
 * Code that does not compile will be given a zero.  The use of poor 
 * variable names and/or lack of useful and descriptive comments in your
 * code will result in a penalty of 50% (penalty is applied per question,
 * not for the whole assignment).  Do not import anything except what is 
 * given to you for each assignment.  Finally, do not add additional methods.
 * 
 * ALL SUBMISSION FILES MUST HAVE THE FOLLOWING NAMING SCHEME WHEN SUBMITTED
 * TO ICON: firstName-lastName-Assign#.java.  SUBMISSIONS WITH THE WRONG 
 * NAMING SCHEME WILL NOT BE GRADED.  THE ONLY FILE YOU NEED TO TURN IN IS
 * THIS ONE (i.e. the DoubleLinkedList.java file).
 * 
 * DO NOT USE ANYTHING THAT WE HAVE NOT TALKED ABOUT IN CLASS.  However, you 
 * are welcome to use any of the in built methods that are available given 
 * the imports that have been provided.  From example, you may use any of the
 * the String class in built methods.  Same goes for Random, Double, Char, etc.
 * 
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.
 */


package assignment;
import assignment.DoubleLinkedListElement;


public class DoubleLinkedList {
	
	// In a double linked list each element in the list
	// holds a reference to the prev and next elements 
	// in the list.  A few notes:
	//
	// 1) if an element is the first in a list, its prev
	//    element will be null.
	// 
	// 2) if an element is the last in a list, its next
	//    element will be null.
	//
	// An example list to make things a bit clearer
	//
	// Suppose we have a list of integers: 1,2,3,4,5.
	// The headElement is the DoubleLinkedListElement
	// that contains 1 and the tailElement is the
	// DoubleLinkedListElement that contains 5.  The
	// nextElement of the headElement is the 
	// DoubleLinkedListElement that contains 2 and
	// the prevElement of the headElement is null.
	// The prevElement of the tailElement is the
	// DoubleLinkedListElement that contains 4 and the
	// nextElement of the tailElement is null.  Suppose
	// instead that there is only one element in the
	// list instead of 1,2,3,4,5.  In this case
	// the headElement and tailElement will be the same
	// DoubleLinkedListElement.  The nextElement and
	// prevElement of this DoubleLinkedListElement will
	// both be null.  Finally, just to make sure that
	// it is completely clear, the two lists given above
	// give the values that are in each element in the
	// list.  Specifically, each list consists of
	// DoubleLinkedListElements each of which have int 
	// values (e.g. 1,2,etc).
	
	// first element in the double linked list
	public DoubleLinkedListElement headElement;
	
	// last element in the double linked list
	public DoubleLinkedListElement tailElement;
	
	/**
	 * Constructor for DoubleLinkedList
	 */
	public DoubleLinkedList()
	{
		// set the head to be null
		this.headElement = null;
		
		// set the tail to be null
		this.tailElement = null;
	}
	
	
	/**
	 * Problem 1: 15 points
	 * 
	 * This method inserts the given element to the end of the 
	 * list (the list is the "this" element).
	 * 
	 * HINT: make sure that all fields of both the list and list
	 * element are correct.
	 * 
	 * @param newElement
	 */
	public void insertTailElement(DoubleLinkedListElement newElement)
	{

	}
	
	
	/**
	 * Problem 2: 15 points
	 * 
	 * This method inserts the given element to the head of the 
	 * list (the list is the "this" element).
	 * 
	 * HINT: make sure that all fields of both the list and list
	 * element are correct.
	 * 
	 * @param newElement
	 */
	public void insertHeadElement(DoubleLinkedListElement newElement)
	{

	}
	
	
	/**
	 * Problem 3: 40 points
	 * 
	 * Replaces the firstElement with the secondElement and the secondElement with the firstElement.
	 * For example, suppose we have the list 1,2,3,4.  If 2 is the firstElement and 3 is the 
	 * secondElement the list will be 1,3,2,4 after calling this method.
	 * 
	 * NOTE: assume that both are in the same list and that list is the "this" list.  Also assume
	 * that the nextElement of the firstElement is the secondElement and that the prevElement of
	 * the secondElement is the firstElement (i.e. the element are "next" to each other in the list
	 * with the firstElement ordered first).
	 * 
	 * HINT: this problem is very tricky.  I would suggest you work out the steps on a piece of
	 * paper before attempting it.  
	 * 
	 * @param firstElement
	 * @param secondElement
	 */
	public void swapElements(DoubleLinkedListElement firstElement, DoubleLinkedListElement secondElement)
	{

	}
	
	
	/**
	 * Problem 4: 30 points
	 * 
	 * Sorts the given list in ascending order if ascending is true, in descending order if false.
	 * For example, suppose the list is 2,3,1,5.  If this method is called with ascending true the
	 * list will be 1,2,3,5 at the end.  If this method is called with ascending false the list
	 * will be 5,3,2,1 at the end.
	 * 
	 * NOTE: you may use the swapElements method to help you with this problem (and I would suggest
	 * that you use it).
	 * 
	 * HINT: make sure that all fields of both the list and list elements are correct.
	 * 
	 * @param ascending
	 */
	public void sortList(boolean ascending)
	{

	}
	
	
	/**
	 * This is a method to help test your solutions.  If printReverse is true the list
	 * values are printed in reverse order starting at the tail.  If printReverse is 
	 * false list values are printed in forward order starting at the head.
	 * 
	 * @param printReverse
	 */
	public void printList(boolean printReverse)
	{
		if(printReverse)
		{
			DoubleLinkedListElement currentElement = this.tailElement;
			while(currentElement != null)
			{
				// this should really use a fence post approach, but this is good enough
				System.out.print(Integer.toString(currentElement.elementValue) + " ");
				currentElement = currentElement.prevElement;
			}
		}
		else
		{
			DoubleLinkedListElement currentElement = this.headElement;
			while(currentElement != null)
			{
				// this should really use a fence post approach, but this is good enough
				System.out.print(Integer.toString(currentElement.elementValue) + " ");
				currentElement = currentElement.nextElement;
			}
		}
		System.out.println();
	}
	

	public static void main(String[] args) 
	{
		// build example list
		DoubleLinkedList myList = new DoubleLinkedList();
		myList.insertTailElement(new DoubleLinkedListElement(3));
		myList.insertTailElement(new DoubleLinkedListElement(2));
		myList.insertTailElement(new DoubleLinkedListElement(6));
		myList.insertHeadElement(new DoubleLinkedListElement(1));
		myList.insertHeadElement(new DoubleLinkedListElement(4));
		myList.insertHeadElement(new DoubleLinkedListElement(5));
		
		// test that the print method is working correctly
		System.out.println("Insert Test");
		myList.printList(false);  // should be 5 4 1 3 2 6, makes sure nextElements are correct
		myList.printList(true);   // should be 6 2 3 1 4 5, makes sure prevElements are correct
		
		// test that the sorting method works (which uses the swap method so we don't test swap)
		System.out.println("\nSort Ascending Test");
		myList.sortList(true);
		myList.printList(false);
		myList.printList(true);
		System.out.println("\nSort Descending Test");
		myList.sortList(false);
		myList.printList(false);
		myList.printList(true);
	}
}

