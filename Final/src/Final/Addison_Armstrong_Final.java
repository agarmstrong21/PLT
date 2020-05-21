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

/**

 Name of Project: Final
 Name of Class: Addison_Armstrong_Final
 Author: Addison Armstrong
 Date Created: 5/6/2020
 Last Update: 5/15/2020
 Class Description: This class contains problems that are to be solved by the student.

 */


package Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Addison_Armstrong_Final {

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
		// if the squareSize is not 0 and less than 10, then...
		if(squareSize != 0 && squareSize < 10) {
			// for loop to create the 2D square of numbers
			for (int index = 1; index <= squareSize * squareSize; index++) {
				// if the index is less than 10, then...
				if (index < 10) {
					// print out the index with a leading 0
					System.out.print("0" + index + " ");
				} else {
					// else, print out index without the leading 0
					System.out.print(index + " ");
				}

				// if the index moduloed by squareSize is 0, then...
				if (index % squareSize == 0) {
					// start a new line
					System.out.println();
				}
			}
		}else{
			// else, then print out that the given squareSize is too big or too small.
			System.out.println("squareSize too large or too small.");
		}
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
		// if numPrimes is greater than 0, then...
		if(numPrimes > 0) {
			// initialize the PrintStream writeOut to null
			PrintStream writeOut = null;

			// initialize countDown with numPrimes
			int countDown = numPrimes;

			// Try catch to set up the printStream with the fileName, if exception FileNotFoundException is thrown, then
			//		print out file not found and print the tree.
			try {
				writeOut = new PrintStream(new File(fileName));
			} catch (FileNotFoundException exception) {
				System.out.println("File not found.");
				exception.printStackTrace();
			}

			// Initialize isPrime boolean and primeArray with set size of numPrimes
			boolean isPrime;
			int[] primeArray = new int[numPrimes];

			// for loop from the first prime number of 2 and count index up til countdown is less than or equal to 0
			for (int index = 2; countDown > 0; index++) {
				// set isPrime to true till proven otherwise
				isPrime = true;

				// for loop to take the current index and divide by anything between 2 and index-1 to prove if prime
				for (int divisor = 2; divisor < index; divisor++) {
					// if index is not prime, then end for loop by setting divisor to index and then set isPrime to false
					if (index % divisor == 0) {
						divisor = index;
						isPrime = false;
					}
				}

				// if isPrime is true, then...
				if (isPrime) {
					// set the last numPrimes - countDown spot of primeArray as index then decrement countDown
					primeArray[numPrimes - countDown] = index;
					countDown--;
				}
			}

			// for loop to print out the contents of primeArray to the fileName in fence post format.
			for (int index = 0; index < numPrimes - 1; index++) {
				writeOut.print(primeArray[index] + ", ");
			}
			writeOut.print(primeArray[numPrimes - 1]);
		}
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
		// if the firstString is larger than the secondString, then...
		if(firstString.length() > secondString.length()){
			// assume that secondString is substring of firstString
			// for loop to test substrings of every spot in the firstString to see if...
			for(int index = 1; index < firstString.length(); index++){
				// ... if the firstString substring at that index is equal to secondString, if so, return true
				if(firstString.substring(index).equals(secondString)){
					return true;
				}
			}
		}
		// else if the latter, the secondString is larger than the firstString, then...
		else if(firstString.length() < secondString.length()){
			// assume that firstString is substring of secondString
			// for loop to test substrings of every spot in the secondString to see if...
			for(int index = 1; index < secondString.length(); index++){
				// ... if the secondString substring at that index is equal to firstString, if so, return true
				if(secondString.substring(index).equals(firstString)){
					return true;
				}
			}
		}
		// else, return false.
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
		// first remove all strings within the hashSet that contain the letter 'a'
		myHashSet.removeIf(Input -> Input.contains("a"));

		// create an object array called myHashArr from myHashSet
		Object[] myHashArr = myHashSet.toArray();

		// loop through each string and if...
		for(int index = 0; index < myHashArr.length; index++){
			// ... if that string contains a b, then...
			if(myHashArr[index].toString().contains("b")){
				// add an s to the string.
				myHashSet.add(myHashArr[index].toString() + "s");
			}
		}
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
		// if the myCollection can be casted to ArrayList, then...
		if(myCollection instanceof ArrayList) {
			// Initialize and define myArr as the casted myCollection
			ArrayList<String> myArr = (ArrayList<String>) myCollection;
			// For loop to remove the beginning num strings
			for(int index = 0; index < num && index < myArr.size(); num--){
				myArr.remove(index);
			}
		}
		// else if the myCollection can be casted to HashSet, then...
		else if(myCollection instanceof HashSet){
			// Initialize and define myHash as the casted myCollection
			HashSet<String> myHash = (HashSet<String>) myCollection;
			// for loop to add the num numbers counting from 0 to num to the hashSet.
			// FYI, the prompt does not say that the numbers need to be set to the beginning of the hashset, so they are
			//		added but not 'inorder' (i.e., my main code will print them out with numbers scattered in the strings.
			for(int index = 0; index <= num; index++){
				myHash.add(Integer.toString(index));
			}
		}
		// else, print invalid collection type.
		else{
			System.out.println("Invalid Collection Type");
		}

	}




	/**
	 * Problem 6: 10 points
	 *
	 * Finish implementing this constructor so that
	 * the passed name and score variables are assigned
	 * to their corresponding fields of the object
	 * created by the constructor.  In addition, add
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

	public Addison_Armstrong_Final(String name, double score)
	{
		this.name = name;
		this.score = score;
	}

	// Auto generated getters and setters.

	// accessor or getter of name
	public String getName() {
		return name;
	}

	// mutator or setter of name
	public void setName(String name) {
		this.name = name;
	}

	// accessor or getter of score
	public double getScore() {
		return score;
	}

	// mutator or setter of score
	public void setScore(double score) {
		this.score = score;
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
		// if the num is less than or equal to 2, then return 0 to represent the first 2 0's in the tribonacci sequence
		if(num <= 2){
			return 0;
		}
		// if the num is 3, then return 1 to represent the 3rd number of the tribonnaci sequence
		if(num == 3){
			return 1;
		}

		// return the recursion problem7 with the values of num -1, num -2, and num - 3 to get the last three values
		// 		and add them together to get the tribonacci sequence
		return problem7(num - 1) + problem7(num - 2) + problem7( num - 3);
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
	public static Addison_Armstrong_Final problem8(String name, double score)
	{
		// return the anonymous class object with the overridden equals method.
		return new Addison_Armstrong_Final(name, score){

			// overridden equals method.
			@Override
			public boolean equals(Object input){
				// cast the input to final and set it to the new Final inputFinal
				Addison_Armstrong_Final inputFinal = (Addison_Armstrong_Final) input;
				// if this name and inputFinal's name is the same length, then...
				if(this.getName().length() == inputFinal.getName().length() ){
					// for loop to test each char in the both strings to see if they are the same case, if not...
					for(int index = 0; index < this.getName().length(); index++){
						// ... if the two names do not match in the same case, then return false.
						if(Character.isLowerCase(this.getName().charAt(index))
								!= Character.isLowerCase((inputFinal.getName().charAt(index)))){
							return false;
						}
					}
					// Assuming that all the letters are matched, then return true.
					return true;
				}
				// else return false.
				return false;
			}
		};
	}
	
	
	public static void main (String[] args)
	{

		// main method, no need to comment.

		// Problem 1:
		System.out.println("Problem 1:");
		problem1(2);
		problem1(4);
		problem1(9);
		problem1(10);

		// Problem 2:
		System.out.println("\nProblem 2:");
		problem2(115, "Final/src/Final/test");


		// Problem 3:
		System.out.println("\nProblem 3:");
		System.out.println(problem3("cat" , "at"));
		System.out.println(problem3("Cat", "AT"));
		System.out.println(problem3("at", "cat"));
		System.out.println(problem3("cat", "cat"));

		//Problem 4:
		System.out.println("\nProblem 4:");
		HashSet<String> hash1 = new HashSet<>();
		hash1.add("about");
		hash1.add("at");
		hash1.add("cAt");
		hash1.add("bob");
		HashSet<String> hash10 = new HashSet<>();
		hash10.add("about");
		hash10.add("at");
		hash10.add("cAt");
		hash10.add("bob");
		hash10.add("BoJmes");
		problem4(hash1);
		problem4(hash10);
		Object[] hashString = hash1.toArray();
		Object[] hashString2 = hash10.toArray();
		for (int i = 0; i < hashString.length; i++){
			System.out.println(hashString[i]);
		}
		for (int i = 0; i < hashString2.length; i++){
			System.out.println(hashString2[i]);
		}


		//Problem 5:
		System.out.println("\nProblem 5:");
		ArrayList<String> myArr = new ArrayList<>();
		myArr.add("about");
		myArr.add("at");
		myArr.add("cAt");
		myArr.add("bob");
		ArrayList<String> myArr2 = new ArrayList<>();
		myArr2.add("about");
		myArr2.add("at");
		myArr2.add("cAt");
		myArr2.add("bob");
		ArrayList<String> myArr3 = new ArrayList<>();
		myArr3.add("about");
		myArr3.add("at");
		myArr3.add("cAt");
		myArr3.add("bob");
		ArrayList<String> myArr4 = new ArrayList<>();
		myArr4.add("about");
		myArr4.add("at");
		myArr4.add("cAt");
		myArr4.add("bob");
		ArrayList<String> myArr5 = new ArrayList<>();
		myArr5.add("about");
		myArr5.add("at");
		myArr5.add("cAt");
		myArr5.add("bob");

		HashSet<String> hash2 = new HashSet<>();
		hash2.add("about");
		hash2.add("at");
		hash2.add("cAt");
		hash2.add("bob");
		HashSet<String> hash3 = new HashSet<>();
		hash3.add("about");
		hash3.add("at");
		hash3.add("cAt");
		hash3.add("bob");
		HashSet<String> hash4 = new HashSet<>();
		hash4.add("about");
		hash4.add("at");
		hash4.add("cAt");
		hash4.add("bob");
		HashSet<String> hash5 = new HashSet<>();
		hash5.add("about");
		hash5.add("at");
		hash5.add("cAt");
		hash5.add("bob");
		HashSet<String> hash6 = new HashSet<>();
		hash6.add("about");
		hash6.add("at");
		hash6.add("cAt");
		hash6.add("bob");

		problem5(myArr,1);
		problem5(myArr2, 2);
		problem5(myArr3, 3);
		problem5(myArr4, 4);
		problem5(myArr5, 5);
		problem5(hash2, 4);
		problem5(hash3, 3);
		problem5(hash4, 2);
		problem5(hash5, 1);
		problem5(hash6, 0);


		for(int i = 0 ; i < myArr.size(); i++){
			System.out.print(myArr.get(i) + ", ");
		}
		System.out.println();

		for(int i = 0 ; i < myArr2.size(); i++){
			System.out.print(myArr2.get(i) + ", ");
		}
		System.out.println();

		for(int i = 0 ; i < myArr3.size(); i++){
			System.out.print(myArr3.get(i) + ", ");
		}
		System.out.println();

		for(int i = 0 ; i < myArr4.size(); i++){
			System.out.print(myArr4.get(i) + ", ");
		}
		System.out.println();

		for(int i = 0 ; i < myArr5.size(); i++){
			System.out.print(myArr5.get(i) + ", ");
		}
		System.out.println();

		Object[] myIter2 = hash2.toArray();
		for(int i = 0; i < myIter2.length; i++){
			System.out.print(myIter2[i] + ", ");
		}
		System.out.println();

		myIter2 = hash3.toArray();
		for(int i = 0; i < myIter2.length; i++){
			System.out.print(myIter2[i] + ", ");
		}
		System.out.println();

		myIter2 = hash4.toArray();
		for(int i = 0; i < myIter2.length; i++){
			System.out.print(myIter2[i] + ", ");
		}
		System.out.println();

		myIter2 = hash5.toArray();
		for(int i = 0; i < myIter2.length; i++){
			System.out.print(myIter2[i] + ", ");
		}
		System.out.println();

		myIter2 = hash6.toArray();
		for(int i = 0; i < myIter2.length; i++){
			System.out.print(myIter2[i] + ", ");
		}
		System.out.println();


		//Problem 6:
		System.out.println("\nProblem 6:");

		//Problem 7:
		System.out.println("\nProblem 7:");
		for(int i = 0; i < 25; i++){
			System.out.print(problem7(i) + ",");
		}
		System.out.println();

		//Problem 8:
		System.out.println("\nProblem 8:");
		System.out.println(problem8("cat", 4).equals(new Addison_Armstrong_Final("cat", 4)));
		System.out.println(problem8("cAt", 4).equals(new Addison_Armstrong_Final("cat", 4)));
		System.out.println(problem8("dog", 4).equals(new Addison_Armstrong_Final("cat", 4)));
		System.out.println(problem8("5", 4).equals(new Addison_Armstrong_Final("cat", 4)));
		System.out.println(problem8("cat", 4.4).equals(new Addison_Armstrong_Final("cat",4.4)));
		System.out.println(problem8("cat", 4.4).equals(new Addison_Armstrong_Final("cat",4.45)));

	}

}
