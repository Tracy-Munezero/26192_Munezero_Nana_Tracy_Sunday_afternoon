// Demonstrating accesing a null point
import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (or press Enter for null): ");
        String str = scanner.nextLine();
        if (str.isEmpty()) {
            str = null;
        }

        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
