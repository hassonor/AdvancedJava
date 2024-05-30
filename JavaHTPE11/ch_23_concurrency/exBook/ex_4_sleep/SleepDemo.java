package JavaHTPE11.ch_23_concurrency.exBook.ex_4_sleep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SleepDemo {
    public static void main(String[] args) {
        Message message = new Message("Hello and good evening everybody!", 10, 500);
        Message message2 = new Message("Hello and good morning everybody!", 10, 500);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(message);
        executorService.execute(message2);
        executorService.shutdown();
    }
}
