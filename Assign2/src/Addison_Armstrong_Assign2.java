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
 * DO NOT USE ANYTHING THAT WE HAVE NOT TALKED ABOUT IN CLASS.  THIS INCLUDES
 * ARRAYS.  However, you are welcome to use any of the in built methods
 * that are available given the imports that have been provided.  From example,
 * you may use any of the the String class in built methods.  Same goes for
 * Random, Double, Char, etc.
 *
 * FAILURE TO FOLLOW ANY OF THE ABOVE INSTRUCTIONS WILL RESULT IN A ZERO.
 */
/*

Name of Project: Assign2
Name of Class: Addison_Armstrong_Assign2
Author: Addison Armstrong
Date Created: 2/29/2020
Last Update: 3/9/2020
Class Description: This class contains 4 methods, main, problem1, problem2, and problem3. These problems contains
	unique prompts that students must solve only using things that we have learned in class. All methods are called
	within the main method.

 */

// don't add to or remove from these
import java.util.*;


public class Addison_Armstrong_Assign2 {
    /**
     *
     * @param bound1
     * @param bound2
     * @param bound3
     * @return
     *
     * 10 points
     *
     * Write code to randomly pick an integer UNIFORMLY from the interval
     * [0, bound1] and [bound2,bound3].
     *
     * For example suppose bound1 = 1, bound2 = 5, and bound3 = 10.
     * This method should return either 0, 1, 5, 6, 7, 8, 9, or 10
     * all with UNIFORM probability.  That is, it should be as equally
     * likely to pick one of these numbers (e.g. probability 0 is selected
     * is the same as 8).
     *
     * NOTE: this function assumes that bound1 <= bound2 <= bound3
     *
     * HINT: what should happen if bound1 == bound2 == bound3 == 0?
     *
     * HINT: what should happen if bound1 == bound2 && bound2 != bound3?
     *
     * HINT: I would write some code that you won't turn in to test that
     * the numbers you generate are in fact being selected uniform across
     * the two intervals.
     */
    public static int problem1(int bound1, int bound2, int bound3)
    {
        /*
        First if statement checks if all passed in bounds are equal, if so, will return bound1.

        Second first is dependent if the first if statement is true or false, if the first if statement is false, the
            second if statement will check to make sure that bound1 is less than or equal to bound2 AND bound2 is
            less than or equal to bound3.
         */
        if((bound1 == bound2) && (bound1 == bound3)){
            return bound1;
        }else if( (bound1 <= bound2) && (bound2 <= bound3)){
            // Creating random variable to only use in this scope. To save memory, no need to create rand until it needs
            //      needs to be used
            Random rand = new Random();

            // myInt will be used as the returned random integer
            int myInt = -1;

            // this while statement checks to see if myInt is outside of both bound areas.
            //      If so, we create a new random int
            while(myInt < 0 || myInt > bound3 || (myInt < bound2 && myInt > bound1)){
                myInt = rand.nextInt(bound3);
            }

            // if myInt is within the bounds, return myInt
            return myInt;
        }
        // if the bounds are incorrect or invalid, return 0.
        return 0;
    }

    /*
    Possible entries:
        - all are in increasing order
            - 0 < bound1 < bound2 < bound3
                - will give random number
        - all bounds are equal
            - bound1 == bound2 == bound3
                - will give bound1 since all bounds are equal
        - all bounds are negative
            - 0 > (bound1 && bound2 && bound3)
                - will give 0
        - if bound1 and bound2 are equal or bound2 is less than bound1
             - (bound1 == bound2) || (bound2 < bound1)
                - will have a range of 0 to bound3 then
        - if bound3 is less than any of the bounds
            - bound3 < bound1 && bound2
                - return 0
     */

    /**
     *
     * @param bound1
     * @param bound2
     * @param bound3
     * @return
     *
     * 20 points
     *
     * Repeat problem 2 but with the following change.  The number
     * returned is a double.  For example suppose bound1 = 1,
     * bound2 = 5, and bound3 = 10.  In this example it would be
     * valid for this method to return 5.5.  In general, for this
     * example your code should return a number uniformly selected
     * from the intervals [0,1] and [5,10]
     *
     * NOTE: if your submission only returns ints you will be given
     * a zero for this problem
     *
     * NOTE: because of the way doubles are generated randomly it may
     * not be possible to return either exactly bound1 or bound3.
     * Don't worry about this.
     */
    public static double problem2(int bound1, int bound2, int bound3)
    {
        /*
        First if statement checks if all passed in bounds are equal, if so, will return bound1.

        Second first is dependent if the first if statement is true or false, if the first if statement is false, the
            second if statement will check to make sure that bound1 is less than or equal to bound2 AND bound2 is
            less than or equal to bound3.
         */
        if((bound1 == bound2) && (bound1 == bound3)){
            return bound1;
        }else if( (bound1 <= bound2) && (bound2 <= bound3)){
            // Creating random variable to only use in this scope. To save memory, no need to create rand until it needs
            //      needs to be used
            Random rand = new Random();

            // myDoub will be used as the returned random double between 0 and 1
            double myDoub = -1;

            // this while statement checks to see if myDoub is outside of both bound areas.
            //      If so, we create a new random double
            while(myDoub < 0 || myDoub > bound3 || (myDoub < bound2 && myDoub > bound1)){
                // we times the random nextDouble with bound3 to create a range between 0-bound3
                myDoub = rand.nextDouble() * (bound3);
            }

            // once the while loop exits, returns myDoub
            return myDoub;
        }
        // if the bounds are incorrect or invalid, return 0.
        return 0;
    }

    /*
    Possible entries:
        - all are in increasing order
            - 0 < bound1 < bound2 < bound3
                - will give random number
        - all bounds are equal
            - bound1 == bound2 == bound3
                - will give bound1 since all bounds are equal
        - all bounds are negative
            - 0 > (bound1 && bound2 && bound3)
                - will give 0
        - if bound1 and bound2 are equal or bound2 is less than bound1
             - (bound1 == bound2) || (bound2 < bound1)
                - will have a range of 0 to bound3 then
        - if bound3 is less than any of the bounds
            - bound3 < bound1 && bound2
                - return 0
     */

    /**
     *
     * @param encryptedPassword
     * @return
     *
     * 70 points
     *
     * You're a programmer at a company and have been tasked to
     * build a password prompt and validation method for a
     * Java project.  You're only responsibility is this method.
     * The method prompts the user for their password then checks
     * the password against an encrypted version that is passed
     * to the method as a parameter (NEVER store passwords in
     * plain text!).  When the user enters their password in response
     * to the prompt, they will also enter in some information needed
     * to decrypt the password that this method accepts (side point,
     * don't do this in real life. A user shouldn't be able to pass
     * any information other than their actual password.  Allowing
     * more information to be shared just makes it more possible
     * for a bad guy to find a hole). This information will then be
     * used to decrypt the encrypted password passed to the method
     * and checked against the password input by the user.  If they
     * match, this method will return true, otherwise false.
     *
     * The encrypted password will be encrypted via two techniques,
     * (1) a caesar cipher (seriously, don't ever use this in real
     * life). and (2) a character location shift (this either).
     * For those of you that don't know, a caesar cipher replaces
     * each letter in a string with another letter.  Each letter is
     * assigned a number on the interval [0,25] (i.e. can be 0, 25,
     * or any integer in between).  To encrypt the following formula
     * is used:
     *
     * cipherChar = (plainChar + index) % 26
     *
     * where plainChar is the integer value of the character (e.g. A
     * is 0, B is 1, .... Z is 26), index is the cipher index, and
     * cipherChar is the resulting encrypted integer code.  For example,
     * If you want to encrypt the character Y with index 4 you will get
     * C.  This is because Y has value 24 and 2 == (24 + 4) % 26.  2 maps
     * to the letter C.  To continue this example, if your string was
     * "helloworld" and you applied an index of 2 you would get
     * "lippsasvph".  The formula to decrypt is the following:
     *
     * plainChar = (cipharChar - index) % 26
     *
     * Running this equation on "lippsasvph" we give "helloworld" as desired.
     *
     * For those of you that don't understand shifts, a shift involves
     * moving the position of each character by a set number of locations.
     * Suppose we have a string "helloworld" and apply a shift of 2.
     * This would give the string "ldhellowor".  Here, each character has
     * been shifted right by two spaces.  If instead we shift "HelloWorld"
     * by -2 we would get "lloWorldHe".
     *
     * It is assumed that each password has been encrypted with a caesar
     * cipher and has been shifted (it doesn't matter which order you
     * do the two in).  Returning to our examples above, if the caesar
     * index is 4 and we shifted -2 the encrypted password would be
     * "ppsasvphli" if our password was "helloworld".
     *
     *
     *
     * Let's consider an example.  When ran, the method should prompt
     * the user with (Without the ""):
     *
     * "Please enter your password:"
     *
     * Then, the method should wait for a response from the user. The
     * response should accept only strings that consist of just
     * alphabet characters (i.e. a,...,z).  If an entered string contains
     * any other character the method should print the message below and
     * wait for another password.  Keep doing this until you get a
     * valid password (again, don't ever do this in real life).  NOTE,
     * if upper case letters are passed that is ok.  You will just have
     * to convert them to lower case.
     *
     * "Invalid password.  Please enter your password:"
     *
     * Next, the program (on the next line) should prompt the user with
     *
     * "Please enter your caesar cipher index:"
     *
     * The index is a number on the interval [0,25] (i.e. can be 0, 25,
     * or any integer in between).  If the user inputs an invalid value
     * the system should say the following and wait again.  Keep doing
     * this until you get a valid value (see above about never, ever
     * doing this in real life).
     *
     * "Invalid value.  Please enter your caesar cipher index:"
     *
     * Next, the program should prompt the user for the shift.  Here a
     * valid shift is ANY integer.  We will assume that the user will
     * enter an integer here so we won't check to make sure what is
     * input is actually an integer.
     *
     * "Please enter your shift:"
     *
     * Finally, use the caesar index and shift value to decrypt the
     * encrypted password that was passed to the method.  Then check if the
     * password entered by the user matches what is stored.
     * Alternatively you could encrypt the password passed by the
     * user and check it against the stored encrypted password that
     * was passed as a parameter.  Either way, if they match return
     * true, else return false.
     *
     * Here are a few inputs that should return true to help you with testing
     * (NOTE: we will test others when we grade your submission)
     *
     * password       cipherText   index   shift
     * helloWORLD     ppsasvphli   4       -2
     * helloworld     fjgnnqyqtn   2        1
     * HelloWorld     szzcKcfzrV   14       999
     * studyhard      dwnzopqzu    22       -67
     * studyhard      ardstudyh    0        3
     * stuDyharH      rstcxgzqc    25       0
     * JAVA           java         0        0
     *
     * NOTE: upper/lower case is ignored (a and A are the same thing.
     * Also, dont ever do this in real life either.  Case sensitivity
     * is huge for security).
     *
     * NOTE: only alphabet characters are supported in passwords.
     *
     * NOTE: this method should keep asking for valid input until it
     * gets it (really bad idea to do this for real though, don't do
     * it).
     *
     * NOTE: to check if a character is a letter use
     * Character.isLetter(myChar).  You could also convert the characters
     * to a number and check if it is on the range for characters (e.g
     * myChar >= 'a' && myChar <= 'z').  You will need to make sure to
     * set all characters to lower case if you do this though.  Otherwise
     * you will need to check for upper and lower case letters as well.
     *
     * NOTE: you can assume the user will enter integers for the cipher
     * index and shift.  However, you will need to make sure the numbers
     * are valid per the instructions given above.
     *
     * NOTE: make sure to close the console before returning.  We will take
     * off points if you do not.  This includes ALL execution paths.
     *
     * HINT: there might be a smarter and more efficient way to
     * encrypt/decrypt individual characters using a caesar cipher than the
     * formulas given above.  Specifically, remember that characters are
     * actually numbers on a range (see above about determining of a char
     * is a letter).
     */
    public static boolean problem3(String encryptedPassword)
    {
        // Creates new Scanner object, readIn
        Scanner readIn = new Scanner(System.in);

        // Defines booleans validPassword, validCipher, and validShift. These are used later to make sure inputs from
        //      user are valid.
        boolean validPassword, validCipher, validShift;

        // Defines and initializes String objects with and empty String. With the exception of alphabet, which is
        //      initialized with the alphabet.
        // input, cipherIndex, and shiftIndex are all inputs Strings from the user. temp is a temporary String used to
        //      create the output String.
        String input = "", cipherIndex = "", shiftIndex = "", temp = "", alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Defines and initializes integers cipherIndexInt, shiftIndexInt, and tempIndex with 0.
        int cipherIndexInt = 0, shiftIndexInt = 0, tempIndex = 0;

        // Starting prompt to Scan in the user input, then transferring a lowercase version of the copy to input.
        System.out.println("Please enter a letter-based password:");
        input = readIn.next().toLowerCase();

        // do while loop to check if the input is all letters. No numbers or special characters are allowed.
        //      If the input does contain the numbers or special characters, then end the check, and ask for
        //      another input
        do{
            // initializing validPassword to true.
            validPassword = true;

            // Checking input to see if it does contain numbers or special characters.
            for(int index = 0; index < input.length(); index++){
                // If number or special character is found, change validPassword to false, then break the for loop by
                //      making the conditional false.
                if(!Character.isLetter(input.charAt(index))){
                    validPassword = false;
                    index = input.length();
                }
            }

            // If validPassword is false OR if the input is of length 0, then ask for another password.
            if(!validPassword || input.length() == 0){
                System.out.println("Invalid password.  Please enter your password:");
                input = readIn.next();
            }
        } while(!validPassword);

        // Prompt for caesar cipher index. Takes in the caesar cipher as a string to avoid errors.
        System.out.println("Please enter your caesar cipher index:");
        cipherIndex = readIn.next();

        // do while loop to check the input and see if its correct.
        do {
            // Setting validCipher to true to assume the input is correct
            validCipher = true;

            // for loop that runs from 0 to cipherIndex.length() to check each char to see if it is a digit or not
            for(int index = 0; index < cipherIndex.length(); index++){

                // If not a digit, then change validCipher to false and end the for loop
                if(!Character.isDigit(cipherIndex.charAt(index))){
                    validCipher = false;
                    index = cipherIndex.length();
                }
            }

            // if validCipher is false, then ask user for new input
            if(!validCipher){
                System.out.println("Invalid value.  Please enter your caesar cipher index:");
                cipherIndex = readIn.next();
            }else{
                // if validCipher is true, parse the string to int, store a copy into cipherIndexInt
                cipherIndexInt = Integer.parseInt(cipherIndex);

                // check value to make sure it is between the bounds of the alphabet [0-25]. If not, ask user for new input
                if(cipherIndexInt < 0 || cipherIndexInt > 25){
                    System.out.println("Invalid value.  Please enter your caesar cipher index:");
                    cipherIndex = readIn.next();
                    validCipher = false;
                }
            }
        } while(!validCipher);

        // Prompts user to enter in a shift index as a string
        System.out.println("Please enter your shift:");
        shiftIndex = readIn.next();

        // do while to check the shiftIndex to make sure it is a valid number.
        do{
            // Setting validShift to true assuming that shiftIndex is valid
            validShift = true;

            // for loop from 0 to shiftIndex.length() to check if the string contains letters
            for(int index = 0; index < shiftIndex.length(); index++){

                // checks if the shiftIndex.atChar(index) char is a NOT a digit AND does not contain '-'
                if(!Character.isDigit(shiftIndex.charAt(index)) && shiftIndex.charAt(index) != '-'){
                    // if so, set validShift to false, then exit the for loop
                    validShift = false;
                    index = shiftIndex.length();
                }
            }

            // if validShift is false, then ask user for new shiftIndex
            if(!validShift){
                System.out.println("Invalid value.  Please enter your shift index:");
                shiftIndex = readIn.next();
            }else{
                //else parses the shiftIndex string to int and stores it into shiftIndexInt
                shiftIndexInt = Integer.parseInt(shiftIndex);
            }
        }while(!validShift);



        // for loop to grab the numeric value of all chars in the input. Then will -10 from that numeric value because
        //      Character.getNumericValue() start 'a' at 10 and 'z' at 36. Once that number is found, then find that
        //      numeric value index inside of alphabet. Will return to a temp string adding onto the current temp String
        for(int index = 0; index < input.length(); index++){
            tempIndex = Character.getNumericValue(input.charAt(index)) - 10;
            temp += alphabet.charAt((tempIndex + cipherIndexInt) % 26);
        }

        // Stores temp into input and sets temp to be empty
        input = temp;
        temp = "";

        // Reduces the shift index to a integer that is between the bounds of [-input.length(), input.length()]
        shiftIndexInt = shiftIndexInt % input.length();



        // shifts the input over char by char and adds each char to temp
        for(int index = 0; index < input.length(); index++){
            temp += input.charAt((input.length() + index - shiftIndexInt) % input.length());
        }

        // Checks if the passed in password, encryptedPassword, and temp are equal. Returns results as a boolean
        return encryptedPassword.toLowerCase().equals(temp);
    }

    public static void main(String[] args)
    {
        int bound1 = 1;
        int bound2 = 5;
        int bound3 = 10;
        System.out.println("Problem 1: " + Integer.toString(problem1(bound1, bound2, bound3)) + "\n"); //0-1 5-10
        System.out.println("Problem 1a: " + problem1(10, 5, 1) + "\n"); // 0
        System.out.println("Problem 1b: " + problem1(5, 15, 17) + "\n"); // 0-5, 15-17
        System.out.println("Problem 1c: " + problem1(5, 15, 30) + "\n"); // 0-5 15-30
        System.out.println("Problem 1d: " + problem1(5, 5, 10) + "\n"); // 0 -10
        System.out.println("Problem 1e: " + problem1(-5, -5, -10) + "\n"); // 0
        System.out.println("Problem 1f: " + problem1(10, 10, 10) + "\n"); // 10


        System.out.println("Problem 2: " + Double.toString(problem2(bound1, bound2, bound3)) + "\n\n\n"); //0-1 5-10
        System.out.println("Problem 2a: " + problem2(10, 5, 1) + "\n"); // 0
        System.out.println("Problem 2b: " + problem2(5, 15, 17) + "\n"); // 0-5, 15-17
        System.out.println("Problem 2c: " + problem2(5, 15, 30) + "\n"); // 0-5 15-30
        System.out.println("Problem 2d: " + problem2(5, 5, 10) + "\n"); // 0 -10
        System.out.println("Problem 2e: " + problem2(-5, -5, -10) + "\n"); // 0
        System.out.println("Problem 2f: " + problem2(10, 10, 10) + "\n"); // 10

        String encryptedPassword = "fjgnnqyqtn"; // seriously, never store passwords as plaintext, always encrypt it
        System.out.println("\n\nProblem 3: " + Boolean.toString(problem3(encryptedPassword)) + "\n");
        System.out.println("\n\nProblem 3a: " + Boolean.toString(problem3("ppsasvphli")) + "\n");
        System.out.println("\n\nProblem 3b: " + Boolean.toString(problem3("szzcKcfzrV")) + "\n");
        System.out.println("\n\nProblem 3c: " + Boolean.toString(problem3("udwnzopqz")) + "\n");
        System.out.println("\n\nProblem 3d: " + Boolean.toString(problem3("ardstudyh")) + "\n");
        System.out.println("\n\nProblem 3e: " + Boolean.toString(problem3("rstcxgzqc")) + "\n");
        System.out.println("\n\nProblem 3f: " + Boolean.toString(problem3("java")) + "\n");

     /* password       cipherText   index   shift
     * helloworld     fjgnnqyqtn   2        1
     * helloWORLD     ppsasvphli   4       -2
     * HelloWorld     szzcKcfzrV   14       999
     * studyhard      udwnzopqz    22       -67 ----- wrong?
     * studyhard      ardstudyh    0        3
     * stuDyharD      rstcxgzqc    25       0
     * JAVA           java         0        0
     */
    }

}
