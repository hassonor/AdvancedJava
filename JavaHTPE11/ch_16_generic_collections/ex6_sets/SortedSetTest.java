package JavaHTPE11.ch_16_generic_collections.ex6_sets;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        // create TreeSet from array colors
        String[] colors = {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.print("sorted set: ");
        printSet(tree);

        // get headSet based on "orange"
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange"));

        // get tailSet based on "orange"
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));

        // get first and last elements
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last: %s%n", tree.last());


    }

    // output SortedSet using enhanced for statement
    private static void printSet(SortedSet<String> set) {
        for (String s : set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    }
}
