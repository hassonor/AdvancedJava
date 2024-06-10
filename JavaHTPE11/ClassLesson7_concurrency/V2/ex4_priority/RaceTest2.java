package JavaHTPE11.ClassLesson7_concurrency.V2.ex4_priority;

public class RaceTest2 {

    private final static int NUMRUNNERS = 10;

    public static void main(String[] args) {
        PoliteRunner[] runners = new PoliteRunner[NUMRUNNERS];

        for (int i = 0; i < NUMRUNNERS; i++) {
            {
                runners[i] = new PoliteRunner(i);
                runners[i].setPriority(i + 1);
            }
        }
        for (int i = 0; i < NUMRUNNERS; i++)
            runners[i].start();
    }
}
