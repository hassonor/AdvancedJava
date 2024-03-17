package JavaHTPE11.ch_2;

import java.util.Scanner; // program uses class Scanner


public class Addition {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
    }
}

