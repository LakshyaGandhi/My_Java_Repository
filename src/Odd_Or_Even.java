/**
 * Working of my Program - Odd or Even Finder
 * A User Input the following conditions using Scanner Class:
 * Contains any alphabet = Invalid number
 * Enter a number = valid
 * Program processes by the following formulas:
 * if num is divided by 2 and returns remainder=0
 * then print even else odd.....
 */

import java.util.Scanner;

public class Odd_Or_Even {
    public static void main(String[] args) {
        System.out.println("Odd or Even Number Finder");
        while (true) {
            System.out.println("\nEnter a number to start the program");
            System.out.println("Type 'exit' to quit the program.");
            Scanner extscan = new Scanner(System.in);
            String ex = extscan.nextLine();
            String ext = ex.toLowerCase();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                default:
                    try {
                        long n = Long.parseLong(ex);
                        if (n % 2 == 0) {
                            System.out.println("The number " + n + " is Even.");
                        } else {
                            System.out.println("The number " + n + " is Odd.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is an invalid number");
                    }
            }
        }
    }
}