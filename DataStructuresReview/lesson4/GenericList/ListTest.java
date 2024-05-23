package DataStructuresReview.lesson4.GenericList;

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

        // Remove elements
        System.out.println("Removed from front: " + list.removeFromFront());  // Expected: 2
        System.out.println("Removed from back: " + list.removeFromBack());    // Expected: 4

        // Print the list after removals
        list.print();  // Expected: The Integer List is: 1 3

        // Test removal until empty
        System.out.println("Removed from front: " + list.removeFromFront());  // Expected: 1
        System.out.println("Removed from back: " + list.removeFromBack());    // Expected: 3

        // Final state of the list
        list.print();  // Expected: Empty Integer List
    }
}
