package JavaHTPE11.ch_23_concurrency.ex7_synchronized_circular_buffer;

// Synchronizing access to a shared three-element bonded buffer
public class CircularBuffer implements Buffer {
    private final int[] buffer = {-1, -1, -1}; // shared buffer
    private int occupiedCells = 0; // count number of buffers used
    private int writeIndex = 0; // index of next element to write to
    private int readIndex = 0; // index ot next element to read

    // place value into buffer
    @Override
    public void blockingPut(int value) throws InterruptedException {

    }

    @Override
    public int blockingGet() throws InterruptedException {
        return 0;
    }
}
