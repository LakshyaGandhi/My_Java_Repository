/**
 * Working of my Program - Square Root Finder
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet = Invalid number
 * Program processes by the following formulas:
 * If entered number is whole verifying:
 * Entered number - Math.floor(entered number) == 0
 * Math.floor will return the decimal zero value for ex,
 * 2.2 = 2.0; 29.999 = 29.0; 30.0 = 30.0, etc.
 * Print the square root
 * Else Not a whole number.....
 */

import java.util.Scanner;

public class Sqrt_Finder {
    public static void main(String[] args) {
        System.out.println("Square Root Finder");
        while (true) {
            System.out.println("\nEnter a number to start the program");
            System.out.println("OR Type 'exit' to quit the program.");
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
                        if (num - Math.floor(num) == 0) {
                            float sqrt = (float) Math.sqrt(num);
                            System.out.println("The Square Root of " + num + " is " + sqrt + ".");
                        } else {
                            System.out.println("Invalid Input. Enter a Whole Number");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is an invalid number");
                    }
            }
        }
    }
}