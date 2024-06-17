package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex1_problem_consumer_producer;

public class Producer extends Thread {
    private Basket theBasket;

    public Producer(Basket c) {
        theBasket = c;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Producer put: " + i);
            theBasket.put(i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
