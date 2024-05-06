package JavaHTPE11.ch_17_lambdas_and_streams.ex8_infiniteStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InfiniteStreams {
    public static void main(String[] args) {
        IntStream.iterate(1, x -> x + 1)
                .limit(10)
                .forEach(System.out::println);

        Random random = new Random();
        IntStream.generate(() -> random.nextInt())
                .limit(10)
                .forEach(System.out::println);

        System.out.println(IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .sum());

        System.out.println(IntStream.rangeClosed(1, 10)
                .map(x -> (x % 2 == 0) ? x : 0)
                .sum());

        System.out.println(IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x - 1)
                .sum());

        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 10)
                .mapToObj(String::valueOf)
                .forEach(System.out::println);

        System.out.println(IntStream.rangeClosed(1, 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(IntStream.of(nums)
                .reduce((x, y) -> x + y).orElse(0));

        Integer[] values = {3, 7, 1, 4, 5, 6, 0, 9, 8, 2};
        List<Integer> list = Arrays.stream(values).filter(value -> value > 4).collect(Collectors.toList());
        System.out.println(list);

        String[] stvalues = {"a", "b", "c", "d"};
        List<String> stlist =
                Arrays.stream(stvalues).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stlist);

    }
}
