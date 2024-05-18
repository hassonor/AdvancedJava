package JavaHTPE11.ch_23_concurrency.ex1_runnable_interface;

import java.security.SecureRandom;

public class PrintTask implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final int sleepTime; // random sleep time for thread
    private final String taskName;

    public PrintTask(String taskName) {
        this.taskName = taskName;

        // pick random sleep time between 0 and 5 seconds
        sleepTime = generator.nextInt(5000);
    }

    @Override
    public void run() {
        try {
            System.out.println(taskName + " going to sleep for " + sleepTime + " milliseconds.");
            Thread.sleep(sleepTime); // put thread to sleep

        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt(); // re-interpret the thread
        }

        // print task name
        System.out.println(taskName + " done sleeping");
    }
}
