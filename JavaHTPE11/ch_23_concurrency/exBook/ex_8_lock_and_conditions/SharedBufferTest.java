package JavaHTPE11.ch_23_concurrency.exBook.ex_8_lock_and_conditions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {
    public static void main(String[] args) throws InterruptedException {
        // create new thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // create SynchronizedBuffer to store ints
        Buffer sharedLocation = new SynchronizedBuffer();

        System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation", "Buffer",
                "Occupied", "---------", "------\t\t--------");

        // execute the Producer and Consumer tasks with IDs
        executorService.execute(new Producer(sharedLocation, 1));
        executorService.execute(new Producer(sharedLocation, 2));
        executorService.execute(new Consumer(sharedLocation, 1));
        executorService.execute(new Consumer(sharedLocation, 2));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
