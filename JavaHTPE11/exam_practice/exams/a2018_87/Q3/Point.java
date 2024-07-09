package JavaHTPE11.exam_practice.exams.a2018_87.Q3;

public class Point implements Swappable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        ;
        this.y = y;
    }

    @Override
    public void swap(Point other) {
        int tempX = other.x;
        int tempY = other.y;
        other.x = this.x;
        other.y = this.y;
        this.x = tempX;
        this.y = tempY;
    }

}
