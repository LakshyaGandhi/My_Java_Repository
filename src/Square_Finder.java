/**
 * Working of my Program - Square Finder
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet = is an invalid number
 * Enters a number = valid
 * Program processes by the following formulas:
 * Square = Number*Number
 * Print the value.....
 */

import java.util.Scanner;

public class Square_Finder {
    public static void main(String[] args) {
        System.out.println("Square Finder");
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
                        double num = Double.parseDouble(ex);
                        double sqr = num * num;
                        System.out.println("The Square of " + num + " is " + sqr + ".");
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is an invalid number");
                    }
            }
        }
    }
}