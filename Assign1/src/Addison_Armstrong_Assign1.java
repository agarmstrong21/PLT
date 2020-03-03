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
 * NAMING SCHEME WILL NOT BE GRADED.
 * 
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.,
 * 
 * NOTE: for each problem there are NO empty spaces/lines before/after 
 * any of the figures.  If you put spaces before or after one or more of the
 * figures the autograder may give you a zero!
 */

/*

Name of Project: Assign1
Name of Class: Addison_Armstrong_Assign1
Author: Addison Armstrong
Date Created: 2/6/2020
Last Update: 2/7/2020
Class Description: This class contains 6 methods, main, problem1, problem2, and so on til problem5. These problems contains
	unique prompts that students must solve only using things that we have learned in class. All methods are called
	within the main method.

 */
public class Addison_Armstrong_Assign1 {
	
	/**
	 * Using only *print* statements, make the following figure
	 * 
	 * 10 points
	 * 
	 * xxxxxxxxxx
	 * x "JAVA" x
	 * xxxxxxxxxx
	 */
	public static void problem1()
	{
		// Print statement that contains the given figure. Instead of using new print statements, the figure is all
		//	contained within one print statement. Using \n operators to create new lines.
		System.out.print("xxxxxxxxxx\n" +
				         "x \"JAVA\" x\n" +
				         "xxxxxxxxxx\n");
	}
	
	
	/**
	 * Make the following figure using NO MORE than 3 for loops.
	 * All print/printlns must be within for loops.
	 * 
	 * 10 points
	 * 
	 * xxxxx
	 * xxxxx
	 * xxxxx
	 *   y
	 *   y
	 *   y
	 *   y
	 *  aaa
	 *  aaa
	 */
	public static void problem2()
	{
		// First for loop that loops indexX 3 times, printing on separate lines "xxxxx"
		for(int indexX = 0; indexX < 3; indexX++){
			System.out.println("xxxxx");
		}

		// Second for loop that loops indexY 4 times, printing on separate lines "  y" with 2 spaces before the y,
		// 	and none after
		for(int indexY = 0; indexY < 4; indexY++){
			System.out.println("  y");
		}

		// Third for loop that loops indexA 2 times, printing on separate lines " aaa" with 1 space before the a, and
		//	none after
		for(int indexA = 0; indexA < 2; indexA++){
			System.out.println(" aaa");
		}
	}
	
	
	/**
	 * 
	 * @param size
	 * 
	 * write code to produce a figure that looks like those below with the given size
	 * 
	 * 20 points
	 * 
	 * size = 3
	 *   x
	 *  xx
	 * xxx
	 * 
	 * size = 5
	 *     x
	 *    xx
	 *   xxx
	 *  xxxx
	 * xxxxx
	 */
	public static void problem3(int size)
	{
		// This problem contains a nested for loop. This problem has one outer for loop, and two inner for loops that
		//	are not nested within each other. This will create a 2D figure.

		// First for loop, loops row to the given int, size. Increments by 1.
		for(int row = 1; row <= size; row++){

			// First nested for loop, loops colSpace to size - row. This will find the amount of white spaces that is
			//	needed on the line.
			for(int colSpace = 1; colSpace <= size-row; colSpace++){
				System.out.print(" ");
			}

			// Second nested for loop, loops colX to row. This will find the amount of x's that is needed on the line.
			for(int colX = 1; colX <= row; colX++){
				System.out.print("x");
			}

			// Prints empty new line to start the next line of row.
			System.out.println();
		}
	}
	
	
	/**
	 * fill in the second for loop's condition check to produce the following figure.
	 * You MAY NOT add any new variables.  All changes that you make must be ONLY
	 * within the second for loops condition check (i.e. the for loop for the col
	 * variable).
	 * 
	 * 30 points
	 * 
	 * x
	 * xx
	 * xxx
	 * xxxx
	 * xxxx
	 * xxx
	 * xx
	 * x
	 * 
	 * HINTS:
	 * (1) break the condition into two parts: i.e., 
	 * 		<some condition that evaluates to zero if 0 < row <= 4> + 
	 * 		<some condition that evaluates to zero if 4 < row <= 8>
	 * (2) remember that, for example, 9/5 = 1 (integer division)
	 * (3) modulo may help you (the % operator)
	 */
	public static void problem4()
	{
		for(int row = 1; row <= 8; row++)
		{
			// you may change ONLY the condition check of this for loop.  Specifically, you will need to replace
			// col < 4 with something else to get the figure.

            // The conditional check for this for loop was changed to the boolean shown down below. In words, this boolean
            //  represents if col less than row AND row is less than 5 then increment col by 1, OR if col is less than
            //  the number of rows plus 1 - row AND row is greater than 4, then increment col by 1.
			for(int col = 0; (col < row && row < 5) || (col < (9 - row) && row > 4); col++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 
	 * @param rows
	 * @param cols
	 * 
	 * write code to produce a figure that looks like the following for the given rows and cols.
	 * 
	 * 30 points.
	 * 
	 * rows=1, cols=1
	 * x
	 * 
	 * rows=2, cols=1
	 * x
	 * x
	 * 
	 * rows=1, cols=2
	 * xx
	 * 
	 * rows=2, cols=2
	 * xx
	 * xx
	 * 
	 * rows=5, cols=5
	 * xxxxx
	 * x012x
	 * x345x
     * x678x
     * xxxxx
	 *
	 * 
	 * rows=8, cols=5
	 * xxxxx
     * x012x
     * x345x
     * x678x
     * x901x
     * x234x
     * x567x
     * xxxxx
     * 
     * rows=10, cols=10
     * xxxxxxxxxx
     * x01234567x
     * x89012345x
     * x67890123x
     * x45678901x
     * x23456789x
     * x01234567x
     * x89012345x
     * x67890123x
     * xxxxxxxxxx
	 * 
	 */
	public static void problem5(int rows, int cols)
	{
	    // Create int innerIndex to keep track of what number needs to be printed within the box.
		int innerIndex = 0;

		// First for loop to create and print cols amount of 'x's
		for(int col = 1; col <= cols; col++){
			System.out.print("x");
		}

		// Creates new line to start next row
		System.out.println();

		// Second for loop to create and print rows 2 through rows-1
		for(int row = 2; row < rows; row++){

		    // Prints out first 'x' to create border of box
			System.out.print("x");

			// Prints out the insides of the box, starting at innerIndex
			for(int col = 2; col < cols; col++){
			    // Prints innerIndex
				System.out.print(innerIndex);

				// Increments innerIndex then modulo's innerIndex by 10
				innerIndex++;
				innerIndex = innerIndex%10;
			}

			// Print the last 'x' to close the row and create border
			System.out.println("x");
		}

		// Prints off last row of cols amount of 'x's to close the box.
		for(int col = 1; col <= cols && rows > 1; col++){
			System.out.print("x");
		}
		System.out.println();
	}
	
	
	
	/**
	 * 
	 * @param args
	 * 
	 * Used for testing only.  Anything put here will be ignored by the 
	 * autograder
	 */
	public static void main(String[] args)
	{
		System.out.println("Problem 1");
		problem1();
		
		System.out.println("\nProblem 2");
		problem2();
		
		System.out.println("\nProblem 3");
		problem3(5);
		
		System.out.println("\nProblem 4");
		problem4();
		
		System.out.println("\nProblem 5");
		problem5(5,6);

	}
}
