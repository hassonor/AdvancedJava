package JavaHTPE11.ch_11_exception_handling;

import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();

        // assert that the value is >= 0 and <= 10
        assert (number >= 0 && number <= 10) : "bad number: " + number;

        System.out.printf("You entered %d%n", number);
    }
}
