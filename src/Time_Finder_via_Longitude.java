/**
 * Working of my Program - Time Finder via Longitude
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet(for every function) = Invalid longitude
 * Enter a longitude more than 360 = Should be less than or equal to 360
 * Program processes by the following formulas:
 * Hour = (longitude*4)/60
 * Remainder is the Minutes = (num*4)%60
 * If num<180:
 * East Side = Print as it is (PM)
 * West Side = 11-hr and 60-minutes (AM) ["-" is minus]
 * If num==180:
 * Print Time 12:00 AM For East and West
 * Else:
 * As the longitude entered by the user is greater than 180, the answer will be more than 12hrs.
 * Therefore, the time will be substituted with 12hrs.
 * And then it will be printed in 12-hr format.
 * East Side = Print as it is (AM)
 * West Side = Print as it is (PM)
 */

import java.util.Scanner;

public class Time_Finder_via_Longitude {
    public static void main(String[] args) {
        System.out.println("Time Finder via Longitude");
        while (true) {
            System.out.println("\nEnter a longitude to start the program");
            System.out.println("OR Type 'exit' to quit the program.");
            Scanner extscan = new Scanner(System.in);
            String ex = extscan.nextLine();
            String ext = ex.toLowerCase();
            if (ext.equals("exit")) {
                System.exit(0);
            } else {
                try {
                    float num = Float.parseFloat(ex);
                    float hr = (num * 4) / 60;
                    float rem = (num * 4) % 60;
                    if (num <= 360) {
                        int hrr = (int) hr;
                        int rem1 = (int) rem;
                        int westhrr = 11 - hrr, westrem1 = 60 - rem1;
                        if (num < 180) {
                            System.out.println("The time is " + hrr + "hr : " + rem1 + "min PM for East");
                            System.out.println("The time is " + westhrr + "hr : " + westrem1 + "min AM for West");
                        } else if (num == 180) {
                            System.out.println("The time is 12hr : 00min AM for East");
                            System.out.println("The time is 12hr : 00min AM for West");
                        } else {
                            int _12hr_format = hrr - 12;
                            System.out.println("The time is " + _12hr_format + "hr : " + rem1 + "min AM for East");
                            System.out.println("The time is " + _12hr_format + "hr : " + rem1 + "min PM for West");
                        }
                    } else {
                        System.out.println("The longitude should be less than or equal to 360");
                    }
                } catch (NumberFormatException e) {
                    System.out.println(ex + " is not a valid longitude");
                }
            }
        }
    }
}