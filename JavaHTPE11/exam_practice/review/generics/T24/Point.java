package JavaHTPE11.exam_practice.review.generics.T24;

public class Point implements Swappable<Point> {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void swap(Point other) {
        int tempX = other.x;
        int tempY = other.y;
        other.x = x;
        other.y = y;
        x = tempX;
        y = tempY;
    }

}
