package DataStructuresReview.lesson4.StackByList;

import DataStructuresReview.lesson4.GenericList.List;

import java.util.EmptyStackException;

/**
 * A generic stack implementation.
 *
 * @param <T> the type of elements in the stack
 */
public class StackByList<T> {
    private List<T> list;
    private int size;

    /**
     * Constructs an empty stack.
     */
    public StackByList() {
        list = new List<>();
        size = 0;
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param value the element to be pushed onto the stack
     */
    public void push(T value) {
        list.insertAtFront(value);
        size++;
    }

    /**
     * Removes the element at the top of the stack and returns that element as the value of this function.
     *
     * @return the element at the top of the stack
     * @throws EmptyStackException if this stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        size--;
        return list.removeFromFront();
    }

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items; false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in this stack
     */
    public int size() {
        return size;
    }

    /**
     * Looks at the element at the top of this stack without removing it from the stack.
     *
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.top();
    }

}
