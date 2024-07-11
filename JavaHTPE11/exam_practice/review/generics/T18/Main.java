package JavaHTPE11.exam_practice.review.generics.T18;

import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        // Test data
        ArrayList<Integer> unsortedArray = new ArrayList<>();
        unsortedArray.add(5);
        unsortedArray.add(1);
        unsortedArray.add(3);
        unsortedArray.add(2);
        unsortedArray.add(4);

        // Create SortedGroup with unsorted array
        SortedGroup<Integer> sortedGroup = new SortedGroup<>(unsortedArray);

        // Print initial sorted group
        System.out.println("Initial sorted group: ");
        printSortedGroup(sortedGroup);

        // Add an element to the sorted group
        sortedGroup.add(0);
        System.out.println("After adding 0: ");
        printSortedGroup(sortedGroup);

        // Remove elements from the sorted group
        int removedCount = sortedGroup.remove(3);
        System.out.println("After removing 3 (count: " + removedCount + "): ");
        printSortedGroup(sortedGroup);

        // Test Reduce
        SortedGroup<Integer> reducedGroup = Reduce.reduce(sortedGroup, 3);
        System.out.println("After reducing with threshold 3: ");
        printSortedGroup(reducedGroup);
    }

    private static <T extends Comparable<T>> void printSortedGroup(SortedGroup<T> sortedGroup) {
        Iterator<T> iterator = sortedGroup.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}