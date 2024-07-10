package JavaHTPE11.exam_practice.exams.b2019_84.Q4;

public class T extends Thread {
    private int id;
    private Monitor mon;

    public T(int i, Monitor m) {
        id = i;
        mon = m;
    }

    private int calc() {
        int num = 0;
        for (int i = 0; i < 10; i++)
            num = num + (int) (Math.random() * 10);
        return num;
    }

    @Override
    public void run() {
        int num = calc();
        mon.print(id, num);
    }
}
