package Lecture;

/**
 * <purpose>
 * 3/19/2018
 * @author rq2992
 */
import java.util.Scanner;

public class FindMatchValue {
   public static void main (String [] args) {
      final int NUM_VALS = 4;
      int[] userValues = new int[NUM_VALS];
      int i;
      int matchValue;
      int numMatches = -99; // Assign numMatches with 0 before your for loop

      userValues[0] = 2;
      userValues[1] = 2;
      userValues[2] = 1;
      userValues[3] = 2;

      matchValue = 2;

      numMatches = 0;
      for (i = 0 ; i < userValues.length ; i++ ){
         if (userValues[i] == matchValue){
            numMatches++;
         }
      }

      System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
   }
}