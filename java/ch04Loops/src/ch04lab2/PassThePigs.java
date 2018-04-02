package ch04lab2;

import java.util.Scanner;
import java.util.Random;
/**
 * Play the game Pass the pigs
 *    Rolls 2 pigs then calculates score
 *    Prints score
 * 2/26/2018
 * @author Roberto Quinones
 * @author Jacob Miska
 */
public class PassThePigs {
   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);       // for user input

      // Names of pig rolls
      final String SIDE_WITHOUT_DOT = "Sider with no dot";
      final String SIDE_WITH_DOT = "Sider with dot";
      final String TROTTER = "Trotter";
      final String RAZORBACK = "Razorback";
      final String SNOUTER = "Snouter";
      final String LEANING_JOWLER = "Leaning jowler";

      // Scores of pig rolls
      final int SCORE_SIDE_NO_DOT = 0;
      final int SCORE_SIDE_WITH_DOT = 0;
      final int SCORE_TROTTER = 5;
      final int SCORE_RAZORBACK = 5;
      final int SCORE_SNOUTER = 10;
      final int SCORE_JOWLER = 15;

      // Probability of pig rolls
      final int PROB_SIDE_NO_DOT =  33;
      final int PROB_SIDE_WITH_DOT = 66;
      final int PROB_TROTTER = 76;
      final int PROB_RAZORBACK = 96;
      final int PROB_SNOUTER = 99;
      final int PROB_JOWLER = 100;

      // Pigs rolled
      String pig1;
      String pig2;

      // Turn and Total scores for pig rolls
      int turnScore = 0;
      int totalScore = 0;

      // For repeating the loop
      char repeat;

      // Begin loop
      do {

         int randomNum1 = new Random().nextInt(100);
         int randomNum2 = new Random().nextInt(100);

         // Begin roll for first pig
         if (randomNum1 < PROB_SIDE_NO_DOT) {
            pig1 = SIDE_WITHOUT_DOT;
            turnScore =  SCORE_SIDE_NO_DOT;
         }
         else if (randomNum1 < PROB_SIDE_WITH_DOT) {
            pig1 = SIDE_WITH_DOT;
            turnScore =  SCORE_SIDE_WITH_DOT;
         }
         else if (randomNum1 < PROB_TROTTER) {
            pig1 = TROTTER;
            turnScore =  SCORE_TROTTER;
         }
         else if (randomNum1 < PROB_RAZORBACK) {
            pig1 = RAZORBACK;
            turnScore =  SCORE_RAZORBACK;
         }
         else if (randomNum1 < PROB_SNOUTER) {
            pig1 = SNOUTER;
            turnScore =  SCORE_SNOUTER;
         }
         else {
            pig1 = LEANING_JOWLER;
            turnScore =  SCORE_JOWLER;
         }





         // Begin roll for second pig
         if (randomNum2 < PROB_SIDE_NO_DOT) {
            pig2 = SIDE_WITHOUT_DOT;
            turnScore = turnScore + SCORE_SIDE_NO_DOT;
         }
         else if (randomNum2 < PROB_SIDE_WITH_DOT) {
            pig2 = SIDE_WITH_DOT;
            turnScore = turnScore + SCORE_SIDE_WITH_DOT;
         }
         else if (randomNum2 < PROB_TROTTER) {
            pig2 = TROTTER;
            turnScore = turnScore + SCORE_TROTTER;
         }
         else if (randomNum2 < PROB_RAZORBACK) {
            pig2 = RAZORBACK;
            turnScore = turnScore + SCORE_RAZORBACK;
         }
         else if (randomNum2 < PROB_SNOUTER) {
            pig2 = SNOUTER;
            turnScore = turnScore + SCORE_SNOUTER;
         }
         else {
            pig2 = LEANING_JOWLER;
            turnScore = turnScore + SCORE_JOWLER;
         }





         // Begin Special Cases
          if (
              ( pig1.equals(SIDE_WITH_DOT)) && ( pig2.equals(SIDE_WITHOUT_DOT)  )
                  ||
              (pig1.equals(SIDE_WITHOUT_DOT)) && (pig2.equals(SIDE_WITH_DOT))  )
          {
              totalScore = 0;
              turnScore = 0;
              System.out.println("Rolling... " + pig1 + " & " + pig2);
              System.out.println("Pig out! No Score.");
              break;
          }

          if( pig1.equals(pig2) ){
              turnScore *= 2;
          }

          if (
              (pig1.equals(SIDE_WITH_DOT) && (pig2.equals(SIDE_WITH_DOT)) )||
              (pig1.equals(SIDE_WITHOUT_DOT) && (pig2.equals(SIDE_WITHOUT_DOT)) ) ){
              turnScore = 1;
          }

          // Calculates total score
          totalScore = totalScore + turnScore;

          // Begin Printing
          System.out.println("Rolling... " + pig1 + " & " + pig2);
          System.out.println("This roll: " + turnScore);
          System.out.println("This turn: " + totalScore);

          System.out.print("Roll again? (y/n) ");
          repeat = scnr.next().charAt(0);
      }

      while (repeat != 'n');
      {
         System.out.println("Your turn is over.");
      }



   }
}
