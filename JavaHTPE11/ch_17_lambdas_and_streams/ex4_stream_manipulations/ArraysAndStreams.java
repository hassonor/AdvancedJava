package JavaHTPE11.ch_17_lambdas_and_streams.ex4_stream_manipulations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        // display original value
        System.out.println("Original values: " + Arrays.asList(values));

        // sort values in ascending order with streams
        System.out.println("Sorted values: " + Arrays.stream(values).sorted().collect(Collectors.toList()));

        // values greater than 4
        List<Integer> greaterThan4 = Arrays.stream(values).filter(x -> x > 4).collect(Collectors.toList());
        System.out.println("Values greater than 4: " + greaterThan4);

        // filter values greater than 4 then sort the results
        List<Integer> greaterThan4AndSortTheResult = Arrays.stream(values).filter(x -> x > 4).sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted values greater than 4: " + greaterThan4AndSortTheResult);

        // greaterThan4 List sorted with streams
        System.out.printf("Values greater than 4 (ascending with streams): %s%n", greaterThan4.stream().sorted()
                .collect(Collectors.toList()));
    }
}
