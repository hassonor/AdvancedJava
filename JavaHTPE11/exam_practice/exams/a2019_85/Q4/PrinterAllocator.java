package JavaHTPE11.exam_practice.exams.a2019_85.Q4;

public class PrinterAllocator {
    private int free;
    private boolean[] printers;


    public PrinterAllocator(int size) {
        free = size;
        printers = new boolean[size + 1];
    }

    public synchronized int getPrinter() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i < printers.length; i++) {
            if (!printers[i]) {
                printers[i] = true;
                free--;
                return i;
            }
        }

        return -1;
    }

    public synchronized void releasePrinter(int num) {
        printers[num] = false;
        free++;
        notifyAll();
    }

}
