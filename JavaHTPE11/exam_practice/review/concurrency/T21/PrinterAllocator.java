package JavaHTPE11.exam_practice.review.concurrency.T21;

public class PrinterAllocator {
    public int free;
    public boolean[] printers;


    public PrinterAllocator(int size) {
        free = size;
        printers = new boolean[size + 1];
    }

    public synchronized int allocatePrinter() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i < printers.length; i++) {
            if (!printers[i]) {
                printers[i + 1] = true;
                free--;
                return i;
            }
        }
        return -1;
    }

    public synchronized void release(int n) {
        printers[n] = false;
        free++;
        notifyAll();
    }

}
