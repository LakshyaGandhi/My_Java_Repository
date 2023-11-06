/**
 * Working of my Program - Interest Calculator
 * A User Input the following conditions using Scanner Class:
 * Contains any alphabet = Invalid number
 * Enters principal amount = valid
 * Enters rate of interest = valid
 * Enters time period in years = valid
 * Program processes by the following formulas:
 * Simple Interest = (P*R*T)/100
 * Compound Interest = P*(Math.pow((1 + R / 100), T)).....
 */

import java.util.Scanner;

public class Interest_Calci {
    public static void main(String[] args) {
        System.out.println("Simple and Compound Interest Calculator");
        while (true) {
            System.out.println("\nEnter the Principal Amount (To start the program)");
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
                        Scanner sc = new Scanner(System.in);
                        double P = Double.parseDouble(ex);
                        System.out.print("Enter the Rate of Interest = ");
                        String y = sc.nextLine();
                        try {
                            double R = Double.parseDouble(y);
                            System.out.print("Enter the Time Period in Years = ");
                            String z = sc.nextLine();
                            try {
                                double T = Double.parseDouble(z);
                                double SIformula = (P * R * T) / 100;
                                double CIformula = P * (Math.pow((1 + R / 100), T));
                                System.out.printf("\nThe Simple Interest is = Rs %,.2f", SIformula);
                                System.out.printf("\nThe Compound Interest is = Rs %,.2f", CIformula);
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid Number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Number");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Number");
                    }
            }
        }
    }
}