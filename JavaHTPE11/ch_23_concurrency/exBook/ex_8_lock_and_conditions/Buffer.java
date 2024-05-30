package JavaHTPE11.ch_23_concurrency.exBook.ex_8_lock_and_conditions;

// Buffer interface specifies methods called by Producer
// and Consumer.
public interface Buffer {
    // place int value into Buffer
    public void blockingPut(int value, int producerId) throws InterruptedException;

    // return int value from Buffer

    public int blockingGet(int consumerId) throws InterruptedException;
}
