/**
 * Working of my Program - Average Finder
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet(s) = not a valid number
 * Enters a first number = valid
 * Enter a second number containing any alphabet(s) = not a valid number
 * Enters a second number = valid
 * Enter a third number containing any alphabet(s) = not a valid number
 * Enters a third number = valid
 * Program processes by the following formulas:
 * if else:
 * 1st case: num1 is bigger than num2 as well as num3
 * 2nd case: num2 is bigger than num1 and num2
 * else: num3 is the largest number
 * variable sqr = the biggest number square
 * variable add = [2nd number*2nd number]+[3rd number*3rd number]
 * if sqr is equal to add, then it's pythagorean triplet
 * else not.
 * Print.....
 */

import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void printSolution(double num1, double num2, double num3) {
        double num1sqr = Math.pow(num1, 2);
        double add = (num2 * num2) + (num3 * num3);
        if (num1sqr == add) {
            System.out.println("Numbers: " + (int) num1 + ", " + (int) num2 + ", " + (int) num3 + " are Pythagorean Triplets.");
        } else {
            System.out.println("It's not a Pythagorean Triplet.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Pythagorean Triplet Verifier");
        while (true) {
            System.out.println("\nEnter 1st number");
            System.out.println("OR Type 'exit' to quit the program."); //user input for typing first number or exit
            Scanner extscan = new Scanner(System.in);
            String ex = extscan.nextLine();
            String ext = ex.toLowerCase();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                default:
                    try {
                        double num1 = Double.parseDouble(ex);
                        System.out.print("Enter second number = "); //asking input for second number
                        String n2 = extscan.nextLine();
                        try {
                            double num2 = Double.parseDouble(n2);
                            System.out.print("Enter third number = ");
                            String n3 = extscan.nextLine();
                            try {
                                double num3 = Double.parseDouble(n3);
                                if (num1 >= num2 && num1 >= num3) {
                                    printSolution(num1, num2, num3);
                                } else if (num2 >= num1 && num2 >= num3) {
                                    printSolution(num2, num1, num3);
                                } else {
                                    printSolution(num3, num1, num2);
                                }
                            } catch (NumberFormatException e) {
                                System.out.println(n2 + " is not a valid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(n2 + " is not a valid number");
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}