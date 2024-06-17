package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex1_problem_consumer_producer;

public class Basket {
    private int contents = -1;

    public synchronized int get() {
        return contents;
    }

    public synchronized void put(int value) {
        contents = value;
    }
}
