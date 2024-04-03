package JavaHTPE11.ch_11_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.print("\nPlease enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.print("\nResult: " + numerator + " / " + denominator + " = " + result + "\n");
                continueLoop = false; // Exit loop after successful division
            } catch (InputMismatchException inputMismatchException) {
                // Consume the invalid input
                System.out.println("\nException: " + inputMismatchException);
                scanner.nextLine(); // discard input so user can try again
                System.out.print("You must enter integers. Please try again.\n");
            } catch (ArithmeticException arithmeticException) {
                System.out.println("\nException: " + arithmeticException);
                System.out.print("Zero is an invalid denominator. Please try again.\n");
            }
        } while (continueLoop);
    }

}
