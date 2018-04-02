package lecture;
import java.util.Scanner;

public class TypeCasting {
   public static void main (String [] args) {
      int numKidsA;
      int numKidsB;
      int numKidsC;
      int numFamilies;
      double avgKids;

      numKidsA = 1;
      numKidsB = 4;
      numKidsC = 5;
      numFamilies = 3;

      avgKids = (numKidsA + numKidsB + numKidsC) / (double) numFamilies;

      System.out.print("Average kids per family: ");
      System.out.println(avgKids);
   }
}