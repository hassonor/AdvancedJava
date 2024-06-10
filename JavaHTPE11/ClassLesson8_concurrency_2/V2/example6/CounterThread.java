package JavaHTPE11.ClassLesson8_concurrency_2.V2.example6;

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