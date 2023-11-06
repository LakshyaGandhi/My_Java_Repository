/**
 * Working of my Program - Cross Multiplication
 * A User Input the following conditions using Scanner Class:
 * Contains any alphabet(for a1, b1, c1 & a2, b1, c2) = not a valid number
 * Input a number(for a1, b1, c1 & a2, b1, c2) = valid
 * Program processes by the following formulas:
 * x=(b1*c2)-(b2*c1), y=(c1*a2)-(c2*a1), one=(a1*b2)-(a2*b1)
 * answer for x - Print x/one
 * answer for y - Print y/one.......
 */

import java.util.Scanner;

public class Cross_Multiplication {
    public static void main(String[] args) {
        System.out.println("Cross Multiplication");
        System.out.println("Note: Program only supports number(constants), not variable & fractions.");
        while (true) {
            System.out.println("\nEnter value of a1 to start the program");
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
                        Double.parseDouble(ex);
                        Scanner sc = new Scanner(System.in);
                        double a1 = Double.parseDouble(ex);
                        System.out.print("Enter value of b1 = ");
                        String b = sc.nextLine();
                        try {
                            double b1 = Double.parseDouble(b);
                            System.out.print("Enter value of c1 = ");
                            String c = sc.nextLine();
                            try {
                                double c1 = Double.parseDouble(c);
                                System.out.print("Enter value of a2 = ");
                                String aa = sc.nextLine();
                                try {
                                    double a2 = Double.parseDouble(aa);
                                    System.out.print("Enter value of b2 = ");
                                    String bb = sc.nextLine();
                                    try {
                                        double b2 = Double.parseDouble(bb);
                                        System.out.print("Enter value of c2 = ");
                                        String cc = sc.nextLine();
                                        try {
                                            double c2 = Double.parseDouble(cc);
                                            double x = (b1 * c2) - (b2 * c1), y = (c1 * a2) - (c2 * a1), one = (a1 * b2) - (a2 * b1);
                                            double ansx = x / one, ansy = y / one;
                                            System.out.println("x/" + x + " = y/" + y + " = 1/" + one);
                                            System.out.println("Therefore, Solution is:");
                                            System.out.println("(x, y) = (" + ansx + ", " + ansy + ")");
                                        } catch (NumberFormatException e) {
                                            System.out.println(cc + " is not a valid number");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println(bb + " is not a valid number");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println(aa + " is not a valid number");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println(c + " is not a valid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(b + " is not a valid number");
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}