package DataStructuresReview.lesson4.QueueByList;

import DataStructuresReview.lesson4.GenericList.List;

import java.util.NoSuchElementException;

public class QueueByList<T> {
    private List<T> list;
    private int size;


    public QueueByList() {
        list = new List<T>();
        size = 0;
    }

    public T front() {
        if (isEmpty())
            throw new NoSuchElementException();
        return list.top();
    }


    public void enqueue(T item) {
        list.insertAtBack(item);
        size++;
    }

    public T dequeue() {
        T removedItem = list.removeFromFront();
        size--;
        return removedItem;
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }
}
