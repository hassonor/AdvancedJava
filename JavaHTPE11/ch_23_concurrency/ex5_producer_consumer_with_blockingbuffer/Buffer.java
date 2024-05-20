package JavaHTPE11.ch_23_concurrency.ex5_producer_consumer_with_blockingbuffer;

// Buffer interface specifies methods called by Producer and Consumer.
public interface Buffer {
    // place int value into Buffer
    public void blockingPut(int value) throws InterruptedException;

    // return int value from Buffer
    public int blockingGet() throws InterruptedException;
}
