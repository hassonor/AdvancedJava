package JavaHTPE11.ch_16_generic_collections.ex5_priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        // queue of capacity 11
        PriorityQueue<Double> queue = new PriorityQueue<>();

        // insert elements to queue
        queue.offer(3.7);
        queue.offer(9.4);
        queue.offer(5.5);

        System.out.print("Polling from queue: ");

        // display elements in queue
        while (!queue.isEmpty()) {
            System.out.printf("%.1f ", queue.peek()); // view top element
            queue.poll(); // remove top element
        }
    }
}
