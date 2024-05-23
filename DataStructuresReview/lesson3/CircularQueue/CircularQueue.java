package DataStructuresReview.lesson3.CircularQueue;

/**
 * A generic circular queue implementation.
 *
 * @param <T> The type of elements held in this queue.
 */
public class CircularQueue<T> {
    private int head;
    private int tail;

    private T[] arr;
    private boolean isMightBeFull;

    private final int SIZE = 1000;

    /**
     * Constructs an empty queue with a default capacity.
     */
    public CircularQueue() {
        head = tail = 0;
        arr = (T[]) new Object[SIZE];
        isMightBeFull = false;
    }

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return The front element of the queue.
     * @throws EmptyQueueException if the queue is empty.
     */
    public T front() throws EmptyQueueException {
        if (!isEmpty()) {
            return arr[head];
        } else {
            throw new EmptyQueueException();
        }
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return The element removed from the front of the queue.
     * @throws EmptyQueueException if the queue is empty.
     */
    public T dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
        } else {
            T elementToReturn = arr[head];
            head = (head + 1) % arr.length;
            isMightBeFull = false;
            return elementToReturn;
        }
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param element The element to add.
     * @throws FullQueueException if the queue is full.
     */
    public void enqueue(T element) throws FullQueueException {
        if (isFull()) {
            throw new FullQueueException();
        } else {
            arr[tail] = element;
            tail = (tail + 1) % arr.length;
            if (tail == head) {
                isMightBeFull = true;
            }
        }
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return The current size of the queue.
     */
    public int size() {
        if (isFull()) {
            return arr.length;
        } else {
            return (arr.length + (tail - head)) % arr.length;
        }
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return (tail == head) && (!isMightBeFull);
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue is full, false otherwise.
     */
    public boolean isFull() {
        return (tail == head) && (isMightBeFull);
    }
}
