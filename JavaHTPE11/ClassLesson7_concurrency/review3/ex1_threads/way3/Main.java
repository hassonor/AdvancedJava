package JavaHTPE11.ClassLesson7_concurrency.review3.ex1_threads.way3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        Worker w1 = new Worker("ONE");
        Worker w2 = new Worker("TWO");
        Worker w3 = new Worker("THREE");

        executorService.execute(w1);
        executorService.execute(w2);
        executorService.execute(w3);

        executorService.shutdown();

        System.out.println("DONE");
    }
}
