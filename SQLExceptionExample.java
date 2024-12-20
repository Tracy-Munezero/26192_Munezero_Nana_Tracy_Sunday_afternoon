// Demonstrating to connect to a non-existent database or execute invalid SQL
import java.sql.*;
import java.util.Scanner;

public class SQLExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter database URL: ");
        String dbUrl = scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Database connected successfully.");
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }
}
