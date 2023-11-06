import java.util.Scanner;

public class Arithmetic_Progression {
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
        System.out.println("Aritmetic Progression");
        while (true) {
            System.out.println("\nType - 1: Find t\u2099"); //tn
            System.out.println("Type - 2: Find number of terms");
            System.out.println("Type - 3: Print an A.P.");
            System.out.println("Type - 4: Check if it's an A.P.");
            System.out.println("Type - 5: Find/Check if a number is in an A.P.");
            System.out.println("Type - 6: Find Sum of an A.P.");
            System.out.println("OR Type 'exit' to quit the program.");
            Scanner sc = new Scanner(System.in);
            String ex = sc.nextLine();
            String ext = ex.toLowerCase();
            double a, d, n, S, tn;
            String ss;
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                case "1":
                    System.out.print("Enter the first term: a = ");
                    a = sc.nextDouble();
                    System.out.print("Enter the difference: d = ");
                    d = sc.nextDouble();
                    System.out.print("Enter the term you want to find: n = ");
                    n = sc.nextDouble();
                    ss = subScript((int) n);
                    System.out.println("t" + ss + " = " + (a + (n - 1) * d));
                    break;
                case "2":
                    System.out.print("Enter the first term: a = ");
                    a = sc.nextDouble();
                    System.out.print("Enter the difference: d = ");
                    d = sc.nextDouble();
                    System.out.print("Enter the last term: t\u2099 = ");
                    tn = sc.nextDouble();
                    n = ((tn - a) / d) + 1;
                    boolean x = false;
                    if (n == (int) n) x = true;
                    if (x) {
                        System.out.println("Number of terms: " + (int) n);
                    } else if (tn == (int) tn) System.out.println((int) tn + " should be a last term of an A.P.");
                    else System.out.println(tn + " should be a last term of an A.P.");
                    break;
                case "3":
                    System.out.print("Enter the first term: a = ");
                    a = sc.nextDouble();
                    System.out.print("Enter the difference: d = ");
                    d = sc.nextDouble();
                    System.out.print("Print A.P. till 'n' terms: n = ");
                    n = sc.nextDouble();
                    if (n == (int) n) {
                        if (a == (int) a) System.out.print((int) a);
                        else System.out.print(a);
                        for (int i = 2; i <= n; i++) {
                            a += d;
                            if (a == (int) a) System.out.print(", " + (int) a);
                            else System.out.print(", " + a);
                        }
                        System.out.print(", ..........");
                    } else System.out.println("'n' should not be a decimal. It is the number of terms to be printed.");
                    break;
                case "4":
                    System.out.print("Enter the first term: a = ");
                    a = sc.nextDouble();
                    System.out.print("Enter the second term: t\u2082 = ");
                    double t2 = sc.nextDouble();
                    System.out.print("Enter the second term: t\u2083 = ");
                    double t3 = sc.nextDouble();
                    if ((t2 - a) == (t3 - t2)) System.out.println("It's an A.P.");
                    else System.out.println("It's not an A.P.");
                    break;
                case "5":
                    System.out.print("Enter the first term: a = ");
                    a = sc.nextDouble();
                    System.out.print("Enter the difference: d = ");
                    d = sc.nextDouble();
                    System.out.print("Enter the term you want to find/check: n = ");
                    n = sc.nextDouble();
                    tn = ((n - a) / d) + 1;
                    if (tn == (int) tn) {
                        if (n == (int) n) System.out.println((int) n + " is the " + (int) tn + " term of an A.P.");
                        else System.out.println(n + " is the " + (int) tn + " term of an A.P.");
                    } else {
                        if (n == (int) n) System.out.println((int) n + " is not the term of an A.P.");
                        else System.out.println(n + " is not the term of an A.P.");
                    }
                    break;
                case "6":
                    System.out.print("Enter the first term: a = ");
                    a = sc.nextDouble();
                    System.out.print("Enter the difference: d = ");
                    d = sc.nextDouble();
                    System.out.print("Sum till 'n' terms: n = ");
                    n = sc.nextDouble();
                    if (n == (int) n) {
                        S = (n * (2 * a + ((n - 1) * d))) / 2;
                        ss = subScript((int) n);
                        if (S == (int) S) System.out.println("S" + ss + " = " + (int) S);
                        else System.out.println("S" + ss + " = " + S);
                    } else System.out.println("'n' should not be a decimal. It is the number of terms.");
                    break;
            }
        }
    }
}