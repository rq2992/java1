package Lecture;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static double CtoF(double C){
        double F = ((9/5) * C) + 32;
        return F;
    }


    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double tempF;
        double tempC;

        System.out.print("Enter temperature in Celsius: ");
        tempC = scnr.nextDouble();

        tempF = CtoF(tempC); // FIXME

        System.out.print("Fahrenheit: ");
        System.out.println(tempF);
    }
}
