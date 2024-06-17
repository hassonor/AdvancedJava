package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex1_problem_consumer_producer;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Basket c = new Basket();
        Producer p1 = new Producer(c);
        Consumer c1 = new Consumer(c);

        p1.start();
        c1.start();
    }
}
