package JavaHTPE11.exam_practice.exams.b2018_82.Q4;

public class Manager {
    private int current;
    private int[] arr;
    private int total;
    private int done;

    public Manager(int[] arr) {
        this.arr = arr;
    }

    public synchronized int[] allocateNum() {
        if (current == arr.length)
            return null;
        int[] res = new int[]{arr[current], current};
        current++;
        return res;
    }

    public synchronized void putResult(int res, int position) {
        arr[position] = res;
        done++;
        notifyAll();
    }

    public synchronized int[] getResults() {
        while (done != arr.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return arr;
    }


}
