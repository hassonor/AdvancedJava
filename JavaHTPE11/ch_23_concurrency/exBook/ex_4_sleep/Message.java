package JavaHTPE11.ch_23_concurrency.exBook.ex_4_sleep;

public class Message implements Runnable {
    private String msg;
    private int times;
    private int delay;

    public Message(String str, int times, int delay) {
        msg = str;
        this.times = times;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }
}
