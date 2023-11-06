/**
 * Working of my Program - Find Prime Number between two numbers
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet = not a valid number
 * Enters a number = valid
 * Program processes by the following formulas:
 * If inputted number returns remainder as zero when is divided by 2 then it's even
 * Print - Invalid Number. Enter a Prime Number
 * Else do this:
 * Variable One = 1
 * Increase value of variable One by 2
 * While it doesn't get equal to or less than the entered prime number by the user.....
 */

import java.util.Scanner;

public class Prime_No_Finder {
    public static void main(String[] args) {
        System.out.println("Prime Number Finder");
        while (true) {
            System.out.println("\nFind a prime number between 1 and...");
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
                        long pn = Long.parseLong(ex);
                        int one = 1;
                        if (pn % 2 == 0) {
                            System.out.println("Invalid Input. Enter a Prime Number");
                        } else {
                            do {
                                System.out.print(one + " ");
                                one += 2;
                            } while (one <= pn);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}