package JavaHTPE11.ch_20_generic_classes_and_methods.ex4_generic_classes;

import java.util.NoSuchElementException;

public class StackTest2 {
    public static void main(String[] args) {
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create a Stack<Double> and a Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        // push elements of doubleElements onto doubleStack
        testPush("doubleStack", doubleStack, doubleElements);
        testPop("doubleStack", doubleStack);

        // push elements of integerElements onto integerStack
        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack);
    }

    private static <E> void testPush(String name, Stack<E> stack, E[] elements) {
        System.out.println("Pushing elements onto " + name);

        for (E value : elements) {
            System.out.print(value + " ");
            stack.push(value);
        }
        System.out.println();
    }

    private static <E> void testPop(String name, Stack<E> stack) {
        try {
            System.out.println("Popping elements from: " + name);
            E popValue;
            while (true) {
                popValue = stack.pop();
                System.out.print(popValue + " ");
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println();
            noSuchElementException.printStackTrace();
        }
    }
}
