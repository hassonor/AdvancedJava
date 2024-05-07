package JavaHTPE11.ch_20_generic_classes_and_methods.ex4_generic_classes;

import java.util.NoSuchElementException;

public class StackTest {
    public static void main(String[] args) {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create a Stack<Double> and a Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        // push elements of doubleElements onto doubleStack
        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack);

        // push elements of integerElements onto integerStack
        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);
    }

    // test push method with double stack
    private static void testPushDouble(Stack<Double> stack, double[] values) {
        System.out.println("Pushing elements onto doubleStack");

        for (double value : values) {
            System.out.printf("%.1f ", value);
            stack.push(value);
        }
        System.out.println();
    }

    // test pop method with double tack
    private static void testPopDouble(Stack<Double> stack) {
        try {
            System.out.println("Popping elements from doubleStack");
            double popValue;
            while (true) {
                popValue = stack.pop();
                System.out.printf("%.1f ", popValue);
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println();
            noSuchElementException.printStackTrace();
        }
    }

    // test push method with integer stack
    private static void testPushInteger(Stack<Integer> stack, int[] values) {
        System.out.println("Pushing elements ono integerStack");

        // push elements to Stack
        for (int value : values) {
            System.out.printf("%d ", value);
            stack.push(value);
        }
        System.out.println();
    }

    // test pop method with integer stack
    private static void testPopInteger(Stack<Integer> stack) {
        // pop elements from stack
        try {
            System.out.println("Popping elements from integerStack");
            int popValue;

            while (true) {
                popValue = stack.pop();
                System.out.printf("%d ", popValue);
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println();
            noSuchElementException.printStackTrace();
        }
    }
}
