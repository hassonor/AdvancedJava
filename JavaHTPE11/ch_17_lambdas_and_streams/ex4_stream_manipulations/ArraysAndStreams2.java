package JavaHTPE11.ch_17_lambdas_and_streams.ex4_stream_manipulations;

import java.util.Arrays;
import java.util.List;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] strings = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

        // display original strings
        System.out.println("Original strings: " + Arrays.asList(strings));

        // strings in upper case
        List<String> stringInUpperCase = Arrays.stream(strings).map(String::toUpperCase).toList();
        System.out.println("Strings in uppercase: " + stringInUpperCase);

        // strings less than "n" (case-insensitive) sorted ascending
        List<String> stringLessThanNSortedAscending = Arrays.stream(strings).
                filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER).toList();
        System.out.println("Strings less than n sorted ascending: " + stringLessThanNSortedAscending);

        List<String> stringLessThanNSortedDescending = Arrays.stream(strings).
                filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).toList();
        System.out.println("Strings less than n sorted descending: " + stringLessThanNSortedDescending);

    }
}
