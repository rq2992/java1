package Lecture;

import java.util.Scanner;

public class YearChecker {
   public static void main (String [] args) {
      int givenYear = 0;

      givenYear = 1776;

      if (givenYear >= 2100){
         System.out.println("Distant future");
      }
      else if (givenYear >= 2000){
         System.out.println("21st century");
      }
      else if (givenYear >= 1900 ){
         System.out.println("20st century");
      }
      else {
         System.out.println("Long ago");
      }

      return;
   }
}