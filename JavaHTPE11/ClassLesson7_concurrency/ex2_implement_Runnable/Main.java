package JavaHTPE11.ClassLesson7_concurrency.ex2_implement_Runnable;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newFixedThreadPool(2);

        OneToTwenty first = new OneToTwenty("FIRST");
        OneToTwenty second = new OneToTwenty("SECOND");
        OneToTwenty third = new OneToTwenty("THIRD");

        executorService.execute(first);
        executorService.execute(second);
        executorService.execute(third);

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("DONE");
    }
}
