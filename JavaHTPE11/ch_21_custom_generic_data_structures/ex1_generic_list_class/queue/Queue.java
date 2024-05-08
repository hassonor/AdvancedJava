package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.queue;

import JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.list.List;

import java.util.NoSuchElementException;

public class Queue<E> {
    private List<E> queueList;

    public Queue() {
        queueList = new List<E>("queue");
    }

    // add object to queue
    public void enqueue(E object) {
        queueList.insertAtBack(object);
    }

    // remove object from queue
    public E dequeue() throws NoSuchElementException {
        return queueList.removeFromFront();
    }

    // determine if queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public void print() {
        queueList.print();
    }
}
