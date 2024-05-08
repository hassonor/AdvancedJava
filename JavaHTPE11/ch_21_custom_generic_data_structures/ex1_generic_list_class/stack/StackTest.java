package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.stack;

import java.util.NoSuchElementException;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // use push method
        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        // remove items from stack
        boolean continueLoop = true;

        while (continueLoop) {
            try {
                int removeItem = stack.pop();
                System.out.printf("%n%d popped%n", removeItem);
                stack.print();
            } catch (NoSuchElementException noSuchElementException) {
                continueLoop = false;
                noSuchElementException.printStackTrace();
            }
        }
    }
}
