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
 * THIS ONE (i.e. the Assignment4.java file).
 * 
 * DO NOT USE ANYTHING THAT WE HAVE NOT TALKED ABOUT IN CLASS.  However, you 
 * are welcome to use any of the in built methods that are available given 
 * the imports that have been provided.  From example, you may use any of the
 * the String class in built methods.  Same goes for Random, Double, Char, etc.
 * 
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.
 */


package assignment;
import java.util.*;
import assignment.Tree;

public class Assignment4 
{
	
	// you will need this field and constructor for problems 4, 5, and 6
	private int assignmentValue;
	public Assignment4(int assignmentValue)
	{
		this.assignmentValue = assignmentValue;
	}
	

	/**
	 * Problem 1: 15 points
	 * 
	 * This method calculates the factorial of the given
	 * number using RECURSION.  Failure to use recursion
	 * will result in a zero.
	 * 
	 * NOTE: you may assume that number >= 1.
	 * 
	 * NOTE: the factorial of a number is the product
	 * of all numbers between 1 and that number.  For 
	 * example, if number = 9, the factorial of number
	 * would be 1*2*3*4*5*6*7*8*9.
	 * 
	 * @param num
	 * @return
	 */
	public static int problem1(int number)
	{
		return -1;
	}
	
	
	/**
	 * Problem 2: 20 points
	 * 
	 * This method calculates the sum of all elementValue
	 * in the tree using RECURSION.  Failure to use recursion
	 * will result in a zero.
	 * 
	 * For example, suppose the tree is
	 *  
	 *            0
	 *           / \
	 *          1   2
	 *         /
	 *        3
	 *       / \
	 *      4   5
	 *           \
	 *            6
	 *            
	 * Then the summation would be 21.  
	 * 
	 * NOTE: you may assume that the input tree is NOT null.
	 * 
	 * HINT: I went over a similar example in one of the
	 * lessons.
	 * 
	 * @param myTree
	 * @return
	 */
	public static int problem2(Tree myTree)
	{
		return -1;
	}
	
	
	/**
	 * Problem 3: 25 points
	 * 
	 * This method takes as input an arraylist of integers
	 * sorted in ascending order and returns true if the
	 * given value is in the arraylist using RECURSIVE binary
	 * search.  If the value is not in the arraylist this
	 * method will return false.  Failure to use recursion
	 * will result in a zero.
	 * 
	 * Binary search works by repeatedly splitting the list
	 * and checking if each subsection has the element.
	 * For example, suppose the arraylist is 1,2,3,4,5,6,7.
	 * Binary search would then create two array lists
	 * containing 1,2,3 in the first and 4,5,6,7 in the
	 * second.  Binary search would then be called on 
	 * both of these arraylists.  This procedure continues
	 * until an arraylist of size 1 is found.  This value
	 * is then compared against the value.  If they match,
	 * the method returns true, else false.  This result
	 * then should be "passed" back up the recursive calls
	 * to the method and returned.  
     *
	 * NOTE: feel free to improve the efficiency of your
	 * version of recursive binary search (the version I
	 * describe above isn't necessarily the most efficient).
	 * As long as the code you actually write implements 
	 * some version of recursive binary search your approach
	 * will be graded.
	 * 
	 * @param arrayList
	 * @return
	 */
	public static boolean problem3(ArrayList<Integer> arrayList, int value)
	{
		return false;	
	}
	
	
	/**
	 * Problem 4: 5 points
	 * 
	 * This function adds 1 to the assignmentValue of each
	 * Assignment4 object in the given HashSet.
	 * 
	 * @param assignObj
	 */
	public static void problem4(HashSet<Assignment4> hashSet)
	{

	}
	
	/**
	 * Problem 5: 15 points
	 * 
	 * Override the equals method so that it returns true
	 * if the this.assignmentValue and passed object.assignmentValue
	 * are either both even or both odd.  
	 * 
	 * NOTE: you will need to manually add the override
	 * yourself (this should go without saying but the method name will
	 * not be problem5).
	 */
	
	
	/**
	 * Problem 6: 20 points
	 * 
	 * Implement the Comparison interface (i.e. Comparable<Assignment4>).
	 * To successfully solve this problem you will need to both implement
	 * the interface and define all the methods of the interface.  Your 
	 * implementation is to follow the following rules:
	 * 
	 * 1)
	 * If this.assignmentValue and obj.assignmentValue are both even then
	 * this.assignmentValue should come before obj.assignmentValue if 
	 * this.assignmentValue is smaller than obj.assignmentValue. If instead
	 * this.assignmentValue is larger, it should come after 
	 * obj.assignmentValue
	 * 
	 * 2) 
	 * If this.assignmentValue and obj.assignmentValue are both odd then
	 * this.assignmentValue should come after obj.assignmentValue if 
	 * this.assignmentValue is smaller than obj.assignmentValue. If instead
	 * this.assignmentValue is larger, it should come before 
	 * obj.assignmentValue
	 * 
	 * 3)
	 * If this.assignmentValue and obj.assignmentValue are not both even nor
	 * odd, then the value that is even should come first.
	 * 
	 * 
	 * For example suppose you have an arraylist with the numbers
	 * 0,1,2,3,4,5,6,7,8,9.  Then after you sort the arraylist with
	 * Collections.sort you should have 0,2,4,6,8,9,7,5,3,1
	 * 
	 * NOTE: you will need to manually implement the interface and add
	 * all needed methods.
	 * 
	 * HINT: I go through an example in one of the lectures.
	 */
	
	
	
	public static void main(String[] args)
	{
		
	}
	
	
}
