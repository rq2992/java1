package ch04lab2;
import java.util.Scanner;
import java.util.Random;


/*
 * Pass the Pigs Game. To see details visit:
 * https://en.wikipedia.org/wiki/Pass_the_Pigs
 *
 * if
 * Do while loop
 * for loop
 *
 * https://docs.google.com/document/d/1zj43T8-b3I8gn-AMNMkX3AYxwjOr_TNk8YIeMTB_yMY/edit
 * * 2/21/18
 *
 * @author: Roberto Quinones
 * @author: Jacob Miska
 *
 * */


public class PassThePigs {

    public static void main(String[] args) {
        Random RandGen = new Random();  // New random number generator
//4
        final String SIDEDOT = "Sider(Dot)";
        final String SIDER = "Sider(No Dot)";
        final String TROTTER = "Trotter";
        final String RAZORBACK = "Razorback";
        final String SNOUTER = "Snouter";
        final String LEANJOWLER = "Leaning Jowler";
//5
        final int SCR_SIDEDOT = 0;
        final int SCR_SIDER = 0;
        final int SCR_TROTTER = 5;
        final int SCR_RAZORBACK = 5;
        final int SCR_SNOUTER = 10;
        final int SCR_LEANJOWLER = 15;
//6
        final int PROB_SIDEDOT = 66;
        final int PROB_SIDER = 33;
        final int PROB_TROTTER = 76;
        final int PROB_RAZORBACK = 96;
        final int PROB_SNOUTER = 99;
        final int PROB_LEANJOWLER = 100;
//7
        String RolledPigA, RolledPigB;
//8
        int TurnScore, TotalScore = 0;

        // Outer Loop Start Here  FIXME
            TurnScore = 0;                            //11

            // FIXME One Turn
            // Rolling  Die  A
            int RandomNum = RandGen.nextInt(99);          //12

            if (RandomNum < PROB_SIDER){
                RolledPigA = SIDER;
            }
            else if (RandomNum >= PROB_SIDER && RandomNum < PROB_SIDEDOT){
                RolledPigA = SIDEDOT;
            }
            else if (RandomNum >= PROB_SIDEDOT && RandomNum < PROB_TROTTER){
                RolledPigA = TROTTER;
            }
            else if (RandomNum >= PROB_TROTTER && RandomNum < PROB_RAZORBACK){
                RolledPigA = RAZORBACK;
            }
            else if (RandomNum == PROB_LEANJOWLER){
                RolledPigA = LEANJOWLER;
            }

            // FIXME
            // Rolling  Die  B

            int RandomNumB = RandGen.nextInt(99);          //12

            if (RandomNum < PROB_SIDER){
                RolledPigB = SIDER;
            }
            else if (RandomNum >= PROB_SIDER && RandomNum < PROB_SIDEDOT){
                RolledPigB = SIDEDOT;
            }
            else if (RandomNum >= PROB_SIDEDOT && RandomNum < PROB_TROTTER){
                RolledPigB = TROTTER;
            }
            else if (RandomNum >= PROB_TROTTER && RandomNum < PROB_RAZORBACK){
                RolledPigB = RAZORBACK;
            }
            else if (RandomNum == PROB_LEANJOWLER){
                RolledPigB = LEANJOWLER;
            }

            






       }

    }
}
