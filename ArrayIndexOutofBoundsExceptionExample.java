import java.util.Scanner;

public class ArrayIndexOutofBoundsExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Enter an array index: ");
        int index = scanner.nextInt();

        try {
            System.out.println("Array value: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
