package ch02lab2;
import java.util.Scanner;

public class IceCreamCone {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String favFlavor;               // favorite ice cream flavor variable
        double coneHeight;              // height  of the cone variable
        double coneDiameter;            // diameter of the cone variable

        // Get user's favorite ice cream flavor, height and diameter of the cone
        System.out.print("Please tell me your favorite ice cream flavor: ");
        favFlavor = scnr.next();

        System.out.print ("What is the height of the ice cream cone?: ");
        coneHeight = scnr.nextDouble();

        System.out.print ("What is the diameter of the ice cream cone?: ");
        coneDiameter = scnr.nextDouble();

        // use the variable favFlavor to display a string message
        String iLikefavFlavor = favFlavor + " ice cream is my favorite too! " ;
        System.out.println(iLikefavFlavor);

        // Print the string variable ILikefavFlavor in Upper case
        iLikefavFlavor = iLikefavFlavor.toUpperCase();
        System.out.println(iLikefavFlavor);

        // Print the lengt of favFlavor
        System.out.println("There are " +favFlavor.length()+ " letters in "+
                               "\"" +favFlavor + "\".");


        // Doing the Math !!!
        double radiusOfCone = coneDiameter * 1/2;        // radius of the cone variable
        double piValue = Math.PI;                      // variable for the value of Pi
        double iceCreamConeVolume = piValue * Math.pow(radiusOfCone, 2) * coneHeight * 1/3;



        System.out.println("An ice cream cone of that size can hold a volume of "+
                               iceCreamConeVolume + " of " + favFlavor + " ice cream!.");



    }
}
