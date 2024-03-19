package JavaHTPE11.ClassLesson1;

public class FinalTest {

    private final int x = 777; // final fields should be init in all constructors
    public final int K;
    private int y;

    public int getX() {
        return x;
    }

    //        public void setX(int x) {
//			this.x = x;
//		}
    public FinalTest() {
        K = 666;
        //this(44);
        int y1 = 99;
        int y2 = 88;
//                if (y1>y2)
//                	x=5;
//                else
//                	x=88;
    }

    public FinalTest(int x) {

        this();
//			  K= 99;
        // this.x=x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}