package Lecture;
import java.util.Scanner;


public class MileageCalc {
    public static double convKilometersToMiles(double numKm) {
        double milesPerKm = 0.621371;
        return numKm * milesPerKm;
    }

    public static double convLitersToGallons(double numLiters) {
        double litersPerGal = 0.264172;
        return numLiters * litersPerGal;
    }

    public static double calcMpg(double distMiles, double gasGallons) {

        double Mpg = (distMiles * gasGallons);
        return Mpg;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double distKm;
        double distMiles;
        double gasLiters;
        double gasGal;
        double userMpg;

        System.out.println("Enter kilometers driven: ");
        distKm = scnr.nextDouble();
        System.out.println("Enter liters of gas consumed: ");
        gasLiters = scnr.nextDouble();

        distMiles = convKilometersToMiles(distKm);
        gasGal = convLitersToGallons(gasLiters);
        userMpg = calcMpg(distMiles, gasGal);

        System.out.println("Miles driven: " + distMiles);
        System.out.println("Gallons of gas: " + gasGal);
        System.out.println("Mileage: " + userMpg + " mpg");
    }
}
