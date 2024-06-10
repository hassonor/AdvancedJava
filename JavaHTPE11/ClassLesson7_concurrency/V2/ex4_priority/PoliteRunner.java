package JavaHTPE11.ClassLesson7_concurrency.V2.ex4_priority;

public class PoliteRunner extends Thread {

    private int tick = 1;
    private int num;

    public PoliteRunner(int num) {
        this.num = num;
    }

    public void run() {
        while (tick < 400000) {
            tick++;
            if ((tick % 50000) == 0) {
                System.out.println("Thread #" + num + ", tick = " + tick);
                Thread.yield();
            }
        }
    }
}
