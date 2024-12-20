// Demonstrating a missing file at runtime
import java.util.Scanner;

public class ClassNotFoundExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a class name to load: ");
        String className = scanner.nextLine();

        try {
            Class.forName(className);
            System.out.println("Class loaded successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
