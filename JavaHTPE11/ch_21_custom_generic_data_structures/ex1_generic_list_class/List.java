package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class;

import java.util.NoSuchElementException;

class ListNode<E> {
    E data;
    ListNode<E> nextNode;

    // constructor creates a ListNode that refers to object
    ListNode(E object) {
        this(object, null);
    }

    // constructor creates ListNode that refers to the specified
    // object and to the next ListNode
    ListNode(E object, ListNode<E> node) {
        data = object;
        nextNode = node;
    }

    // return reference to next node in list
    E getData() {
        return data;
    }

    // return reference to next node in list
    ListNode<E> getNext() {
        return nextNode;
    }
}

public class List<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    // constructor creates empty List with "list" as the name
    public List() {
        this("list");
    }

    // constructor creates an empty List with a name
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    // insert item at from of List
    public void insertAtFront(E insertItem) {
        if (isEmpty()) { // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // firstNode refers to new node
            firstNode = new ListNode<E>(insertItem, firstNode);
        }
    }

    /// insert item at end of List
    public void insertAtBack(E insertItem) {
        if (isEmpty()) { // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // lastNode's nextNode refers to new node
            lastNode = lastNode.nextNode = new ListNode<E>(insertItem);
        }
    }

    // remove first node from List
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = firstNode.data; // retrieve data being removed

        // update references firstNode and lastNode
        if (firstNode == lastNode) { // the list was only 1 element
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }

        return removedItem;
    }

    // remove last node from List
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }

        E removedItem = lastNode.data;

        // update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;

            // loop while current node does not refer to lastNode
            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }

            lastNode = current; // current is new lastNode
            current.nextNode = null;
        }

        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    // output list contents
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is ", name);
        ListNode<E> current = firstNode;

        // while not end of list output currnt node's data
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }

        System.out.println();
    }


}
