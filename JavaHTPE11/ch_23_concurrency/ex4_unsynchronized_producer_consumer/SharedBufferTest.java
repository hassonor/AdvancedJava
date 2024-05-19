package JavaHTPE11.ch_23_concurrency.ex4_unsynchronized_producer_consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {
    public static void main(String[] args) throws InterruptedException {
        // create new thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // create Unsynchronized to store ints
        Buffer sharedLocation = new UnsynchronizedBuffer();

        System.out.println("Action\t\t\tValue\tSum of Produced\tSum of Consumed");
        System.out.printf("------\t\t\t-----\t---------------\t------------%n%n");

        // execute the Producer and Consumer, giving each
        // access to the sharedLocation
        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));

        executorService.shutdown(); // terminate app when tasks complete
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
