package JavaHTPE11.ch_23_concurrency.exBook.monitor_with_synchronized.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Worker(counter, (int) (Math.random() * 100)));
        }
        executorService.shutdown();
    }
}
