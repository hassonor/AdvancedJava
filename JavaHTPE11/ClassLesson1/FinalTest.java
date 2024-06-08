package JavaHTPE11.ClassLesson1;

public class FinalTest {

    private final int x = 777; // final fields should be init in all constructors
    public final int K;
    private int y;

    public int getX() {
        return x;
    }

    public FinalTest() {
        K = 666;
        int y1 = 99;
        int y2 = 88;

    }

    public FinalTest(int x) {
        this();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}