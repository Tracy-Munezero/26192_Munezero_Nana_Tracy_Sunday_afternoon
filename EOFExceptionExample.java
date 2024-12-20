// Demonstrating reaching at the end of a file unexpectedly
import java.io.*;
import java.util.Scanner;

public class EOFExceptionExample {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text to simulate EOFException: ");
        String input = scanner.nextLine();

        try {
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(input.getBytes()));
            while (true) {
                dis.readUTF();
            }
        } catch (EOFException e) {
            System.out.println("Caught EOFException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
