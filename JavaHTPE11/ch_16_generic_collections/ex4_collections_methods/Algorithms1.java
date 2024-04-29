package JavaHTPE11.ch_16_generic_collections.ex4_collections_methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        // create and display a List<Character>
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);

        // reverse and display the List<Character>
        Collections.reverse(list);
        System.out.println("After calling reverse, list contains:");
        output(list);

        // create copyList from an array of 3 Characters
        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        // copy contents of list into copyList
        Collections.copy(copyList, list);
        System.out.println("After coping, copyList contains:");
        output(copyList);
        Collections.reverse(copyList);
        System.out.println("After calling reverse, copyList contains:");
        output(copyList);
        System.out.println("list contains: ");
        output(list);

        // fill list with Rs
        Collections.fill(list, 'R');
        System.out.println("After calling fill, list contains:");
        output(list);
    }

    // output List information
    private static void output(List<Character> listRef) {
        System.out.print("The list is: ");

        for (Character element : listRef) {
            System.out.printf("%s ", element);
        }

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf(" Min: %s%n", Collections.min(listRef));
        System.out.println();
    }
}
