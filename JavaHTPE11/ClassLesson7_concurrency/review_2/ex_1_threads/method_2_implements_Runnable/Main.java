package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_1_threads.method_2_implements_Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        OneToTwenty one = new OneToTwenty("ONE");
        OneToTwenty two = new OneToTwenty("TWO");
        OneToTwenty three = new OneToTwenty("THREE");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(one);
        executorService.execute(two);
        executorService.execute(three);

        executorService.shutdown();
    }
}
