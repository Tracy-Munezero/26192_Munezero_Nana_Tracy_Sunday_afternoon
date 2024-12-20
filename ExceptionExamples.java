// this is the main
public class ExceptionExamples {
    public static void main(String[] args) {
        System.out.println("Demonstrating Checked Exceptions:");
        IOExceptionExample.run();
        FileNotFoundExceptionExample.run();
        EOFExceptionExample.run();
        SQLExceptionExample.run();
        ClassNotFoundExceptionExample.run();

        System.out.println("\nDemonstrating Unchecked Exceptions:");
        ArithmeticExceptionExample.run();
        NullPointerExceptionExample.run();
        ArrayIndexOutofBoundsExceptionExample.run();
        ClassCastExceptionExample.run();
        IllegalArgumentExceptionExample.run();
        NumberFormatExceptionExample.run();
    }
}
