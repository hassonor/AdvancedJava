package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex2_wait_notify_consumer_producer;

public class Producer extends Thread {
    private final Basket theBasket;

    public Producer(Basket c) {
        theBasket = c;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            theBasket.put(i);
            System.out.println("Producer put: " + i);

            synchronized (theBasket) {
                theBasket.changeState(true);
                theBasket.notify(); // Wake the consumer up
            }
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
