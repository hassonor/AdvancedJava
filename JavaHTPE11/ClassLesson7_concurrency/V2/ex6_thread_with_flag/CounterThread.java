package JavaHTPE11.ClassLesson7_concurrency.V2.ex6_thread_with_flag;

public class CounterThread extends Thread {
    public boolean stopped = false;

    int count = 0;

    public void run() {
        while (!stopped) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(count++);
            ;
        }
    }
}