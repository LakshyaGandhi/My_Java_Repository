/**
 * Working of my Program - Geometry Shape Tool
 * A User Inputs the following conditions using Scanner Class:
 * Not select available function = Invalid Input
 * Contains any alphabet(for every function) = Invalid Number
 * Program processes by the following formulas:
 * Square: Area = num*num; Perimeter = 4*num
 * Rectangle: Area = l*b; Perimeter = 2*(l+b)
 * Triangle: Perimeter=sum of all sides i.e. a+b+c
 * Circle: Area = Math.PI(OR 3.14)*r*r; Perimeter = 2*Math.PI*r.....
 */

import java.util.Scanner;

public class Geometry_Shapes {
    public static void main(String[] args) {
        System.out.println("Geometry Shapes Calculator");
        while (true) {
            System.out.println("\nType 'square' for shape");
            System.out.println("Type 'rectangle' for shape");
            System.out.println("Type 'triangle' for shape");
            System.out.println("Type 'circle' for shape");
            System.out.println("Type 'exit' to quit the program");
            System.out.println("REMEMBER: ALL UNITS SHOULD BE SAME, That is, all should be either cm or m or km.....");
            Scanner sc = new Scanner(System.in);
            String ex = sc.nextLine();
            String ext = ex.toLowerCase();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                case "square":
                    System.out.print("Enter length or breadth = ");
                    Scanner square = new Scanner(System.in);
                    String w = square.nextLine();
                    try {
                        double lorb = Double.parseDouble(w);
                        double sqrarea = lorb * lorb;
                        double sqrperimeter = 4 * lorb;
                        System.out.println("->The Area of Square " + lorb + " is = " + sqrarea + " cm sq.");
                        System.out.println("->The Perimeter of Square " + lorb + " is = " + sqrperimeter + " cm.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Number");
                    }
                    break;
                //********************************************************************************
                case "rectangle":
                    System.out.print("Enter length = ");
                    Scanner rectangle = new Scanner(System.in);
                    String x = rectangle.nextLine();
                    try {
                        double lofr = Double.parseDouble(x);
                        System.out.print("Enter breadth = ");
                        String x1 = rectangle.nextLine();
                        try {
                            double bofr = Double.parseDouble(x1);
                            double recarea = lofr * bofr;
                            double recperimeter = 2 * (lofr + bofr);
                            System.out.println("->The Area of Rectangle " + lofr + " and " + bofr + " is = " + recarea + " cm sq.");
                            System.out.println("->The Perimeter of Rectangle " + lofr + " and " + bofr + " is = " + recperimeter + " cm.");
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Number");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Number");
                    }
                    break;
                //********************************************************************************
                case "triangle":
                    System.out.print("Enter length of side 'a' = ");
                    Scanner triangle = new Scanner(System.in);
                    String y = triangle.nextLine();
                    try {
                        double sidea = Double.parseDouble(y);
                        System.out.print("Enter length of side 'b' = ");
                        String y1 = triangle.nextLine();
                        try {
                            double sideb = Double.parseDouble(y1);
                            System.out.print("Enter length of side 'c' = ");
                            String y2 = triangle.nextLine();
                            try {
                                double sidec = Double.parseDouble(y2);
                                if (sidea + sideb + sidec > 180) {
                                    System.out.println("Invalid Values. The Sum of all sides of a triangle is more than 180°");
                                } else {
                                    double triperimeter = sidea + sideb + sidec;
                                    System.out.println("->The Perimeter of Triangle " + sidea + " + " + sideb + " + " + sidec + " is = " + triperimeter + " cm.");
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid Number");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Number");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Number");
                    }
                    break;
                //********************************************************************************
                case "circle":
                    System.out.print("Enter radius = ");
                    String z = sc.nextLine();
                    try {
                        double r = Double.parseDouble(z);
                        double circlearea = Math.PI * r * r;
                        double circleperi = 2 * Math.PI * r;
                        System.out.println("->The Area of Circle " + r + " is = " + circlearea + " cm sq.");
                        System.out.println("->The Circumference of Circle " + r + " is = " + circleperi + " cm");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Number");
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}