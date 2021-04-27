/*
* This program generate random number between 1 to 6,
* get user number, check these two numbers are correct.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-04-27
*/
// package ca.mths.unit1.unit05.java.main;

import java.util.Scanner;
import java.util.Random;

public final class DiceGame {
    // constant
    /** max number of normal dice. */
    static final int NORMAL_DICE = 6;

    private DiceGame() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method get the type of food, number of food and
    * prints out the time to reheat in the microwave.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        Random random = new Random();

        // Genrate random number between 1 to 6
        int randomNumber = random.nextInt(NORMAL_DICE) + 1;

        while (true) {
            System.out.print("Guess the number between 1 to 6: ");
            try {
                // condition
                userNumber = Integer.parseInt(myObj.nextLine());
                if (userNumber >= 1 && userNumber <= NORMAL_DICE) {
                    if (userNumber == randomNumber) {
                        break;
                    } else {
                        System.out.print("Wrong number!");
                    }
                } else {
                    System.out.print("Out of range!");
                }

            } catch (Exception ex) {
                System.err.print("Invalid input!");
            }
            System.out.println("\nTry again!");
        }
        System.out.println("Correct! The number is " + randomNumber + "!");
        System.out.println("\nDone.");
    }
}
