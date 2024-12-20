// Demonstrating an invalid type cast
import java.util.Scanner;

public class ClassCastExceptionExample {
    public static void run() {
        try {
            System.out.print("Enter an integer value: ");
            Scanner scanner = new Scanner(System.in);
            Object obj = scanner.nextInt();
            String str = (String) obj;
            System.out.println("String: " + str);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
