package ch05lab2;
import java.util.Scanner;

/*
 * The program ask the user to enter the ammount of containers of a train, and what
 * the content of the containers are, and then output each one of them.
 * https://drive.google.com/drive/u/1/folders/1dGGW7TjK-mixjfj_EdOaDYSs9mKjHzts
 *
 * Arrays
 * For loop
 *
 *
 * * 03/20/2018
 *
 * @author: Roberto Quinones
 * @author: Jacob Miska
 *
 * */

public class ArrayTrain {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);  // Get input from the user
        int numContainers;                      // Holds the number of containers
        int i;                                  // Loops count
        String[] train;                         // Declare the array

        //Ask the user for the numbers of containers and store it
        System.out.print("How many containers are on the train? :");
        numContainers = scnr.nextInt();

        //Assign the number of elements to the array
        train = new String[numContainers];

        //Assign the value of each element of the array from user input
        for (i = 0; i < train.length; i++){
            System.out.print("What's in container#" + (i + 1) +"? :");
            train[i] = scnr.next();
        }

        // "Unloading" each container
        for (i = train.length-1; i >= 0 ; i--) {
            System.out.println("Unloading " + train[i]);
        }
    }
}
