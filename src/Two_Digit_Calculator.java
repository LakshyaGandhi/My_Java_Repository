/**
 * Working of my Program - Two Digit Calculator
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet = Invalid Number
 * Enters number = valid
 * After entering value select function- 1=Add; 2=Subtract; 3=Multiplication; 4=Division
 * Program processes by the following formulas:
 * Add = num1+num2
 * Subtract = num1-num2
 * Multiplication = num1*num2
 * Division = num1/num2
 * Remainder = num1%num2
 * Print.....
 */

import java.util.Scanner;

public class Two_Digit_Calculator {
    public static void printSolution(double num1, double num2, String operation, double operator) {
        System.out.println("The " + operation + " for " + num1 + " and " + num2 + " is " + operator + ".");
    }

    public static void main(String[] args) {
        System.out.println("Two Digit Calculator");
        while (true) {
            System.out.println("\nEnter first number to execute the program");
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
                        double num1 = Double.parseDouble(ex);
                        System.out.println("Enter your second number");
                        Scanner scan2 = new Scanner(System.in);
                        String x = scan2.nextLine();
                        try {
                            double num2 = Double.parseDouble(x);
                            System.out.println("Type 0 - Addition");
                            System.out.println("Type 1 - Subtraction");
                            System.out.println("Type 2 - Multiplication");
                            System.out.println("Type 3 - Division");
                            System.out.println("Type 9 - Stop executing the program");
                            double add = num1 + num2;
                            double sub = num1 - num2;
                            double mul = num1 * num2;
                            double div = num1 / num2;
                            int input = scan2.nextInt();
                            switch (input) {
                                case 0:
                                    printSolution(num1, num2, "addition", add);
                                    break;
                                case 1:
                                    printSolution(num1, num2, "subtraction", sub);
                                    break;
                                case 2:
                                    printSolution(num1, num2, "multiplication", mul);
                                    break;
                                case 3:
                                    printSolution(num1, num2, "division", div);
                                    double remainder = num1 % num2;
                                    System.out.println("Remainder left = " + remainder);
                                    break;
                                case 9:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Invalid Input");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(x + " is not a valid integer");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid integer");
                    }
            }
        }
    }
}