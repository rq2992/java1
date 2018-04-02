package ch03lab1;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;


/**
 * This program determine the elegibility for US Congress of a user dependeing on
 * their age and time of citizenship
 *
 * 2/7/2018
 * @author Roberto J
 * @author Ramiro
 *
 */

public class CongressEligibility {
   public static void main (String [] args){
      //Variable to get the input from the user
      Scanner scnr = new Scanner(System.in);

      final int MIN_AGE_REP = 25; //minimum age of  representatives
      final int MIN_AGE_SEN = 30; //minimum age of senators
      final int MIN_CIT_REP = 7;  //minimum citizenship years for Representatives
      final int MIN_CIT_CEN = 9;  //minimum citizenship years for Cenators

      System.out.println("Enter your age: ");
      int userAge = scnr.nextInt();        //User age input
      System.out.println("Enter the ammount of years you have been a Citizen os USA: ");
      int userCitYears = scnr.nextInt();   //User years of citizenship input

      if ((userAge >= MIN_AGE_SEN) && (userCitYears >= 9)){
         System.out.println("You are eligible to be a member of the House or the Senate.");
      }
      else if((userAge >= MIN_AGE_REP)&&(userCitYears >= MIN_CIT_REP)){
         System.out.println("You are eligible to be a member of the House.");
      }
      //
      else{
         System.out.println("You are not eligible to be a member of Congress.");
      }
   }
}
