package JavaHTPE11.ch_23_concurrency.exBook.ex_8_lock_and_conditions;

import java.security.SecureRandom;

public class Consumer implements Runnable {
    private static final SecureRandom generator = new SecureRandom();

    private final Buffer sharedLocation; // reference to shared object

    private final int id; // Identifier for the consumer

    public Consumer(Buffer sharedLocation, int id) {
        this.sharedLocation = sharedLocation;
        this.id = id;
    }


    @Override
    public void run() {
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            // sleep 0 to 3 seconds, read value from buffer and add to sum
            try {
                Thread.sleep(generator.nextInt(3000));
                int readValue = sharedLocation.blockingGet(id);
                sum += readValue;
                System.out.printf("Consumer %d consumed %d%n", id, readValue);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("Consumer %d read values totaling %d%nTerminating Consumer %d%n", id, sum, id);
    }
}
