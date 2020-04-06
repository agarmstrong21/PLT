/**
 * 
 * @author YOUR NAME GOES HERE
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
 * TO ICON: firstName-lastName-Midterm.java.  SUBMISSIONS WITH THE WRONG 
 * NAMING SCHEME WILL NOT BE GRADED.
 * 
 * DO NOT USE ANYTHING THAT WE HAVE NOT TALKED ABOUT IN CLASS.  However, you 
 * are welcome to use any of the in built methods that are available given 
 * the imports that have been provided.  From example, you may use any of the
 * the String class in built methods.  Same goes for Random, Double, Char, etc.
 * 
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.
 */

import java.util.*;
import java.io.*;

public class Midterm {
	
	/**
	 * 5 points
	 * 
	 * Output the following figure to the console
	 * 
	 *           x
	 *          -x-
	 *         --x--
	 *        ---x---
	 *       ----x----
	 */
	public static void problem1()
	{

	}
	
	/**
	 * 5 points
	 * 
	 * Output the following figures to the console
	 * based on size:
	 * 
	 * positiveFigSize == 1
	 * 
	 *           x
	 *           
	 * positiveFigSize == 2
	 *           x
	 *          -x-
	 *          
	 * positiveFigSize == 3
	 *           x
	 *          -x-
	 *         --x--
	 *         
	 * etc...
	 * 
	 * NOTE: assume positiveFigSize is positive
	 */
	public static void problem2(int positiveFigSize)
	{

	}
	
	/**
	 * 20 points
	 * 
	 * Repeatedly ask the user to input a positive int.
	 * If the user enters anything but a positive int
	 * ignore the input and ask again.  Then print
	 * a list counting down to zero.
	 * 
	 * For example the program may prompt the user
	 * 
	 * "enter an int:"
	 * 
	 * if the user inputs 10 then the program would
	 * output
	 * 
	 * 10,9,8,7,6,5,4,3,2,1,0
	 * 
	 * NOTE: observe that commas occur only between
	 * numbers.
	 */
	public static void problem3()
	{

	}
	
	/**
	 * 10 points
	 * 
	 * calculate and return a specific fibonacci number
	 * 
	 * For example, if positiveSeqNum is 7 then the 
	 * fibonacci sequence would be
	 * 
	 * 1,1,2,3,5,8,13
	 * 
	 * Your program should return 13
	 * 
	 * NOTE: positiveSeqNum is positive
	 * 
	 * @return
	 */
	public static int problem4(int positiveSeqNum)
	{
		return -1;
	}
	
	/**
	 * 20 points
	 * 
	 * calculate the fibonacci sequence of the given
	 * length and first write that sequence to file.
	 * Then the sequence is returned in an int array.
	 * 
	 * NOTE: you may use the problem4 method to help.
	 * 
	 * NOTE: positiveSeqNum will be positive.
	 * 
	 * @param fileName
	 * @param positiveSeqNum
	 * @return
	 */
	public static int[] problem5(String fileName, int positiveSeqNum)
	{
		return null;
	}
	
	/**
	 * 10 points
	 * 
	 * select an int on the interval 
	 * [lowerBound, upperBound] uniformly randomly.
	 * 
	 * For example, if given the interval [2,4], your
	 * solution should return either 2, 3, or 4 with
	 * equal probability.
	 * 
	 * @param lowerBound
	 * @param upperBound
	 * @return
	 */
	public static int problem6(int lowerBound, int upperBound)
	{
		return -1;
	}

	
	/**
	 * 10 points
	 * 
	 * remove the first numChars of inputString and
	 * test if the resulting substring is equal
	 * to testString.  If it is, return null.  Otherwise
	 * return the substring you calculated.
	 * 
	 * For example, suppose the inputString is "abcde",
	 * testString is "qwer", and numChars is 2.  Then
	 * the substring is "cde" and the substring and
	 * testString are not equal.  The method then would
	 * return "cde".
	 * 
	 * NOTE: assume numChars is non negative and less
	 * than the size of inputString
	 * 
	 * @param myString
	 * @param numChars
	 * @return
	 */
	public static String problem7(String inputString, String testString, int numChars)
	{
		return null;
	}
	
	/**
	 * 20 points
	 * 
	 * round the input double up to the nearest int,
	 * cast the result to an int, then find and return
	 * the largest prime divisor of this int.
	 * 
	 * For example, if myDouble is ten this method 
	 * should return 5.
	 * 
	 * NOTE: assume myDouble is greater than 2
	 * 
	 * @param myDouble
	 * @return
	 */
	public static int problem8(double myDouble)
	{
		return -1;
	}
	
	
	public static void main(String[] args)
	{
		// place anything you want to test your code here
	}
}
