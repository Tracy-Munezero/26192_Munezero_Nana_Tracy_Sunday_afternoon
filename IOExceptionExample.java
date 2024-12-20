import java.io.*;
import java.util.Scanner;

public class IOExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file name to read: ");
        String filename = scanner.nextLine();

        try {
            FileReader reader = new FileReader(filename);
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
