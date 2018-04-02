package ch04lab1;
import java.util.Scanner;

/*
 * The program ask the user for a number between 0 and 118, and then
 * prints the char value of that int, plus the next 10 values.
 *
 * if
 * Do while loop
 * for loop
 *
 * https://docs.google.com/document/d/1zPaopSeztlw_VbM6fajKZ24LYjnftoHXBqjSajoy3Es/edit
 * * 2/21/18
 *
 * @author: Roberto Quinones
 * @author: Jacob Miska
 *
 * */

public class CharacterTables {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in) ; // Variable to get the input
        final int MIN_CHAR = 0;                 // Minimum input value possible
        final int MAX_CHAR = 118;               // Maximum input value possible
        final int NUM_OF_ROWS = 10;             // Number of rows

        int userNum;            //Variable to hold the user input
        int i;                  // variables to count in the loops

        char decision;          // User input to Continue or Quit ('Q' or not 'Q')


        // Loop to get inputs and compare them
        do {
            System.out.print("Enter a starting integer between 0 and 118: ");
            userNum = scnr.nextInt();
            if (!((userNum >= MIN_CHAR) && (userNum <= MAX_CHAR))){
                System.out.print("Game over, thank you for playing.");
                break;
            }
            // Inner loop, print the input, and the char value of the input + 10
            for (i = userNum ; i < (userNum + NUM_OF_ROWS); i++ ){
                System.out.println(i + "\t\t" + (char)i);
            }
            // Prompt the user to continue or quit
            System.out.print("Enter \'C\' to continue, or \'Q\' to quit: ");
            decision = scnr.next().charAt(0);
        } while (decision != 'Q');
    }
}
