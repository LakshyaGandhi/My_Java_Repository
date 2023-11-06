/**
 * Working of my Program - Pendulum Gravity Finder
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet(s) = not a valid length value
 * Enters a length of string = valid
 * Enter a first time containing any alphabet(s) = not a valid time value
 * Enters a first time = valid
 * Enter a second time containing any alphabet(s) = not a valid time value
 * Enters a second time = valid
 * Program processes Using the following formulas:
 * formula for finding ava and then divide it by twenty: (time1+time2)/40 (avg = /2 and then again /20 = /40)
 * gravity formula: (4*PI*PI*length)/formula square
 */

import java.util.Scanner;

public class Pendulum_Gravity {
    public static void main(String[] args) {
        System.out.println("Pendulum Gravity Finder");
        while (true) {
            System.out.println("\nEnter the length of the string of a pendulum");
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
                        double length = Double.parseDouble(ex);
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Enter time(trial 1), seconds = ");
                        String x1 = sc.nextLine();
                        try {
                            double time1 = Double.parseDouble(x1);
                            System.out.print("Enter time(trial 2), seconds = ");
                            String x2 = sc.nextLine();
                            try {
                                double time2 = Double.parseDouble(x2);
                                double formula = (time1 + time2) / 40;
                                double gravity = (4 * Math.PI * Math.PI * length) / (formula * formula);
                                System.out.println("The gravity is = " + gravity + " m/s2");
                            } catch (NumberFormatException e) {
                                System.out.println(x2 + " is not a valid time value");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(x1 + " is not a valid time value");
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(ext + " is not a valid length value");
                    }
            }
        }
    }
}