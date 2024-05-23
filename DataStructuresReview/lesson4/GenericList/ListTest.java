package DataStructuresReview.lesson4.GenericList;

import java.util.NoSuchElementException;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>("Integer List");

        // Insert elements
        list.insertAtFront(1);
        list.insertAtFront(2);
        list.insertAtBack(3);
        list.insertAtBack(4);

        // Print the list
        list.print();  // Expected: The Integer List is: 2 1 3 4

        // Insert elements using insert method
        try {
            list.insert(1, 10);
            list.print();  // Expected: The Integer List is: 2 1 10 3 4

            list.insert(4, 20);
            list.print();  // Expected: The Integer List is: 2 1 10 3 4 20

            list.insert(2, 30);
            list.print();  // Expected: The Integer List is: 2 30 1 10 3 4 20
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        // Try inserting before a non-existing element
        try {
            list.insert(100, 50);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());  // Expected: The specified item was not found in the list.
        }

        // Remove elements
        System.out.println("Removed from front: " + list.removeFromFront());  // Expected: 2
        System.out.println("Removed from back: " + list.removeFromBack());    // Expected: 4

        // Print the list after removals
        list.print();  // Expected: The Integer List is: 30 1 10 3

        // Test removal until empty
        while (!list.isEmpty()) {
            System.out.println("Removed from front: " + list.removeFromFront());  // Removing elements until the list is empty
        }

        // Final state of the list
        list.print();  // Expected: Empty Integer List

        // Re-insert elements for find test
        list.insertAtFront(5);
        list.insertAtBack(6);
        list.insertAtFront(7);
        list.insertAtBack(8);

        // Find existing elements
        System.out.println("Finding 5: " + (list.find(5) != null ? "Found" : "Not Found"));  // Expected: Found
        System.out.println("Finding 8: " + (list.find(8) != null ? "Found" : "Not Found"));  // Expected: Found
        System.out.println("Finding 7: " + (list.find(7) != null ? "Found" : "Not Found"));  // Expected: Found
        System.out.println("Finding 6: " + (list.find(6) != null ? "Found" : "Not Found"));  // Expected: Found

        // Find non-existing element
        System.out.println("Finding 10: " + (list.find(10) != null ? "Found" : "Not Found"));  // Expected: Not Found
    }
}
