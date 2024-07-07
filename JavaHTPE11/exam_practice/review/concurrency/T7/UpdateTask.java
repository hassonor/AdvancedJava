package JavaHTPE11.exam_practice.review.concurrency.T7;

public class UpdateTask extends Thread {
    private Data data;

    public UpdateTask(Data d) {
        data = d;
    }

    @Override
    public void run() {
        int index;
        for (int i = 0; i < 100; i++) {
            index = (int) (Math.random() * 100);
            data.update(index);
            try {
                Thread.sleep(index);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
