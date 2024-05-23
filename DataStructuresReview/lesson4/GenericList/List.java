package DataStructuresReview.lesson4.GenericList;

import java.util.NoSuchElementException;

/**
 * A generic linked list implementation.
 *
 * @param <E> the type of elements held in this list
 */
public class List<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    /**
     * Constructs an empty list with the default name.
     */
    public List() {
        this("list");
    }

    /**
     * Constructs an empty list with the specified name.
     *
     * @param listName the name of the list
     */
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    /**
     * Inserts an item into the list before the specified item.
     *
     * @param beforeItem the item before which the new item will be inserted
     * @param insertItem the item to insert
     * @throws NoSuchElementException if the list is empty or the specified beforeItem is not found
     */
    public boolean insert(E beforeItem, E insertItem) {
        if (isEmpty()) {
            return false;
        } else {
            ListNode<E> current = firstNode;
            while (current != null) {
                if (current.data.equals(beforeItem)) {
                    current.nextNode = new ListNode<E>(insertItem, current.nextNode);
                    return true;
                }
                current = current.nextNode;
            }
        }

        return false;
    }

    /**
     * Inserts an item at the front of the list.
     *
     * @param insertItem the item to insert
     */
    public void insertAtFront(E insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            firstNode = new ListNode<E>(insertItem, firstNode);
        }
    }

    /**
     * Inserts an item at the back of the list.
     *
     * @param insertItem the item to insert
     */
    public void insertAtBack(E insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            lastNode = lastNode.nextNode = new ListNode<E>(insertItem);
        }
    }

    /**
     * Removes the first occurrence of the specified element from the list.
     *
     * @param itemForRemove the element to be removed from the list
     * @return true if the element was found and removed, false otherwise
     */
    public boolean remove(E itemForRemove) {
        if (isEmpty()) {
            return false;
        }
        ListNode<E> current = firstNode;

        // Special case: removing the first node
        if (firstNode.data.equals(itemForRemove)) {
            removeFromFront();
            return true;
        }
        while (current.nextNode != null) {
            if (current.nextNode.data.equals(itemForRemove)) {
                current.nextNode = current.nextNode.nextNode;
                if (current.nextNode == null)
                    lastNode = current;
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    /**
     * Removes and returns the item from the front of the list.
     *
     * @return the removed item
     * @throws NoSuchElementException if the list is empty
     */
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E removedElement = firstNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }
        return removedElement;
    }

    /**
     * Removes and returns the item from the back of the list.
     *
     * @return the removed item
     * @throws NoSuchElementException if the list is empty
     */
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E removedElement = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;
            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }

            lastNode = current;
            current.nextNode = null;
        }
        return removedElement;
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return firstNode == null;
    }

    /**
     * Searches for the specified item in the list and returns the node containing it.
     *
     * @param item the item to find in the list
     * @return the ListNode containing the item, or null if the item is not found
     */
    public ListNode<E> find(E item) {
        if (isEmpty()) return null;
        ListNode<E> current = firstNode;
        while (current != null) {
            if (current.data.equals(item)) {
                return current;
            }
            current = current.nextNode;
        }
        return null;

    }


    /**
     * Prints the elements of the list.
     */
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: ", name);
        ListNode<E> current = firstNode;

        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }

        System.out.println();
    }
}
