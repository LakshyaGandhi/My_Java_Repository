import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix Calculator");
        System.out.println("\nMATRIX A INPUT");
        System.out.print("Enter number of rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols1 = sc.nextInt();
        System.out.println("Enter Matrix A Elements:");
        int[][] arr1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        while (true) {
            System.out.println("MATRIX B INPUT");
            System.out.print("Enter number of rows: ");
            int rows2 = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols2 = sc.nextInt();
            System.out.println("Enter Matrix B Elements:");
            int[][] arr2 = new int[rows2][cols2];
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Type 1: Addition");
            System.out.println("Type 2: Subtraction");
            System.out.println("Type 3: Multiplication");
            System.out.println("Type 'exit' to quit the program");
            System.out.print("Enter a choice: ");
            sc.nextLine();
            String ex = sc.nextLine();
            String ext = ex.toLowerCase();
            int[][] arr3 = new int[rows1][cols1];
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                case "1":
                    if (rows1 == rows2 && cols1 == cols2) {
                        System.out.println("New Matrix A is(i.e., Solution):");
                        for (int i = 0; i < rows1; i++) {
                            for (int j = 0; j < cols1; j++) {
                                arr3[i][j] = arr1[i][j] + arr2[i][j];
                                System.out.print(arr1[i][j] + arr2[i][j] + " ");
                            }
                            System.out.println();
                        }
                        for (int i = 0; i < rows1; i++) { //Array Copy
                            for (int j = 0; j < cols1; j++) {
                                arr1[i][j] = arr3[i][j];
                            }
                        }
                    } else {
                        System.out.println("Both the Arrays must be of same order.");
                        System.exit(0);
                    }
                    break;
                case "2":
                    if (rows1 == rows2 && cols1 == cols2) {
                        System.out.println("New Matrix A is(i.e., Solution):");
                        for (int i = 0; i < rows1; i++) {
                            for (int j = 0; j < cols1; j++) {
                                arr3[i][j] = arr1[i][j] - arr2[i][j];
                                System.out.print(arr1[i][j] - arr2[i][j] + " ");
                            }
                            System.out.println();
                        }
                        for (int i = 0; i < rows1; i++) { //Array Copy
                            for (int j = 0; j < cols1; j++) {
                                arr1[i][j] = arr3[i][j];
                            }
                        }
                    } else {
                        System.out.println("Both the Arrays must be of same order.");
                        System.exit(0);
                    }
                    break;
                case "3":
                    if (cols1 == rows2) {
                        System.out.println("New Matrix A is(i.e., Solution):");
                        for (int i = 0; i < rows1; i++) {
                            for (int j = 0; j < cols2; j++) {
                                for (int k = 0; k < cols1; k++) { //cols1==row2 so k can also be: k < rows2
                                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                                }
                                System.out.print(arr3[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Both the Arrays must be of same order.");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}