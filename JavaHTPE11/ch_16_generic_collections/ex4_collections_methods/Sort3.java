package JavaHTPE11.ch_16_generic_collections.ex4_collections_methods;

import JavaHTPE11.ch_8.Time2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>();

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 5, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        System.out.printf("Unsorted array elements: %n%s%n", list);

        // sort in order using a comparator
        Collections.sort(list, new TimeComparator());

        System.out.printf("Sorted array elements: %n%s%n", list);
    }
}
