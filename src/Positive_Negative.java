/**
 * Working of my Program - Positive Negative Finder
 * A User Input the following conditions using Scanner Class:
 * Contains any alphabet = Invalid number
 * Enters a number = valid
 * Program processes by the following formulas:
 * if number is bigger than 0.0 than positive
 * else if number is smaller than 0.0 than negative
 * else neither positive nor negative(zero)
 * print.....
 */

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        System.out.println("Positive and Negative Number Finder");
        while (true) {
            System.out.println("\nEnter a Positive or Negative number to start the program");
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
                        if (num > 0.0) {
                            System.out.println("The number " + num + " is Positive.");
                        } else if (num < 0.0) {
                            System.out.println("The number " + num + " is Negative.");
                        } else {
                            System.out.println("The number " + num + " is Neither Positive nor Negative.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is an invalid number");
                    }
            }
        }
    }
}