package JavaHTPE11.exam_practice.exams.a2019_95.Q2;

public class MovingBall extends Ball implements Runnable {
    private Thread t;
    private boolean isStopped = false;

    public MovingBall(int x, int y) {
        super(x, y);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (!isStopped) {
            try {
                move();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        isStopped = true;
    }

}
