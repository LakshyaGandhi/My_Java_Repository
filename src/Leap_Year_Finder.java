/**
 * Working of my Program - Leap Year Finder
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet = Not a valid year
 * Note: Program supports year between 1000-9999
 * Enters a year = valid
 * Program process by the following formulas:
 * If-Else Leap Year = Divided by 4, 100 & 400; returns remainder zero
 * Else Non-leap year....
 */

import java.util.Scanner;

public class Leap_Year_Finder {
    public static void main(String[] args) {
        System.out.println("Leap Year and Non-Leap Year Finder");
        while (true) {
            System.out.println("\nEnter a year to start the program");
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
                        long year = Short.parseShort(ex);
                        if (year > 999 && year < 10000) {
                            if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
                                System.out.println(year + " is a Leap Year");
                            } else {
                                System.out.println(year + " is a Non-Leap Year");
                                break;
                            }
                        } else {
                            System.out.println("Program doesn't support this year");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid year");
                    }
            }
        }
    }
}