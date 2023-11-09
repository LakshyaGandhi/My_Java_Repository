/**
 * Working of my Program - Geometric Progression Solver
 * A User chooses a choice from the given menu
 * Next, User inputs the following conditions using Scanner Class:
 * If contains any alphabet = Invalid number
 * Enter value of a (first term) = valid
 * Enter value of r (constant ratio) = valid
 * Enter value of n (position of n-th term) = valid
 * Enter value of S (Sum of G.P.) = valid
 * Enter value of tn (n-th term) = valid
 * Program processes by the following formulas:
 * n = (tn * r) / a and using loop find 4^n equal to value of tn
 * n = ((tn - a) / d) + 1
 * Check if a series is an G.P. = the constant ratio remains same. if t3/t2 = t2/t1(or a), then the series is an G.P.
 * S = (a * (r^n) - 1) / (r - 1);, where n is n-th no. of term
 * Print G.P. = Loop with multiplication of constant ratio (r) to (n*r^(n-1)) th term
 * Check if a given term is in an G.P. = Loop = r^i check if equals to n, where n is n-th term
 */

import java.util.Scanner;

public class Geometric_Progression {
    public static String subScript(int a) {
        String s = "";
        String sa = Integer.toString(a);
        for (int i = 0; i < sa.length(); i++) {
            if (sa.charAt(i) == '1') s += "\u2081";
            else if (sa.charAt(i) == '2') s += "\u2082";
            else if (sa.charAt(i) == '3') s += "\u2083";
            else if (sa.charAt(i) == '4') s += "\u2084";
            else if (sa.charAt(i) == '5') s += "\u2085";
            else if (sa.charAt(i) == '6') s += "\u2086";
            else if (sa.charAt(i) == '7') s += "\u2087";
            else if (sa.charAt(i) == '8') s += "\u2088";
            else if (sa.charAt(i) == '9') s += "\u2089";
            else if (sa.charAt(i) == '0') s += "\u2080";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Geometric Progression");
        while (true) {
            System.out.println("\nType - 1: Find t\u2099"); //tn
            System.out.println("Type - 2: Find number of terms");
            System.out.println("Type - 3: Print a G.P.");
            System.out.println("Type - 4: Check if it's an G.P.");
            System.out.println("Type - 5: Find/Check if a number is in an G.P.");
            System.out.println("Type - 6: Find Sum of a G.P.");
            System.out.println("OR Type 'exit' to quit the program.");
            Scanner sc = new Scanner(System.in);
            String ex = sc.nextLine();
            String ext = ex.toLowerCase();
            double a, r, n, S, tn = 0;
            String x, y, z;
            String ss;
            System.out.print("Enter the first term: a = ");
            x = sc.nextLine();
            try {
                a = Double.parseDouble(x);
                switch (ext) {
                    case "exit":
                        System.exit(0);
                        break;
                    case "1":
                        System.out.print("Enter the constant ratio: r = ");
                        y = sc.nextLine();
                        try {
                            r = Double.parseDouble(y);
                            System.out.print("Enter the term you want to find: n = ");
                            z = sc.nextLine();
                            try {
                                n = Double.parseDouble(z);
                                ss = subScript((int) n);
                                System.out.println("t" + ss + " = " + (a * (Math.pow(r, (n - 1)))));
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number");
                        }
                        break;
                    case "2":
                        System.out.print("Enter the constant ratio: r = ");
                        y = sc.nextLine();
                        try {
                            r = Double.parseDouble(y);
                            System.out.print("Enter the last term: t\u2099 = ");
                            z = sc.nextLine();
                            try {
                                tn = Double.parseDouble(z);
                                n = (tn * r) / a;
                                boolean m = false;
                                for (int i = 1; Math.pow(r, i) <= n; i++) {
                                    if (Math.pow(r, i) == n && Math.pow(r, i) <= n) {
                                        n = i;
                                        m = true;
                                        break;
                                    }
                                }
                                if (m) System.out.println("Number of terms: " + (int) n);
                                else System.out.println("The term you entered is not in the series.");
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number");
                        }
                        break;
                    case "3":
                        System.out.print("Enter the constant ratio: r = ");
                        y = sc.nextLine();
                        try {
                            r = Double.parseDouble(y);
                            System.out.print("Print G.P. till 'n' terms: n = ");
                            z = sc.nextLine();
                            try {
                                n = Double.parseDouble(z);
                                if (n == (int) n) {
                                    if (a == (int) a) System.out.print((int) a);
                                    else System.out.print(a);
                                    for (int i = 2; i <= n; i++) {
                                        a *= r;
                                        if (a == (int) a) System.out.print(", " + (int) a);
                                        else System.out.print(", " + a);
                                    }
                                    System.out.print(", ..........");
                                } else
                                    System.out.println("'n' should not be a decimal. It is the number of terms to be printed.");
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number");
                        }
                        break;
                    case "4":
                        System.out.print("Enter the second term: t\u2082 = ");
                        y = sc.nextLine();
                        try {
                            double t2 = Double.parseDouble(y);
                            System.out.print("Enter the third term: t\u2083 = ");
                            z = sc.nextLine();
                            try {
                                double t3 = Double.parseDouble(z);
                                if ((t2 / a) == (t3 / t2)) System.out.println("It's a G.P.");
                                else System.out.println("It's not a G.P.");
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number");
                        }
                        break;
                    case "5":
                        System.out.print("Enter the constant ratio: r = ");
                        y = sc.nextLine();
                        try {
                            r = Double.parseDouble(y);
                            System.out.print("Enter the term you want to find/check: n = ");
                            z = sc.nextLine();
                            try {
                                tn = Double.parseDouble(z);
                                n = (tn * r) / a;
                                boolean m = false;
                                for (int i = 1; Math.pow(r, i) <= n; i++) {
                                    if (Math.pow(r, i) == n && Math.pow(r, i) <= n) {
                                        n = i;
                                        m = true;
                                        break;
                                    }
                                }
                                if (tn == (int) tn) {
                                    if (m) System.out.println((int) tn + " is the term of G.P.");
                                    else System.out.println((int) tn + " is not the term of G.P.");
                                } else {
                                    if (m) System.out.println(tn + " is the term of G.P.");
                                    else System.out.println(tn + " is not the term of G.P.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number");
                        }
                        break;
                    case "6":
                        System.out.print("Enter the constant ratio: r = ");
                        y = sc.nextLine();
                        try {
                            r = Double.parseDouble(y);
                            System.out.print("Sum till 'n' terms: n = ");
                            z = sc.nextLine();
                            try {
                                n = Double.parseDouble(z);
                                if (n == (int) n) {
                                    S = (a * ((Math.pow(r, n)) - 1)) / (r - 1);
                                    ss = subScript((int) n);
                                    if (S == (int) S) System.out.println("S" + ss + " = " + (int) S);
                                    else System.out.println("S" + ss + " = " + S);
                                } else System.out.println("'n' should not be a decimal. It is the number of terms.");
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number");
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
    }
}