package JavaHTPE11.ch_23_concurrency.ex5_producer_consumer_with_blockingbuffer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Two threads manipulating a blocking buffer that properly
// implements the producer/consumer relationship
public class BlockingBufferTest {
    public static void main(String[] args) throws InterruptedException {
        // create new thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // create Blocking buffer to store this
        Buffer sharedLocation = new BlockingBuffer();

        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
