package JavaHTPE11.ch_23_concurrency.exBook.ex_3_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Processes3 {
    public static void main(String[] args) {
        Name one = new Name("Amir");
        Name two = new Name("Or");
        Name three = new Name("Tamar");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(one);
        executorService.execute(two);
        executorService.execute(three);

        executorService.shutdown();

        System.out.println("MAIN DONE");

    }
}
