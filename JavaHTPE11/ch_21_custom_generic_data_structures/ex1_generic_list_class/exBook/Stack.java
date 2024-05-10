package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exBook;

import java.util.EmptyStackException;

public class Stack<E> {
    private final int size; // number of elements in the stack
    private int top; // location of the top element

    private E[] elements; // array that stores stack elements

    // constructor creates a stack of the specified number of elements
    public Stack(int s) {
        size = s > 0 ? s : 10; // set size of Stack
        top = -1; // Stack initially empty
        elements = (E[]) new Object[size]; // create array;
    }

    // push element onto stack; if full throw IndexOutOfBoundsException
    public void push(E pushValue) {
        if (top == size - 1) // if stack is full
            throw new IndexOutOfBoundsException(String.format("Stack is full, cannot push %s", pushValue));
        elements[++top] = pushValue; // place pushValue on Stack
    }

    // return the top element if not empty; else throw EmptyStackException
    public E pop() {
        if (top == -1)  // if stack is empty
            throw new EmptyStackException();

        return elements[top--];
    }

    public int size() {
        return top + 1;
    }
}
