import java.io.*;
import java.util.Scanner;

public class FileNotFoundExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file name to open: ");
        String filename = scanner.nextLine();

        try {
            FileInputStream file = new FileInputStream(filename);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}
