package ch02lab1;
import java.util.Scanner;

/*
@authors: Roberto Quinones, Ramiro Rojas, Michael Simonetti
*/

public class TrainWeight {
    public static void main (String [] args){
        Scanner scnr = new Scanner(System.in);

        final double GEAC6000CW_WEIGHT = 423000.000;      // weight of the GE AC6000CW locomotive
        final double EMPTY_TRAIN_CAR_WEIGHT = 58000.000;  // weight of a single empty train car
        int numOfLocomotives;                             // Number of locmotives
        int numOfTrainCars;                               // Number of train cars entered
        double totalEmptyTrainWheight;                    // Calculate the total wheight

        //prompt the user for the number of locomotives
        System.out.print("Enter the number of locomotives: ");
        //Assign the value entered by the user to the variable numOfLocomotives
        numOfLocomotives = scnr.nextInt();
        //prompt the user for the number of train cars
        System.out.print("Enter the number of train cars: ");
        //Assign the value entered by the user to the variable numOfTrainCars
        numOfTrainCars = scnr.nextInt();

        // Calculating the totalEmptyTrainWheight and printing the result
        totalEmptyTrainWheight =
            numOfLocomotives * GEAC6000CW_WEIGHT + numOfTrainCars * EMPTY_TRAIN_CAR_WEIGHT;
        System.out.println ("The total empty weight of the train is: "+
                                totalEmptyTrainWheight + " pounds.");

        return;
    }
}

