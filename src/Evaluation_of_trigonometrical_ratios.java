/**
 * A User Inputs the following conditions/options using Scanner Class:
 * Contains any alphabet = Invalid Input
 * Enters an option = valid
 * Enters the numerator of that fraction of the ratio = valid
 * Enters the denominator of that fraction of the ratio = valid
 * Program processes by the following formulas:
 * Hypotenuse = Square root of [(hypotenuse*hypotenuse)+(perpendicular*perpendicular)]
 * Perpendicular = Square root of [(hypotenuse*hypotenuse)-(base*base)]
 * Base = Square root of [(hypotenuse*hypotenuse)-(perpendicular*perpendicular)]
 * Print all the ratios.....
 */

import java.util.Scanner;

public class Evaluation_of_trigonometrical_ratios {
    public static void printSolution(float hypotenuse, float perpendicular, float base) {
        System.out.println("Hypotenuse = " + hypotenuse + " units");
        System.out.println("Perpendicular/Opposite = " + perpendicular + " units");
        System.out.println("Base/Adjacent = " + base + " units");
        System.out.println("\nSin = " + perpendicular + "/" + hypotenuse);
        System.out.println("Cos = " + base + "/" + hypotenuse);
        System.out.println("Tan = " + perpendicular + "/" + base);
        System.out.println("Cosec = " + hypotenuse + "/" + perpendicular);
        System.out.println("Sec = " + hypotenuse + "/" + base);
        System.out.println("Cot = " + base + "/" + perpendicular);
    }

    public static void main(String[] args) {
        System.out.println("Evaluation of Trigonometrical Ratios");
        while (true) {
            System.out.println("\nEnter the provided ratio");
            System.out.println("Type 1: sin");
            System.out.println("Type 2: cos");
            System.out.println("Type 3: tan");
            System.out.println("Type 4: cosec");
            System.out.println("Type 5: sec");
            System.out.println("Type 6: cot");
            System.out.println("OR Type 'exit' to quit the program."); //user input for typing the number or exit
            Scanner extscan = new Scanner(System.in);
            String ex = extscan.nextLine();
            String ext = ex.toLowerCase();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                case "1":
                    System.out.println("SIN");
                    System.out.print("Enter numerator/opposite/perpendicular = ");
                    String x1 = extscan.nextLine();
                    try {
                        float perpendicular = Float.parseFloat(x1);
                        System.out.print("Enter denominator/hypotenuse = ");
                        String x2 = extscan.nextLine();
                        try {
                            float hypotenuse = Float.parseFloat(x2);
                            float base = (float) Math.sqrt((hypotenuse * hypotenuse) - (perpendicular * perpendicular));
                            printSolution(hypotenuse, perpendicular, base);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Value");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Value");
                    }
                    break;
                case "2":
                    System.out.println("COS");
                    System.out.print("Enter numerator/adjacent/base = ");
                    String y1 = extscan.nextLine();
                    try {
                        float base = Float.parseFloat(y1);
                        System.out.print("Enter denominator/hypotenuse = ");
                        String y2 = extscan.nextLine();
                        try {
                            float hypotenuse = Float.parseFloat(y2);
                            float perpendicular = (float) Math.sqrt((hypotenuse * hypotenuse) - (base * base));
                            printSolution(hypotenuse, perpendicular, base);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Value");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Value");
                    }
                    break;
                case "3":
                    System.out.println("TAN");
                    System.out.print("Enter numerator/opposite/perpendicular = ");
                    String z1 = extscan.nextLine();
                    try {
                        float perpendicular = Float.parseFloat(z1);
                        System.out.print("Enter denominator/adjacent/base = ");
                        String z2 = extscan.nextLine();
                        try {
                            float base = Float.parseFloat(z2);
                            float hypotenuse = (float) Math.sqrt((perpendicular * perpendicular) + (base * base));
                            printSolution(hypotenuse, perpendicular, base);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Value");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Value");
                    }
                    break;
                case "4":
                    System.out.println("COSEC");
                    System.out.print("Enter numerator/hypotenuse = ");
                    String a1 = extscan.nextLine();
                    try {
                        float hypotenuse = Float.parseFloat(a1);
                        System.out.print("Enter denominator/opposite/perpendicular = ");
                        String a2 = extscan.nextLine();
                        try {
                            float perpendicular = Float.parseFloat(a2);
                            float base = (float) Math.sqrt((hypotenuse * hypotenuse) - (perpendicular * perpendicular));
                            printSolution(hypotenuse, perpendicular, base);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Value");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Value");
                    }
                    break;
                case "5":
                    System.out.println("SEC");
                    System.out.print("Enter numerator/hypotenuse = ");
                    String b1 = extscan.nextLine();
                    try {
                        float hypotenuse = Float.parseFloat(b1);
                        System.out.print("Enter denominator/adjacent/base = ");
                        String b2 = extscan.nextLine();
                        try {
                            float base = Float.parseFloat(b2);
                            float perpendicular = (float) Math.sqrt((hypotenuse * hypotenuse) - (base * base));
                            printSolution(hypotenuse, perpendicular, base);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Value");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Value");
                    }
                    break;
                case "6":
                    System.out.println("COT");
                    System.out.print("Enter numerator/adjacent/base = ");
                    String c1 = extscan.nextLine();
                    try {
                        float base = Float.parseFloat(c1);
                        System.out.print("Enter denominator/opposite/perpendicular = ");
                        String c2 = extscan.nextLine();
                        try {
                            float perpendicular = Float.parseFloat(c2);
                            float hypotenuse = (float) Math.sqrt((perpendicular * perpendicular) + (base * base));
                            printSolution(hypotenuse, perpendicular, base);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Value");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Value");
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}