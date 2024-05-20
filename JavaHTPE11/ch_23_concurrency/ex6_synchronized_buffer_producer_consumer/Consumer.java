package JavaHTPE11.ch_23_concurrency.ex6_synchronized_buffer_producer_consumer;

import java.security.SecureRandom;

public class Consumer implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation; // reference to shared object

    public Consumer(Buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }


    @Override
    public void run() {
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            // sleep 0 to 3 seconds, read value from buffer and add to sum
            try {
                Thread.sleep(generator.nextInt(3000));
                sum += sharedLocation.blockingGet();
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("%n%s %d%n%s%n", "Consumer read values totaling", sum, "Terminating Consumer");
    }
}
