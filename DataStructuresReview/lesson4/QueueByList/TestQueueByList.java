package DataStructuresReview.lesson4.QueueByList;

import java.util.NoSuchElementException;

public class TestQueueByList {
    public static void main(String[] args) {
        QueueByList<Integer> queue = new QueueByList<>();

        // Enqueue elements
        System.out.println("Enqueueing elements:");
        queue.enqueue(10);
        System.out.println("Enqueued 10");
        queue.enqueue(20);
        System.out.println("Enqueued 20");
        queue.enqueue(30);
        System.out.println("Enqueued 30");

        // Print size of the queue
        System.out.println("Current queue size: " + queue.size());  // Expected: 3

        // Peek at the front element
        System.out.println("Front element: " + queue.front());  // Expected: 10

        // Dequeue elements and print them
        System.out.println("Dequeuing elements:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        // Expected to throw NoSuchElementException
        try {
            System.out.println("Attempting to dequeue from an empty queue...");
            queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: " + e.getMessage());
        }

        // Test enqueuing and dequeuing again
        System.out.println("Enqueueing elements again:");
        queue.enqueue(40);
        System.out.println("Enqueued 40");
        queue.enqueue(50);
        System.out.println("Enqueued 50");

        // Print size of the queue
        System.out.println("Current queue size: " + queue.size());  // Expected: 2

        // Peek at the front element
        System.out.println("Front element: " + queue.front());  // Expected: 40

        // Dequeue elements and print them
        System.out.println("Dequeuing elements again:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        // Verify queue is empty
        System.out.println("Queue is empty: " + queue.isEmpty());  // Expected: true
    }
}
