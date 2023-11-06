/**
 * Working of my Program - HCF & LCM
 * A User Input the following conditions using Scanner Class:
 * Contains any alphabet = is not a valid number
 * Enters the first number = valid
 * Enters the second number = valid
 * Program processes by the following formulas:
 * on1 & on2 = original numbers
 * n1 & n2 = new numbers
 * remainder = n1%n2
 * n1 = n2
 * n2 = remainder
 * gcd = n2
 * lcm = (on1 * on2)/gcd [formula]
 * Print - The HCF of on1 and on2 = gcd
 * Print - The LCM of on1 and on2 = lcm.....
 */

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        System.out.println("HCF and LCM Calculator");
        while (true) {
            System.out.println("\nEnter first number to start the program");
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
                        Long.parseLong(ex);
                        Scanner sc = new Scanner(System.in);
                        long n1 = Long.parseLong(ex);
                        System.out.println("Enter second number");
                        String num = sc.nextLine();
                        try {
                            long n2 = Long.parseLong(num);
                            long on1 = n1;
                            long on2 = n2;
                            while (n1 % n2 != 0) {
                                long remainder = n1 % n2;
                                n1 = n2;
                                n2 = remainder;
                            }
                            long gcd = n2;
                            long lcm = (on1 * on2) / gcd;
                            System.out.println("The HCF of " + on1 + " and " + on2 + " is = " + gcd);
                            System.out.println("The LCM of " + on1 + " and " + on2 + " is = " + lcm);
                        } catch (NumberFormatException e) {
                            System.out.println(num + " is not a valid number");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}