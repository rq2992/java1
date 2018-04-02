package ch06lab2;
import java.util.Scanner;

public class TipCalculator {
    private static Scanner scnr = new Scanner(System.in);
    private static double checkAmount = getCheckAmount();
    private static double tipPct = getTipPct();
    private static int qtyOfPeople = getDinerCount();
    private static double total = getTotal();

    public static double getCheckAmount (){
        System.out.print("Enter amount of check (before tip): ");
        double amount = scnr.nextDouble ();
        while (amount <= 0.0){
            System.out.print("Error! check amount must be greater than 0.00. Please re-enter: ");
            amount = scnr.nextDouble();
        }
        return amount;
    }

    public static double getTipPct(){
        System.out.print("How much should the tip be? (Enter 18 for 18%): ");
        int tip = scnr.nextInt();
        while (tip < 0 || tip >= 100){
            System.out.print("Error! Tip must be between 0 and 100. Please re-enter: ");
            tip = scnr.nextInt();
        }
        double tipDouble = tip / 100.00;
        return tipDouble;
    }

    public static int getDinerCount(){
        System.out.print("How many will share the bill? ");
        int peopleCount = scnr.nextInt();
        while (peopleCount <= 0){
            System.out.print("Error! Number of diners must be at least 1. Please re-enter: ");
            peopleCount = scnr.nextInt();
        }
        return peopleCount;
    }

    public static double getTotal (){
        double total;
        total = checkAmount + (checkAmount*tipPct);
        return total;
    }

    // FIXME
    public static void displayData(){
        double tip = tipPct * 100;
        double totalPerPerson = total/qtyOfPeople;

        System.out.println("If the check is $" + checkAmount);
        System.out.println("and the desired tip is " + (int)tip + "%");
        System.out.println("then each person's share is $" + totalPerPerson);
    }

    // FIXME
    public static void main(String[] args) {


        //        displayData();
    }
}
