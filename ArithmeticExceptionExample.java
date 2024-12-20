import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to divide 100 by: ");
        int divisor = scanner.nextInt();

        try {
            int result = 100 / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
