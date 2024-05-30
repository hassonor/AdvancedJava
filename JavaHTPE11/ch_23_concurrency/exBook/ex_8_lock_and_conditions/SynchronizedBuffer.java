package JavaHTPE11.ch_23_concurrency.exBook.ex_8_lock_and_conditions;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Synchronizing access to a shared integer using the Lock and Condition
// interfaces
public class SynchronizedBuffer implements Buffer {
    private final Lock accessLock = new ReentrantLock();
    private final Condition canWrite = accessLock.newCondition();
    private final Condition canRead = accessLock.newCondition();

    private int buffer = -1; // shared by producer and consumer threads
    private boolean occupied = false; // whether buffer is occupied

    @Override
    public void blockingPut(int value, int producerId) throws InterruptedException {
        accessLock.lock();
        try {
            while (occupied) {
                System.out.println("Producer " + producerId + " tries to write.");
                displayState("Buffer full. Producer " + producerId + " waits.");
                canWrite.await();
            }
            buffer = value; // set new buffer value
            occupied = true;

            displayState("Producer " + producerId + " writes " + buffer);
            canRead.signalAll();
        } finally {
            accessLock.unlock();
        }
    }

    @Override
    public int blockingGet(int consumerId) throws InterruptedException {
        accessLock.lock();
        int readValue = 0;
        try {
            while (!occupied) {
                System.out.println("Consumer " + consumerId + " tries to read.");
                displayState("Buffer empty. Consumer " + consumerId + " waits.");
                canRead.await();
            }
            readValue = buffer; // retrieve value from buffer
            occupied = false;

            displayState("Consumer " + consumerId + " reads " + readValue);
            canWrite.signalAll();
        } finally {
            accessLock.unlock();
        }
        return readValue;
    }

    private void displayState(String operation) {
        System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
    }
}