package Lecture;

import java.util.Scanner;

public class TicketCounter {
   public static void main (String [] args) {
      int awardPoints;
      int userTickets;

      Scanner scnr = new Scanner(System.in);
      userTickets = scnr.nextInt(); // Program will be tested with values: 4, 5, 6, 7.

      if (userTickets > 5){
         awardPoints = 10;
      }
      else {
         awardPoints = userTickets;

      }

      System.out.println(awardPoints);
   }
}
