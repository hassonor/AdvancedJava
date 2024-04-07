package JavaHTPE11.ch_8.classBook.ex_1;


public class Circle {
    private static int circleCount = 0;
    private double x;
    private double y;

    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        circleCount++;
    }

    public Circle(double r) {
        x = 0.0;
        y = 0.0;
        this.r = r;
        circleCount++;
    }

    public Circle() {
        this(0.0, 0.0, 1.0);
    }

    public double circumference() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public boolean inside(double x, double y) {
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return (r < Math.sqrt((deltaX * deltaX) + (deltaY * deltaY)));
    }

    public static boolean bigger(Circle a, Circle b) {
        return (a.r > b.r);
    }
}
