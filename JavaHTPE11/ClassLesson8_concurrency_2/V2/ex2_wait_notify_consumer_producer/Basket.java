package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex2_wait_notify_consumer_producer;

public class Basket {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait(); // Until the producer wakes me up
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return contents;
    }

    public synchronized void put(int value) {
        while (available) {
            try {
                wait(); // Until the consumer wakes me up
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        contents = value;
    }

    public void changeState(boolean _state) {
        available = _state;
    }
}
