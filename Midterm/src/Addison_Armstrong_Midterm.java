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
 * TO ICON: firstName-lastName-Addison_Armstrong_Midterm.java.  SUBMISSIONS WITH THE WRONG
 * NAMING SCHEME WILL NOT BE GRADED.
 * 
 * DO NOT USE ANYTHING THAT WE HAVE NOT TALKED ABOUT IN CLASS.  However, you 
 * are welcome to use any of the in built methods that are available given 
 * the imports that have been provided.  From example, you may use any of the
 * the String class in built methods.  Same goes for Random, Double, Char, etc.
 * 
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.
 */

/*

Name of Project: Midterm
Name of Class: Addison_Armstrong_Midterm
Author: Addison Armstrong
Date Created: 4/5/2020
Last Update: 4/10/2020
Class Description: This class contains eight different methods which contain unique problem statements. All explainations
 are provided above every method.

 */

//	Importing additional tools
import java.util.*;
import java.io.*;

public class Addison_Armstrong_Midterm {
	
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
		//Assuming that there are no extra spaces after each line. Along with that, assuming that there are no
		// 	additional spaces before the last line. (i.e. there are only a max of 4 spaces before the x.)

		// Print statement that prints the given figure with new lines between each line.
		System.out.println("    x\n   -x-\n  --x--\n ---x---\n----x----");
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

		// First for loop which runs for the length of positiveFigSize. Each run in the for loop will print out one line.
		for(int index = 0; index < positiveFigSize; index++){

			//	Second for loop that prints the spaces on the same line. The amount of spaces depend of positiveFigSize
			//		and current index.
			for(int spaceIndex = index; spaceIndex < positiveFigSize-1; spaceIndex++){
				System.out.print(" ");
			}

			//	Third for loop that prints out the dashes '-'. The amount of dashes depend on the index.
			for(int lineIndex = 0; lineIndex < index; lineIndex++ ){
				System.out.print("-");
			}

			//	Prints out the centerlined x
			System.out.print("x");

			//	Just like the Third for loop, will print out dashes dependent on the current index.
			for(int lineIndex = 0; lineIndex < index; lineIndex++){
				System.out.print("-");
			}

			//	Starts new line.
			System.out.println();
		}
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
		// Scanner tool readIn to read in tokens from the console.
		Scanner readIn = new Scanner(System.in);

		// String input which will store the readIn value.
		String input = "";

		// integer positiveInt that will store the integer read in depending if it is valid.
		int positiveInt = 0;

		// boolean valudInput that will notify the program if the input was valid.
		boolean validInput = false;

		// While loop that depends on boolean expression, validInput. This while loop will ask the user for an integer
		//	input. Scanner will read it in from the console, then test if the input string contains letters or the
		//	special character '-'. If it does contain those characters, validInput will be false and will no longer check.
		//	Along with that, the program will ask the user for another input and try this all again. If the input is valid,
		//	then validInput will be true, the while loop will no longer execute then will continue on.
		while(!validInput){
			// Set validInput to true until proven false.
			validInput = true;

			// Prints out instruction for user.
			System.out.print("enter an int:");

			// Reads in token from console.
			input = readIn.next();

			// Checks if the input is valid. (i.e. doesnt contain letters or '-') If it does contain those then validInput
			//	will be set to false, and the index will be set to the index length to reduce runtime.
			for(int index = 0; index<input.length(); index++){
				if(Character.isLetter(input.charAt(index)) || input.contains("-")){
					validInput = false;
					index = input.length();
				}
			}
			// If input is valid, print to console that the input was accepted, if not, ask the user to enter a new one.
			if(validInput){
				System.out.println("Input accepted.");
			}else{
				System.out.println("Invalid input, please try again.");
			}
		}

		// string input is parsed to an int and stored in positiveInt.
		positiveInt = Integer.parseInt(input);

		// First print out the positiveInt and start the fence post. The following for loop will continue to count down
		//	from positiveInt and print out the current index with commas between each number.
		System.out.print(positiveInt);
		for(int index = positiveInt-1; index >= 0; index--){
			System.out.print(","+index);
		}
		System.out.println();
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
		// Initialize and define current to 1 to start the fibonacci sequence then setting prev and prev2 to 0 to
		// 	signify the 2 previous values in the sequence.
		int current = 1;
		int prev = 0;
		int prev2 = 0;

		// for loop that will store prev in prev2, current in prev, and add prev2 and prev together to get the new
		// 	current. Taking characteristics of the fibonacci sequence.
		for(int index = 0; index < positiveSeqNum-1; index++){
			prev2 = prev;
			prev = current;
			current = prev2 + prev;
		}

		// return the fibonacci sequence number at positiveSeqNum.
		return current;
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
	public static int[] problem5(String fileName, int positiveSeqNum) {
		/**
		 * DISCLAIMER, I did not use problem4 method in this method purely for runtime. Plus, I believed it would've been
		 * 	easier to create its own method.
		 *
		 * 	Along with that, this program will create a new file if file is not found.
		 */

		// Initialize intArr to return later. The size is positiveSeqNum.
		int[] intArr = new int[positiveSeqNum];

		// Creating PrintString object writeOut.
		PrintStream writeOut = null;

		// Try catch to initialize and define the writeOut object with the new File at fileName. If not found, will print
		//	stack trace and print "file not found"
		try{
			writeOut = new PrintStream(new File(fileName));
		}catch(FileNotFoundException exception){
			System.out.println("File not found.");
			exception.printStackTrace();
		}

		// Similar to problem4, current, prev, and prev2 will be used to create the fibonacci sequence.
		int current = 1;
		int prev = 0;
		int prev2 = 0;

		// set the first int in intArr as current, print to file, then continue to the for loop to start the fence post.
		intArr[0] = current;
		writeOut.print(current);

		// Just like in problem 4, set prev2 to prev, prev to current, and current to prev+prev2, to create the fibonacci
		//	sequence. Once current is calculated, then add that int to the intArr and print out to the file.
		for(int index = 1; index < positiveSeqNum; index++){
			prev2 = prev;
			prev = current;
			current = prev2 + prev;
			intArr[index] = current;
			writeOut.print(","+current);
		}

		// return intArr
		return intArr;
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
		// Create new Random object called rdmInt with not set seed.
		Random rdmInt = new Random();

		// Initialize and define generatedInt with rdmInt's method nextInt. The bound is the upperBound - lowerBound+1.
		//	This will create a randomly generated int between [0, upperBound - lowerBound]
		int generatedInt = rdmInt.nextInt(upperBound - lowerBound+1);

		// Lastly, add the lowerBound to the generatedInt to get [lowerBound, upperBound]
		generatedInt += lowerBound;

		// return the generatedInt
		return generatedInt;
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
	 * @param inputString
	 * @param numChars
	 * @return
	 */
	public static String problem7(String inputString, String testString, int numChars)
	{
		// Initialize and define subString using the subString method of the inputString at numChars.
		// 	Then changing all letters to lowercase.
		String subString = inputString.substring(numChars).toLowerCase();

		// If subString equals testString, then return null, if not, return subString
		if(subString.equals(testString.toLowerCase())){
			return null;
		}
		return subString;
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
		// Initializing and defining boolean isPrime to false to later be proven true or false later.
		boolean isPrime = false;

		// Creating and setting highestPrime to 1 because the highest prime divisor of a prime number is either itself
		//	or one.
		int highestPrime = 1;

		// Initialize and define myInt with the ceiling of myDouble casted to an int.
		int myInt = (int) (Math.ceil(myDouble));

		// For loop to test all possibilities of prime divisors.
		for(int primeNum = 1; primeNum < myInt; primeNum++){
			// Second for loop to check if the current primeNum is prime. If primeNum is divisible by primeTestNum other
			//	than one or itself, then will be further tested and set isPrime to true, if not, will end the for loop
			//	and set isPrime to false.
			for(int primeTestNum = 2; primeTestNum < primeNum+1; primeTestNum++){
				// To test if primeNum is divisible by primeTestNum, we need to find when primeNum/primeTestNum does
				// 	not equal 1 and when moduloed, the remainder is 0.
				if(primeNum/primeTestNum != 1 && primeNum%primeTestNum == 0){
					primeTestNum = primeNum;
					isPrime = false;
				}else{
					isPrime = true;
				}
			}
			// if isPrime is true, then test if myInt is divisible by primeNum. Similar to above. If it is, then store
			// 	primeNum in highestPrime.
			if(isPrime){
				if(myInt/primeNum > 1 && myInt%primeNum == 0){
					highestPrime = primeNum;
				}
			}
		}
		// return highestPrime
		return highestPrime;
	}

	public static void main(String[] args)  {
		// place anything you want to test your code here.

		// No need to comment because this is testing grounds.

		System.out.println("Problem 1:");
		problem1();

		System.out.println("Problem 2:");
		problem2(1);
		problem2(2);
		problem2(5);
		problem2(7);
		problem2(10);
		problem2(20);

		System.out.println("Problem 3:");
		problem3();

		System.out.println("Problem 4:");
		System.out.println(problem4(10));
		System.out.println(problem4(2));
		System.out.println(problem4(5));
		System.out.println(problem4(12));
		System.out.println(problem4(7));
		System.out.println(problem4(9));
		System.out.println(problem4(3));

		System.out.println("Problem 5:");
		int[] output = problem5("Midterm/haha.txt", 7);
		System.out.print(output[0]);
		for(int index = 1; index < output.length; index++){
			System.out.print("," + output[index]);
		}
		System.out.println();

		System.out.println("Problem 6:");
		System.out.println(problem6(0,10));
		System.out.println(problem6(-10, 10));
		System.out.println(problem6(-10, -5));

		System.out.println("Problem 7:");
		System.out.println(problem7("abcde","cde",2));
		System.out.println(problem7("QWERTY", "abcde", 3));

		System.out.println("Problem 8:");
		System.out.println(problem8(9.9));
		System.out.println(problem8(7));
		System.out.println(problem8(26));

	}
}
