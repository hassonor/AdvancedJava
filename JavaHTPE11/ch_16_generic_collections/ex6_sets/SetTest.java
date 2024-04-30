package JavaHTPE11.ch_16_generic_collections.ex6_sets;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        // eliminate duplicates then print the unique values
        printNonDuplicates(list);
    }

    private static void printNonDuplicates(Collection<String> values) {
        // create a HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        for (String value : set) {
            System.out.printf("%s ", value);
        }

        System.out.println();
    }
}
