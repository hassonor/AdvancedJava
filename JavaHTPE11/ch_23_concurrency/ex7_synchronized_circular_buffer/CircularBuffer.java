package JavaHTPE11.ch_23_concurrency.ex7_synchronized_circular_buffer;

// Synchronizing access to a shared three-element bonded buffer
public class CircularBuffer implements Buffer {
    private final int[] buffer = {-1, -1, -1}; // shared buffer
    private int occupiedCells = 0; // count number of buffers used
    private int writeIndex = 0; // index of next element to write to
    private int readIndex = 0; // index ot next element to read

    // place value into buffer
    @Override
    public synchronized void blockingPut(int value) throws InterruptedException {
        // wait until buffer has space available, then write value;
        // while no empty locations, place thread in blocked state
        while (occupiedCells == buffer.length) {
            System.out.println("Buffer is full. Producer waits.");
            wait(); // wait until a buffer cell is free
        }

        buffer[writeIndex] = value; // set new buffer value

        // update circular write index
        writeIndex = (writeIndex + 1) % buffer.length;
        ++occupiedCells; // one more buffer cell is full
        displayState("Producer writes " + value);
        notifyAll(); // notify threads waiting to read from buffer
    }

    // return value from buffer
    @Override
    public synchronized int blockingGet() throws InterruptedException {
        // wait until buffer gad data, then read value;
        // while no data to read, place thread in waiting state
        while (occupiedCells == 0) {
            System.out.printf("Buffer is empty. Consumer waits.%n");
            wait();
        }

        int readValue = buffer[readIndex];
        readIndex = (readIndex + 1) % buffer.length;

        --occupiedCells; // one fewer buffer cells are occupied
        displayState("Consumer reads " + readValue);
        notifyAll();

        return readValue;
    }


    // display current operation and buffer state
    public synchronized void displayState(String operation) {
        // output operation and number of occupied buffer cells
        System.out.printf("%s%s%d)%n%s", operation, " (buffer cells occupied: ", occupiedCells, "buffer cells: ");

        for (int value : buffer) {
            System.out.printf("   %2d  ", value); // output values in buffer, each value spaced equally
        }

        System.out.printf("%n          "); // Line break before the dashes

        for (int i = 0; i < buffer.length; i++) {
            System.out.print("    ---- "); // aligns with the buffer values above
        }

        System.out.printf("%n          "); // Line break before the index indicators

        for (int i = 0; i < buffer.length; i++) {
            // Conditionally print the index markers based on their current positions
            if (i == writeIndex && i == readIndex) {
                System.out.print("    WR   "); // Both write and read index at the same place
            } else if (i == writeIndex) {
                System.out.print("    W    "); // Only write index
            } else if (i == readIndex) {
                System.out.print("    R    "); // Only read index
            } else {
                System.out.print("         "); // No index at this position
            }
        }
        System.out.printf("%n%n"); // Double line break for clear separation from subsequent output
    }

}
