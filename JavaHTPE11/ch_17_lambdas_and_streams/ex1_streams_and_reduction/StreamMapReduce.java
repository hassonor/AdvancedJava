package JavaHTPE11.ch_17_lambdas_and_streams.ex1_streams_and_reduction;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        // sum the even integers from 2 through 20
        int total = 0;
        for (int i = 2; i <= 20; i += 2) {
            total += i;
        }
        System.out.println("Sum of the even ints from 2 through 20 is: " + total);

        // Stream map way
        int total2 = IntStream.rangeClosed(1, 10).map((int x) -> x * 2).sum();
        System.out.println("Sum of the even ints from 2 through 20 is: " + total2);
    }
}
