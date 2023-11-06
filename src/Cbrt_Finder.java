/**
 * Working of my Program - Cube Root Finder
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet(s) = not a valid number
 * Not Entering a Whole Number = invalid input; enter whole number
 * Enters a whole number = valid
 * Program processes Math.cbrt....float
 */

import java.util.Scanner;

public class Cbrt_Finder {
    public static void main(String[] args) {
        System.out.println("Cube Root Finder");
        while (true) {
            System.out.println("\nEnter a number to start the program");
            System.out.println("OR Type 'exit' to quit the program."); // user input for typing the number o
            Scanner extscan = new Scanner(System.in);
            String ex = extscan.nextLine();
            String ext = ex.toLowerCase();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                default:
                    try {
                        float num = Float.parseFloat(ex);
                        if (num - Math.floor(num) == 0) { // checking if user inputted number is whole or decimal
                            float cbrt = (float) Math.cbrt(num);
                            System.out.println("The Cube Root of " + num + " is " + cbrt + ".");
                        } else {
                            System.out.println("Invalid Input. Enter a Whole Number");
                            break;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}