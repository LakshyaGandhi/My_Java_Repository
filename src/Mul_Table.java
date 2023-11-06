import java.util.Scanner;
//1st: Do_While Loop
//2nd: For Loop

/**
 * Working of my Program - Multiplication Table
 * A User Input the following conditions using Scanner Class:
 * Contains any alphabet(for every input) = not a valid number
 * Enters table number = valid
 * Enters how much it multiply = valid
 * Program processes by the following formulas:
 * Do-While Loop
 * increment i=1 variable value until it's equal to the number how much is to multiplied
 * Print = num * i = ....
 */
class do_whileLoop_Mul_Table {
    public static void main(String[] args) {
        System.out.println("Table Number");
        while (true) {
            System.out.println("\nWrite table number");
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
                        long num = Long.parseLong(ex);
                        System.out.println("Till how much it should multiply? ");
                        String z = sc.nextLine();
                        try {
                            long mul = Long.parseLong(z);
                            long i = 1;
                            do {
                                System.out.println(num + " * " + i + " = " + num * i);
                                i++;
                            } while (i <= mul);
                        } catch (NumberFormatException e) {
                            System.out.println(z + " is not a valid number");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}

/**
 * Working of my Program - Multiplication Table
 * A User Input the following conditions using Scanner Class:
 * Contains any alphabet(for every input) = not a valid number
 * Enters table number = valid
 * Enters how much it multiply = valid
 * Program processes by the following formulas:
 * For Loop
 * increment i=1 temporary(extra) variable value until it's equal to the number how much is to multiplied
 * Print = num * i = ....
 */
class forLoop_Mul_Table {
    public static void main(String[] args) {
        System.out.println("Table Number");
        while (true) {
            System.out.println("\nWrite table number");
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
                        long num = Long.parseLong(ex);
                        System.out.println("Till how much it should multiply? ");
                        String z = sc.nextLine();
                        try {
                            long mul = Long.parseLong(z);
                            for (long i = 1; i <= mul; i++) {
                                System.out.println(num + " x " + i + " = " + num * i);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(z + " is not a valid number");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ex + " is not a valid number");
                    }
            }
        }
    }
}