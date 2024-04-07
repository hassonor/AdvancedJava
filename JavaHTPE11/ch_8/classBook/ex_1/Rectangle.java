package JavaHTPE11.ch_8.classBook.ex_1;

public class Rectangle {
    private int width = 0;
    private int height = 0;

    private Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(int width, int height) {
        origin = new Point(0, 0);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point p, int width, int height) {
        this.origin = p;
        this.width = width;
        this.height = height;
    }

    public void move(int x, int y) {
        origin.setX(x);
        origin.setY(y);
    }

    public int area() {
        return width * height;
    }
}
