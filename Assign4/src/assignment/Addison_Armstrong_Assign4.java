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
 * THIS ONE (i.e. the Assignment4.java file).
 * 
 * DO NOT USE ANYTHING THAT WE HAVE NOT TALKED ABOUT IN CLASS.  However, you 
 * are welcome to use any of the in built methods that are available given 
 * the imports that have been provided.  From example, you may use any of the
 * the String class in built methods.  Same goes for Random, Double, Char, etc.
 * 
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.
 */

/**

Name of Project: Assignment4
Name of Class: Addison_Armstrong_Assign4
Author: Addison Armstrong
Date Created: 4/25/2020
Last Update: 4/27/2020
Class Description: This class contains problems that are to be solved by the student.

 */

// Importing important and useful tools for this class
package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

// Assigment4 class which implements the Comparable<Object> class to use Java's built in sorting algorithms
public class Addison_Armstrong_Assign4 implements Comparable<Object>
{

	// you will need this field and constructor for problems 4, 5, and 6
	private int assignmentValue;
	public Addison_Armstrong_Assign4(int assignmentValue)
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
	 * @param number
	 * @return
	 */
	public static int problem1(int number)
	{
		// If the number that is passed in is greater than one, then...
		if(number > 1){
			// Take number and multiply it by a recursion of the next number down. Or number-1
			number = number * problem1((number-1));
		}
		// If the number is equal to one, then it will return the number to climb back up the recursive tree
		return number;
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
		// Initialing total off the bat with 0
		int total = 0;

		// if the left node of the tree is present, or not null, then...
		if(myTree.left != null){
			// Add the elementValue of that node to the total, and go into that node via recursion. Adding whatever
			// 		is outputted from the recursion
			total += myTree.left.elementValue;
			total += problem2(myTree.left);
		}

		// if the right node of the tree is present, or not null, then...
		if(myTree.right != null){
			// Add the elementValue of that node to the total, and go into that node via recursion. Adding whatever
			// 		is outputted from the recursion
			total += myTree.right.elementValue;
			total += problem2(myTree.right);
		}

		// Return the total of the tree
		return total;
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
		// Initializing the boolean found to false until later proven otherwise
		boolean found = false;

		// if the passed in arrayList is of size 1, then check the value of that arrayList and compare it to the passed
		//		in value value, if true, return tree, if false, return false.
		if(arrayList.size() == 1){
			return (value==arrayList.get(0));
		}

		// else, if the size of the arrayList if greater than 1, then...
		else{
			// initialize the placeHolder, or middle spot of the arrayList, later used to split the arrayList
			int placeHolder = arrayList.size()/2;

			// Creating the first half of the arrayList
			ArrayList<Integer> firstHalf = new ArrayList<Integer>();

			// Creating the second half of the arrayList
			ArrayList<Integer> secondHalf = new ArrayList<Integer>();

			// Adding the correct values to each new half of the arrayList
			for(int index = 0; index < arrayList.size(); index++){
				if(index >= placeHolder){
					secondHalf.add(arrayList.get(index));
				}else{
					firstHalf.add(arrayList.get(index));
				}
			}

			// Recursively call with the firstHalf, and the passed in value value, until the binary search is conducted
			found = problem3(firstHalf, value);

			// if found turns to be true, then return true to avoid checking the rest of the arrayList
			if(found) {
				return found;
			}

			// Recursively call with the secondHalf, and the passed in value value, until the binary search is conducted
			found = problem3(secondHalf, value);
		}

		// Lastly, return found
		return found;
	}
	
	
	/**
	 * Problem 4: 5 points
	 * 
	 * This function adds 1 to the assignmentValue of each
	 * Assignment4 object in the given HashSet.
	 * 
	 * @param hashSet
	 */
	public static void problem4(HashSet<Addison_Armstrong_Assign4> hashSet)
	{

		// Create and initialize an Iterator of Assignment4, myIter, from the HashSet, hashSet.
		Iterator<Addison_Armstrong_Assign4> myIter = hashSet.iterator();

		// While myIter has a next, then...
		while(myIter.hasNext()){
			// Initialize myAssign to be the next myIter in the Iteration
			Addison_Armstrong_Assign4 myAssign = myIter.next();

			// Add one to the int assignmentValue of that object
			myAssign.assignmentValue++;
		}
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

	// Overriding the .equals() method of Assignment4 to set the method up a different way. This method only takes in
	//		Object as its pass in, so the pass in value will be an Object called myObj
	@Override
	public boolean equals(Object myObj){
		// Casting myObj to an Assigment4 object
		Addison_Armstrong_Assign4 object = (Addison_Armstrong_Assign4) myObj;

		// Taking the modulo of both this and object, if they equal, return true, if not, return false.
		return (this.assignmentValue%2 == object.assignmentValue%2);
	}
	
	
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
	 * this and obj are even,
	 * 		if this < obj then this comes first
	 * 		if this > obj then this comes after
	 * 
	 * 2) 
	 * If this.assignmentValue and obj.assignmentValue are both odd then
	 * this.assignmentValue should come after obj.assignmentValue if 
	 * this.assignmentValue is smaller than obj.assignmentValue. If instead
	 * this.assignmentValue is larger, it should come before 
	 * obj.assignmentValue
	 *
	 * this and obj are odd,
	 * 		if this < obj then this comes after
	 * 		if this > obj then this comes before
	 * 
	 * 3)
	 * If this.assignmentValue and obj.assignmentValue are not both even nor
	 * odd, then the value that is even should come first.
	 *
	 * this and obj are even and odd,
	 * 		if this is even, this comes first
	 * 		if obj is even, obj comes first
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


	// Just like the above problem, this is the Overridden method .compareTo() to a different way. The passed in value
	//		will only be an Objects to line up with how the description is told. (like this.assignmentValue,
	//		object.assignmentValue) Cannot be a passed in value of Assignment4, because then that will not be overriding
	//		any methods.
	@Override
	public int compareTo(Object value){

		// Casting value to Assignment4 and declaring it as myObj
		Addison_Armstrong_Assign4 myObj = (Addison_Armstrong_Assign4) value;

		//if this and myObj are equal using .equals()
		if(this.equals(myObj)){

			//if this and obj are even,
			//		if this < obj then this comes first
			// 		if this > obj then this comes after
			//		else, do nothing
			if(this.assignmentValue%2 == 0){
				if(this.assignmentValue < myObj.assignmentValue){
					return -1;
				}else if(this.assignmentValue > myObj.assignmentValue){
					return 1;
				}else{
					return 0;
				}
			}

			//if this and obj are odd,
			//		if this < obj then this comes after
			// 		if this > obj then this comes before
			// 		else, do nothing

			else if(this.assignmentValue%2 == 1){
				if(this.assignmentValue < myObj.assignmentValue){
					return 1;
				}else if(this.assignmentValue > myObj.assignmentValue){
					return -1;
				}else{
					return 0;
				}
			}
		}
		// else this and obj are even and odd,
		// 		if this is even, this comes first
		//		if obj is even, obj comes first
		else{
			if(this.assignmentValue%2 == 0){
				return -1;
			}
		}
		return 1;
	}
	
	
	public static void main(String[] args)
	{

		// Testing grounds, no need to comment.
		// Problem 1
		System.out.println(problem1(5));


		// Problem 2
		Tree myTree = new Tree(0);
		myTree.right = new Tree(2);
		myTree.left = new Tree(1);
		myTree.left.left = new Tree(3);
		myTree.left.left.left = new Tree(4);
		myTree.left.left.right = new Tree(5);
		myTree.left.left.right.right = new Tree(6);

		System.out.println(problem2(myTree));


		// Problem 3
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 1; i < 101; i++){
			arrayList.add(i);
		}

		System.out.println(problem3(arrayList, 690));

		//Problem 4
		HashSet<Addison_Armstrong_Assign4> myHashSet = new HashSet<Addison_Armstrong_Assign4>();
		for(int index = 0; index < 10; index++){
			myHashSet.add(new Addison_Armstrong_Assign4(index));
		}
		Iterator<Addison_Armstrong_Assign4> myIter = myHashSet.iterator();
		while(myIter.hasNext()){
			Addison_Armstrong_Assign4 myAssign = myIter.next();
			System.out.print(myAssign.assignmentValue + ", ");
		}
		System.out.println();
		problem4(myHashSet);
		myIter = myHashSet.iterator();
		while(myIter.hasNext()){
			Addison_Armstrong_Assign4 myAssign = myIter.next();
			System.out.print(myAssign.assignmentValue + ", ");
		}
		System.out.println();



		//Problem 5
		Addison_Armstrong_Assign4 myObj = new Addison_Armstrong_Assign4(5);
		Object myObj2 = new Addison_Armstrong_Assign4(6);
		System.out.println(myObj.equals(myObj2));

		//Problem 6
		ArrayList<Addison_Armstrong_Assign4> myAssign = new ArrayList<Addison_Armstrong_Assign4>();
		for(int i = 0; i < 10; i++){
			myAssign.add(new Addison_Armstrong_Assign4(i));
		}

		for(int i = 0; i < 10; i++ ){
			System.out.print(myAssign.get(i).assignmentValue + ",");
		}
		System.out.println();

		Collections.sort(myAssign);
		for(int i = 0; i < 10; i++ ){
			System.out.print(myAssign.get(i).assignmentValue + ",");
		}
	}

}
