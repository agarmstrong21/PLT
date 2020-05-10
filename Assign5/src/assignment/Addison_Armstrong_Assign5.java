/**
 * 
 * @author Addison Armstrong
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
 * THIS ONE (i.e. the Assignment5.java file).
 * 
 * DO NOT USE ANYTHING THAT WE HAVE NOT TALKED ABOUT IN CLASS.  However, you 
 * are welcome to use any of the in built methods that are available given 
 * the imports that have been provided.  From example, you may use any of the
 * the String class in built methods.  Same goes for Random, Double, Char, etc.
 * 
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.
 */

/**

 Name of Project: Assignment5
 Name of Class: Addison_Armstrong_Assign5
 Author: Addison Armstrong
 Date Created: 5/6/2020
 Last Update: 5/7/2020
 Class Description: This class contains problems that are to be solved by the student.

 */

// Importing packages needed for this class.
package assignment;
import java.util.*;
import java.util.function.IntUnaryOperator;


public class Addison_Armstrong_Assign5 {
	/*
	 * Code needed for problems 2 and 4 and 5
	 *
	 * Code given, no need to comment
	 */
	private int elementValue;
	private ArrayList<Addison_Armstrong_Assign5> branches;
	public Addison_Armstrong_Assign5(int elementValue)
	{
		this.elementValue = elementValue;
		this.branches = new ArrayList<Addison_Armstrong_Assign5>();
	}
	public String toString()
	{
		return "old " + Integer.toString(elementValue);
	}
	
	
	/**
	 * Problem 1: 15 points
	 * 
	 * This method takes as input an ArrayList and removes every
	 * element from it that satisfies the following conditions
	 * 
	 * 1) the element is not the first in the ArrayList
	 * 2) the immediately preceding element in the starting 
	 * ArrayList is larger.
	 * 
	 * For example, suppose the ArrayList contains 5,25,2,3 (in 
	 * this order).  After calling this function the ArrayList
	 * should be 5,25,3.  Notice that 3 is NOT removed.  This
	 * is because the immediately preceding element of 3 is 2
	 * in the starting ArrayList.
	 * 
	 * You must use an iterator for this problem and may use
	 * no more than one loop.  In addition, you may NOT create
	 * a copy of the ArrayList in this method.  This includes 
	 * manually creating a copy and using in built java methods.
	 * 
	 * @param myArrayList
	 */
	public static void problem1(ArrayList<Integer> myArrayList)
	{
		// Create an iterator from the myArrayList
		Iterator<Integer> myArrayListIterator = myArrayList.iterator();

		// Because the first element in myArrayList cannot be removed, we will skip the first element in myArrayList
		//		and the iterator
		myArrayListIterator.next();

		// for loop that will examine the elements from the 2nd element to the last element
		for(int index = 2; index < myArrayList.size(); index++){

			// Get next element in the iterator to line up with myArrayList
			myArrayListIterator.next();

			// if the previous element in myArrayList is less than the current element then...
			if(myArrayList.get(index-1) < myArrayList.get(index)){
				// remove from the iterator and myArrayList
				myArrayListIterator.remove();

				// since we have removed the element, the index will be off, so to keep it lined up with the iterator,
				//		do index--  to cancel out the increment of the for loop
				index--;
			}
		}
	}
	
	
	/**
	 * Problem 2: 30 points
	 * 
	 * This method returns the max depth of the given 
	 * tree using RECURSION.  Failure to use recursion 
	 * will result in a zero.  For example, suppose the 
	 * tree is
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
	 * Then the max depth is 4 (4 branches are needed to 
	 * reach 6 from 0).
	 * 
	 * Hint: how many branches does an Assignment5 tree 
	 * have?
	 * 
	 * @param tree
	 * @return
	 */
	public static int problem2(Addison_Armstrong_Assign5 tree)
	{
		// if the tree's branches are of size 0, then...
		if(tree.branches.size() == 0){
			// return 0 and do nothing else
			return 0;
		}

		// initialize int maxDepth as 0
		int maxDepth = 0;

		// for loop from 0 to the branches size - 1
		for(int index = 0; index < tree.branches.size(); index++){
			// recursively call problem2 method to find the max depth of the given tree
			//		take the max of either the recursive call, or the current maxDepth
			maxDepth = Math.max(problem2(tree.branches.get(index)),maxDepth);
		}
		// return maxDepth +1 to account for each level that has been reached
		return maxDepth+1;
	}
	
	
	/**
	 * Problem 3: 20 points
	 * 
	 * This method takes as input an array of positive 
	 * ints, rounds each int in the array UP to the 
	 * nearest multiple of ten, removes each element
	 * greater than 100, and sums the result using
	 * ONLY streams.  You are NOT allowed to use any
	 * loops.  Moreover, your solution can contain
	 * AT MOST ONE semicolon (i.e. only one ;).Failure
	 * to follow these instructions will result in a 
	 * zero.
	 * 
	 * For example, suppose you are provided an array
	 * with the numbers 1,45,32,101,2.  
	 * 
	 * 1) first round up each element to the nearest 
	 * multiple of ten to get 10,50,40,110,10.
	 * 
	 * 2) remove each element greater than 100 to get
	 * 10,50,40,10.
	 * 
	 * 3) finally, sum and return the result which
	 * should be 110.
	 * 
	 * @param myArray
	 * @return
	 */
	public static int problem3(int[] myArray)
	{
		// as instructed above, use the stream method call to do the following in puesocode on one line
		/*
		1. round up each element in myArray by multiplying the current element by .1,
				getting the ceiling of that number,
				then multiplying it by 10 to account for rounding up to the nearest ten,
				then cast back to int

		2. Then filter out each element that is greater than 100, so
				if the current element is less than 101, which will account for 100
					then keep it,
				else,
					remove from array

		3. Sum all of the elements left in the array
		 */
		return Arrays.stream(myArray).map(input -> (int) (Math.ceil(input * .1)*10)).filter(input -> input < 101).sum();
	}
	
	
	/**
	 * Problem 4: 25 points
	 * 
	 * This method takes as input an Assignment5 tree and
	 * a lambda expression (for ints).  This method RECURSIVELY
	 * applies the lambda expression to each node in the tree 
	 * and returns the sum of all the results from applying the
	 * lambda expression.  Failure to use recursion will result
	 * in a zero.  For example, suppose the tree is
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
	 * and the lambda expression is input -> input * 2.  Then 
	 * the method should return (6 * 2) + (5 * 2) + (4 * 2) +
	 * (3 * 2) + (1 * 2) + (2 * 2) + (0 * 2) = 42.  If instead
	 * the lambda expression is input -> input - 1 the method
	 * should return (6 - 1) + (5 - 1) + (4 - 1) + (3 - 1) + 
	 * (1 - 1) + (2 - 1) + (0 - 1) = 14.
	 * 
	 * NOTE: applying the lambda expression should NOT change
	 * the elementValue of any of the Assignment5 objects.  In
	 * other words, don't save the results, just return the 
	 * summation (the tree should not change).
	 * 
	 * @param tree
	 * @param expression
	 * @return
	 */

	public static int problem4(Addison_Armstrong_Assign5 tree, IntUnaryOperator expression)
	{
		// Initialized int sum to be 0
		int sum = 0;
		// for loop from 0 to the tree's branch size -1
 		for(int index = 0; index < tree.branches.size(); index++){
 			// recursively call problem4 with the next branch from tree, with the same IntUnaryOperator expression
			sum += problem4(tree.branches.get(index), expression);
		}

 		// return the sum + the current tree's elementValue with the expression used on it
		return sum + expression.applyAsInt(tree.elementValue);
	}
	
	
	/**
	 * Problem 5: 10 points
	 * 
	 * This method returns an anonymous class object
	 * that extends Assignment5 with an overridden
	 * toString method that prints 
	 * "new " + Integer.toString(input) instead of
	 * "old " + Integer.toString(elementValue).
	 * 
	 * For example, if the input is 3 then the 
	 * Assignment5 object returned by this method
	 * should print "new 3" instead of "old 3". 
	 * In other words, this should print "old 2"
	 * 
	 * System.out.println((new Assignment5(2)).toString());
	 * 
	 * and this should print "new 3"
	 * 
	 * System.out.println(problem5(3).toString());
	 * 
	 * @param input
	 * @return
	 */
	public static Addison_Armstrong_Assign5 problem5(int input)
	{

		// Create a new anonymous class and object of that class that extends the Assignment5 class
		return new Addison_Armstrong_Assign5(input){

			// Override the toString method
			@Override
			public String toString() {
				// return the new toString format
				return "new " + input;
			}
		};
		// Lastly return it
	}
	
	
	public static void main(String[] args)
	{

		// Testing grounds, no need to comment.
		System.out.println("Problem 1:");
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		myArrayList.add(5);
		myArrayList.add(25);
		myArrayList.add(2);
		myArrayList.add(3);

		ArrayList<Integer> myArrayList2 = new ArrayList<Integer>();
		ArrayList<Integer> myArrayList3 = new ArrayList<Integer>();
		ArrayList<Integer> myArrayList4 = new ArrayList<Integer>();
		ArrayList<Integer> myArrayList5 = new ArrayList<Integer>();
		for(int i = 10; i > 0; i--){
			myArrayList2.add(i);
			myArrayList3.add(10-i);
			myArrayList4.add(-i);
			myArrayList5.add(i-10);
		}

		problem1(myArrayList);
		System.out.println(myArrayList.toString());
		problem1(myArrayList2);
		System.out.println(myArrayList2.toString());
		problem1(myArrayList3);
		System.out.println(myArrayList3.toString());
		problem1(myArrayList4);
		System.out.println(myArrayList4.toString());
		problem1(myArrayList5);
		System.out.println(myArrayList5.toString());

		System.out.println("Problem 2:");

		Addison_Armstrong_Assign5 myTree = new Addison_Armstrong_Assign5(0);
		myTree.branches.add(new Addison_Armstrong_Assign5(1));
		myTree.branches.add(new Addison_Armstrong_Assign5(2));
		myTree.branches.get(0).branches.add(new Addison_Armstrong_Assign5(3));
		myTree.branches.get(0).branches.get(0).branches.add(new Addison_Armstrong_Assign5(4));
		myTree.branches.get(0).branches.get(0).branches.add(new Addison_Armstrong_Assign5(5));
		myTree.branches.get(0).branches.get(0).branches.get(1).branches.add(new Addison_Armstrong_Assign5(6));

		System.out.println(problem2(myTree));

		Addison_Armstrong_Assign5 myTree2 = new Addison_Armstrong_Assign5(0);

		System.out.println(problem2(myTree2));

		Addison_Armstrong_Assign5 myTree3 = new Addison_Armstrong_Assign5(0);
		myTree3.branches.add(new Addison_Armstrong_Assign5(1));
		myTree3.branches.add(new Addison_Armstrong_Assign5(2));
		myTree3.branches.add(new Addison_Armstrong_Assign5(3));
		myTree3.branches.add(new Addison_Armstrong_Assign5(4));
		myTree3.branches.add(new Addison_Armstrong_Assign5(5));

		System.out.println(problem2(myTree3));

		Addison_Armstrong_Assign5 myTree4 = new Addison_Armstrong_Assign5(0);
		myTree4.branches.add(new Addison_Armstrong_Assign5(1));
		myTree4.branches.get(0).branches.add(new Addison_Armstrong_Assign5(2));
		myTree4.branches.get(0).branches.get(0).branches.add(new Addison_Armstrong_Assign5(3));
		myTree4.branches.get(0).branches.get(0).branches.get(0).branches.add(new Addison_Armstrong_Assign5(4));
		myTree4.branches.get(0).branches.get(0).branches.get(0).branches.get(0).branches.add(new Addison_Armstrong_Assign5(5));

		Addison_Armstrong_Assign5 myTree5 = new Addison_Armstrong_Assign5(0);
		myTree5.branches.add(new Addison_Armstrong_Assign5(-1));
		myTree5.branches.add(new Addison_Armstrong_Assign5(-2));
		myTree5.branches.add(new Addison_Armstrong_Assign5(-3));
		myTree5.branches.add(new Addison_Armstrong_Assign5(-4));
		myTree5.branches.add(new Addison_Armstrong_Assign5(-5));

		System.out.println(problem2(myTree3));

		Addison_Armstrong_Assign5 myTree6 = new Addison_Armstrong_Assign5(0);
		myTree6.branches.add(new Addison_Armstrong_Assign5(-1));
		myTree6.branches.get(0).branches.add(new Addison_Armstrong_Assign5(-2));
		myTree6.branches.get(0).branches.get(0).branches.add(new Addison_Armstrong_Assign5(-3));
		myTree6.branches.get(0).branches.get(0).branches.get(0).branches.add(new Addison_Armstrong_Assign5(-4));
		myTree6.branches.get(0).branches.get(0).branches.get(0).branches.get(0).branches.add(new Addison_Armstrong_Assign5(-5));

		System.out.println(problem2(myTree4));

		System.out.println("Problem 3:");
		int[] myArray = {1,45,32,101,2};
		int[] myArray2 = {101,210,300,1,6,7,10,11,99};
		int[] myArray3 = {};
		int[] myArray4 = {1};
		int[] myArray5 = {100};

		System.out.println(problem3(myArray));
		System.out.println(problem3(myArray2));
		System.out.println(problem3(myArray3));
		System.out.println(problem3(myArray4));
		System.out.println(problem3(myArray5));


		System.out.println("Problem 4:");

		System.out.println(problem4(myTree, input -> input * 2));
		System.out.println(problem4(myTree, input -> input - 1));
		System.out.println(problem4(myTree2, input -> input * 2));
		System.out.println(problem4(myTree2, input -> input - 1));
		System.out.println(problem4(myTree3, input -> input * 2));
		System.out.println(problem4(myTree3, input -> input - 1));
		System.out.println(problem4(myTree4, input -> input * 2));
		System.out.println(problem4(myTree4, input -> input - 1));
		System.out.println(problem4(myTree5, input -> input * 2));
		System.out.println(problem4(myTree5, input -> input - 1));
		System.out.println(problem4(myTree6, input -> input * 2));
		System.out.println(problem4(myTree6, input -> input - 1));

		System.out.println("Problem 5:");
		System.out.println(new Addison_Armstrong_Assign5(2).toString());
		System.out.println(problem5(3).toString());

	}


}
