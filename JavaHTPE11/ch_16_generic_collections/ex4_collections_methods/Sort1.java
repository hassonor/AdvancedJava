package JavaHTPE11.ch_16_generic_collections.ex4_collections_methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

        Collections.sort(list); // sort ArrayList
        System.out.printf("Sorted array elements: %s%n", list);
    }
}
