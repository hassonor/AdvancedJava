package JavaHTPE11.exam_practice.exams.b2019_84.Q4;

public class Main {
    public static void main(String[] args) {
        Monitor mon = new Monitor();
        for (int i = 0; i < 10; i++)
            new T(i, mon).start();
        mon.allDone();
        System.out.println("finished");
    }
}
