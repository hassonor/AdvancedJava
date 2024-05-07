package JavaHTPE11.ch_20_generic_classes_and_methods.ex4_generic_classes;

import java.util.ArrayList;
import java.util.NoSuchElementException;


// Stack generic class declaration
public class Stack<E> {
    private final ArrayList<E> elements;

    // no-argument constructor creates a stack of the default size
    public Stack() {
        this(10);
    }

    // constructor creates a stack of the specified number of elements
    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<E>(initCapacity);
    }

    // push elements onto stack
    public void push(E pushValue) {
        elements.add(pushValue);
    }

    // return the top element if not empty; else throw exception
    public E pop() {
        if (elements.isEmpty()) { // if stack is empty
            throw new NoSuchElementException("Stack is empty, cannot pop");
        }

        // remove and return top element of Stack
        return elements.remove(elements.size() - 1);
    }

}
