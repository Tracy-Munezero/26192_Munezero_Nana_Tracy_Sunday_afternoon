// Demonstrating hoe to handle when there is Passing an invalid argument to a method.
import java.util.Scanner;

public class IllegalArgumentExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sleep duration (negative for error): ");
        int duration = scanner.nextInt();

        try {
            Thread.sleep(duration);
            System.out.println("Slept for " + duration + "ms");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
        }
    }
}
