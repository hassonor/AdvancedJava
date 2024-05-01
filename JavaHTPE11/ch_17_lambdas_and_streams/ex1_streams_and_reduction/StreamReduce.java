package JavaHTPE11.ch_17_lambdas_and_streams.ex1_streams_and_reduction;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {

        int total = 0;
        for (int number = 1; number <= 10; number++) {
            total += number;

        }
        System.out.printf("Sum of 1 through 10 is: %d%n", total);

        // sum the integers from 1 through 10
        System.out.printf("Sum of 1 through 10 is: %d%n", IntStream.rangeClosed(1, 10).sum());
    }
}
