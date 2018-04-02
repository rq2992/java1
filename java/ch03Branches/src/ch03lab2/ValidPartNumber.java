package ch03lab2;
import java.util.Scanner;

/*
* The program checks a string entered by the user, and decide
* if is a part or not based on the specific rules.
*     Multiple If else
*     Switch Statement
*     Logical Operators
* https://docs.google.com/document/d/1aP4Ai2ydJAbWfYvZTpZxl_yJCTrsy16k0INVsLk5R6w/edit
*  
* 2/14/18 
* @author: Roberto Quinones
* @author: Jacob Miska
*
* */
public class ValidPartNumber {
    public static void main(String[] args) {
        // Variables Declaration
        Scanner scnr = new Scanner(System.in);  // Variable to scan the input
        System.out.println("Enter the part: ");

        String posPartNum = scnr.next();        // User input (Possible part)
        String isOrISNot;                       // "Is" or "IS NOT" string variable

        boolean isValid = true;                 //  holds true or false fo the final verification
        final int PART_LENGTH = 6;              // Constant for the string length


        // Decide if the part is valid
        // Compare the length
        if (posPartNum.length() != PART_LENGTH){
            isValid = false;
        }
        // Compare the first two Characters
        else {
            String first2Chars = posPartNum.substring(0,2);
            switch (first2Chars){
                case "SR": case "SD": case "TU": case "TR":
                // Compare the third caracter
                   if (posPartNum.charAt(2) != '-'){
                        isValid = false;
                }
                // Compare the last three characters
                    else if(!Character.isDigit(posPartNum.charAt(3))
                    || !Character.isDigit(posPartNum.charAt(4))
                    || !Character.isDigit(posPartNum.charAt(5))){

                        isValid = false;
                }
                break;

                default:
                    isValid = false;
                    break;
                }
            }

        // Print the Final answer
        if (isValid){
            isOrISNot = "IS ";
        }
        else {
            isOrISNot = "is NOT ";
        }
        System.out.println("The part that you entered " + isOrISNot + "a valid part.");
   }
}

