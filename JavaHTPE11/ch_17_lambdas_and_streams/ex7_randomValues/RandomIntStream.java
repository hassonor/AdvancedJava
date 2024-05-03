package JavaHTPE11.ch_17_lambdas_and_streams.ex7_randomValues;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStream {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        // roll a die 1,000,000 times and summarize the results
        System.out.printf("%-6s%s%n", "Face", "Frequency");
        random.ints(1_000_000, 1, 7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((face, frequency) ->
                        System.out.printf("%-6d%d%n", face, frequency));
    }
}
