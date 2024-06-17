package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex2_wait_notify_consumer_producer;

public class Consumer extends Thread {
    private Basket theBasket;

    public Consumer(Basket c) {
        theBasket = c;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = theBasket.get();
            System.out.println("Consumer got: " + value);

            synchronized (theBasket) {
                theBasket.changeState(false);
                theBasket.notify(); // Wake the producer up
            }
        }
    }
}
