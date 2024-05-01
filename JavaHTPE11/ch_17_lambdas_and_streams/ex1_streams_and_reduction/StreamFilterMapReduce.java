package JavaHTPE11.ch_17_lambdas_and_streams.ex1_streams_and_reduction;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {
    public static void main(String[] args) {
        int total = 0;
        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) {
                total += x * 3;
            }
        }
        System.out.println("Sum of the triples of event ints from 2 though 10 is: " + total);

        // sum thr triple of the even integers from 2 through 10
        int total2 = IntStream.rangeClosed(1, 10)
                .filter(x -> {
                    System.out.println("filter: " + x);
                    return x % 2 == 0;
                })
                .map(x -> {
                    System.out.println("map: " + x);
                    return x * 3;
                }).sum();
        System.out.println("Sum of the triples of event ints from 2 though 10 is: " + total2);
    }
}
