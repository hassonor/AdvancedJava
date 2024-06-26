package DataStructuresReview.lesson4.GenericList;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>("Integer List");

        // Insert elements
        System.out.println("Inserting 1 at front");
        list.insertAtFront(1);
        list.print();

        System.out.println("Inserting 2 at front");
        list.insertAtFront(2);
        list.print();

        System.out.println("Inserting 3 at back");
        list.insertAtBack(3);
        list.print();

        System.out.println("Inserting 4 at back");
        list.insertAtBack(4);
        list.print();

        // Insert elements using insert method
        System.out.println("Inserting 10 after 1");
        if (list.insert(1, 10)) {
            list.print();  // Expected: The Integer List is: 2 1 10 3 4
        } else {
            System.out.println("Insert failed: 1 not found");
        }

        System.out.println("Inserting 20 after 4");
        if (list.insert(4, 20)) {
            list.print();  // Expected: The Integer List is: 2 1 10 3 4 20
        } else {
            System.out.println("Insert failed: 4 not found");
        }

        System.out.println("Inserting 30 after 2");
        if (list.insert(2, 30)) {
            list.print();  // Expected: The Integer List is: 2 30 1 10 3 4 20
        } else {
            System.out.println("Insert failed: 2 not found");
        }

        // Try inserting before a non-existing element
        System.out.println("Inserting 50 after 100");
        if (list.insert(100, 50)) {
            list.print();
        } else {
            System.out.println("Insert failed: 100 not found");  // Expected: Insert failed: 100 not found
        }

        // Remove elements
        System.out.println("Removed from front: " + list.removeFromFront());  // Expected: 2
        list.print();

        System.out.println("Removed from back: " + list.removeFromBack());    // Expected: 4
        list.print();

        // Test removal until empty
        System.out.println("Removing from front until empty");
        while (!list.isEmpty()) {
            System.out.println("Removed from front: " + list.removeFromFront());  // Removing elements until the list is empty
            list.print();
        }

        // Re-insert elements for find test
        System.out.println("Inserting 5 at front");
        list.insertAtFront(5);
        list.print();

        System.out.println("Inserting 6 at back");
        list.insertAtBack(6);
        list.print();

        System.out.println("Inserting 7 at front");
        list.insertAtFront(7);
        list.print();

        System.out.println("Inserting 8 at back");
        list.insertAtBack(8);
        list.print();

        System.out.println("Inserting 9 at back");
        list.insertAtBack(9);
        list.print();

        System.out.println("Inserting 11 at back");
        list.insertAtBack(11);
        list.print();

        System.out.println("Inserting 13 at back");
        list.insertAtBack(13);
        list.print();

        System.out.println("Inserting 12 at back");
        list.insertAtBack(12);
        list.print();

        System.out.println("Inserting 4 at back");
        list.insertAtBack(4);
        list.print();

        // Find existing elements
        System.out.println("Finding 5: " + (list.find(5) ? "Found" : "Not Found"));  // Expected: Found
        System.out.println("Finding 8: " + (list.find(8) ? "Found" : "Not Found"));  // Expected: Found
        System.out.println("Finding 7: " + (list.find(7) ? "Found" : "Not Found"));  // Expected: Found
        System.out.println("Finding 6: " + (list.find(6) ? "Found" : "Not Found"));  // Expected: Found

        // Find non-existing element
        System.out.println("Finding 10: " + (list.find(10) ? "Found" : "Not Found"));  // Expected: Not Found

        // Test the remove method
        System.out.println("Removing 5: " + list.remove(5));  // Expected: true
        list.print();  // Expected: The Integer List is: 7 6 8 9 11 13 12 4

        System.out.println("Removing 8: " + list.remove(8));  // Expected: true
        list.print();  // Expected: The Integer List is: 7 6 9 11 13 12 4

        System.out.println("Removing 7: " + list.remove(7));  // Expected: true
        list.print();  // Expected: The Integer List is: 6 9 11 13 12 4

        System.out.println("Removing 6: " + list.remove(6));  // Expected: true
        list.print();  // Expected: The Integer List is: 9 11 13 12 4

        System.out.println("Removing 10: " + list.remove(10));  // Expected: false
        list.print();  // Expected: The Integer List is: 9 11 13 12 4

        System.out.println("Removing 13: " + list.remove(13));  // Expected: true
        list.print();  // Expected: The Integer List is: 9 11 12 4

        // Test removeDuplicates method
        System.out.println("Testing removeDuplicates method:");
        list.insertAtBack(9);
        list.insertAtBack(11);
        list.insertAtBack(12);
        list.print();  // Expected: The Integer List is: 9 11 12 4 9 11 12
        list.removeDuplicates();
        list.print();  // Expected: The Integer List is: 9 11 12 4

        // Test reverse method
        System.out.println("Testing reverse method:");
        list.reverse();
        list.print();  // Expected: The Integer List is: 4 12 11 9

        // Test compareList method
        System.out.println("Testing compareList method:");

        List<Integer> listOne = new List<>("List One");
        List<Integer> listTwo = new List<>("List Two");

        listOne.insertAtBack(1);
        listOne.insertAtBack(2);
        listOne.insertAtBack(3);

        listTwo.insertAtBack(1);
        listTwo.insertAtBack(2);
        listTwo.insertAtBack(3);

        System.out.println("Comparing List One and List Two: " + (List.compareList(listOne, listTwo) ? "Equal" : "Not Equal")); // Expected: Equal

        listTwo.insertAtBack(4);
        System.out.println("Comparing List One and List Two: " + (List.compareList(listOne, listTwo) ? "Equal" : "Not Equal")); // Expected: Not Equal

        listOne.insertAtBack(4);
        System.out.println("Comparing List One and List Two: " + (List.compareList(listOne, listTwo) ? "Equal" : "Not Equal")); // Expected: Equal

        listTwo.removeFromFront();
        System.out.println("Comparing List One and List Two: " + (List.compareList(listOne, listTwo) ? "Equal" : "Not Equal")); // Expected: Not Equal
    }
}
