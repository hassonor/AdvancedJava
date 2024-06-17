package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex1_problem_consumer_producer;

public class Consumer extends Thread {
    private Basket theBasket;

    public Consumer(Basket theBasket) {
        this.theBasket = theBasket;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = theBasket.get();
            System.out.println("Consumer got: " + value);
        }
    }
}
