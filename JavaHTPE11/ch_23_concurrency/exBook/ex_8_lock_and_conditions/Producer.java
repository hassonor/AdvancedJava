package JavaHTPE11.ch_23_concurrency.exBook.ex_8_lock_and_conditions;

import java.security.SecureRandom;

public class Producer implements Runnable {
    private static SecureRandom generator = new SecureRandom();

    private final Buffer sharedLocation; // reference to shared object
    private final int id; // Identifier for the producer

    public Producer(Buffer sharedLocation, int id) {
        this.sharedLocation = sharedLocation;
        this.id = id;
    }

    @Override
    public void run() {
        int sum = 0;
        // store values from 1 to 10 in sharedLocation
        for (int count = 1; count <= 10; count++) {
            try {
                // sleep 0 to 3 seconds, then place value in Buffer
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.blockingPut(count, id); // set value in buffer
                sum += count; // increment sum of values
                System.out.printf("Producer %d produced %d%n", id, count);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("Producer %d done producing. Total sum: %d%nTerminating Producer %d%n", id, sum, id);
    }
}
