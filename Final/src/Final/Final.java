/**
 * 
 * @author Addison Armstrong
 * 
 * Instructions:
 * Finish each of the methods such that each satisfies the instructions
 * given for each.  This is an individual test, do not work with
 * others.  Each question will be graded individually by hand.
 * Code that does not compile will be given a zero.  The use of poor 
 * variable names and/or lack of useful and descriptive comments in your
 * code will result in a penalty of 50% (penalty is applied per question,
 * not for the whole test).  Do not import anything except what is 
 * given to you.  Finally, do not add additional methods.
 * 
 * ALL SUBMISSION FILES MUST HAVE THE FOLLOWING NAMING SCHEME WHEN SUBMITTED
 * TO ICON: firstName-lastName-Final.java.  SUBMISSIONS WITH THE WRONG 
 * NAMING SCHEME WILL NOT BE GRADED.
 * 
 * DO NOT USE ANYTHING THAT WE HAVE NOT TALKED ABOUT IN CLASS.  However, you 
 * are welcome to use any of the in built methods that are available given 
 * the imports that have been provided.  From example, you may use any of the
 * the String class in built methods.  Same goes for Random, Double, Char, etc.
 * 
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.
 */


package Final;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Final {
	
	/**
	 * Problem 1: 15 points
	 * 
	 * This method takes as input a positive int
	 * that is smaller than or and
	 * prints out a square with length and width
	 * equal to this input value.  Moreover, this
	 * method counts up to the square of the input
	 * For example, suppose the input is 4 then 
	 * the output should be:
	 * 
	 * 01 02 03 04
	 * 05 06 07 08
	 * 09 10 11 12
	 * 13 14 15 16
	 * 
	 * If the input was 2 then the output would be
	 * 
	 * 01 02
	 * 03 04
	 * 
	 * For this problem you are allowed to use NO 
	 * MORE than one loop of any type.
	 * 
	 * Hint: you can create as many variables as 
	 * would like.  Also, don't worry so much 
	 * about spacing besides the spacing BETWEEN
	 * the numbers (same idea as with the midterm).
	 * 
	 * @param squareSize
	 */
	public static void problem1(int squareSize)
	{
		
	}
	
	
	/**
	 * Problem 2: 15 points
	 * 
	 * This method prints out the first given number of primes
	 * to a file at the given location.  If the file does not
	 * exist, you will need to create it.  Otherwise, you should
	 * overwrite the file.  Num primes will be at least 1.
	 * 
	 * For example, suppose that numPrimes is 10.  Then the file
	 * should contain:
	 * 
	 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
	 * 
	 * You may NOT change the method to throw any exceptions.
	 * 
	 * @param numPrimes
	 * @param fileName
	 */
	public static void problem2(int numPrimes, String fileName)
	{

	}
	
	/**
	 * Problem 3: 10 points
	 * 
	 * Returns true if firstString is a subString of secondString
	 * or if secondString is a subString of firstString.  For 
	 * example, suppose that firstString is "cat" and secondString
	 * is "at".  In this case secondString would be a substring of
	 * firstString.
	 * 
	 * You may use ONLY the length method and subString methods of
	 * the string class for this problem.  If you use any other
	 * string methods a zero will be given.
	 * 
	 * @param firstString
	 * @param secondString
	 * @return
	 */
	public static boolean problem3(String firstString, String secondString)
	{
		return false;
	}
	
	
	/**
	 * Problem 4: 10 points
	 * 
	 * This method takes as input an HashSet of strings
	 * that first removes all strings that contain the letter "a"
	 * (case sensitive!).  Then, for all strings that contain the
	 * letter b (case sensitive!), a copy of the string is made, an 
	 * "s" is added to the end of the copy, and the copy is added 
	 * to the HashSet.
	 * 
	 * For example, suppose the hashset contains "about", "at", 
	 * "cAt", "bob".
	 * 
	 * At the end of this method the hashset will contain 
	 * "cAt", "bob", "bobs"
	 * 
	 * @param myHashSet
	 */
	public static void problem4(HashSet<String> myHashSet)
	{
		
	}
	
	
	/**
	 * Problem 5: 15 points
	 * 
	 * If the given collection is an ArrayList, this method
	 * will remove the first num elements or all elements 
	 * if num is bigger than the size of the ArrayList.  If 
	 * instead the collection is a HashSet, this method will
	 * add the strings "0", "1", ..., "num" to the HashSet.
	 * 
	 * For example, suppose that num is 3 and the collection 
	 * is an ArrayList of size 5.  Then, the elements in the
	 * arrayList at locations 0, 1, and 2 will be removed.
	 * If instead the ArrayList is size 2, all elements from
	 * the ArrayList will be removed.  If the collection is
	 * a HashSet, the strings "0", "1", and "2" will be added
	 * to it.
	 * 
	 * you may assume that num is positive.
	 * 
	 * @param myCollection
	 */
	public static void problem5(Collection<String> myCollection, int num)
	{

	}
	
	
	/**
	 * Problem 6: 10 points
	 * 
	 * Finish implementing this constructor so that 
	 * the passed name and score variables are assigned
	 * to their corresponding fields of the object
	 * created by the contructor.  In addition, add
	 * mutator and accessor methods for both fields
	 * (i.e. setName, getName etc).  Make sure you name
	 * these methods correctly!
	 * 
	 * DO NOT CHANGE THE NAMES OF ANY OF THE VARIABLES!
	 * 
	 * @param name
	 * @param score
	 */
	private String name;
	private double score;
	public Final(String name, double score)
	{

	}

	
	
	/**
	 * Problem7: 10 points
	 * 
	 * This method calculates the num'th number in the
	 * Tribonacci sequence USING RECURSION.  Failure to
	 * use recursion will result in a zero.  For those 
	 * of you that don't know, the Tribonacci sequence 
	 * is defined as the sequence of numbers such that 
	 * each number is the sum of the previous three 
	 * numbers given that the first three numbers are 
	 * 0, 0, and 1 (The Tribonacci is very similar to 
	 * the Fibonacci sequence.  The difference being 
	 * that the Fibonacci sequence uses the previous 
	 * two numbers while the Tribonacci sequence uses 
	 * the previous three).
	 * 
	 * For example, suppose num is 10.  Then the
	 * corresponding Tribonacci sequence would be
	 * 0,0,1,1,2,4,7,13,24,44 and the number returned
	 * by this method would be 44.
	 * 
	 * You may assume that num is at least 3.
	 * 
	 * @param num
	 * @return
	 */
	public static int problem7(int num)
	{
		return -1;
	}
	
	
	/**
	 * Problem8: 15 points
	 * 
	 * This method returns an anonymous class object
	 * that extends Final with an overridden equals method
	 * that returns true if the name field of the two 
	 * objects are the same length and each corresponding
	 * char are the same case.
	 * 
	 * For example, suppose that the two Strings are "cat"
	 * and "dog".  These strings are the same length and
	 * each character is lower case so the method would 
	 * return true.
	 * 
	 * Consider another example, suppose the two Strings are
	 * "cat" and "cAt".  These strings are the same length
	 * but each character is not the same case (the "a" and 
	 * "A" are not the same case) so the method would return
	 * false.
	 * 
	 * NOTE: you may need the accessor/mutators that you wrote
	 * above to complete this problem.
	 * 
	 * @param name
	 * @param score
	 * @return
	 */
	public static Final problem8(String name, double score)
	{
		return null;
	}
	
	
	public static void main (String[] args)
	{
		
	}

}
