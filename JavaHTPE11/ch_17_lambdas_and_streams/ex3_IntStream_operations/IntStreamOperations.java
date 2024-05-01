package JavaHTPE11.ch_17_lambdas_and_streams.ex3_IntStream_operations;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // display original values
        System.out.print("Original values: ");
        System.out.println(
                IntStream.of(values)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));

        // count, min, max, sum and average of the values
        System.out.println("Count: " + IntStream.of(values).count());
        System.out.println("Min: " + IntStream.of(values).min().getAsInt());
        System.out.println("Max: " + IntStream.of(values).max().getAsInt());
        System.out.println("Sum: " + IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        // sum of valued with reduce method
        System.out.println("Sum via reduce method: " + IntStream.of(values).reduce(0, (x, y) -> x + y));

        // product of values with reduce method
        System.out.println("Product via reduce method: " + IntStream.of(values).reduce((x, y) -> x * y).getAsInt());

        // sum of squares of values with map and sum methods
        System.out.println("Sum of squares via map and sum: " + IntStream.of(values).map(x -> x * x).sum());

        // displaying the elements in sorted order
        System.out.printf("Valued displayed in sorted order: %s%n",
                IntStream.of(values)
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));

        // Summary Statistics
        System.out.println(IntStream.of(values).summaryStatistics());


    }
}
