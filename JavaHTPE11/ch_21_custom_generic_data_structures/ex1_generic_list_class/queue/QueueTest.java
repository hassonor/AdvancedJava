package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.queue;

import java.util.NoSuchElementException;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        // use enqueue method
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(0);
        queue.print();
        queue.enqueue(1);
        queue.print();
        queue.enqueue(5);
        queue.print();

        // remove objects from queue
        boolean continueLoop = true;
        while (continueLoop) {
            try {
                int removedItem = queue.dequeue(); // remove head element;
                System.out.printf("%n%d dequeue%n", removedItem);
                queue.print();
            } catch (NoSuchElementException noSuchElementException) {
                continueLoop = false;
                noSuchElementException.printStackTrace();
            }
        }
    }
}
