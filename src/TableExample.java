import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Scanner;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Get the number of rows from the user
        Scanner sc = new Scanner(System.in);
        int rowCount = sc.nextInt();

        // Create a table with user-defined number of rows and 5 columns.
        Object[][] data = new Object[rowCount][5];

        // Get values for each row from the user
        String ele[] = new String[rowCount];
        for (int i = 0; i < rowCount; i++) {
            System.out.println("Enter details for element " + ele[i] + ": ");
            System.out.print("Enter ID for row " + (i + 1) + ": ");
            data[0][i] = sc.next();

            System.out.print("Enter Name for row " + (i + 1) + ": ");
            data[1][i] = sc.next();

            System.out.print("Enter Employee Number for row " + (i + 1) + " (3 digits): ");
            data[2][i] = sc.next();

            System.out.print("Enter City for row " + (i + 1) + ": ");
            data[3][i] = sc.next();

            System.out.print("Enter Salary for row " + (i + 1) + ": ");
            data[4][i] = sc.nextDouble();
        }
        sc.close();

        String[] columns = {"ID", "Name", "Employee Number", "City", "Salary"};

        // Create a DefaultTableModel with user input data and column names
        DefaultTableModel model = new DefaultTableModel(data, columns);

        JTable table = new JTable(model);

        // Adding the table to the frame.
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(700, 500);
        frame.setVisible(true);
    }
}
