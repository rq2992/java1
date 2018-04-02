package ch06lab1;

import java.util.Scanner;

/**
 * simulate a container train, version 2 (methods)
 * https://docs.google.com/a/email.vccs.edu/
 * document/d/1OXaNv2rVuroaSH_EakOgCAchPDlDolnotFay982e_Zk/edit?usp=sharing
 * 2016-07-01
 * @version 2
 * @author john maxfield
 * @author Roberto Quinones
 * @author Jacob Miska
 */
public class MethodTrain {
   private static Scanner scnr = new Scanner(System.in);   // for user input


   /**
    * call methods to load and unload train
    * @param args if present, used for descriptions of container
    */
   public static void main(String[] args) {
      String[] trainContainers;              // Strings describing contents of containers on train

      // if the command line args exists, use it to load the "train"
      if (args.length > 0) {
         trainContainers = args;             // new reference to command line arguments
         System.out.println("Strings copied from command line.");
      }

      // otherwise, get the train contents from the user
      else {
         trainContainers = getContainers();
      }

      // "unload" the train
      reverseVals(trainContainers);
      unloadTrain(trainContainers);

   }
/*
* Return the String array representing what’s in the containers.
* */
   public static String[] getContainers() {
      int arraySize = getNumContainers();
      String[] train;
      train = new String[arraySize];
      for (int i = 0; i < train.length; i++){
         System.out.print("What's in container#" + (i + 1) +"? :");
         train[i] = scnr.next();
      }

      return train;
   }

   public static void unloadTrain(String[] trainContainers) {
      String userAnswer;
      System.out.print("Unload from front or back? (f/b) ");
      userAnswer = scnr.next();
      if (userAnswer.equalsIgnoreCase("b")){
         reverseVals(trainContainers);
         }
      for (int i = trainContainers.length-1; i >= 0 ; i--) {
         System.out.println("Unloading " + trainContainers[i]);
      }
   }

   /* Ask the user for the number for the number of containers on a train.
   Return the number of containers.
   */
   public static int getNumContainers() {
      int numCont = -1;
      while (numCont < 0){
         System.out.print("How many containers are on the train? :");
         numCont = scnr.nextInt();
      }
      return numCont;
   }
/*
* Reverses the array in place.
* @param: String Array
* @return: String Array
*
* */

   public static void reverseVals (String[] train){
      String tempVar;
      for (int i = 0; i < train.length / 2; ++i) {
         tempVar = train[i];                        // Temp for swap
         train[i] = train[train.length - 1 - i];    // First part of swap
         train[train.length - 1 - i] = tempVar;     // Swap complete
      }
   }
}




