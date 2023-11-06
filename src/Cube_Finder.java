/**
 * Working of my Program - Cube Finder
 * A User Inputs the following conditions using Scanner Class:
 * Contains any alphabet(s) = not a valid number
 * Enters a number = valid
 * Program processes num*num - Print.....
 */

import java.util.Scanner;

public class Cube_Finder {
    public static void main(String[] args) {
        System.out.println("Cube Finder");
        while (true) {
            System.out.println("\nEnter a number to start the program");
            System.out.println("OR Type 'exit' to quit the program."); //user input for typing the number or exit
            Scanner extscan = new Scanner(System.in);
            String ex = extscan.nextLine();
            String ext = ex.toLowerCase();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                default:
                    try {
                        Double.parseDouble(ex);
                        double num = Double.parseDouble(ex);
                        //cubing the inputted number i.e. multiplying number three times
                        double cube = num * num * num;
                        System.out.println("The Cube of " + num + " is " + cube + ".");
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}