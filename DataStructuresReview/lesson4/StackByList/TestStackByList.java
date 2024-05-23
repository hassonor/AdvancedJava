package DataStructuresReview.lesson4.StackByList;

import java.util.EmptyStackException;

public class TestStackByList {
    public static void main(String[] args) {
        // Create a stack of integers
        StackByList<Integer> integerStack = new StackByList<>();

        System.out.println("Pushing elements onto the stack:");
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);

        System.out.println("Current stack size: " + integerStack.size());

        System.out.println("Peeking at the top element: " + integerStack.peek());

        System.out.println("Popping elements from the stack:");
        while (!integerStack.isEmpty()) {
            System.out.println("Popped element: " + integerStack.pop());
        }

        // Test stack underflow condition
        try {
            System.out.println("Attempting to pop from an empty stack...");
            integerStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException: " + e.getMessage());
        }

        // Create a stack of strings
        StackByList<String> stringStack = new StackByList<>();

        System.out.println("\nPushing elements onto the string stack:");
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Current stack size: " + stringStack.size());
        System.out.println("Peeking at the top element: " + stringStack.peek());

        System.out.println("Popping elements from the string stack:");
        while (!stringStack.isEmpty()) {
            System.out.println("Popped element: " + stringStack.pop());
        }

        // Test stack underflow condition
        try {
            System.out.println("Attempting to pop from an empty string stack...");
            stringStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException: " + e.getMessage());
        }
    }
}
