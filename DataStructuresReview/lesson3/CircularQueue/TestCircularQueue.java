package DataStructuresReview.lesson3.CircularQueue;

public class TestCircularQueue {
    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<Integer>();

        try {
            // Test enqueue operations
            for (int i = 1; i <= 10; i++) {
                queue.enqueue(i);
                System.out.println("Enqueued: " + i);
            }

            // Test front and dequeue operations
            System.out.println("Current front: " + queue.front());
            while (!queue.isEmpty()) {
                System.out.println("Dequeued: " + queue.dequeue());
                System.out.println("Current front (after dequeue): " + (queue.isEmpty() ? "Queue is empty" : queue.front()));
            }

            // Test underflow
            try {
                queue.dequeue();
            } catch (EmptyQueueException e) {
                System.out.println("Caught EmptyQueueException: " + e.getMessage());
            }

            // Test overflow
            for (int i = 1; i <= 1000; i++) {
                queue.enqueue(i);
            }
            try {
                queue.enqueue(1001);
            } catch (FullQueueException e) {
                System.out.println("Caught FullQueueException: " + e.getMessage());
            }

        } catch (EmptyQueueException | FullQueueException e) {
            e.printStackTrace();
        }
    }
}
