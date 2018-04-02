package Lecture;

public class PizzaArea {
    public static void printFace(char faceChar) {
        System.out.println("  " + faceChar + " " + faceChar);      // Eyes
        System.out.println("   " + faceChar);                      // Nose
        System.out.println("  " + faceChar + faceChar + faceChar); // Mouth

        return;
    }

    public static void main (String [] args) {
        printFace('a');
        return;
    }

}
