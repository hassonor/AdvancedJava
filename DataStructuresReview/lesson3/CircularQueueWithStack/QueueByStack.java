package DataStructuresReview.lesson3.CircularQueueWithStack;

import DataStructuresReview.lesson3.CircularQueue.EmptyQueueException;

import java.util.Stack;

public class QueueByStack<T> {
    private Stack<T> insertElements;
    private Stack<T> removeElements;

    private int virtualSize;


    public QueueByStack() {
        insertElements = new Stack<>();
        removeElements = new Stack<>();
        virtualSize = 0;
    }

    public void enqueue(T element) {
        insertElements.push(element);
        virtualSize += 1;
    }

    public T dequeue() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException();
        else if (!removeElements.isEmpty()) {
            virtualSize -= 1;
            return removeElements.pop();
        } else {
            while (!insertElements.isEmpty())
                removeElements.push(insertElements.pop());
            virtualSize -= 1;
            return removeElements.pop();
        }
    }

    public boolean isEmpty() {
        return insertElements.isEmpty() && removeElements.isEmpty();
    }

    public int size() {
        return virtualSize;
    }
}
