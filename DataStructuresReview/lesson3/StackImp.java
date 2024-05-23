package DataStructuresReview.lesson3;

import java.util.EmptyStackException;

/**
 * A generic stack implementation.
 *
 * @param <T> the type of elements in the stack
 */
public class StackImp<T> {
    private T[] arr;
    private int size;
    private int top;

    /**
     * Constructs an empty stack with an initial capacity of 1000.
     */
    public StackImp() {
        top = -1;
        size = 1000;
        arr = (T[]) new Object[size];
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param value the element to be pushed onto the stack
     */
    public void push(T value) {
        if (top == size - 1) {
            resize();
        }
        arr[++top] = value;
    }

    /**
     * Removes the element at the top of the stack and returns that element as the value of this function.
     *
     * @return the element at the top of the stack
     * @throws EmptyStackException if this stack is empty
     */
    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        return arr[top--];
    }

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items; false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in this stack
     */
    public int size() {
        return top == -1 ? 0 : top + 1;
    }

    /**
     * Looks at the element at the top of this stack without removing it from the stack.
     *
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return arr[top];
    }

    /**
     * Doubles the size of the stack array when the stack is full.
     */
    private void resize() {
        int newSize = size + 1000;
        T[] newArray = (T[]) new Object[newSize];
        if (size >= 0) System.arraycopy(arr, 0, newArray, 0, size);
        arr = newArray;
        size = newSize;
    }
}
