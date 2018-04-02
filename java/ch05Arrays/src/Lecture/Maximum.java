package Lecture;

/**
 * <purpose>
 * 3/19/2018
 * @author rq2992
 */
public class Maximum {
   public static void main (String [] args) {
      final int SIZE_LIST = 4;
      int maximum ;
      int[] keysList = new int[SIZE_LIST];
      int[] itemsList = new int[SIZE_LIST];
      int i;
      double average;

      keysList[0] = 42;
      keysList[1] = 105;
      keysList[2] = 101;
      keysList[3] = 100;

      itemsList[0] = 10;
      itemsList[1] = 20;
      itemsList[2] = 30;
      itemsList[3] = 40;

      maximum = keysList[0];
      for (i=0 ; i < keysList.length; i++){
         if (maximum < keysList[i]){
            maximum = keysList[i];
         }

      }

      System.out.println("the maximum value is: " + maximum);
   }

}