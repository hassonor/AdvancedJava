package JavaHTPE11.ch_23_concurrency.ex3_synchronized_thread_safe;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {
    private static final SecureRandom generator = new SecureRandom();
    private final int[] array; // the shared integer array
    private int writeIndex = 0; // index of next element to be written

    public SimpleArray(int size) {
        array = new int[size];
    }

    // add value to the shared array
    public synchronized void add(int value) {
        int position = writeIndex;

        try {
            // in real application, you shouldn't sleep while holding a lock
            Thread.sleep(generator.nextInt(500)); // for demo only
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        // put value in the appropriate element
        array[position] = value;
        System.out.printf("%s wrote %2d to element %d.%n",
                Thread.currentThread().getName(), value, position);

        ++writeIndex; // increment index of element to be written next
        System.out.printf("Next write index: %d%n", writeIndex);
    }

    // used for outputting the contents of the shared integer array
    @Override
    public synchronized String toString() {
        return Arrays.toString(array);
    }


}
