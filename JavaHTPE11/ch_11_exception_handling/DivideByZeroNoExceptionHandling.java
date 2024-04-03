package JavaHTPE11.ch_11_exception_handling;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator; // possible division by zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter a denominator: ");
        int denominator = scanner.nextInt();

        int result = quotient(numerator, denominator);
        System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
    }

}
