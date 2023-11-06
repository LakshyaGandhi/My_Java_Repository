/**
 * Working of my Program - Factor Finder
 * A User Input the following conditions using Scanner Class:
 * Not select available function = Invalid input
 * Contains any alphabet(for both the function) = Invalid number
 * Program processes by the following formulas:
 * Positive Number = should be more than or equal to one
 * Negative Number = less than or equal to minus one
 * 1st Function = variable i=1
 * For loop = increment value
 * Print number if remainder comes 0.
 * Loop until i = inputted variable
 * 2nd Function = variable i1=1
 * For loop = increment value
 * Print number if remainder comes 0
 * Loop until i1 = inputted variable.....
 */

import java.util.Scanner;

public class Factors_of_No {
    public static void main(String[] args) {
        System.out.println("Factor Finder");
        while (true) {
            System.out.println("\nType 1 - To find Factors of Positive Numbers");
            System.out.println("Type 2 - To find Factors of Negative Numbers");
            System.out.println("OR Type 'exit' to quit the program.");
            Scanner extscan = new Scanner(System.in);
            String ex = extscan.nextLine();
            String ext = ex.toLowerCase();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                case "1":
                    System.out.print("Enter a positive number = ");
                    Scanner sc = new Scanner(System.in);
                    String x = sc.nextLine();
                    try {
                        long num = Long.parseLong(x);
                        long i = 1;
                        if (i <= num) {
                            for (i = 1; i <= num; ++i) {
                                if (num % i == 0) {
                                    System.out.print(i + " ");
                                }
                            }
                        } else if (num == 0) {
                            System.out.println("Entered number should not be zero");
                        } else {
                            System.out.println("Entered number should be positive");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number");
                    }
                    break;
                case "2":
                    System.out.print("Enter a negative number = ");
                    Scanner scan = new Scanner(System.in);
                    String y = scan.nextLine();
                    try {
                        long num1 = Long.parseLong(y);
                        long i1 = -1;
                        if (i1 <= num1) {
                            for (i1 = -1; i1 <= Math.abs(num1); ++i1) {
                                if (i1 == 0) {
                                    continue;
                                } else {
                                    if (num1 % i1 == 0) {
                                        System.out.print(i1 + " ");
                                    }
                                }
                            }
                        } else {
                            System.out.println("Entered number should be negative");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number");
                    }
                    break;
                default:
                    System.out.println("Invalid Input.");
            }
        }
    }
}