/**
 * Working of my Program - Three Digit Calculator
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet = Invalid Number
 * Enters number = valid
 * After entering value select function- 1=Add; 2=Subtract; 3=Multiplication; 4=Division
 * Program processes by the following formulas:
 * Add = num1+num2+num3
 * Subtract = num1-num2-num3
 * Multiplication = num1*num2*num3
 * Division = num1/num2/num3
 * Remainder = num1%num2%num3
 * Print.....
 */

import java.util.Scanner;

public class Three_Digit_Calculator {
    public static void printSolution(double num1, double num2, double num3, String operation, double operator) {
        System.out.println("The " + operation + " for " + num1 + ", " + num2 + " and " + num3 + " is " + operator + ".");
    }

    public static void main(String[] args) {
        System.out.println("Three Digit Calculator");
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
                        Scanner scan1 = new Scanner(System.in);
                        String y = scan1.nextLine();
                        try {
                            double num2 = Double.parseDouble(y);
                            System.out.println("Enter your third number");
                            String z = scan1.nextLine();
                            try {
                                double num3 = Double.parseDouble(z);
                                System.out.println("Type 0 - Addition");
                                System.out.println("Type 1 - Subtraction");
                                System.out.println("Type 2 - Multiplication");
                                System.out.println("Type 3 - Division");
                                System.out.println("Type 9 - Stop executing the program");
                                double add = num1 + num2 + num3;
                                double sub = num1 - num2 - num3;
                                double mul = num1 * num2 * num3;
                                double div = num1 / num2 / num3;
                                int input = scan1.nextInt();
                                switch (input) {
                                    case 0:
                                        printSolution(num1, num2, num3, "addition", add);
                                        break;
                                    case 1:
                                        printSolution(num1, num2, num3, "subtraction", sub);
                                        break;
                                    case 2:
                                        printSolution(num1, num2, num3, "multiplication", mul);
                                        break;
                                    case 3:
                                        printSolution(num1, num2, num3, "division", div);
                                        double remainder = num1 % num2 % num3;
                                        System.out.println("Final Remainder left = " + remainder);
                                        break;
                                    case 9:
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println(z + " is not a valid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(y + " is not a valid number");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}