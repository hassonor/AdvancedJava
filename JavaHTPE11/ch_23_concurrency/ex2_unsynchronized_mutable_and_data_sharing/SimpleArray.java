package JavaHTPE11.ch_23_concurrency.ex2_unsynchronized_mutable_and_data_sharing;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray { // CAUTION: NOT THREAD SAFE!
    private static final SecureRandom generator = new SecureRandom();
    private final int[] array; // the shared integer array
    private int writeIndex = 0; // shared index of next element to write

    // construct a SimpleArray of a given size
    public SimpleArray(int size) {
        array = new int[size];
    }

    // add a value to the shared array
    public void add(int value) {
        int position = writeIndex; // store the write index;
        try {
            // put thread to sleep for 0-499 ms
            Thread.sleep(generator.nextInt(500));
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        // put value in the appropriate element
        array[position] = value;
        System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);

        ++writeIndex; // increment index of element to be written next
        System.out.println("Next write index: " + writeIndex);

    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
